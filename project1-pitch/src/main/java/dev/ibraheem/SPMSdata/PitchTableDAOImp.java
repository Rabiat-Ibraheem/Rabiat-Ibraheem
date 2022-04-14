package dev.ibraheem.SPMSdata;

import java.sql.SQLException;
import java.util.List;

import dev.ibraheem.project1.Pitch_table;
import dev.ibraheem.project1.UserInfo;

//Implementation for PitchTable DAO interface
public class PitchTableDAOImp implements PitchTableDAO{

	@Override
	public int create(Pitch_table newObj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pitch_table getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pitch_table> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Pitch_table updatedObj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pitch_table objToDelete) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pitch_table> getByRole_id(int role_id, int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePitch_table(int pitch_id, String tentative_title, String blurb, String description, int user_id,
			int editor_id, int genre_id, int word_count_length, int author_id, int expected_completion_date,
			String status_name, String genre_name) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getByUserInfo(Pitch_table pitchtable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPitch(Object byUserInfo) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Pitch_table getByAuthorId(Pitch_table author_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pitch_table> getByEditor(int editor_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pitch_table> getByAuthor(int author_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pitch_table> getByStatus_name(String status_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pitch_table> getByEditorInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return null;
	}

}
