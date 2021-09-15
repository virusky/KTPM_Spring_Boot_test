package com.example.ktpm_spring_boot.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Table(name = "employee")
public class Employee {
    @Id
    @Generated
    private Long id;
    private String name;
    private String email;
}
