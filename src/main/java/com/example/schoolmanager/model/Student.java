package com.example.schoolmanager.model;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.util.UUID;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    @UuidGenerator // Hibernate 6+
    // @Column(columnDefinition = "UNIQUEIDENTIFIER",  -- bo doan nay do conflict de data type giua sql va progressSQL
    // updatable = false,
    // nullable = false)
    private UUID id;

    // NVARCHAR trên SQL Server
    // project duoc chay tren ca sql va progressSQL , go bo thuoc tinh columnDefinition de hibernate tu dong anh xa sang datatype tuong ung cho tung loai database
    @Column(length = 100)
    private String name;
    @Column(length = 100)
    private String email;

    // ===== Constructor =====
    public Student() {
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // ===== Getter Setter =====
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
