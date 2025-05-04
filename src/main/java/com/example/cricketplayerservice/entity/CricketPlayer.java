package com.example.cricketplayerservice.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
public class CricketPlayer {

    @Override
	public String toString() {
		return "CricketPlayer [id=" + id + ", name=" + name + ", role=" + role + ", matches=" + matches + ", runs="
				+ runs + ", wickets=" + wickets + "]";
	}
    
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String role; // Batsman, Bowler, All-Rounder
    private int matches;
    private int runs;
    private int wickets;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getMatches() {
		return matches;
	}
	public void setMatches(int matches) {
		this.matches = matches;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
    
    
    
    
}
