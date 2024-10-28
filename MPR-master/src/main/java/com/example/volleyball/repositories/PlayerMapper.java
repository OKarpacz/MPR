package com.example.volleyball.repositories;

import com.example.volleyball.models.Player;
import com.example.volleyball.models.PlayerRequest;
import com.example.volleyball.models.PlayerResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface PlayerMapper
{
    @Mapping(target = "name", source = "playerName")
    Player mapToPlayer(PlayerRequest playerRequest);
    PlayerResponse mapToPlayerResponse(Player player);
}
