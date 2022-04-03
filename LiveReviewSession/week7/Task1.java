package week7;

public class Task1 {
    public static void main(String[] args) {
        int rowCount = 5;
        for (int row = 1; row <= rowCount; row++) {
            int value = row;
            for (int col = 1; col <= row; col++) {
                System.out.print(value + " ");
                value += rowCount - col;
            }


            System.out.println();

        }
            /*int n = 6;
        int m =n;

        for (int i = 1; i <= n; i++,m--) {
            for (int j = 1; j <= m; j++) {
                System.out.print(i+" ");
            }
            System.out.println();

*/


    }
}

/*
Print below pattern using loop

row :5
column:5

            1
            2 6                         row-1
            3 7 10                      row-1,row-2
            4 8 11 13                  row-1,row-2 row-3
            5 9 12 14 15               row-1,row-2 row-3 row4
 */