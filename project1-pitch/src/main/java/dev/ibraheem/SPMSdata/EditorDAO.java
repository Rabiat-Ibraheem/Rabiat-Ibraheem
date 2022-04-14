package dev.ibraheem.SPMSdata;

import java.util.List;
import dev.ibraheem.project1.Editor;
import dev.ibraheem.project1.UserInfo;

//EditorDAO inherits the genericDAO so whichever class 
//implements the interface would get the types for the Editor table
public interface EditorDAO extends GenericDAO<Editor>{
	
	public Editor getById(int editor_id);
	
	
	
	
}


