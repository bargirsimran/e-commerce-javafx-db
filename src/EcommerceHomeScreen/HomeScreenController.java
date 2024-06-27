package EcommerceHomeScreen;

import java.io.IOException;

import EcommerceAddProduct.AddProductViewer;
import EcommerceUserManagement.UserScreenViewer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeScreenController {
	
	@FXML
	Button ProductId;
	
	@FXML
	Button UserId;
	
	@FXML
	Button LogOut;

	public void addProductButtonClick() throws IOException {
		System.out.println("Add Product Button");
		EcommerceProductManagement.ProductManagementViewer.show();
		
	}
	
	public void addUserButtonClick() throws IOException {
		System.out.println("Add User Button");
		UserScreenViewer.show();
	}
	
	public void logOutButtonClick() {
		System.out.println("Logout Button Click");
	}
}
