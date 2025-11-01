package com.desafio02.event.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio02.event.entities.Participant;

public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
