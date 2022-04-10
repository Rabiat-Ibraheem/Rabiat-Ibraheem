package dev.ibraheem.project1;

import java.util.Objects;

public class Editor {
	// fields
	private int editor_id;
	private String first_name;
	private String last_name;
	private int reports_to;
	private long hire_date;
	private int user_id;
	
	//constructors
		public Editor() {
			editor_id = 0;
			first_name = "";
			last_name = "";
			reports_to = 0;
			hire_date = 0;
			user_id = 0;
		}
	// getters and setters
	public int getEditor_id() {
		return editor_id;
		
	}
	public void setEditor_id(int editor_id) {
		this.editor_id = editor_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public int getReports_to() {
		return reports_to;
	}
	public void setReports_to(int reports_to) {
		this.reports_to = reports_to;
	}
	public long getHire_date() {
		return hire_date;
	}
	public void setHire_date(long hire_date) {
		this.hire_date = hire_date;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "Editor [editor_id=" + editor_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", reports_to=" + reports_to + ", hire_date=" + hire_date + ", user_id=" + user_id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(editor_id, first_name, hire_date, last_name, reports_to, user_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Editor other = (Editor) obj;
		return editor_id == other.editor_id && Objects.equals(first_name, other.first_name)
				&& hire_date == other.hire_date && Objects.equals(last_name, other.last_name)
				&& reports_to == other.reports_to && user_id == other.user_id;
	} 
 
}
