 package dev.ibraheem.project1;


public class Genre {
	private int genreID;
	private String genreName;
	public Genre() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Genre(int genreID, String genreName) {
		super();
		this.genreID = genreID;
		this.genreName = genreName;
	}
	public int getGenreID() {
		return genreID;
	}
	public void setGenreID(int genreID) {
		this.genreID = genreID;
	}
	public String getGenreName() {
		return genreName;
	}
	public void setGenreName(String genreName) {
		this.genreName = genreName;
	}
	
}	