package dev.ibraheem.SPMSdata;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import dev.ibraheem.project1.Editor;
import dev.ibraheem.project1.Pitch_table;

//Implementation for Editor DAO interface
public class EditorDAOImp implements EditorDAO{
	Connection connection;

	@Override
	public int create(Editor newObj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Editor getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Editor> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Editor updatedObj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Editor objToDelete) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Editor getByAuthorId(Pitch_table author_id) {
		// TODO Auto-generated method stub
		return null;
	}


}
