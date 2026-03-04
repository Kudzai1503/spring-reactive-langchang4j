package com.dambex.langchangflux.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Setter
@Getter
@Entity
public class Claim {
    @Id
    private String claimId;
    private String claimNumber;
    private String claimSource;
    private String claimStatus;
    private String claimType;
    private BigDecimal grossAmount;
    private String narrative;
    private BigDecimal netAmount;
    private String paidTo;
    private LocalDate receivedDate;
    private BigDecimal claimShortFall;
    private LocalDate claimDate;
    private LocalDate dateOfCommencement;
    private String policyStatus;
    private String suffix;
    private String policyNumber;
    private LocalDate dateOfBirth;
    private String dependantType;
    private String firstName;
    private String gender;
    private String lastName;
    private String maritalStatus;
    private String title;
    private BigDecimal approvedAmount;
    private BigDecimal awardedAmount;
    private String benefitName;
    private BigDecimal claimedAmount;
    private String code;
    private String condition;
    private String description;
    private String lineItemStatus;
    private Integer quantity;
    private BigDecimal shortFall;
    private LocalDate treatmentDate;
    private String modifierDescription;
}
