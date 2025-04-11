package com.example.e_learning_platform.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Data
@Entity
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private String description;

    @ManyToMany
    //JoinTable annotation create the join table between the Course entity and Author entity
    @JoinTable(
            name = "authors_courses",
            joinColumns = {
                   @JoinColumn(name = "course_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    private List<Author> authors;

    //The OneToMany annotation makes the one to many relationships between Course entity and Section entity
    //mappedBy property refers to the couse property in Section Class
    @OneToMany(mappedBy = "course")
    private List<Section> sections;

}
