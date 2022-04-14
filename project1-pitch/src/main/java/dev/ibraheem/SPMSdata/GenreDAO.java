package dev.ibraheem.SPMSdata;

import java.util.List;


import dev.ibraheem.project1.Genre;

public interface GenreDAO extends GenericDAO<Genre>{
	public List<Genre> getAll();

}
