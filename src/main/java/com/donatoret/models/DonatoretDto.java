package com.donatoret.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonatoretDto {
    private long donorId;
    private String donorName;
    private String donorReceiver;
    private boolean active;
    private String preferredCause;
}
