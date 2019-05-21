package intro_lambda_expression;

import java.util.Optional;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Demo extends Application{
	private int x = 3;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Button button = new Button("OK");
		button.setMaxSize(80,30);
		
		
//		button.setOnAction(new MyEventHandler());
		button.setOnAction(e -> {
			x = x + 3;
			System.out.println("Button clicked!" + x);
		});
		
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("ID");
		dialog.setContentText("Enter an ID");
		dialog.setHeaderText("ID, Please");
		Optional<String> result = dialog.showAndWait();
		result.ifPresent(idnumber -> {
			System.out.println(idnumber);
		});
		
		HBox root = new HBox();
		root.setAlignment(Pos.CENTER);
		root.getChildren().add(button);
		Scene scene = new Scene(root, 300, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}
}
