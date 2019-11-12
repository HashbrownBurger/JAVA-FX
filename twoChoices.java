import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


/*that presents two buttons and a number (initially 50) to the user.
Label the buttons Increment and Decrement.
When the increment button is pushed,
increment the display value and likewise for the decrement button.
 */
public class twoChoices extends Application {
    private int count;
    private Text countText;

    public void start(Stage stage) {
        count = 50;
        countText = new Text("Pushes: 50");

        Button pushUp = new Button("Push Me To Get High!");
        pushUp.setOnAction(this::processButtonPressUp);

        Button pushDown = new Button("Push Me To Get Low!");
        pushDown.setOnAction(this::processButtonPressDown);

        FlowPane pane = new FlowPane(pushDown, countText, pushUp);
        pane.setAlignment(Pos.CENTER);
        pane.setHgap(5);
        pane.setStyle("-fx-background-color: purple");

        Scene scene = new Scene(pane, 100, 100);

        stage.setTitle("Up or Down");
        stage.setScene(scene);
        stage.show();
    }
    private void processButtonPressUp(ActionEvent event)
    {
        count += 1;
        countText.setText("" + count);
    }
    private void processButtonPressDown(ActionEvent event)
    {
        count -= 1;
        countText.setText("" + count);
    }
}