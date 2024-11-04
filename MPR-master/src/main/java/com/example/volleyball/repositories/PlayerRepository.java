package com.example.volleyball.repositories;

import com.example.volleyball.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PlayerRepository extends JpaRepository<Player, UUID> {
   /**
    * Querry
    */
    public List<Player> findByNameAndSurname (String name, String surname);
}

