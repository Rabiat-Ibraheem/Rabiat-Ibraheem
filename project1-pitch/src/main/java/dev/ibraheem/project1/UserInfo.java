package dev.ibraheem.project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserInfo {
	
	private int user_id;
	private int role_id;
	private String first_name;
	private String last_name;
	private String role_name; 
	private List<Editor> manager;
	
	// constructor
		public UserInfo()	{
			user_id = user_id;
			role_id = role_id;
			first_name = first_name;
			role_name = role_name;
			manager = new ArrayList<>();
		}

		// 	getters and setters
		public int getUser_id() {
			return user_id;
		}

		public void setUser_id(int user_id) {
			this.user_id = user_id;
		}

		public int getRole_id() {
			return role_id;
		}

		public void setRole_id(int role_id) {
			this.role_id = role_id;
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

		public String getRole_name() {
			return role_name;
		}

		public void setRole_name(String role_name) {
			this.role_name = role_name;
		}

		public List<Editor> getManager() {
			return manager;
		}

		public void setManager(List<Editor> manager) {
			this.manager = manager;
		}

		@Override
		public String toString() {
			return "UserInfo [user_id=" + user_id + ", role_id=" + role_id + ", first_name=" + first_name
					+ ", last_name=" + last_name + ", role_name=" + role_name + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(first_name, last_name, role_id, role_name, user_id);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			UserInfo other = (UserInfo) obj;
			return Objects.equals(first_name, other.first_name) && Objects.equals(last_name, other.last_name)
					&& role_id == other.role_id && Objects.equals(role_name, other.role_name)
					&& user_id == other.user_id;
		}
 
}
	



