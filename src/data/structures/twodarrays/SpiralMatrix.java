package data.structures.twodarrays;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][]mat = new int[3][8];
        int count = 1;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                mat[i][j] = count++;
            }
        }

        printMatrix(mat);
        printSpiralMatrix(mat);

    }

    public static void printSpiralMatrix(int[][]mat) {
        int colMin=0,colMax=mat[0].length-1;
        int rowMin=0,rowMax=mat.length-1;

        while(rowMin <= rowMax && colMin <= colMax) {
            for (int i = colMin; i <= colMax; i++) {
                System.out.print(mat[rowMin][i] + " ");
            }

            for (int i = rowMin + 1; i <= rowMax; i++) {
                System.out.print(mat[i][colMax] + " ");
            }

            for (int i = colMax - 1; i >= colMin; i--) {
                if(rowMin==rowMax){
                    break;
                }
                System.out.print(mat[rowMax][i] + " ");
            }

            for (int i = rowMax - 1; i >= rowMin + 1; i--) {
                if(colMin==colMax){
                    break;
                }
                System.out.print(mat[i][colMin] + " ");
            }

            rowMin++;
            rowMax--;
            colMin++;
            colMax--;
        }
        System.out.println();
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
