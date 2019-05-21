package intro_lambda_expression;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class MyEventHandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		System.out.println("Button clicked!");
	}
}
