/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khmerunicodetypingse;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

/**
 * FXML Controller class
 *
 * @author YCODE
 */
public class MainFormController implements Initializable {

    @FXML
    private TextArea txtBack;
    @FXML
    private TextArea txtFront;
    char[] arrCha;
    int i = 0;
    @FXML
    private Label lblTodo;
    @FXML
    private GridPane btn2;
    @FXML
    private GridPane btn6;
    @FXML
    private GridPane btn7;
    @FXML
    private GridPane btn8;
    @FXML
    private GridPane btnMinus;
    @FXML
    private GridPane btnEual;
    @FXML
    private GridPane btnTab;
    @FXML
    private GridPane btnQ;
    @FXML
    private GridPane btnW;
    @FXML
    private GridPane btnE;
    @FXML
    private GridPane btnR;
    @FXML
    private GridPane btnT;
    @FXML
    private GridPane btnY;
    @FXML
    private GridPane btnU;
    @FXML
    private GridPane btnI;
    @FXML
    private GridPane btnO;
    @FXML
    private GridPane btnP;
    @FXML
    private GridPane btnLeftBrac;
    @FXML
    private GridPane btnRightBrac;
    @FXML
    private GridPane btnBackSlash;
    @FXML
    private GridPane btnA;
    @FXML
    private GridPane btnS;
    @FXML
    private GridPane btnD;
    @FXML
    private GridPane btnF;
    @FXML
    private GridPane btnG;
    @FXML
    private GridPane btnH;
    @FXML
    private GridPane btnJ;
    @FXML
    private GridPane btnK;
    @FXML
    private GridPane btnL;
    @FXML
    private GridPane btnSimicol;
    @FXML
    private GridPane btnSingleQuote;
    @FXML
    private GridPane btnLeftShift;
    @FXML
    private GridPane btnZ;
    @FXML
    private GridPane btnX;
    @FXML
    private GridPane btnC;
    @FXML
    private GridPane btnV;
    @FXML
    private GridPane btnB;
    @FXML
    private GridPane btnN;
    @FXML
    private GridPane btnM;
    @FXML
    private GridPane btnComma;
    @FXML
    private GridPane btnPeriod;
    @FXML
    private GridPane btnForwardSlash;
    @FXML
    private GridPane btnRightShift;
    @FXML
    private GridPane btnLeftAlt;
    @FXML
    private GridPane btnSpace;
    @FXML
    private GridPane btnRightAlt;
    @FXML
    private AnchorPane bgKey;
    @FXML
    private GridPane btnEnter;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        txtFront.setText(readLesson("C:\\Users\\YCODE\\Documents\\NetBeansProjects\\KhmerUnicodeTypingSE\\src\\khmerunicodetypingse\\lessons\\lesson1.txt"));
        arrCha = txtFront.getText().toCharArray();
        lblTodo.setText(arrCha[0] + "");
        highlighBtn(arrCha[0] + "");
        txtBack.addEventFilter(KeyEvent.KEY_TYPED, charValidation(arrCha.length));

    }

    private EventHandler<KeyEvent> charValidation(int maxLenght) {
        return new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (i >= arrCha.length - 1) {
                    lblTodo.setText("អបអរសាទរ");
                    reset();
                    event.consume();
                    return;
                }
                if (event.getCharacter().matches("" + arrCha[i] + "") && i <= arrCha.length​ - 1) {
                    i++;
                    if (i < arrCha.length) {
                        if ((int) arrCha[i] == 10) {
                            i = i + 1;

                        }
                        highlighBtn(arrCha[i] + "");
//                        System.out.println((int) arrCha[i] + arrCha[i]);
//                         lblTodo.setText(arrCha[i] + "");
                    }
                } else {
                    System.out.println("incorrrect");
                    event.consume();
                }

            }
        };

    }

    private void reset() {
        for (Node node : bgKey.getChildren()) {
            if (node instanceof GridPane) {
                node.setStyle("-fx-background-color: #f9f9f9ff; -fx-background-radius:10");
            }
        }
    }

    private void highlighBtn(String next) {
        reset();
        lblTodo.setText(next);
        switch (next) {
            //without shift
            case "ឆ":
                btnQ.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឹ":
                btnW.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "េ":
                btnE.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "រ":
                btnR.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ត":
                btnT.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "យ":
                btnY.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ុ":
                btnU.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ិ":
                btnI.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ោ":
                btnO.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ផ":
                btnP.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ៀ":
                btnLeftBrac.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឪ":
                btnRightBrac.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឮ":
                btnBackSlash.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ា":
                btnA.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ស":
                btnS.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ដ":
                btnD.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ថ":
                btnF.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ង":
                btnG.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ហ":
                btnH.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "្":
                btnJ.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                lblTodo.setText("ជើង");
                break;
            case "ក":
                btnK.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ល":
                btnL.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ើ":
                btnSimicol.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "់":
                btnSingleQuote.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឋ":
                btnZ.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ខ":
                btnX.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ច":
                btnC.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "វ":
                btnV.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ប":
                btnB.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ន":
                btnN.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ម":
                btnM.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ុំ":
                btnComma.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "។":
                btnPeriod.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "៊":
                btnForwardSlash.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;

            //with shift
            case "ៗ":
                btn2.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឈ":
                btnQ.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឺ":
                btnW.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ែ":
                btnE.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឬ":
                btnR.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ទ":
                btnT.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ួ":
                btnY.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ូ":
                btnU.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ី":
                btnI.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ៅ":
                btnO.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ភ":
                btnP.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឿ":
                btnLeftBrac.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឧ":
                btnRightBrac.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឭ":
                btnBackSlash.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ាំ":
                btnA.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ៃ":
                btnS.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឌ":
                btnD.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ធ":
                btnF.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "អ":
                btnG.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ះ":
                btnH.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ញ":
                btnJ.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "គ":
                btnK.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឡ":
                btnL.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ោះ":
                btnSimicol.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "៉":
                btnSingleQuote.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឍ":
                btnZ.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ឃ":
                btnX.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ជ":
                btnC.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "េះ":
                btnV.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ព":
                btnB.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnRightShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ណ":
                btnN.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "ំ":
                btnM.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "៕":
                btnPeriod.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "?":
                btnForwardSlash.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case "​":
                lblTodo.setText("ចន្លោះមើលមិនឃើញ");
                btnSpace.setStyle("-fx-background-color:yellow; -fx-background-radius:10");

                break;
            case " ":
                lblTodo.setText("ដកឃ្លា");
                btnSpace.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;
            case " ":
                lblTodo.setText("ចន្លោះភ្ជាប់");
                btnSpace.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                btnLeftShift.setStyle("-fx-background-color:yellow; -fx-background-radius:10");
                break;

            //for
            default:

        }

    }

    private String readLesson(String fileName) {
        Charset charset = Charset.forName("UTF-8");
        BufferedReader br = null;
        String text = "", content = "";
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), charset));
            while ((text = br.readLine()) != null) {
                content += text + "\n";
            };
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MainFormController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFormController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(MainFormController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return content;
    }

    @FXML
    private void keyPress(KeyEvent event) {
        if (event.getCode() == KeyCode.DELETE || event.getCode() == KeyCode.BACK_SPACE || event.getCode() == KeyCode.TAB
                || event.getCode() == KeyCode.TAB || event.getCode() == KeyCode.LEFT || event.getCode() == KeyCode.RIGHT
                || event.getCode() == KeyCode.UP || event.getCode() == KeyCode.DOWN) {
            event.consume();
        }
    }

}
