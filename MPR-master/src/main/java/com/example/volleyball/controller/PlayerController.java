package com.example.volleyball.controller;

import com.example.volleyball.models.Player;
import com.example.volleyball.models.PlayerResponse;
import com.example.volleyball.services.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class PlayerController
{
    private final PlayerService service;

    @GetMapping("/getPlayer/{id}")
    public Player getPlayer(@PathVariable UUID id)
    {
        //return service.getPlayer(id);
        return new Player();
    }

    @GetMapping("/getAllPlayers/{id}")
    public List<Player> getAllPlayers()
    {
        return (service.getAllPlayers());
    }

    @PostMapping("/addPlayer")
    public PlayerResponse addPlayer(@RequestBody Player player)
    {
        return service.addPlayer(player);
    }

    @DeleteMapping("/deletePlayer")
    public void deletePlayer(@RequestBody UUID id)
    {
        service.deletePlayer(id);
    }

    @PutMapping
    public PlayerResponse editPlayer(@PathVariable UUID id, @RequestBody Player player)
    {
        return service.editPlayer(id, player);
    }

    @GetMapping("/filter/{gender}/{role}")
    public List<Integer> filterPlayers(@PathVariable String gender, @PathVariable String role)
    {
        return service.filterPlayers(gender, role);
    }

}
