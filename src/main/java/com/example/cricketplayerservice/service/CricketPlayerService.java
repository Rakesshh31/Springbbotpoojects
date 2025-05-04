package com.example.cricketplayerservice.service;

import com.example.cricketplayerservice.entity.CricketPlayer;
import com.example.cricketplayerservice.repository.CricketPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CricketPlayerService {

    @Autowired
    private CricketPlayerRepository repo;

    public CricketPlayer savePlayer(CricketPlayer player) {
        return repo.save(player);
    }

    public List<CricketPlayer> getAllPlayersss() {
        return repo.findAll();
    }
    
    
    public Optional<CricketPlayer >getbyid(Long id){
    	
    	return repo.findById(id);
    	
    	
    }
    
    public List<CricketPlayer> postdetails( List<CricketPlayer> v) {
    	
    	return repo.saveAll(v);
    }

//    public Optional<CricketPlayer> getPlayerById(Long id) {
//        return repo.findById(id);
//    }

    public void deletePlayer(Long id) {
        repo.deleteById(id);
    }

//    public CricketPlayer updatePlayer(Long id, CricketPlayer updated) {
//        CricketPlayer player = repo.findById(id).orElseThrow();
//        player.setName(updated.getName());
//        player.setRole(updated.getRole());
//        player.setMatches(updated.getMatches());
//        player.setRuns(updated.getRuns());
//        player.setWickets(updated.getWickets());
//        return repo.save(player);
//    }
}
