package data.structures.twodarrays;

public class DiagonalSum {
    public static void main(String[] args) {
        int[][]mat = new int[3][3];
        int count = 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = count++;
            }
        }

        printMatrix(mat);
        System.out.println(sum(mat));
    }

    public static int sum(int[][] mat) {
        int d1 = 0;
        int d2 = 0;
        int common = 0;
        for (int i = 0; i < mat.length; i++) {
            d1 += mat[i][i];
        }

        for (int i = 0; i < mat.length; i++) {
            if(i != mat.length - i - 1) {
                d2 += mat[i][mat.length - i - 1];
            }
        }

//        if(mat.length % 2 == 1) {
//            int mid = (mat.length) / 2;
//            common = mat[mid][mid];
//        }

        return d1 + d2 - common;
    }


    public static void printMatrix(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
