/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainers.dao;

/**
 *
 * @author alexa
 */

    
    

import com.mycompany.trainers.models.Trainer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.websparrow.model.Student;

public class TrainerDAOImpl extends TrainerDAO {

	private JdbcTemplate jdbcTemplate;

	public TrainerDAOImpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
	}

	@Override
	public int create(Trainer trainer) {

		String sql = "insert into trainer(fame,elname,) values(?,?,?)";

		try {

			int counter = jdbcTemplate.update(sql,
					new Object[] { trainer.getFName(), trainer.get.LName() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public List<Trainer> read() {
		List<Trainer> trainerList = jdbcTemplate.query("SELECT * FROM TRAINER", new RowMapper<Trainer>() {

			@Override
			public Trainer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Trainer trainer = new Trainer();

				trainer.setId(rs.getInt("id"));
				trainer.setFName(rs.getString("fname"));
				trainer.setLName(rs.getString("lname"));
				

				return trainer;
			}

		});

		return trainerList;
	}

	@Override
	public List<Trainer> findTrainerById(int trainerId) {

		List<Trainer> trainerList = jdbcTemplate.query("SELECT * FROM TRAINER where id=?",
				new Object[] { trainerId }, new RowMapper<Trainer>() {

					@Override
					public Trainer mapRow(ResultSet rs, int rowNum) throws SQLException {
						Trainer trainer = new Trainer();

						trainer.setId(rs.getInt("id"));
						trainer.setFName(rs.getString("fname"));
						trainer.setLName(rs.getString("lname"));
						

						return trainer;
					}

				});

		return trainerList;
	}

	@Override
	public int update(Trainer trainer) {
		String sql = "update  trainer set fname=?, lname=? where id=?";

		try {

			int counter = jdbcTemplate.update(sql,
					new Object[] { trainer.getFName(), trainer.getLName(), trainer.getId() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public int delete(int sttrainerId) {
		String sql = "delete from trainer where id=?";

		try {

			int counter = jdbcTemplate.update(sql, new Object[] { trainerId });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

}

