package com.example.volleyball.services;

import com.example.volleyball.models.Player;
import com.example.volleyball.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;

    public Player getPlayerById(UUID id) {
        //GET BY ID
        playerRepository.getReferenceById(id);  //po id
        return null;
    }

    public List<Player> getAllPlayers() {
        //GETALL
        return playerRepository.findAll(); //wszystkich playerów szuka
    }

    public Player AddPlayer(Player player) {
        //POST
        return playerRepository.save(new Player()); //Zapis nowego playera do bazy

    }

    public void deletePlayer(UUID id) {
        //DELETE BY ID
        playerRepository.deleteById(id); //usuń po id
    }

    public Player updatePlayer(UUID id, Player playerFromRequest) {
        //PUT
        Player player = playerRepository.getReferenceById(id);
        player.setAge(playerFromRequest.getAge());
        player.setName(playerFromRequest.getName());
        return playerRepository.save(player);
    }

    ;
}
