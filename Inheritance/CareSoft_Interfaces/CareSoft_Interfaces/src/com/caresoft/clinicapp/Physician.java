package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;


public class Physician extends User implements HIPAACompliantUser {
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
    
    
    public Physician(int id) {
    	super(id);
    	this.patientNotes = new ArrayList<String>();
    }
    
    
    //Pin must be exactly 4 digits, returns false if not.
    //Expected to assign the pin to the user (as a member variable)
    
	@Override
	public boolean assignPin(int pin) {
    	if (String.valueOf(pin).length() != 4) {
    		return false;
    	}
    	else {
    		this.pin = pin;
    		return true;
    	}
	}
    
    //Checks the physician's id against the given id;
    //returns true if they are a match, otherwise false.

    @Override
    public boolean accessAuthorized(Integer id) {
    	String stringID = String.valueOf(this.id);
    	String confirmID = String.valueOf(id);
    	if(stringID.equals(confirmID)) {
    		return true;			
    	} else {
    		return false;
    	}
    }
    
    
    // TO DO: Implement HIPAACompliantUser!
	
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }


    
    // TO DO: Setters & Getters

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}



	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}



		



	
	
}
