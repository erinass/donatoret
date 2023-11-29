package com.donatoret.controllers;

import com.donatoret.models.Donatoret;
import com.donatoret.models.DonatoretDto;
import com.donatoret.services.DonatoretService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/donatoret")
@CrossOrigin(origins = "*")

public class DonatoretController {

    private final DonatoretService donatoretService;

    public DonatoretController(DonatoretService donatoretService) {
        this.donatoretService = donatoretService;
    }


    @GetMapping
    public List<DonatoretDto> getAll() {
        return donatoretService.findAll();
    }

    @GetMapping("/{id}")
    public DonatoretDto getById(@PathVariable long id) {
        return donatoretService.findById(id);
    }

    @PostMapping
    public void add(@RequestBody Donatoret newDonor) {
        donatoretService.add(newDonor);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody Donatoret updatedDonor) {
        donatoretService.modify(id, updatedDonor);
    }

    @DeleteMapping("/{id}")
    public void deleteReportCase(@PathVariable long id) {
        donatoretService.removeById(id);
    }


}


