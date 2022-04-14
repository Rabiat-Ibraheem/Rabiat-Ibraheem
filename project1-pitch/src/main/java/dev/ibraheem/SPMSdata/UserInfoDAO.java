package dev.ibraheem.SPMSdata;

import java.sql.SQLException;
import java.util.List;

import dev.ibraheem.project1.Editor;
import dev.ibraheem.project1.Pitch_table;
import dev.ibraheem.project1.UserInfo;

public interface UserInfoDAO extends GenericDAO<UserInfo> {
	public List<UserInfo> getByFirstName(String first_name);
	public List<UserInfo> getByLastName(String last_name);
	public List<UserInfo> getbyUserId(int user_id);
	public List<Pitch_table> getbyAuthorId(int user_id);
	public void updatePitch_Table(int pitch_id, int user_id) throws SQLException;
	public UserInfo getByUsername(String username);
	public void updatePitch_table(int pitch_id, String tentative_title, String blurb, String description, int user_id,
			int editor_id, int genre_id, int word_count_length, int author_id, int expected_completion_date, String status_name, String genre_name)
			throws SQLException;
	
	
}
