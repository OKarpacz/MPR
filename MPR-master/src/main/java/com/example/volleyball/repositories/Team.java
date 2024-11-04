package com.example.volleyball.repositories;

import com.example.volleyball.models.Player;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchProfile;
import org.hibernate.annotations.UuidGenerator;
import org.springframework.data.repository.cdi.Eager;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@NonNull
@Entity
public class Team {
   @Id
   @UuidGenerator
    private UUID teamId;
   @NonNull
    private String teamName;
   @NonNull
    private int  teamCount;
    @OneToMany(fetch = FetchType.EAGER)
    public List<Player> playerList = new ArrayList<Player>();

}
