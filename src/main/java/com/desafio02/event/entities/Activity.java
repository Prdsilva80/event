package com.desafio02.event.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_activity")
public class Activity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@Column(columnDefinition = "TEXT")
	private String description;

	private Double price;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;

	@OneToMany(mappedBy = "activity")
	private List<Block> blocks = new ArrayList<>();

	// Muitos-para-muitos Activity <-> Participant
	@ManyToMany
	@JoinTable(name = "tb_activity_participant", joinColumns = @JoinColumn(name = "activity_id"), inverseJoinColumns = @JoinColumn(name = "participant_id"))
	private Set<Participant> participants = new HashSet<>();

	public Activity() {
	}

	public Activity(Long id, String name, String description, Double price, Category category) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Double getPrice() {
		return price;
	}

	public Category getCategory() {
		return category;
	}

	public List<Block> getBlocks() {
		return blocks;
	}

	public Set<Participant> getParticipants() {
		return participants;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
