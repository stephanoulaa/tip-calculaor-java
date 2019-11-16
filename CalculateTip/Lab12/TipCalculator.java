import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.geometry.Pos;
import javafx.geometry.Insets;

public class TipCalculator extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) {
        Label label1 = new Label("Restaurant Charge:");
        TextField charge = new TextField();
        Button button = new Button("Calculate Tip");
        Label label2 = new Label("Amount to Tip:");
        Label tip = new Label("");
        
        //create event handler on button
        button.setOnAction(event -> {
            Double tipValue = Double.parseDouble(charge.getText())*0.2;
            tip.setText("$" + String.format("%,.2f", tipValue));
        }
        );
        
        
        VBox box = new VBox(10, label1, charge, button, label2, tip);
        box.setAlignment(Pos.CENTER);
        box.setPadding(new Insets(10));
        
        //create scene
        Scene scene = new Scene(box);
        
        //set scene to the stage
        stage.setScene(scene);
        
        //display scene on stage
        stage.show();
        
    }
    
}