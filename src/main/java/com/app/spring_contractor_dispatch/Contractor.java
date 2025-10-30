package com.app.spring_contractor_dispatch;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Contractor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String companyName;
    private String workType;
    @Column(unique = true, nullable = false)
    private String taxId;
    private String serviceArea;
    private String contactInfo;
    private String coverageZipCodes;
    private String availabilityStatus;
}
