package sample;


import java.util.Collections;
import java.util.Random;

public class Field {
    private Tile[][] arr;

    public Field() {
        initField();
    }

    public Tile[][] getArr() {
        return arr;
    }

    public void setArr(Tile[][] arr) {
        this.arr = arr;
    }

    private void initField() {
        arr = new Tile[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = new Tile();

            }
        }
    }

    public boolean isWinner() {
        return arr[0][0].getValue() == 1
                && arr[0][1].getValue() == 2
                && arr[0][2].getValue() == 3
                && arr[0][3].getValue() == 4
                && arr[1][0].getValue() == 5
                && arr[1][1].getValue() == 6
                && arr[1][2].getValue() == 7
                && arr[1][3].getValue() == 8
                && arr[2][0].getValue() == 9
                && arr[2][1].getValue() == 10
                && arr[2][2].getValue() == 11
                && arr[2][3].getValue() == 12
                && arr[3][0].getValue() == 13
                && arr[3][1].getValue() == 14
                && arr[3][2].getValue() == 15
                && arr[3][3].getValue() == 0
                ;
    }

    public void print() {

        arr[0][0].setValue(3);
        arr[0][1].setValue(5);
        arr[0][2].setValue(1);
        arr[0][3].setValue(2);
        arr[1][0].setValue(4);
        arr[1][1].setValue(10);
        arr[1][2].setValue(8);
        arr[1][3].setValue(9);
        arr[2][0].setValue(10);
        arr[2][1].setValue(6);
        arr[2][2].setValue(7);
        arr[2][3].setValue(13);
        arr[3][0].setValue(15);
        arr[3][1].setValue(14);
        arr[3][2].setValue(12);
        arr[3][3].setValue(0);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[i][j].getValue() + " ");

            }
            System.out.println();
        }



    }







}



