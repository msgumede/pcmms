package com.example.pcmms.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Record {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    //later on i.d should be foreign key
    private Long id;

    private String name;

    private String password;

    @Column(nullable = false)
    private String phone;

    private String note;

    private String status;
    //status will have 4 selections:
    // "prospective", "regular", "baptised" & "deceased"

}
