package EcommerceProductManagement;

import java.io.IOException;

import EcommerceAddProduct.AddProductViewer;
import EcommerceEditProduct.EditProductViewer;
import EcommerceSearchProduct.SearchProductViewer;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
 
public class ProductManagementController {
	
	@FXML
	Button AddProduct;
	
	@FXML
	Button UpdateProduct;
	
	@FXML
	Button SearchProduct;
	
	@FXML
	Button ViewProduct;
	
	@FXML
	Button DeleteProduct;
	
	@FXML
	Button ExitProduct;
	
	public void addProduct() throws IOException {
		AddProductViewer.show();
	}
	public void updateProduct() throws IOException {
		EditProductViewer.show();
	}
	public void searchProduct() throws IOException {
		SearchProductViewer.show();
	}
}
