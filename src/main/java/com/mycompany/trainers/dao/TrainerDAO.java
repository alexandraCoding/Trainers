/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;

import com.mycompany.trainers.models.Trainer;

public interface TrainertDAO {

	public int create(Trainer trainer);

	public List<Trainer> read();

	public List<Trainer> findTrainerById(int trainerId);

	public int update(Trainer trainer);

	public int delete(int trainerId);

}
package com.mycompany.trainers.dao;

/**
 *
 * @author alexa
 */
public interface TrainertDAO {

	public int create(Trainer trainer);

	public List<Trainer> read();

	public List<Trainer> findTrainerById(int trainerId);

	public int update(Trainer trainer);

	public int delete(int trainerId);

}
