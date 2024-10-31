package com.example.volleyball.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Player
{
    @NonNull
    @Id
    @UuidGenerator
    private UUID id;

    @NonNull
    private String name;

    @NonNull
    private String surname;

    private int age;
    private int height;
    private String role;
    private String gender;

}
