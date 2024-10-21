package com.example.volleyball.models;

import jakarta.persistence.Id;
import lombok.NonNull;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

public class PlayerRequest {
    @NonNull
    private String name;
    @NonNull
    private String sureName;
    private int age;
    private int height;
    private String role;
    private String gender;

    public void setName(@NonNull String name) {
        this.name = name;
    }
    public void setSureName(@NonNull String sureName) {
        this.sureName = sureName;
    }
    public void setAge(int age) {
            this.age = age;
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
