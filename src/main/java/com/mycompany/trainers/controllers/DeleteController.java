/
package com.mycompany.trainers.controllers;

import com.mycompany.trainers.dao.TrainerDAO;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class DeleteController {

	@Autowired
	private TrainerDAO trainerDAO;

	@RequestMapping(value = "/delete/{studentId}")
	public ModelAndView deleteTrainerById(ModelAndView mv, @PathVariable("trainerId") int trainerId)
			throws IOException {

		int counter = trainerDAO.delete(trainerId);

		if (counter > 0) {
			mv.addObject("msg", "Trainer records deleted against trainer id: " + trainerId);
		} else {
			mv.addObject("msg", "Error- check the console log.");
		}

		mv.setViewName("delete");

		return mv;
	}

}