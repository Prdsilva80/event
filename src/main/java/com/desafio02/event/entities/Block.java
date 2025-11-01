package com.desafio02.event.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_block")
public class Block {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "event_day")
	private LocalDate day;

	@Column(name = "start_time")
	private LocalTime startTime;

	@Column(name = "end_time")
	private LocalTime endTime;

	@ManyToOne
	@JoinColumn(name = "activity_id")
	private Activity activity;

	public Block() {
	}

	public Block(Long id, LocalDate day, LocalTime startTime, LocalTime endTime, Activity activity) {
		this.id = id;
		this.day = day;
		this.startTime = startTime;
		this.endTime = endTime;
		this.activity = activity;
	}

	public Long getId() {
		return id;
	}

	public LocalDate getDay() {
		return day;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public Activity getActivity() {
		return activity;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDay(LocalDate day) {
		this.day = day;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public void setEndTime(LocalTime endTime) {
		this.endTime = endTime;
	}

	public void setActivity(Activity activity) {
		this.activity = activity;
	}
}
