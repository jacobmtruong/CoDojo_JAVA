package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPAACompliantUser, HIPAACompliantAdmin {

//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    
	public AdminUser (Integer id, String role) {
		super(id);
		this.employeeID = id;
		this.role = role;
	}
	
	
	//	Pin must be 6 digits or more; returns false if not
	//Expected to assign the pin to the user (as a member variable)
    
	@Override
	public boolean assignPin(int pin) {
    	int lengthOfPIN = String.valueOf(pin).length();
    	if (lengthOfPIN >= 6) {
    		this.pin = pin; 
    		return true;
    	}
    	else {
    		return false;
    	}
	} 
	
	
    //Compares the ids, and if they are not a match,
    //creates an incident report using the  authIncident method,
    //Returns true if ids match, false if not.
	
	
    
    
	@Override
	public boolean accessAuthorized(Integer id) {
		String stringID = String.valueOf(this.employeeID);
		String confirmID = String.valueOf(id);
		if(stringID.equals(confirmID)) {
			return true;			
		} else {
			authIncident();
			return false;
		}
	}
   
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.getEmployeeID(), notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.getEmployeeID(), "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }

    // TO DO: Implement HIPAACompliantUser!
    // TO DO: Implement HIPAACompliantAdmin!
    
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		return null;
	}





    // ------------ TO DO: Setters & Getters -------------
	
	
	public Integer getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}


	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
    


	

	
}
