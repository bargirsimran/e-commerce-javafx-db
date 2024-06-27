package EcommerceLoginJavaFx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;
import java.nio.file.Paths;

import CommanStage.StageHolder;

public class LoginViewerJavaFx extends Application{
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stageCreatedByJavaFx) throws Exception{
		StageHolder.stage=stageCreatedByJavaFx;
		
		URL fxmlURL=Paths.get("C:\\Users\\user\\eclipse-workspace\\EcommerceJavaFxDB\\src\\EcommerceLoginJavaFx\\LoginForm.fxml").toUri().toURL();
		
		
		Parent actorGroup=FXMLLoader.load(fxmlURL);
		
		
		Scene scene=new Scene(actorGroup, 700, 400);
		
		
		StageHolder.stage.setTitle("User Login");
		StageHolder.stage.setScene(scene);
		StageHolder.stage.show();
	}
}
