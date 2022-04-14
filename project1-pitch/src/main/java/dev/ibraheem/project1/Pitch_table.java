package dev.ibraheem.project1;

import java.util.Objects;

public class Pitch_table {
	// fields
	private int pitch_id;
	private String tentative_title;
	private String blurb;
	private int word_count_length;
	private String description;
	private int user_id; 
	private int editor_id; 
	private int genre_id; 
	private int author_id; 
	private int expected_completion_date;
	private String status_name;
	private String genre_name;
	
	// constructor
		public Pitch_table()	{
			pitch_id = pitch_id;
			tentative_title = tentative_title;
			blurb = blurb;
			word_count_length = word_count_length;
			description = description;
			user_id = user_id;
			editor_id = editor_id;
			genre_id = genre_id;
			author_id = author_id;
			expected_completion_date = expected_completion_date;
			status_name = status_name;
			genre_name = genre_name;
		}

		public int getPitch_id() {
			return pitch_id;
		}

		public void setPitch_id(int pitch_id) {
			this.pitch_id = pitch_id;
		}

		public String getTentative_title() {
			return tentative_title;
		}

		public void setTentative_title(String tentative_title) {
			this.tentative_title = tentative_title;
		}

		public String getBlurb() {
			return blurb;
		}

		public void setBlurb(String blurb) {
			this.blurb = blurb;
		}

		public int getWord_count_length() {
			return word_count_length;
		}

		public void setWord_count_length(int word_count_length) {
			this.word_count_length = word_count_length;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getUser_id() {
			return user_id;
		}

		public boolean setUser_id(int user_id) {
			this.user_id = user_id;
			return false;
		}

		public int getEditor_id() {
			return editor_id;
		}

		public void setEditor_id(int editor_id) {
			this.editor_id = editor_id;
		}

		public int getGenre_id() {
			return genre_id;
		}

		public void setGenre_id(int genre_id) {
			this.genre_id = genre_id;
		}

		public int getAuthor_id() {
			return author_id;
		}

		public void setAuthor_id(int author_id) {
			this.author_id = author_id;
		}

		public int getExpected_completion_date() {
			return expected_completion_date;
		}

		public void setExpected_completion_date(int expected_completion_date) {
			this.expected_completion_date = expected_completion_date;
		}

		public String getStatus_name() {
			return status_name;
		}

		public void setStatus_name(String status_name) {
			this.status_name = status_name;
		}

		public String getGenre_name() {
			return genre_name;
		}

		public void setGenre_name(String genre_name) {
			this.genre_name = genre_name;
		}

		@Override
		public String toString() {
			return "Pitch_table [pitch_id=" + pitch_id + ", tentative_title=" + tentative_title + ", blurb=" + blurb
					+ ", word_count_length=" + word_count_length + ", description=" + description + ", user_id="
					+ user_id + ", editor_id=" + editor_id + ", genre_id=" + genre_id + ", author_id=" + author_id
					+ ", expected_completion_date=" + expected_completion_date + ", status_name=" + status_name
					+ ", genre_name=" + genre_name + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(author_id, blurb, description, editor_id, expected_completion_date, genre_id,
					genre_name, pitch_id, status_name, tentative_title, user_id, word_count_length);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pitch_table other = (Pitch_table) obj;
			return author_id == other.author_id && Objects.equals(blurb, other.blurb)
					&& Objects.equals(description, other.description) && editor_id == other.editor_id
					&& expected_completion_date == other.expected_completion_date && genre_id == other.genre_id
					&& Objects.equals(genre_name, other.genre_name) && pitch_id == other.pitch_id
					&& Objects.equals(status_name, other.status_name)
					&& Objects.equals(tentative_title, other.tentative_title) && user_id == other.user_id
					&& word_count_length == other.word_count_length;
		}

}
	