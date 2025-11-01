package com.desafio02.event.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.desafio02.event.entities.Activity;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
