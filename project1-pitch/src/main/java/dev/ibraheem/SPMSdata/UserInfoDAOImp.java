package dev.ibraheem.SPMSdata;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dev.ibraheem.SPMSServices.ConnectionFactory;
import dev.ibraheem.project1.Pitch_table;
import dev.ibraheem.project1.UserInfo;

//Implementation for UserInfo DAO interface
public class UserInfoDAOImp implements UserInfoDAO{
	

	@Override
	public int create(UserInfo newObj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public UserInfo getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfo> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(UserInfo updatedObj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(UserInfo objToDelete) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<UserInfo> getByFirstName(String first_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfo> getByLastName(String last_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserInfo> getbyUserId(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePitch_Table(int pitch_id, int user_id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserInfo getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void updatePitch_table(int pitch_id, String tentative_title, String blurb, String description, int user_id,
			int editor_id, int genre_id, int word_count_length, int author_id, int expected_completion_date, String status_name, String genre_name) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pitch_table> getbyAuthorId(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserInfo getByAuthorId(Pitch_table author_id) {
		// TODO Auto-generated method stub
		return null;
	}

}