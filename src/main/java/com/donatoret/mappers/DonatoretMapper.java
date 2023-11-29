package com.donatoret.mappers;

import com.donatoret.entities.DonatoretEntity;
import com.donatoret.models.Donatoret;
import com.donatoret.models.DonatoretDto;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DonatoretMapper {

    public DonatoretEntity toEntity(Donatoret donatoret) {
        var entity = new DonatoretEntity();
        entity.setDonorName(donatoret.getDonorName());
        entity.setDonorId(donatoret.getDonorId());
        entity.setDonorReceiver(donatoret.getDonorReceiver());
        entity.setDonationAmount(donatoret.getDonationAmount());
        entity.setPreferredCause(donatoret.getPreferredCause());
        entity.setActive(donatoret.isActive());
        entity.setDonationDate(LocalDateTime.now());
        return entity;
    }
    public DonatoretDto toDto(DonatoretEntity entity) {
        var dto = new DonatoretDto();
        dto.setDonorName(entity.getDonorName());
        dto.setDonorId(entity.getDonorId());
        dto.setDonorReceiver(entity.getDonorReceiver());
        dto.setPreferredCause(entity.getPreferredCause());
        dto.setActive(entity.isActive());
        return dto;
    }

}




