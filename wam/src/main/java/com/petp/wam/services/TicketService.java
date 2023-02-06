package com.petp.wam.services;

import com.petp.wam.models.DTOs.TicketModelDTO;
import com.petp.wam.models.PlaceModel;
import com.petp.wam.models.SpeciesModel;
import com.petp.wam.models.TicketModel;
import com.petp.wam.repositories.PlaceRepository;
import com.petp.wam.repositories.SpeciesRepository;
import com.petp.wam.repositories.TicketRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;
    private final SpeciesRepository speciesRepository;
    private final PlaceRepository placeRepository;

    public TicketModel getTicketById(Long ticketId) {
        return ticketRepository.findById(ticketId).orElseThrow(
                ()-> new NoSuchElementException("Ticket with ticket id %d not found!".formatted(ticketId)));
    }

    public TicketModel createTicket(TicketModelDTO ticketModelDTO) {

        if (isTicketWithIdAlreadyExist(ticketModelDTO.getCustomId())) {
            throw new DataIntegrityViolationException(
                    "Ticket with Custom-Id: %s already exist in database.".formatted(ticketModelDTO.getCustomId()));
        }

        SpeciesModel speciesModel = ticketModelDTO.getSpeciesModel();
        PlaceModel placeModel = ticketModelDTO.getPlaceModel();
        SpeciesModel speciesModelFromDB = speciesRepository.findByName(speciesModel.getName()).orElseGet(() ->
                speciesRepository.save(speciesModel)
        );
        PlaceModel placeModelFromDB =
                placeRepository.getPlaceModelByNumberAndPlaceModelSuffixType(
                        placeModel.getNumber(),
                        placeModel.getPlaceModelSuffixType())
                        .orElseGet(()-> placeRepository.save(placeModel)
        );

        // TODO: Mapstruct will be much nicer here
        TicketModel ticketModel = TicketModel.builder()
                .seasonModel(ticketModelDTO.getSeasonModel())
                .customId(ticketModelDTO.getCustomId())
                .licenseId(ticketModelDTO.getLicenseId())
                .name(ticketModelDTO.getName())
                .speciesModel(speciesModelFromDB)
                .date(ticketModelDTO.getDate())
                .placeModel(placeModelFromDB)
                .usageType(ticketModelDTO.getUsageType())
                .build();

        return ticketRepository.save(ticketModel);
    }

    private boolean isTicketWithIdAlreadyExist(String customId) {
        return ticketRepository.findByCustomId(customId).isPresent();
    }

    public List<TicketModel> getAllTicketBySeasonId(Long seasonId) {
        return ticketRepository.findAllBySeasonModel_Id(seasonId);
    }

}
