package com.mapping.mapping_demo.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {
    @Id
    private String houseNumber;
    private String street;
    private String city;
    private String postalCode;

    @OneToOne (mappedBy = "address")
    @JsonIgnore
    private Student student;
}
