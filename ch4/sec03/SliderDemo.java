import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.*;
import javafx.scene.text.*;
import javafx.stage.*;

public class SliderDemo extends Application {
   public void start(Stage stage) {
      Label message = new Label("Hello, JavaFX!");
      message.setFont(new Font(100));
      Slider slider = new Slider();
      slider.setValue(100);
      slider.valueProperty().addListener(property 
         -> message.setFont(new Font(slider.getValue())));
      VBox root = new VBox();
      root.getChildren().addAll(slider, message);
      Scene scene = new Scene(root);
      stage.setTitle("Hello");
      stage.setScene(scene);
      stage.show();
   }
}


-c 56e07d7 '@org.springframework.web.context.ContextLoader@getCurrentWebApplicationContext().getBean("xxxService").(62531,149)'