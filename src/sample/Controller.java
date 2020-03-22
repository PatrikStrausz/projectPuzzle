package sample;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;
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


    public void clickBtn0(ActionEvent event) {
        Button b0 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 0));
        Button b1 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 0));
        Button b4 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 1));

        String id = ((Button) event.getSource()).getId().substring(3);
        int intId = Integer.parseInt(id);

        game.nextMove(intId);

        if (b1.getText().equals(" ")) {
            b1.setText(b0.getText());
            b0.setText(" ");
        } else if (b4.getText().equals(" ")) {
            b4.setText(b0.getText());
            b0.setText(" ");
        }

    }

    public void clickBtn1() {

        Button b0 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 0));
        Button b1 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 0));
        Button b2 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 0));
        Button b5 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 1));

        if (b0.getText().equals(" ")) {
            b0.setText(b1.getText());
            b1.setText(" ");
        } else if (b2.getText().equals(" ")) {
            b2.setText(b1.getText());
            b1.setText(" ");
        } else if (b5.getText().equals(" ")) {
            b5.setText(b1.getText());
            b1.setText(" ");
        }


    }

    public void clickBtn2() {


        Button b1 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 0));
        Button b2 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 0));
        Button b3 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 0));
        Button b6 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 1));



        if (b1.getText().equals(" ")) {
            b1.setText(b2.getText());
            b2.setText(" ");
        } else if (b3.getText().equals(" ")) {
            b3.setText(b2.getText());
            b2.setText(" ");
        } else if (b6.getText().equals(" ")) {
            b6.setText(b2.getText());
            b2.setText(" ");
        }


    }

    public void clickBtn3() {

        Button b2 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 0));
        Button b3 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 0));
        Button b7 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 1));

        if (b2.getText().equals(" ")) {
            b2.setText(b3.getText());
            b3.setText(" ");

        } else if (b7.getText().equals(" ")) {
            b7.setText(b3.getText());
            b3.setText(" ");
        }


    }

    public void clickBtn4() {
        Button b0 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 0));
        Button b4 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 1));
        Button b5 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 1));
        Button b8 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 2));

        if (b0.getText().equals(" ")) {
            b0.setText(b4.getText());
            b4.setText(" ");
        } else if (b5.getText().equals(" ")) {
            b5.setText(b4.getText());
            b4.setText(" ");
        } else if (b8.getText().equals(" ")) {
            b8.setText(b4.getText());
            b4.setText(" ");
        }


    }

    public void clickBtn5() {
        Button b1 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 0));
        Button b4 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 1));
        Button b5 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 1));
        Button b6 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 1));
        Button b9 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 2));

        if (b1.getText().equals(" ")) {
            b1.setText(b5.getText());
            b5.setText(" ");
        } else if (b4.getText().equals(" ")) {
            b4.setText(b5.getText());
            b5.setText(" ");
        } else if (b6.getText().equals(" ")) {
            b6.setText(b5.getText());
            b5.setText(" ");
        } else if (b9.getText().equals(" ")) {
            b9.setText(b5.getText());
            b5.setText(" ");
        }


    }

    public void clickBtn6() {
        Button b2 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 0));
        Button b5 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 1));
        Button b6 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 1));
        Button b7 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 1));
        Button b10 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 2));

        if (b2.getText().equals(" ")) {
            b2.setText(b6.getText());
            b6.setText(" ");
        } else if (b5.getText().equals(" ")) {
            b5.setText(b6.getText());
            b6.setText(" ");
        } else if (b7.getText().equals(" ")) {
            b7.setText(b6.getText());
            b6.setText(" ");
        } else if (b10.getText().equals(" ")) {
            b10.setText(b6.getText());
            b6.setText(" ");
        }


    }

    public void clickBtn7() {

        Button b3 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 0));
        Button b6 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 1));
        Button b7 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 1));
        Button b11 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 2));


        if (b11.getText().equals(" ")) {
            b11.setText(b7.getText());
            b7.setText(" ");
        } else if (b6.getText().equals(" ")) {
            b6.setText(b7.getText());
            b7.setText(" ");
        } else if (b3.getText().equals(" ")) {
            b3.setText(b7.getText());
            b7.setText(" ");
        }


    }

    public void clickBtn8() {
        Button b4 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 1));
        Button b8 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 2));
        Button b9 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 2));
        Button b12 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 3));

        if (b4.getText().equals(" ")) {
            b4.setText(b8.getText());
            b8.setText(" ");

        } else if (b9.getText().equals(" ")) {
            b9.setText(b8.getText());
            b8.setText(" ");

        } else if (b12.getText().equals(" ")) {
            b12.setText(b8.getText());
            b8.setText(" ");
        }

    }

    public void clickBtn9() {

        Button b5 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 1));
        Button b8 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 2));
        Button b9 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 2));
        Button b10 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 2));
        Button b13 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 3));


        if (b5.getText().equals(" ")) {
            b5.setText(b9.getText());
            b9.setText(" ");

        } else if (b8.getText().equals(" ")) {
            b8.setText(b9.getText());
            b9.setText(" ");

        } else if (b10.getText().equals(" ")) {
            b10.setText(b9.getText());
            b9.setText(" ");

        } else if (b13.getText().equals(" ")) {
            b13.setText(b9.getText());
            b9.setText(" ");
        }


    }

    public void clickBtn10() {

        Button b6 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 1));
        Button b9 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 2));
        Button b10 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 2));
        Button b11 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 2));
        Button b14 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 3));

        if (b11.getText().equals(" ")) {
            b11.setText(b10.getText());
            b10.setText(" ");

        } else if (b14.getText().equals(" ")) {
            b14.setText(b10.getText());
            b10.setText(" ");

        } else if (b6.getText().equals(" ")) {
            b6.setText(b10.getText());
            b10.setText(" ");

        } else if (b9.getText().equals(" ")) {
            b9.setText(b10.getText());
            b10.setText(" ");
        }


    }


    public void clickBtn11() {

        Button b7 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 1));
        Button b10 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 2));
        Button b11 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 2));
        Button b15 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 3));


        if (b15.getText().equals(" ")) {

            b15.setText(b11.getText());
            b11.setText(" ");

        } else if (b7.getText().equals(" ")) {

            b7.setText(b11.getText());
            b11.setText(" ");
        } else if (b10.getText().equals(" ")) {
            b10.setText(b11.getText());
            b11.setText(" ");
        }


    }


    public void clickBtn12() {
        Button b8 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 2));
        Button b12 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 3));
        Button b13 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 3));

        if (b8.getText().equals(" ")) {
            b8.setText(b12.getText());
            b12.setText(" ");
        } else if (b13.getText().equals(" ")) {
            b13.setText(b12.getText());
            b12.setText(" ");

        }

    }

    public void clickBtn13() {

        Button b9 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 2));
        Button b12 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 0, 3));
        Button b13 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 3));
        Button b14 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 3));

        if (b9.getText().equals(" ")) {
            b9.setText(b13.getText());
            b13.setText(" ");
        } else if (b12.getText().equals(" ")) {
            b12.setText(b13.getText());
            b13.setText(" ");
        } else if (b14.getText().equals(" ")) {
            b14.setText(b13.getText());
            b13.setText(" ");

        }


    }

    public void clickBtn14() {


        Button b10 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 2));
        Button b13 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 1, 3));
        Button b14 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 3));
        Button b15 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 3));

        if (b15.getText().equals(" ")) {
            b15.setText(b14.getText());
            b14.setText(" ");


        } else if (b10.getText().equals(" ")) {
            b10.setText(b14.getText());
            b14.setText(" ");
        } else if (b13.getText().equals(" ")) {
            b13.setText(b14.getText());
            b14.setText(" ");
        }


    }

    public void clickBtn15(ActionEvent event) {

        Button b11 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 2));
        Button b14 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 2, 3));
        Button b15 = (Button) Objects.requireNonNull(getNodeFromGridPane(gridPane, 3, 3));

        String id = ((Button) event.getSource()).getId().substring(3);
        int intId = Integer.parseInt(id);

        game.nextMove(intId);


        if (b11.getText().equals(" ")) {
            b11.setText(b15.getText());
            b15.setText(" ");

        } else if (b14.getText().equals(" ")) {
            b14.setText(b15.getText());
            b15.setText(" ");
        }
    }
}
