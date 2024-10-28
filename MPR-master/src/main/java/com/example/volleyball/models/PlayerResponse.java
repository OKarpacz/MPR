package com.example.volleyball.models;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
public class PlayerResponse
{

    @NonNull
    @Id
    @UuidGenerator
    private UUID id;

    @NonNull
    private String name;
    private int age;
    private int height;
    private String role;
    private String gender;

}
