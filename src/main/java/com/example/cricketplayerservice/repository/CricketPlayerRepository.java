package com.example.cricketplayerservice.repository;

import com.example.cricketplayerservice.entity.CricketPlayer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CricketPlayerRepository extends JpaRepository<CricketPlayer, Long> {
}
