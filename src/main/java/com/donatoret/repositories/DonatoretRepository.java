package com.donatoret.repositories;

import com.donatoret.entities.DonatoretEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DonatoretRepository extends JpaRepository<DonatoretEntity, Long> {
}
