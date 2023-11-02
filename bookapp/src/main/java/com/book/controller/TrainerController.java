package com.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.entity.Trainer;
import com.book.services.TrainerService;

@RestController
@RequestMapping("/trainer")
public class TrainerController {
	@Autowired
	private TrainerService trainerService;
	
	@PostMapping("/insert")
	public Trainer insertTrainer(@RequestBody Trainer trainer) {
		return trainerService.insertTrainer(trainer);
	}

}
