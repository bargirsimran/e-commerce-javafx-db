package EcommerceUserManagement;

import java.io.IOException;
import java.net.URL;
import java.nio.file.Paths;

import CommanStage.StageHolder;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;

public class UserScreenViewer {
public static void show() throws IOException {
		
		URL fxmlUrl;
		
		fxmlUrl=Paths.get("C:\\Users\\user\\eclipse-workspace\\EcommerceJavaFxDB\\src\\EcommerceUserManagement\\UserManagementScreen.fxml").toUri().toURL();
	
		Parent actorGroup=FXMLLoader.load(fxmlUrl);
		
		Scene scene=new Scene(actorGroup, 600, 500);
		
		StageHolder.stage.setTitle("Product Management");
		StageHolder.stage.setScene(scene);
		StageHolder.stage.show();
	
}
}
