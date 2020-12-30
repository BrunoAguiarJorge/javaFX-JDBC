package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable{

	
	//menu attributes 
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;

	@FXML
	private MenuItem menuItemAbout;

	
	//Create eventHandlers for the menu attributes
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("onMenuItemSellerAction");
		
	}
	
	@FXML
	public void onmenuItemDepartmentAction() {
		System.out.println("onmenuItemDepartment");
		
	}
	
	@FXML
	public void onmenuItemAboutAction() {
		System.out.println("onmenuItemAbout");
		
	}
	
	@Override
	public void initialize(URL uri, ResourceBundle rb) {
		// TODO Auto-generated method stub
		
	}

	
}
