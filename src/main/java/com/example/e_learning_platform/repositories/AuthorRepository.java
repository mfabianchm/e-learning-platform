package com.example.e_learning_platform.repositories;

import com.example.e_learning_platform.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
