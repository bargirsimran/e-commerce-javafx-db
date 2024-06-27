package EcommerceHomeScreen;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import CommanStage.StageHolder;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomeScreenViewer{
	public static void show() {
		URL fxmlUrl;
		
		try {
			fxmlUrl=Paths.get("C:\\Users\\user\\eclipse-workspace\\EcommerceJavaFxDB\\src\\EcommerceHomeScreen\\HomeScreen.fxml").toUri().toURL();
			
			try {
				Parent actorGroup=FXMLLoader.load(fxmlUrl);
				
				Scene scene=new Scene(actorGroup, 600,400);
				
				StageHolder.stage.setTitle("Home Screen");
				StageHolder.stage.setScene(scene);
				StageHolder.stage.show();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
