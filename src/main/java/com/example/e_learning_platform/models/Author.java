package com.example.e_learning_platform.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@Data
@Entity
@AllArgsConstructor
@Builder
public class Author {

    @Id
    @GeneratedValue()
    private Integer id;

    private String firstName;

    private String lastName;

    @Column(
            unique = true,
            nullable = false
    )
    private String email;

    private int age;

    //This annotation refers to the authors property of Course class, (Course class is the principal class that holds the relationship)
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;

}
