import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.application.*;

public class Controller implements Initializable {

  @FXML
  private ImageView person4;

  @FXML
  private Slider slider;

  @FXML
  private ImageView person3;

  @FXML
  private ImageView person2;

  @FXML
  private ImageView person1;

  @FXML
  private TextField field;

  @FXML
  private Label year;

  @FXML
  private ImageView person6;

  @FXML
  private ImageView person5;
  

  int INIT_VALUE = 0;
  int slide = INIT_VALUE;
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    slider.setValue(INIT_VALUE);
    Image picture;
    try {
      picture = new Image(new FileInputStream("Assets/203593-200.png));
      foodPicture.setImage(picture);
    } catch (FileNotFoundException e) {

    }
    if(slide == 1) {
      person1.setVisible(false);
    } else if(slide == 2) {
      person1.setVisible(false);
      person2.setVisible(false);
    }else {
      person1.setVisible(true);
      person2.setVisible(true);
      person3.setVisible(true);
      person4.setVisible(true);
      person5.setVisible(true);
      person6.setVisible(true);
    }
   
    /*switch  (INIT_VALUE) {
      case 1:
        person1.setVisible(true);
        break;
      case 2:
        person1.setVisible(true);
        person2.setVisible(true);
        break;
      case 3:
        person1.setVisible(true);
        person2.setVisible(true);
        person3.setVisible(true);
        break;
      case 4:
        person1.setVisible(true);
        person2.setVisible(true);
        person3.setVisible(true);
        person4.setVisible(true);
        break;
      case 5:
        person1.setVisible(true);
        person2.setVisible(true);
        person3.setVisible(true);
        person4.setVisible(true);
        person5.setVisible(true);
        break;
      case 6:
        person1.setVisible(true);
        person2.setVisible(true);
        person3.setVisible(true);
        person4.setVisible(true);
        person5.setVisible(true);
        person6.setVisible(true);
        break;
        
      default:
        person1.setVisible(false);
        person2.setVisible(false);
        person3.setVisible(false);
        person4.setVisible(false);
        person5.setVisible(false);
        person6.setVisible(false);
        break;
    }*/
    }
  }
