package EcommerceUserManagement;

import java.io.IOException;

import EcommerceAddProduct.AddProductViewer;
import EcommerceAddUser.AddUserViewer;
import EcommerceEditProduct.EditProductViewer;
import EcommerceSearchProduct.SearchProductViewer;
import EcommerceUpdateUser.UserUpdatedViewer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class UserScreenController {
	
	@FXML
	Button AddUser;
	
	@FXML
	Button EditUser;
	
	@FXML
	Button SearchUser;
	
	@FXML
	Button ViewUser;
	
	@FXML
	Button deleteUser;
	
	@FXML
	Button ExitButton;
	
	public void addUser() throws IOException {
		AddUserViewer.show();
	}
	public void updateUser() throws IOException {
		UserUpdatedViewer.show();
	}
//	public void searchProduct() throws IOException {
//		SearchProductViewer.show();
//	}
}
