/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainers.controllers;

/**
 *
 * @author alexa
 */
 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.mycompany.trainers.dao.TrainerDAO;
import com.mycompany.trainers.models.Trainer;

@Controller
public class CreateController {

	@Autowired
	private TrainerDAO trainerDAO;

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createTrainer(@RequestParam("fname") String fname, @RequestParam("lname") String lname
			, ModelAndView mv) {

		Trainer trainer = new Trainer();
		trainer.setFName(fname);
		trainer.setLName(lname);
		

		int counter = trainerDAO.create(trainer);

		if (counter > 0) {
			mv.addObject("msg", "Trainer registration successful.");
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("create");

		return mv;
	}
}
