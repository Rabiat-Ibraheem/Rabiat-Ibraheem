package dev.ibraheem.SPMSServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dev.ibraheem.SPMSExceptions.IncorrectCredentialsException;
import dev.ibraheem.SPMSExceptions.StorypitchAlreadyExistsException;
import dev.ibraheem.SPMSExceptions.usernameAlreadyExistsException;
import dev.ibraheem.SPMSdata.DAOFactory;
import dev.ibraheem.SPMSdata.PitchTableDAO;
import dev.ibraheem.SPMSdata.UserInfoDAO;
import dev.ibraheem.project1.Pitch_table;
import dev.ibraheem.project1.UserInfo;

//implements user services interface
public class UserServicesImp implements UserServices{
		private UserInfoDAO userInfoDao = DAOFactory.getUserInfoDAO();
		private PitchTableDAO pitchDao = DAOFactory.getPitchTableDAO();
		
		
	@Override
	public UserInfo register(UserInfo newUserInfo)throws usernameAlreadyExistsException {
		int user_id = userInfoDao.create(newUserInfo);
		if (user_id != 0) {
			newUserInfo.setUser_id(user_id);
			return newUserInfo;
		} else {
			throw new usernameAlreadyExistsException();
		}
	}
	
	@Override
	public Pitch_table newPitch(Pitch_table newPitch_table) throws StorypitchAlreadyExistsException {
		Pitch_table author_id = new Pitch_table();
			return newPitch_table;
	}
	
	@Override
	public UserInfo logIn(String username, int password)throws IncorrectCredentialsException  {
		UserInfo userInfo = userInfoDao.getByUsername(username);
			if (userInfo != null && userInfo.getPassword()==(password)) {
				return userInfo;
			} else {
				throw new IncorrectCredentialsException();
			}
	}

	@Override
	public List<Pitch_table> viewExistingPitches(int user_id) {
			return pitchDao.getByAuthor(user_id);
	}
	
	@Override
	public List<Pitch_table> viewExistingPitches() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pitch_table newPitch(String tentative_title) throws StorypitchAlreadyExistsException {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<UserInfo> getByUserId(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	


	
}