package com.terra.main.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import com.terra.main.entity.ProcessPensionInput;



public interface ProcessPensionRepository extends JpaRepository<ProcessPensionInput, Long> {

}
