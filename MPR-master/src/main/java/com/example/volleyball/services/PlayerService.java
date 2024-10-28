package com.example.volleyball.services;

import com.example.volleyball.models.Player;
import com.example.volleyball.models.PlayerResponse;
import com.example.volleyball.repositories.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PlayerService
{
    private final PlayerRepository playerRepository;

    public Player getPlayer(UUID id)
    {
        return playerRepository.getReferenceById(id);
    }

    public List<Player> getAllPlayers()
    {
        return playerRepository.findAll();
    }

    public PlayerResponse addPlayer(Player player)
    {
        convertPlayerToResponse(player);
        Player savedPlayer = playerRepository.save(player);
        return convertPlayerToResponse(savedPlayer);
    }

    public void deletePlayer(UUID id)
    {
        playerRepository.deleteById(id);
    }

    public PlayerResponse editPlayer(UUID id, Player editedPlayer)
    {
        convertPlayerToResponse(editedPlayer);
        Player player = playerRepository.getReferenceById(id);
        player.setName(editedPlayer.getName());
        player.setSurname(editedPlayer.getSurname());
        player.setAge(editedPlayer.getAge());
        player.setHeight(editedPlayer.getHeight());
        player.setRole(editedPlayer.getRole());
        player.setGender(editedPlayer.getGender());
        Player save = playerRepository.save(player);
        return convertPlayerToResponse(save);

    }

    /*

     */

    public PlayerResponse convertPlayerToResponse(Player player)
    {
        PlayerResponse playerResponse = new PlayerResponse();
        playerResponse.setName(player.getName());
        playerResponse.setRole(player.getRole());
        playerResponse.setAge(player.getAge());
        playerResponse.setHeight(player.getHeight());
        playerResponse.setGender(player.getGender());
        return playerResponse;
    }

    public List<Integer> filterPlayers(String gender, String role)
    {
        return playerRepository
                .findAll()
                .stream()
                .filter(ourPlayer -> ourPlayer.getGender().equalsIgnoreCase(gender))
                .filter(ourPlayer -> ourPlayer.getRole().equals(role))
                .map(Player::getHeight)
                .toList();
    }


}
