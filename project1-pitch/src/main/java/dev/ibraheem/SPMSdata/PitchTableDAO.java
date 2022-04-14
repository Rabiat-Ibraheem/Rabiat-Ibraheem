package dev.ibraheem.SPMSdata;

import java.sql.SQLException;
import java.util.List;
import dev.ibraheem.project1.Pitch_table;
import dev.ibraheem.project1.UserInfo;

public interface PitchTableDAO extends GenericDAO<Pitch_table> {

	public List<Pitch_table> getByEditor(int editor_id);
	public List<Pitch_table> getByAuthor(int author_id);
	public List<Pitch_table> getByStatus_name(String status_name);
	public List<Pitch_table> getByRole_id(int role_id, int user_id);
	public void updatePitch_table(int pitch_id, String tentative_title, String blurb, String description, int user_id,
			int editor_id, int genre_id, int word_count_length, int author_id, int expected_completion_date, String status_name, String genre_name)
			throws SQLException;
	public Object getByUserInfo(Pitch_table pitchtable);
	public void setPitch(Object byUserInfo);
	public List<Pitch_table> getByEditorInfo(UserInfo userInfo);
	
}

