package com.example.Reto3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Reto3.entities.Category;

public interface CategoryRepository  extends JpaRepository<Category, Integer>{
}
