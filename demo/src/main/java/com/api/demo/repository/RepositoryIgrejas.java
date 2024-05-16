package com.api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.demo.models.Igrejas;

public interface RepositoryIgrejas extends JpaRepository <Igrejas,Long> {
    
}
