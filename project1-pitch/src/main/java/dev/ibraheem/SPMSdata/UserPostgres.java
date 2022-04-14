package dev.ibraheem.SPMSdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import dev.ibraheem.SPMSServices.ConnectionFactory;
import dev.ibraheem.project1.Pitch_table;
import dev.ibraheem.project1.UserInfo;


public class UserPostgres implements UserInfoDAO {
	private static Connection conn = ConnectionFactory.getConnection();

	@Override
	public int create(UserInfo newObj) {
		// TODO Auto-generated method stub
		int generatedId = 0;
		Connection conn = ConnectionFactory.getConnection();
		try {
			String sql = "insert into user_info (user_id, first_name, last_name, role_id, role_name, username, passwrd)"
					+ " values (?,?,?,?,?,?,?)";
			PreparedStatement pStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
			pStmt.setInt(1, newObj.getUser_id());
			pStmt.setString(2, newObj.getFirst_name());
			pStmt.setString(3, newObj.getLast_name());
			pStmt.setInt(7, newObj.getPassword());
			pStmt.setInt(7, 1);
			
			conn.setAutoCommit(false); // for ACID (transaction management)
			pStmt.executeUpdate();
			ResultSet resultSet = pStmt.getGeneratedKeys();
			
			if (resultSet.next()) {
				generatedId = resultSet.getInt(1);
				conn.commit();
			} else {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return generatedId;
		
		
	}
// might be get by user_id not just id
	@Override
	public UserInfo getById(int id) {
		// TODO Auto-generated method stub
		
		UserInfo userInfo = null;
		try (Connection conn = ConnectionFactory.getConnection()) {
			String sql = "select * from user_info left join editor on user_info.user_Id=editor.editor_id"
					+ " where userInfo.id = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setInt(1, id);
			
			ResultSet resultSet = pStmt.executeQuery();
			if (resultSet.next()) {
				userInfo = new UserInfo();
				userInfo.setRole_id(id);
				userInfo.setFirst_name(resultSet.getString("first_name"));
				userInfo.setLast_name(resultSet.getString("last_name"));
				userInfo.setUsername(resultSet.getString("username"));
				userInfo.setPassword(resultSet.getInt("passwrd"));
				
				PitchTableDAO pitchTable = DAOFactory.getPitchTableDAO();
				userInfo.setPitch(pitchTable.getByEditorInfo(userInfo));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userInfo;
	}

	@Override
	public List<UserInfo> getAll() {
		List<UserInfo> users = new LinkedList<>();
		try (Connection conn = ConnectionFactory.getConnection()) {
			
			String sql = "select * from user_info left join story_pitch on user_info.user_id=story_pitch.user_id;";
			Statement stmt = conn.createStatement();
			
			ResultSet resultSet = stmt.executeQuery(sql);
			while (resultSet.next()) {
				UserInfo userInfo = new UserInfo();
				userInfo.setUser_id(resultSet.getInt("user_id"));
				userInfo.setFirst_name(resultSet.getString("first_name"));
				userInfo.setLast_name(resultSet.getString("last_name"));
				userInfo.setUsername(resultSet.getString("username"));
				userInfo.setPassword(resultSet.getInt("passwrd"));
				
				PitchTableDAO pitchTable = DAOFactory.getPitchTableDAO();
				userInfo.setPitch(pitchTable.getByEditorInfo(userInfo));
				
				users.add(userInfo);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	
	@Override
	public void update(UserInfo updatedObj) throws SQLException {
		Connection conn = ConnectionFactory.getConnection(); 
		try {
			String sql = "update user_info set first_name, last_name, role_id, username, passwrd)"
					+ "where user_id=?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, updatedObj.getFirst_name() + " " + updatedObj.getLast_name());
			pStmt.setString(2, updatedObj.getUsername());
			pStmt.setInt(3, updatedObj.getPassword());
			pStmt.setInt(4, 1);
			pStmt.setInt(5, updatedObj.getUser_id());
			
			conn.setAutoCommit(false); // for ACID (transaction management)
			int rowsUpdated = pStmt.executeUpdate();
			
			if (rowsUpdated==1) {
				conn.commit();
			} else {
				conn.rollback();
				throw new SQLException("ERROR: no object found to update");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			throw e;
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void delete(UserInfo objToDelete) throws SQLException {
		// TODO Auto-generated method stub
			Connection conn = ConnectionFactory.getConnection();
			try {
				String sql = "delete from user_info where user_id=?";
				PreparedStatement pStmt = conn.prepareStatement(sql);
				pStmt.setInt(1, objToDelete.getUser_id());
				
				conn.setAutoCommit(false); // for ACID (transaction management)
				int rowsUpdated = pStmt.executeUpdate();
				
				if (rowsUpdated==1) {
					conn.commit();
				} else {
					conn.rollback();
					throw new SQLException("ERROR: no object found to delete");
				}
			} catch (SQLException e) {
				e.printStackTrace();
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				throw e;
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	@Override
	public UserInfo getByUsername(String username) {
		// TODO Auto-generated method stub
		UserInfo userDetails = null;
		try (Connection conn = ConnectionFactory.getConnection()) {
			String sql = "select * from user_info left join editor on user_info.user_Id=editor.editor_id"
					+ " where user_info.username = ?";
			PreparedStatement pStmt = conn.prepareStatement(sql);
			pStmt.setString(1, username);
			
			ResultSet resultSet = pStmt.executeQuery();
			if (resultSet.next()) {
				userDetails = new UserInfo();
				userDetails.setUser_id(resultSet.getInt("user_id"));
				userDetails.setFirst_name(resultSet.getString("first_name"));
				userDetails.setLast_name(resultSet.getString("last_name"));
				userDetails.setPassword(resultSet.getInt("passwrd"));
				
				PitchTableDAO pitchTable = DAOFactory.getPitchTableDAO();
				userDetails.setPitch(pitchTable.getByEditorInfo(userDetails));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userDetails;
	}

	@Override
	public List<UserInfo> getByLastName(String last_name) {
		// TODO Auto-generated method stub
				UserInfo getLN = null;
				try (Connection conn = ConnectionFactory.getConnection()) {
					String sql = "select * from user_info left join editor on user_info.user_Id=editor.editor_id"
							+ " where user_info.last_name = ?";
					PreparedStatement pStmt = conn.prepareStatement(sql);
					pStmt.setString(1, last_name);
					
					ResultSet resultSet = pStmt.executeQuery();
					if (resultSet.next()) {
						getLN = new UserInfo();
						getLN.setUser_id(resultSet.getInt("user_id"));
						getLN.setFirst_name(resultSet.getString("first_name"));
						getLN.setLast_name(resultSet.getString("last_name"));
						getLN.setPassword(resultSet.getInt("passwrd"));
						
						PitchTableDAO pitchTable = DAOFactory.getPitchTableDAO();
						getLN.setPitch(pitchTable.getByEditorInfo(getLN));
					}
					
				} catch (SQLException e) {
					e.printStackTrace();
				}
				return getLN;
			}




	@Override
	public void updatePitch_table(int pitch_id, String tentative_title, String blurb, String description, int user_id,
			int editor_id, int genre_id, int word_count_length, int author_id, int expected_completion_date, String status_name, 
			String genre_name) throws SQLException {
			Connection conn = ConnectionFactory.getConnection();
			try {
				String sql = "insert into story_pitch (pitch_id, tentative_title, blurb, description, user_id, word_count_length, author_id, expected_completion_date, genre_name) values (?,?,?,?,?,?,?,?,?)";
				PreparedStatement pStmt = conn.prepareStatement(sql);
				pStmt.setInt(1, pitch_id);
				pStmt.setString(2, tentative_title);
				pStmt.setString(3, blurb);
				pStmt.setString(4, description);
				pStmt.setInt(5, user_id);
				pStmt.setInt(6, editor_id);
				pStmt.setInt(7, genre_id);
				pStmt.setInt(8, word_count_length);
				pStmt.setInt(9, author_id);
				pStmt.setInt(10, expected_completion_date);
				pStmt.setString(11, status_name);
				pStmt.setString(12, genre_name);
				
				conn.setAutoCommit(false); // for ACID (transaction management)
				int rowsUpdated = pStmt.executeUpdate();
				
				if (rowsUpdated==1) {
					conn.commit();
				} else {
					conn.rollback();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				try {
					conn.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
				throw e;
			} finally {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}



	@Override
	public List<UserInfo> getbyUserId(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public List<UserInfo> getByFirstName(String first_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePitch_Table(int pitch_id, int user_id) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<Pitch_table> getbyAuthorId(int user_id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public UserInfo getByAuthorId(Pitch_table author_id) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
}