/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainers.controllers;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.mycompany.trainers.dao.TrainerDAO;
import com.mycompany.trainers.models.Trainer;

@Controller
public class UpdateController {

	@Autowired
	private TrainerDAO trainerDAO;

	@RequestMapping(value = "/update/{trainerId}")
	public ModelAndView findStudentById(ModelAndView model, @PathVariable("trainerId") int trainertId)
			throws IOException {

		List<Trainer> listTrainer = trainerDAO.findTrainerById(trainerId);
		model.addObject("listTrainer", listTrainer);
		model.setViewName("update");

		return model;
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public ModelAndView updateTrainer(@RequestParam("id") int id, @RequestParam("fname") String fname,
			@RequestParam("lname") String lname, ModelAndView mv) {

		Trainer trainer = new Trainer();
		trainer.setId(id);
		trainer.setFName(fname);
		trainer.setLName(lname);
		

		int counter = trainerDAO.update(trainer);

		if (counter > 0) {
			mv.addObject("msg", "Trainer records updated against trainer id: " + trainer.getId());
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("update");

		return mv;
	}