package EcommerceSearchProduct;

import java.sql.ResultSet;
import java.sql.SQLException;

import CommonDatabse.DBUtils;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class SearchProductController {
	
	@FXML
	TextField ProductIdToSearch;
	
	@FXML
	Button SearchProductButton;
	
	@FXML
	Label ProductFoundMsg;
	
	public void searchProduct() throws NumberFormatException, SQLException {
		String ProductIdToSearchField=ProductIdToSearch.getText();
		
		if(validatesearchProduct(Integer.parseInt(ProductIdToSearchField))){
			ProductFoundMsg.setText("Product Found!!");
			ProductFoundMsg.setTextFill(Color.GREEN);
		}
		else {
			ProductFoundMsg.setText("Product Not Found!!");
			ProductFoundMsg.setTextFill(Color.RED);
		}
	}
	public boolean validatesearchProduct(int ProductId) throws SQLException {
		String query="SELECT * FROM product where product_id='"+ProductId+"'";
		
		ResultSet result=DBUtils.executeSelectQuery(query);
		
		return result.next();
	}
	
}
