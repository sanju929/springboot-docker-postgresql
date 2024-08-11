package com.das.spring_boot_docker_postgresql.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sk_test")
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "test_generator")
    private int testId;

    @Column
    private String testName;

}
