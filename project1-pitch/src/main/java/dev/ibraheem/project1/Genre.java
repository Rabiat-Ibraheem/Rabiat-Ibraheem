package dev.ibraheem.project1;

import java.util.Objects;

public class Genre {
	// fields
	private int genre_id;
	private String genre_name;

	// constructor
	public Genre() {
		genre_id = genre_id;
		genre_name = genre_name;
	}

	// getters and setters
	public int getGenre_id() {
		return genre_id;
	}

	public void setGenre_id(int genre_id) {
		this.genre_id = genre_id;
	}

	public String getGenre_name() {
		return genre_name;
	}

	public void setGenre_name(String genre_name) {
		this.genre_name = genre_name;
	}

	@Override
	public String toString() {
		return "Genre [genre_id=" + genre_id + ", genre_name=" + genre_name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(genre_id, genre_name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Genre other = (Genre) obj;
		return genre_id == other.genre_id && Objects.equals(genre_name, other.genre_name);
	}

}
