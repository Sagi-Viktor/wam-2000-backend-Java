package com.petp.wam.services;

import com.petp.wam.models.DTOs.SeasonModelDTO;
import com.petp.wam.models.SeasonModel;
import com.petp.wam.models.TicketModel;
import com.petp.wam.repositories.SeasonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class SeasonService {

    private final SeasonRepository seasonRepository;
    private final TicketService ticketService;

    public SeasonModel createSeason(String name) {
        SeasonModel seasonModel = SeasonModel.builder().name(name).build();
        return seasonRepository.save(seasonModel);
    }

    public SeasonModel getSeasonById(Long seasonId) {
        return seasonRepository.findById(seasonId).orElseThrow(
                ()-> new NoSuchElementException("Season %d not found!".formatted(seasonId)));
    }

    public void deleteSeasonById(Long seasonId) {
        SeasonModel seasonModel = getSeasonById(seasonId);
        seasonRepository.delete(seasonModel);
    }

    public List<SeasonModelDTO> getAllSeason() {
        List<SeasonModelDTO> seasonModelDTOList = new LinkedList<>();
        List<SeasonModel> SeasonModelList = seasonRepository.findAll();

        for (SeasonModel seasonModel : SeasonModelList) {
            Long seasonModelId = seasonModel.getId();
            List<TicketModel> ticketModelList = ticketService.getAllTicketBySeasonId(seasonModelId);
            SeasonModelDTO seasonModelDTO = SeasonModelDTO.builder()
                    .id(seasonModelId)
                    .name(seasonModel.getName())
                    .isEmptySeason(ticketModelList.size() == 0)
                    .recordsNumber(ticketModelList.size())
                    .location("/api/seasons/%d".formatted(seasonModelId)).build();
            seasonModelDTOList.add(seasonModelDTO);
        }
        return seasonModelDTOList;
    }
}
