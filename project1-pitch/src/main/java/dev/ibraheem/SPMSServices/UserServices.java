package dev.ibraheem.SPMSServices;
//User login services
//might be renamed to editor services down the line

import java.util.List;

import dev.ibraheem.SPMSExceptions.IncorrectCredentialsException;
import dev.ibraheem.SPMSExceptions.StorypitchAlreadyExistsException;
import dev.ibraheem.SPMSExceptions.usernameAlreadyExistsException;
import dev.ibraheem.project1.Pitch_table;
import dev.ibraheem.project1.UserInfo;

public interface UserServices {
	
	// returns the User if username and password are correct. 
	 // otherwise throws an IncorrectCredentialsException.
	/* * 
	 * @param username
	 * @param password
	 * @return User matching the given username/password
	 */
	public UserInfo logIn(String username, int password) throws IncorrectCredentialsException;

	
	/**
	 * creates a new user. if the username is available, 
	 * returns the new user with their database-generated ID. 
	 * otherwise, throws a UsernameAlreadyExistsException.
	 * 
	 * @param newUser
	 * @return User with newly generated ID
	 * @throws usernameAlreadyExistsException 
	 */
	
	public UserInfo register(UserInfo newUser) throws usernameAlreadyExistsException;
	
	
	
	/**
	 * 
	 * @return all available pets
	 * 
	 * 
	 */
	
	public Pitch_table newPitch(String tentative_title) throws StorypitchAlreadyExistsException;
	
	
	
	
	public List<Pitch_table> viewExistingPitches();


	List<Pitch_table> viewExistingPitches(int user_id);


	Pitch_table newPitch(Pitch_table newPitch_table) throws StorypitchAlreadyExistsException;


	List<UserInfo> getByUserId(int user_id);
	
	
	
	
	/**
	 * 
	 * @param species
	 * @return all available pets with the specified species
	 */
	
}
