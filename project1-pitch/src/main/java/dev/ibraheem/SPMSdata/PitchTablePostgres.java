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

public class PitchTablePostgres implements PitchTableDAO{

	@Override
	public int create(Pitch_table newObj) {
		// TODO Auto-generated method stub
				int generatedId = 0;
				Connection conn = ConnectionFactory.getConnection();
				try {
					String sql = "insert into story_pitch ( pitch_id,tentative_title, blurb, description, user_id, editor_id, genre_id, word_count_length, author_id, expected_completion_date, status_name, genre_name)"
							+ " values (?,?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pStmt = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
					pStmt.setString(2, newObj.getTentative_title());
					pStmt.setString(3, newObj.getBlurb());
					pStmt.setString(4, newObj.getDescription());
					pStmt.setInt(5, newObj.getUser_id());
					pStmt.setInt(8, newObj.getWord_count_length());
					pStmt.setInt(10, newObj.getExpected_completion_date());
					pStmt.setString(12, newObj.getGenre_name());
					
					
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

	@Override
	public Pitch_table getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pitch_table> getAll() {
		List<Pitch_table> ptable = new LinkedList<>();
		try (Connection conn = ConnectionFactory.getConnection()) {
			// left join because we want ALL the people even if they don't have any pets.
			// a full join would be fine too since everything in the pet_owner table
			// will have a user associated with it, but a left join makes more sense logically
			String sql = "select * from story_pitch ";
			Statement stmt = conn.createStatement();
			
			ResultSet resultSet = stmt.executeQuery(sql);
			while (resultSet.next()) {
				Pitch_table pitchtable = new Pitch_table();
				pitchtable.setUser_id(resultSet.getInt("user_id"));
				pitchtable.setAuthor_id(resultSet.getInt("author_id"));
				
				PitchTableDAO pitchTable = DAOFactory.getPitchTableDAO();
				pitchTable.setPitch(pitchTable.getByUserInfo(pitchtable));
				
				ptable.add(pitchtable);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ptable;
	}
		

	@Override
	public void delete(Pitch_table objToDelete) throws SQLException {
		// TODO Auto-generated method stub
		
	}


	@Override
	public List<Pitch_table> getByRole_id(int role_id, int user_id) {
		// TODO Auto-generated method stub
		return null;
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
	public void update(Pitch_table updatedObj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getByUserInfo(Pitch_table pitchtable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPitch(Object byUserInfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pitch_table getByAuthorId(Pitch_table author_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pitch_table> getByEditor(int editor_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pitch_table> getByAuthor(int author_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pitch_table> getByStatus_name(String status_name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pitch_table> getByEditorInfo(UserInfo userInfo) {
		// TODO Auto-generated method stub
		return null;
	}
			
	}

