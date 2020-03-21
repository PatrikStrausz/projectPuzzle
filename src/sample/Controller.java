package sample;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Controller {


    public Button btnStart;
    public Button btnExitGame;
    public Button btnReset;

    public Button btn0;
    public Button btn1;
    public Button btn2;
    public Button btn3;
    public Button btn4;
    public Button btn5;
    public Button btn6;
    public Button btn7;
    public Button btn8;
    public Button btn9;
    public Button btn10;
    public Button btn11;
    public Button btn12;
    public Button btn13;
    public Button btn14;
    public Button btn15;

    private Game game;

    private Button[][] buttons = {
            {btn0, btn1},
            {btn4,btn5}
    };


    public Controller() {

        game = new Game();

    }




    public void isDisabled(boolean visibility){
        btn0.setDisable(visibility);
        btn1.setDisable(visibility);
        btn2.setDisable(visibility);
        btn3.setDisable(visibility);
        btn4.setDisable(visibility);
        btn5.setDisable(visibility);
        btn6.setDisable(visibility);
        btn7.setDisable(visibility);
        btn8.setDisable(visibility);
        btn9.setDisable(visibility);
        btn10.setDisable(visibility);
        btn11.setDisable(visibility);
        btn12.setDisable(visibility);
        btn13.setDisable(visibility);
        btn14.setDisable(visibility);
        btn15.setDisable(visibility);
    }

    public void initialize() {

        isDisabled(true);



    }

    public void reset() {
        game.reset();
        btnStart.setDisable(true);

    }

    public void start() {
        game.start();
        btnStart.setDisable(true);
        isDisabled(false);


    }

    public void exit() {
        game.end();
        Stage stage = (Stage) btnExitGame.getScene().getWindow();
        stage.close();

    }









    public void clickBtn0() {
        double x= btn0.getTranslateX();
        double y = btn0.getLayoutY();

        btn0.setLayoutX(btn12.getLayoutX());
        btn0.setLayoutY(btn12.getLayoutY());
        if (btn1.getText().equals(" ")) {
            btn0.setText(" ");
            btn1.setText("1");
        } else if (btn4.getText().equals(" ")) {
            btn0.setText(" ");
            btn4.setText("1");
        }
    }

    public void clickBtn1() {
        if (btn0.getText().equals(" ")) {
            btn0.setText("1");
            btn1.setText(" ");
        } else if (btn2.getText().equals(" ")) {
            btn2.setText("2");
            btn1.setText(" ");
        } else if (btn5.getText().equals(" ")) {
            btn5.setText("2");
            btn1.setText(" ");

        }
    }

    public void clickBtn2() {
        if (btn1.getText().equals(" ")) {
            btn1.setText("3");
            btn2.setText(" ");
        }else if (btn3.getText().equals(" ")) {
            btn3.setText("3");
            btn2.setText(" ");
        }else if (btn6.getText().equals(" ")) {
            btn6.setText("3");
            btn2.setText(" ");
        }

    }

    public void clickBtn3() {
        if (btn2.getText().equals(" ")) {
            btn2.setText("4");
            btn3.setText(" ");
        }else if (btn7.getText().equals(" ")){
            btn7.setText("4");
            btn3.setText("");
        }

    }

    public void clickBtn4() {
        if(btn0.getText().equals(" ")){
            btn0.setText("5");
            btn4.setText(" ");
        }
        else if (btn5.getText().equals(" ")) {
            btn5.setText("5");
            btn4.setText(" ");
        }else if(btn8.getText().equals(" ")){
            btn8.setText("5");
            btn4.setText(" ");
        }

    }

    public void clickBtn5() {
        if(btn1.getText().equals(" ")){
            btn1.setText("6");
            btn5.setText(" ");
        }
        else if (btn4.getText().equals(" ")) {
            btn4.setText("6");
            btn5.setText(" ");
        }else if(btn6.getText().equals(" ")){
            btn6.setText("6");
            btn5.setText(" ");
        }else if(btn9.getText().equals(" ")){
            btn9.setText("6");
            btn5.setText(" ");
        }


    }

    public void clickBtn6() {
        if (btn2.getText().equals(" ")) {
            btn2.setText("7");
            btn6.setText(" ");
        }
        else if (btn5.getText().equals(" ")) {
            btn5.setText("7");
            btn6.setText(" ");
        }
        else if (btn7.getText().equals(" ")) {
            btn7.setText("7");
            btn6.setText(" ");
        } else if (btn10.getText().equals(" ")) {
            btn10.setText("7");
            btn6.setText(" ");
        }


    }

    public void clickBtn7() {
        if (btn3.getText().equals(" ")) {
            btn3.setText("8");
            btn7.setText(" ");
        } else if (btn6.getText().equals(" ")) {
            btn6.setText("8");
            btn7.setText(" ");
        }else if (btn11.getText().equals(" ")) {
            btn11.setText("8");
            btn7.setText(" ");
        }


    }

    public void clickBtn8() {
        if (btn4.getText().equals(" ")) {
            btn4.setText("9");
            btn8.setText(" ");
        } else if (btn13.getText().equals(" ")) {
            btn12.setText(" ");
            btn13.setText("13");
        } else if (btn9.getText().equals(" ")) {
            btn9.setText("10");
            btn8.setText(" ");
        }

    }

    public void clickBtn9() {
        if (btn12.getText().equals(" ")) {
            btn12.setText("10");
            btn9.setText(" ");
        } else if (btn10.getText().equals(" ")) {
            btn10.setText("11");
            btn9.setText(" ");
        } else if (btn8.getText().equals(" ")) {
            btn8.setText("10");
            btn9.setText(" ");
        } else if (btn5.getText().equals(" ")) {
            btn5.setText("10");
            btn9.setText(" ");
        } else if (btn13.getText().equals(" ")) {
            btn9.setText(" ");
            btn13.setText("10");
        }


    }

    public void clickBtn10() {
        if (btn14.getText().equals(" ")) {
            btn14.setText("11");
            btn10.setText(" ");
        } else if (btn9.getText().equals(" ")) {
            btn10.setText(" ");
            btn9.setText("11");
        } else if (btn6.getText().equals(" ")) {
            btn10.setText(" ");
            btn6.setText("7");
        } else if (btn11.getText().equals(" ")) {
            btn10.setText(" ");
            btn11.setText("12");
        }


    }

    public void clickBtn11() {

        if (btn15.getText().equals(" ")) {
            btn15.setText("12");
            btn11.setText(" ");
        } else if (btn10.getText().equals(" ")) {
            btn11.setText(" ");
            btn10.setText("12");
        } else if (btn7.getText().equals(" ")) {
            btn7.setText("8");
            btn11.setText(" ");
        }

    }

    public void clickBtn12() {
        if (btn8.getText().equals(" ")) {
            btn12.setText(" ");
            btn8.setText("9");
        } else if (btn13.getText().equals(" ")) {
            btn12.setText(" ");
            btn13.setText("13");
        } else if (btn9.getText().equals(" ")) {
            btn12.setText(" ");
            btn9.setText("13");
        }


    }

    public void clickBtn13() {

        if (btn14.getText().equals(" ")) {
            btn13.setText(" ");
            btn14.setText("14");
        } else if (btn9.getText().equals(" ")) {
            btn13.setText(" ");
            btn9.setText("10");
        } else if (btn12.getText().equals(" ")) {
            btn12.setText("13");
            btn13.setText(" ");
        }

    }

    public void clickBtn14() {





        if (btn15.getText().equals(" ")) {

            GridPane.setColumnIndex(btn13, 2);
            GridPane.setRowIndex(btn13, 3);
            GridPane.setColumnIndex(btn14, 1);
            GridPane.setRowIndex(btn14, 3);

        }

    }

    public void clickBtn15() {

        if (btn14.getText().equals(" ")) {
            btn15.setText(" ");
            btn14.setText("15");
        } else if (btn11.getText().equals(" ")) {
            btn15.setText(" ");
            btn11.setText("12");
        }
    }
}
