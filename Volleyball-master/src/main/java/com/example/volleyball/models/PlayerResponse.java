package com.example.volleyball.models;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Getter@Setter@NoArgsConstructor
public class PlayerResponse {
    @NonNull
    @Id
    @UuidGenerator
    private UUID id;
    @NonNull
    private String name;
    @NonNull
    //private String sureName;
    private int age;
    private int height;
    private String role;
    private String gender;

    public void setId(@NonNull UUID id) {
        this.id = id;
    }
    public void setAge(@NonNull int age) {
        this.age = age;
    }
    public void setName(@NonNull String name) {
        this.name = name;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setRole(@NonNull String role) {
        this.role = role;
    }
    public void setGender(@NonNull String gender) {
        this.gender = gender;
    }

}
