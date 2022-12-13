package com.petp.wam.repositories;

import com.petp.wam.models.IdentifierModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentifierRepository extends JpaRepository<IdentifierModel, Long> {
}
