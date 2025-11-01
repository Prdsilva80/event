package com.desafio02.event.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio02.event.entities.Block;

public interface BlockRepository extends JpaRepository<Block, Long> {
}
