package com.das.spring_boot_docker_postgresql.repository;

import com.das.spring_boot_docker_postgresql.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<Test,Integer> {
}
