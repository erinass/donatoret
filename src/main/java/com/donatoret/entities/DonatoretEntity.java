package com.donatoret.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "donatoret")
public class DonatoretEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long donorId;
    private String donorName;
    private String donorReceiver;
    private double donationAmount;
    @Column(nullable = true)
    private boolean active;
    private LocalDateTime donationDate;
    private String preferredCause;


}