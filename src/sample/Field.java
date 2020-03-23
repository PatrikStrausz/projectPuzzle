package sample;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

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
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                arr[i][j] = new Tile();

            }

        }

    }

    public boolean isWinner() {

        if (arr[0][0].getValue() == 0 &&
                arr[0][1].getValue() == 1 &&
                arr[0][2].getValue() == 2 &&
                arr[0][3].getValue() == 3 &&
                arr[1][0].getValue() == 4 &&
                arr[1][1].getValue() == 5 &&
                arr[1][2].getValue() == 6 &&
                arr[1][3].getValue() == 7 &&
                arr[2][0].getValue() == 8 &&
                arr[2][1].getValue() == 9 &&
                arr[2][2].getValue() == 10 &&
                arr[2][3].getValue() == 11 &&
                arr[3][0].getValue() == 12 &&
                arr[3][1].getValue() == 13 &&
                arr[3][2].getValue() == 14 &&
                arr[3][3].getValue() == 15


        ) {
            return true;
        } else {
            return false;
        }


    }


    public void shuffle() {

        arr[0][0].setValue(0);
        arr[0][1].setValue(1);
        arr[0][2].setValue(2);
        arr[0][3].setValue(3);
        arr[1][0].setValue(4);
        arr[1][1].setValue(5);
        arr[1][2].setValue(6);
        arr[1][3].setValue(7);
        arr[2][0].setValue(8);
        arr[2][1].setValue(9);
        arr[2][2].setValue(10);
        arr[2][3].setValue(11);
        arr[3][0].setValue(12);
        arr[3][1].setValue(13);
        arr[3][2].setValue(14);
        arr[3][3].setValue(15);



        int  [] []a = {
                {0,1,2,3},
                {4,5,6,7},
                {8,9,10,11},
                {12,13,14,15}
        };

        Random random = new Random();

        for (int i = arr.length -1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);

                int temp = a[i][j];
                a[i][j] = a[m][n];
                a[m][n] = temp;
                arr[i][j].setValue(a[i][j]);
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }
        System.out.println();






    }







    public void print() {
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[j][i].getValue() + " ");

            }
            System.out.println();
        }
        System.out.println();

    }
}
