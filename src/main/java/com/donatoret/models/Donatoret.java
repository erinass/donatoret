package com.donatoret.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donatoret {
    private long donorId;
    private String donorName;
    private String donorReceiver;
    private double donationAmount;
    private boolean active;
    private LocalDateTime donationDate;
    private String preferredCause;
}
