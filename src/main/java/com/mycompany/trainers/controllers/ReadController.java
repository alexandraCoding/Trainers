/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainers.controllers;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.mycompany.trainers.dao.TrainerDAO;
import com.mycompany.trainers.models.Trainer;
/**
 *
 * @author alexa
 */
@Controller
public class ReadController {
 






	@Autowired
	private TrainerDAO trainerDAO;

	@RequestMapping(value = "/read")
	public ModelAndView readTrainer(ModelAndView model) throws IOException {

		List<Trainer> listTrainer = trainerDAO.read();
		model.addObject("listTrainer", listTrainer);
		model.setViewName("read");

		return model;
	}
}
}
