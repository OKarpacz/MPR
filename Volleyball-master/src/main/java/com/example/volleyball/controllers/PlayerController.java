package com.example.volleyball.controllers;
import com.example.volleyball.models.Player;

import java.util.Optional;

import org.springframework.web.bind.annotation.*;

@RestController
public class PlayerController {

    @GetMapping("/player/{playerId}")  //endpoint to /player
    public Player getPlayer(@PathVariable int playerId) {
        return new Player(playerId, "Rychu", "Gortat");
   }

   @PostMapping("/player")
   public Player addPlayer(@RequestBody Player player) {
        return player;
   }
   //Czy to powinno być tak zrobione ???
   @DeleteMapping("/player/{playerId}")
    public String deletePlayer(@PathVariable int playerId) {
       return "Player Deleted";
    }
    //Bad Request ???
    @PutMapping("/player/{playerId}")
    public Player updatePlayer(@PathVariable int playerId, @RequestBody Player player) {
        return new Player(playerId, "Michał", "Jordan");
    }
}
