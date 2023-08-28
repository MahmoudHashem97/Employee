package com.IOC.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {
    @Id
    @SequenceGenerator(
            name = "EMPLOYE_sequence",
            sequenceName ="employe_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "EMPLOYE_sequence"

    )
    private int id ;
    @Column
    private String fullName;
    @Column
    private String email;
    @Column
    private String password;
}
