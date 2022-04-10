package dev.ibraheem.SPMSServices;
//User login services
//might be renamed to editor services down the line

import dev.ibraheem.SPMSExceptions.IncorrectCredentialsException;
import dev.ibraheem.SPMSExceptions.StorypitchAlreadyExistsException;
import dev.ibraheem.project1.Pitch_table;
import dev.ibraheem.project1.UserInfo;

public interface UserServices {
	
	public UserInfo login(String username, String password) throws IncorrectCredentialsException;

	
	
	
	public Pitch_table entry(String username, String password) throws StorypitchAlreadyExistsException;
	
	
	
}
