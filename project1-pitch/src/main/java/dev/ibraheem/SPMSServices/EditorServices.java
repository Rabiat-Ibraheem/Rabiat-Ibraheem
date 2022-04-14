package dev.ibraheem.SPMSServices;
import java.util.List;
import dev.ibraheem.project1.Pitch_table;
import dev.ibraheem.project1.UserInfo;
import dev.ibraheem.project1.*;


public interface EditorServices {


		
public List<Pitch_table> searchPitchbyEditorId(int editor_id);
		
		 
		
		
public List<Pitch_table> searchPitch_status(String status_name);
		/**
		 * 
		 * @param id
		 * @return the pet with the specified ID
		 */
public List<Pitch_table> searchBy_author(int author_id);




	
		
		}


