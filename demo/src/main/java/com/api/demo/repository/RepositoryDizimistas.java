package com.api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.demo.models.Dizimistas;

public interface RepositoryDizimistas extends JpaRepository <Dizimistas,Long> {
    
}
