package com.example.volleyball.services;

import com.example.volleyball.models.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import repositories.PlayerRepositories;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private PlayerRepositories playerRepositories;

    public Player getPlayerById(int id){
        return new Player(id, "Jan", "Nowak");
    }

    public Player addPlayer(Player player){
        return player;
    }

    public String deletePlayerById(int id){
        return "Player Deleted";
    }

    public Player updatePlayer(Player player){
        return new Player(player.getId(), "Micheal", "Jordan");
    }
}
