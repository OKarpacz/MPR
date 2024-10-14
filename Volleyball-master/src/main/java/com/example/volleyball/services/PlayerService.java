package com.example.volleyball.services;

import com.example.volleyball.models.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.example.volleyball.repositories.PlayerRepository;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PlayerService {
private final PlayerRepository playerRepository;
//   //Get by ID
//       playerRepository.findById(id);
//   //Get All
//    playerRepository.findAll(id);
//   //Delete Player
//       playerRepository.deleteById(id);
//   //Post Player
//       playerRepository.save(new Player());
//   //Put Player
//   Player player = playerRepository.getReferenceById(id);
//       player.setHeight(player.getHeight());
//       player.setName(player.getName());
//       player.setRole(player.getRole());
//       player.setSureName(player.getSureName());
//       return null;

    public Player getPlayerById(UUID id){
      return playerRepository.findById(id).orElse(null);
    }

    public Player addPlayer(Player player){
        return playerRepository.save(player);
    }

    public void deletePlayerById(UUID id){
        playerRepository.deleteById(id);
    }

     public Player updatePlayer(Player player){
        return playerRepository.save(player);
    }
}
