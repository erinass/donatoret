package com.donatoret.services.impl;

import com.donatoret.mappers.DonatoretMapper;
import com.donatoret.models.Donatoret;
import com.donatoret.models.DonatoretDto;
import com.donatoret.repositories.DonatoretRepository;
import com.donatoret.services.DonatoretService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DonatoretServiceImpl implements DonatoretService {

    public final DonatoretMapper donatoretMapper;
    public final DonatoretRepository donatoretRepository;

    public DonatoretServiceImpl(DonatoretMapper donatoretMapper, DonatoretRepository donatoretRepository) {
        this.donatoretMapper = donatoretMapper;
        this.donatoretRepository = donatoretRepository;
    }



    @Override
    public void add(Donatoret donatoret) {
        var entity = donatoretMapper.toEntity(donatoret);
        donatoretRepository.save(entity);
    }

    @Override
    public void modify(long id, Donatoret updatedDonatoret) {
        var optionalEntity = donatoretRepository.findById(id);
        if (optionalEntity.isEmpty())
            throw new RuntimeException("Report case not found");

        var entity = optionalEntity.get();
        entity.setDonorName(updatedDonatoret.getDonorName());
        entity.setDonorReceiver(updatedDonatoret.getDonorReceiver());
        entity.setDonationAmount(updatedDonatoret.getDonationAmount());
        entity.setDonationDate(updatedDonatoret.getDonationDate());
        entity.setPreferredCause(updatedDonatoret.getPreferredCause());
        entity.setActive(updatedDonatoret.isActive());

        donatoretRepository.save(entity);
    }

    @Override
    public void removeById(long id) {
        donatoretRepository.deleteById(id);
    }

    @Override
    public DonatoretDto findById(long id) {
        var entity = donatoretRepository.findById(id);
        if (entity.isEmpty())
            throw new RuntimeException("Report case not found");
        var dto = donatoretMapper.toDto(entity.get());
        return dto;
    }

    @Override
    public List<DonatoretDto> findAll() {
        return donatoretRepository.findAll().stream().map(donatoretMapper::toDto).toList();

    }
}






