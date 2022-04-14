package dev.ibraheem.project1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class UserInfo implements List<UserInfo> {
	
	private int user_id;
	private int role_id;
	private String first_name;
	private String last_name;
	private String role_name; 
	private String username;
	private int password;
	private List<Pitch_table> pitch;
	
	
	// constructor
		public UserInfo()	{
			user_id = user_id;
			role_id = role_id;
			first_name = first_name;
			role_name = role_name;
			pitch = new ArrayList<>();
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

		public List<Pitch_table> getPitch() {
			return pitch;
		}

		public void setPitch(List<Pitch_table> manager) {
			this.pitch = pitch;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public int getPassword() {
			return password;
		}

		public void setPassword(int password) {
			this.password = password;
		}

		
		@Override
		public String toString() {
			return "UserInfo [user_id=" + user_id + ", role_id=" + role_id + ", first_name=" + first_name
					+ ", last_name=" + last_name + ", role_name=" + role_name + ", username=" + username + ", password="
					+ password + ", pitch=" + pitch + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(first_name, last_name, pitch, password, role_id, role_name, user_id, username);
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
					&& Objects.equals(pitch, other.pitch) && password == other.password && role_id == other.role_id
					&& Objects.equals(role_name, other.role_name) && user_id == other.user_id
					&& Objects.equals(username, other.username);
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Iterator<UserInfo> iterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Object[] toArray() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public <T> T[] toArray(T[] a) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean add(UserInfo e) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean remove(Object o) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean containsAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean addAll(Collection<? extends UserInfo> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean addAll(int index, Collection<? extends UserInfo> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean removeAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean retainAll(Collection<?> c) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public UserInfo get(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public UserInfo set(int index, UserInfo element) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void add(int index, UserInfo element) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public UserInfo remove(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public int indexOf(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int lastIndexOf(Object o) {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public ListIterator<UserInfo> listIterator() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public ListIterator<UserInfo> listIterator(int index) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public List<UserInfo> subList(int fromIndex, int toIndex) {
			// TODO Auto-generated method stub
			return null;
		}

}