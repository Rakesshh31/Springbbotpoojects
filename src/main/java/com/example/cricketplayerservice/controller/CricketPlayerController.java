package com.example.cricketplayerservice.controller;

import com.example.cricketplayerservice.entity.CricketPlayer;
import com.example.cricketplayerservice.repository.CricketPlayerRepository;
import com.example.cricketplayerservice.service.CricketPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/players")
public class CricketPlayerController {

    @Autowired
    private CricketPlayerService service;
    
    @Autowired
    private CricketPlayerRepository repo;
    
    @GetMapping
    public List<CricketPlayer> getAllPlayers() {
    	
    	
    	List<CricketPlayer> players = service.getAllPlayersss();

        // ✅ Console print
        System.out.println("------ Player List from Service ------");
        for (CricketPlayer p : players) {
            System.out.println(p); // Works if @Data or toString() is present
        }

        return players;
    }
    
    
    
    @GetMapping("/{id}")
    public Optional<CricketPlayer> getPlayersbyid(@PathVariable Long id ) {
    	
    	
    	Optional<CricketPlayer> players = service.getbyid(id);

        // ✅ Console print
        System.out.println("------ Player List from Service ------");
        
        System.out.println(players);
        return players;
    }
    
    @PostMapping
    public List<CricketPlayer> postdetailss(@RequestBody List<CricketPlayer> p) {
    	
    	List<CricketPlayer>   x	= service.postdetails(p);
 
    	System.out.println ( "the deatils of player are " + x);
      
    	return x;
      
    }
    

//    @PostMapping
//    public CricketPlayer addPlayer(@RequestBody CricketPlayer player) {
//        return service.savePlayer(player);
//    }
//
////    @GetMapping
////    public List<CricketPlayer> getAllPlayers() {
////        return service.getAllPlayers();
////    }
//
//    @GetMapping("/{id}")
//    public CricketPlayer getPlayer(@PathVariable Long id) {
//        return service.getPlayerById(id).orElse(null);
//    }
//
////    @PutMapping("/{id}")
////    public CricketPlayer updatePlayer(@PathVariable Long id, @RequestBody CricketPlayer player) {
////        return service.updatePlayer(id, player);
////    }
//
//    @DeleteMapping("/{id}")
//    public String deletePlayer(@PathVariable Long id) {
//        service.deletePlayer(id);
//        return "Deleted player with ID: " + id;
//    }
}
