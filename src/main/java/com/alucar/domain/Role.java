package com.alucar.domain;

import lombok.*;
import javax.persistence.*;
import static javax.persistence.GenerationType.AUTO;

@Entity @Data
@NoArgsConstructor @AllArgsConstructor
public class Role {
    @Id @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
}
