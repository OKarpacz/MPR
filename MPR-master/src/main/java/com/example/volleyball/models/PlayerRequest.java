package com.example.volleyball.models;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Setter
@Getter
public class PlayerRequest
{
//    @NonNull
//    @Id
//    @UuidGenerator
//    private UUID id;

    @NonNull
    private String playerName;
    @NonNull
    private String surname;

    private int age;
    private int height;
    private String role;
    private String gender;
}
