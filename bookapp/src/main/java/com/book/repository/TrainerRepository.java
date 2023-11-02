package com.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.book.entity.Trainer;

public interface TrainerRepository extends JpaRepository<Trainer, Long>{

}
