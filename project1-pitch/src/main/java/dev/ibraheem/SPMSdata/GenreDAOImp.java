package dev.ibraheem.SPMSdata;

import java.sql.SQLException;
import java.util.List;

import dev.ibraheem.project1.Genre;
import dev.ibraheem.project1.Pitch_table;

//Implementation for Genre DAO interface
public class GenreDAOImp implements GenreDAO{

	@Override
	public int create(Genre newObj) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Genre getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Genre updatedObj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Genre objToDelete) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Genre> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Genre getByAuthorId(Pitch_table author_id) {
		// TODO Auto-generated method stub
		return null;
	}

}
