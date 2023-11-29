package com.donatoret.services;

import com.donatoret.models.Donatoret;
import com.donatoret.models.DonatoretDto;

import java.util.List;

public interface DonatoretService {

    void add(Donatoret donatoret);

    void modify(long id, Donatoret updatedDonatoret);

    void removeById(long id);

    DonatoretDto findById(long id);

    List<DonatoretDto> findAll();
}
