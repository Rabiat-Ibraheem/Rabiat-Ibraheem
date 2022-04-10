package dev.ibraheem.SPMSdata;

public class DAOFactory {
	//DAO Factory
	private static EditorDAO editorDAO = null;
	private static GenreDAO genreDAO = null;
	private static PitchTableDAO pitchTableDAO = null;
	private static StatusInfoDAO statusInfoDAO = null;
	private static UserInfoDAO userInfoDAO = null;
	
	private DAOFactory()	{
		
	}

	public static EditorDAO getEditorDAO() {
		return editorDAO;
	}

	public static void setEditorDAO(EditorDAO editorDAO) {
		DAOFactory.editorDAO = editorDAO;
	}

	public static GenreDAO getGenreDAO() {
		return genreDAO;
	}

	public static void setGenreDAO(GenreDAO genreDAO) {
		DAOFactory.genreDAO = genreDAO;
	}

	public static PitchTableDAO getPitchTableDAO() {
		return pitchTableDAO;
	}

	public static void setPitchTableDAO(PitchTableDAO pitchTableDAO) {
		DAOFactory.pitchTableDAO = pitchTableDAO;
	}

	public static StatusInfoDAO getStatusInfoDAO() {
		return statusInfoDAO;
	}

	public static void setStatusInfoDAO(StatusInfoDAO statusInfoDAO) {
		DAOFactory.statusInfoDAO = statusInfoDAO;
	}

	public static UserInfoDAO getUserInfoDAO() {
		return userInfoDAO;
	}

	public static void setUserInfoDAO(UserInfoDAO userInfoDAO) {
		DAOFactory.userInfoDAO = userInfoDAO;
	}

	
}
