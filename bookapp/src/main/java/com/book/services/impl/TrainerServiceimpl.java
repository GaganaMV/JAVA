package com.book.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.entity.Trainer;
import com.book.repository.TrainerRepository;
import com.book.services.TrainerService;

@Service
public class TrainerServiceimpl implements TrainerService{
	@Autowired
	private TrainerRepository trainerRepository;

	@Override
	public Trainer insertTrainer(Trainer trainer) {
		return trainerRepository.save(trainer);
	}

}
