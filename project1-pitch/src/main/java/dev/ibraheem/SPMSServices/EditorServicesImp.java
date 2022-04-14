package dev.ibraheem.SPMSServices;

import java.util.List;

import dev.ibraheem.SPMSdata.DAOFactory;
import dev.ibraheem.SPMSdata.PitchTableDAO;
import dev.ibraheem.SPMSdata.UserInfoDAO;
import dev.ibraheem.project1.Pitch_table;
import dev.ibraheem.project1.UserInfo;

public class EditorServicesImp implements EditorServices{
	private UserInfoDAO userInfoDao = DAOFactory.getUserInfoDAO();
	private PitchTableDAO pitchDao = DAOFactory.getPitchTableDAO();
	
	
	@Override
	public List<Pitch_table> searchPitchbyEditorId(int editor_id) {
		return pitchDao.getByEditor(editor_id);
	}
	@Override
	public List<Pitch_table> searchPitch_status(String status_name) {
		return pitchDao.getByStatus_name("Pending Editor Approval");
	}
	@Override
	public List<Pitch_table> searchBy_author(int author_id) {
		return pitchDao.getByAuthor(author_id);
	}
	
}

	