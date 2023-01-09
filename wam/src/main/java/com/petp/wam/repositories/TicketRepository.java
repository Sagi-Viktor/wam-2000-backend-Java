package com.petp.wam.repositories;

import com.petp.wam.models.TicketModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TicketRepository extends JpaRepository<TicketModel, Long> {
    List<TicketModel> findAllBySeasonModel_Id(Long seasonId);
    Optional<TicketModel> findByCustomId(String customId);
}
