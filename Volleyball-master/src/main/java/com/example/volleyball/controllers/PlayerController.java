package com.example.volleyball.controllers;
import com.example.volleyball.models.Player;

import java.util.List;
import java.util.Optional;

import com.example.volleyball.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService service;

    @GetMapping("/player/{playerId}")  //endpoint to /player
    public List <Player> getAllPlayers(@PathVariable int playerId) {
        return List.of(service.getPlayerById(playerId));
   }

   @PostMapping("/player")
   public Player addPlayer(@RequestBody Player player) {
        return service.addPlayer(player);
   }
   //Czy to powinno być tak zrobione ???
   @DeleteMapping("/player/{playerId}")
    public String deletePlayer(@PathVariable int playerId) {
      return service.deletePlayerById(playerId);
    }
    //Bad Request ???
    @PutMapping("/player/{playerId}")
    public Player updatePlayer(@PathVariable int playerId, @RequestBody Player player) {
        return service.updatePlayer(player);
    }
}
