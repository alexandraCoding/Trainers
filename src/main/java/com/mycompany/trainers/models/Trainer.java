/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.trainers.models;

/**
 *
 * @author alexa
 */
public class Trainer {
    
    
      
    
  
private int id;    
private String fname;    
private String lname   ; 

    public Trainer() {
    }

    public Trainer(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Trainer(int id, String fname, String lname) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
  
    

    
    
    
    
    
    
}
