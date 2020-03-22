package sample;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.event.MouseEvent;
import java.util.Objects;

public class Controller {


    public Button btnStart;
    public Button btnExitGame;
    public Button btnReset;


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
    public Button btn0;
    public GridPane gridPane;

    private Game game;


    public Controller() {

        game = new Game();

    }


    public void isDisabled(boolean visibility) {
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

    private Node getNodeFromGridPane(GridPane gridPane, int col, int row) {
        for (Node node : gridPane.getChildren()) {
            if (GridPane.getColumnIndex(node) == col && GridPane.getRowIndex(node) == row) {
                return node;
            }
        }
        return null;
    }


    public void clickBtn0() {
        Button b0 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 0));
        Button b1 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 0));
        Button b4 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 1));





        if (b1.getText().equals(" ")) {
            GridPane.setColumnIndex(b0, 1);
            GridPane.setRowIndex(b0, 0);
            GridPane.setColumnIndex(b1, 0);
            GridPane.setRowIndex(b1, 0);
        } else if (b4.getText().equals(" ")) {
            GridPane.setColumnIndex(b0, 0);
            GridPane.setRowIndex(b0, 1);
            GridPane.setColumnIndex(b4, 0);
            GridPane.setRowIndex(b4, 0);
        }

    }

    public void clickBtn1() {

        Button b0 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 0));
        Button b1 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 0));
        Button b2 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 0));
        Button b5 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 1));

        if (b0.getText().equals(" ")) {
            GridPane.setColumnIndex(b0, 1);
            GridPane.setRowIndex(b0, 0);
            GridPane.setColumnIndex(b1, 0);
            GridPane.setRowIndex(b1, 0);
        } if (b2.getText().equals(" ")) {
            GridPane.setColumnIndex(b2, 1);
            GridPane.setRowIndex(b2, 0);
            GridPane.setColumnIndex(b1, 2);
            GridPane.setRowIndex(b1, 0);
        }  if (b5.getText().equals(" ")) {
            GridPane.setColumnIndex(b5, 1);
            GridPane.setRowIndex(b5, 0);
            GridPane.setColumnIndex(b1, 1);
            GridPane.setRowIndex(b1, 1);

        }
    }

    public void clickBtn2() {


        Button b1 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 0));
        Button b2 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 0));
        Button b3 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 0));
        Button b6 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 1));

        if (b1.getText().equals(" ")) {
            GridPane.setColumnIndex(b2, 1);
            GridPane.setRowIndex(b2, 0);
            GridPane.setColumnIndex(b1, 2);
            GridPane.setRowIndex(b1, 0);

        } else if (b3.getText().equals(" ")) {
            GridPane.setColumnIndex(b2, 3);
            GridPane.setRowIndex(b2, 0);
            GridPane.setColumnIndex(b3, 2);
            GridPane.setRowIndex(b3, 0);

        } else if (b6.getText().equals(" ")) {
            GridPane.setColumnIndex(b2, 2);
            GridPane.setRowIndex(b2, 1);
            GridPane.setColumnIndex(b6, 2);
            GridPane.setRowIndex(b6, 0);

        }

    }

    public void clickBtn3() {

        Button b2 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 0));
        Button b3 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 0));
        Button b7 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 1));

        if (b2.getText().equals(" ")) {
            GridPane.setRowIndex(b3, 0);
            GridPane.setColumnIndex(b3, 2);
            GridPane.setRowIndex(b2, 0);
            GridPane.setColumnIndex(b2, 3);

        } else if (b7.getText().equals(" ")) {
            GridPane.setRowIndex(b3, 1);
            GridPane.setColumnIndex(b3, 3);
            GridPane.setRowIndex(b7, 0);
            GridPane.setColumnIndex(b7, 3);
        }

    }

    public void clickBtn4() {
        Button b0 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 0));
        Button b4 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 1));
        Button b5 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 1));
        Button b8 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 2));

        if (b0.getText().equals(" ")) {
            GridPane.setRowIndex(b4, 0);
            GridPane.setColumnIndex(b4, 0);
            GridPane.setRowIndex(b0, 1);
            GridPane.setColumnIndex(b0, 0);
        } else if (b5.getText().equals(" ")) {
            GridPane.setRowIndex(b4, 1);
            GridPane.setColumnIndex(b4, 1);
            GridPane.setRowIndex(b5, 1);
            GridPane.setColumnIndex(b5, 0);
        } else if (b8.getText().equals(" ")) {
            GridPane.setRowIndex(b4, 2);
            GridPane.setColumnIndex(b4, 0);
            GridPane.setRowIndex(b8, 1);
            GridPane.setColumnIndex(b8, 0);
        }

    }

    public void clickBtn5() {
        Button b1 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 0));
        Button b4 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 1));
        Button b5 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 1));
        Button b6 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 1));
        Button b9 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 2));

        if (b1.getText().equals(" ")) {
            GridPane.setRowIndex(b5, 0);
            GridPane.setColumnIndex(b5, 1);
            GridPane.setRowIndex(b1, 1);
            GridPane.setColumnIndex(b1, 1);
        } else if (b4.getText().equals(" ")) {
            GridPane.setRowIndex(b5, 1);
            GridPane.setColumnIndex(b5, 0);
            GridPane.setRowIndex(b4, 1);
            GridPane.setColumnIndex(b4, 1);
        } else if (b6.getText().equals(" ")) {
            GridPane.setRowIndex(b5, 1);
            GridPane.setColumnIndex(b5, 2);
            GridPane.setRowIndex(b6, 1);
            GridPane.setColumnIndex(b6, 1);
        } else if (b9.getText().equals(" ")) {
            GridPane.setRowIndex(b5, 2);
            GridPane.setColumnIndex(b5, 1);
            GridPane.setRowIndex(b9, 1);
            GridPane.setColumnIndex(b9, 1);
        }


    }

    public void clickBtn6() {
        Button b2 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 0));
        Button b5 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 1));
        Button b6 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 1));
        Button b7 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 1));
        Button b10 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 2));



        if (b2.getText().equals(" ")) {
            GridPane.setRowIndex(b6, 0);
            GridPane.setColumnIndex(b6, 2);
            GridPane.setRowIndex(b2, 1);
            GridPane.setColumnIndex(b2, 2);
        } else if (b5.getText().equals(" ")) {
            GridPane.setRowIndex(b6, 1);
            GridPane.setColumnIndex(b6, 1);
            GridPane.setRowIndex(b5, 1);
            GridPane.setColumnIndex(b5, 2);
        } else if (b7.getText().equals(" ")) {
            GridPane.setRowIndex(b6, 1);
            GridPane.setColumnIndex(b6, 3);
            GridPane.setRowIndex(b7, 1);
            GridPane.setColumnIndex(b7, 2);
        } else if (b10.getText().equals(" ")) {
            GridPane.setRowIndex(b6, 2);
            GridPane.setColumnIndex(b6, 2);
            GridPane.setRowIndex(b10, 1);
            GridPane.setColumnIndex(b10, 2);
        }


    }

    public void clickBtn7() {

        Button b3 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 0));
        Button b6 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 1));
        Button b7 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 1));
        Button b11 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 2));


        if (b3.getText().equals(" ")) {
            GridPane.setRowIndex(b7, 0);
            GridPane.setColumnIndex(b7, 3);
            GridPane.setRowIndex(b3, 1);
            GridPane.setColumnIndex(b3, 3);
        } else if (b6.getText().equals(" ")) {
            GridPane.setRowIndex(b7, 1);
            GridPane.setColumnIndex(b7, 2);
            GridPane.setRowIndex(b6, 1);
            GridPane.setColumnIndex(b6, 3);
        } else if (b11.getText().equals(" ")) {
            GridPane.setRowIndex(b7, 2);
            GridPane.setColumnIndex(b7, 3);
            GridPane.setRowIndex(b11, 1);
            GridPane.setColumnIndex(b11, 3);
        }


    }

    public void clickBtn8() {


        Button b4 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 1));
        Button b8 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 2));
        Button b9 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 2));
        Button b12 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 3));



        if (b4.getText().equals(" ")) {
            GridPane.setRowIndex(b8, 1);
            GridPane.setColumnIndex(b8, 0);
            GridPane.setRowIndex(b4, 2);
            GridPane.setColumnIndex(b4, 0);
        } else if (b12.getText().equals(" ")) {
            GridPane.setRowIndex(b8, 3);
            GridPane.setColumnIndex(b8, 0);
            GridPane.setRowIndex(b12, 2);
            GridPane.setColumnIndex(b12, 0);
        } else if (b9.getText().equals(" ")) {
            GridPane.setRowIndex(b8, 3);
            GridPane.setColumnIndex(b8, 1);
            GridPane.setRowIndex(b9, 3);
            GridPane.setColumnIndex(b9, 0);
        }

    }

    public void clickBtn9() {

        Button b5 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 1));
        Button b8 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 2));
        Button b9 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 2));
        Button b10 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 2));
        Button b13 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 3));



        if (b5.getText().equals(" ")) {
            GridPane.setRowIndex(b9, 1);
            GridPane.setColumnIndex(b9, 1);
            GridPane.setRowIndex(b5, 2);
            GridPane.setColumnIndex(b5, 1);
        } else if (b8.getText().equals(" ")) {
            GridPane.setRowIndex(b9, 2);
            GridPane.setColumnIndex(b9, 0);
            GridPane.setRowIndex(b8, 2);
            GridPane.setColumnIndex(b8, 1);

        }
        else if (b10.getText().equals(" ")) {
            GridPane.setRowIndex(b9, 2);
            GridPane.setColumnIndex(b9, 2);
            GridPane.setRowIndex(b10, 2);
            GridPane.setColumnIndex(b10, 1);
        } else if (b13.getText().equals(" ")) {
            GridPane.setRowIndex(b9, 3);
            GridPane.setColumnIndex(b9, 1);
            GridPane.setRowIndex(b13, 2);
            GridPane.setColumnIndex(b13, 1);
        }


    }

    public void clickBtn10() {

        Button b6 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 1));
        Button b9 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 2));
        Button b10 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 2));
        Button b11 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 2));
        Button b14 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 3));

        if (b6.getText().equals(" ")) {
            GridPane.setRowIndex(b10, 1);
            GridPane.setColumnIndex(b10, 2);
            GridPane.setRowIndex(b6, 2);
            GridPane.setColumnIndex(b6, 2);
        } else if (b9.getText().equals(" ")) {
            GridPane.setRowIndex(b10, 2);
            GridPane.setColumnIndex(b10, 1);
            GridPane.setRowIndex(b9, 2);
            GridPane.setColumnIndex(b9, 2);
        }

        else if (b11.getText().equals(" ")) {
            GridPane.setRowIndex(b10, 2);
            GridPane.setColumnIndex(b10, 3);

            GridPane.setRowIndex(b11, 2);
            GridPane.setColumnIndex(b11, 2);
        } else if (b14.getText().equals(" ")) {
            GridPane.setRowIndex(b10, 3);
            GridPane.setColumnIndex(b10, 2);
            GridPane.setRowIndex(b14, 2);
            GridPane.setColumnIndex(b14, 2);
        }


    }



    public void clickBtn11() {

        Button b7 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 1));
        Button b10 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 2));
        Button b11 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 2));
        Button b15 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 3));


        if (b7.getText().equals(" ")) {
            GridPane.setRowIndex(b11, 1);
            GridPane.setColumnIndex(b11, 3);
            GridPane.setRowIndex(b7, 2);
            GridPane.setColumnIndex(b7, 3);
        } else if (b10.getText().equals(" ")) {
            GridPane.setRowIndex(b11, 2);
            GridPane.setColumnIndex(b11, 2);
            GridPane.setRowIndex(b10, 2);
            GridPane.setColumnIndex(b10, 3);
        } else if (b15.getText().equals(" ")) {

            GridPane.setRowIndex(b11, 3);
            GridPane.setColumnIndex(b11, 3);
            GridPane.setRowIndex(b15, 2);
            GridPane.setColumnIndex(b15, 3);

        }


    }


    public void clickBtn12() {
        Button b8 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 2));
        Button b12 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 3));
        Button b13 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 3));


        if (b8.getText().equals(" ")) {
            GridPane.setRowIndex(b12, 2);
            GridPane.setColumnIndex(b12, 0);
            GridPane.setRowIndex(b8, 3);
            GridPane.setColumnIndex(b8, 0);
        } else if (b13.getText().equals(" ")) {
            GridPane.setRowIndex(b12, 3);
            GridPane.setColumnIndex(b12, 1);
            GridPane.setRowIndex(b13, 3);
            GridPane.setColumnIndex(b13, 0);
        }


    }

    public void clickBtn13() {

        Button b9 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 2));
        Button b12 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 3));
        Button b13 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 3));
        Button b14 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 3));

        if (b14.getText().equals(" ")) {
            GridPane.setRowIndex(b13, 3);
            GridPane.setColumnIndex(b13, 2);
            GridPane.setRowIndex(b14, 3);
            GridPane.setColumnIndex(b14, 1);
        } else if (b9.getText().equals(" ")) {
            GridPane.setRowIndex(b13, 2);
            GridPane.setColumnIndex(b13, 1);
            GridPane.setRowIndex(b9, 3);
            GridPane.setColumnIndex(b9, 1);
        } else if (b12.getText().equals(" ")) {
            GridPane.setRowIndex(b13, 2);
            GridPane.setColumnIndex(b13, 0);
            GridPane.setRowIndex(b12, 3);
            GridPane.setColumnIndex(b12, 1);
        }

    }

    public void clickBtn14() {


        Button b10 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 2));
        Button b13 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 3));
        Button b14 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 3));
        Button b15 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 3));


        if (b15.getText().equals(" ")) {

            GridPane.setRowIndex(b14, 3);
            GridPane.setColumnIndex(b14, 3);
            GridPane.setRowIndex(b15, 3);
            GridPane.setColumnIndex(b15, 2);

        }else if (b13.getText().equals(" ")) {
            GridPane.setRowIndex(b14, 3);
            GridPane.setColumnIndex(b14, 1);
            GridPane.setRowIndex(b13, 3);
            GridPane.setColumnIndex(b13, 2);
        }else if (b10.getText().equals(" ")) {
            GridPane.setRowIndex(b14, 2);
            GridPane.setColumnIndex(b14, 2);
            GridPane.setRowIndex(b10, 3);
            GridPane.setColumnIndex(b10, 2);
        }

    }

    public void clickBtn15() {

        Button b11 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 2));
        Button b14 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 3));
        Button b15 = (Button)  Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 3));

        if (b14.getText().equals(" ")) {
            GridPane.setRowIndex(b14, 3);
            GridPane.setColumnIndex(b14, 3);
            GridPane.setRowIndex(b15, 3);
            GridPane.setColumnIndex(b15, 2);
        } else if (b11.getText().equals(" ")) {
            GridPane.setRowIndex(b11, 3);
            GridPane.setColumnIndex(b11, 3);
            GridPane.setRowIndex(b15, 2);
            GridPane.setColumnIndex(b15, 3);
        }
    }
}
