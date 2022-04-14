package dev.ibraheem.SPMSmain;
import dev.ibraheem.project1.UserInfo;
import dev.ibraheem.project1.Genre;
import dev.ibraheem.SPMSServices.ConnectionFactory;
import dev.ibraheem.SPMSdata.DAOFactory;
import dev.ibraheem.SPMSdata.UserInfoDAO;
import io.javalin.Javalin;


public class StoryProjectMain {

	//private static final String user_info = null;

	public static void main(String[] args) {
		Javalin app;
		app = Javalin.create();
		app.start(8081);		// start up the javalin server for http requests
		
	app.get("/hello",ctx -> ctx.result("Hello World"));		
	}
	
    app.post("/get" ) { ctx -> ctx.
		
		
		
	}


