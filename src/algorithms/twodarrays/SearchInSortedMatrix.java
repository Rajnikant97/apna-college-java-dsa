package algorithms.twodarrays;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int key = 35;
        printMatrix(mat);
        searchBruteForce(mat, key);
        searchRowWiseBinary(mat, key);
        staircaseSearch(mat, key);

    }

    public static boolean staircaseSearch(int[][] mat, int key) {
        int row = mat.length - 1;
        int col = 0;
        while(row >= 0 && col <= mat[0].length - 1) {
            int curr = mat[row][col];
            if(curr == key) {
                System.out.println("key found at cell ("+row+","+col+")");
                return true;
            } else if (curr < key) {
                col++;
            } else {
                row--;
            }
        }
        System.out.println("key not found!");
        return false;
    }

    public static boolean searchRowWiseBinary(int[][] mat, int key) {
        for (int i = 0; i < mat.length; i++) {
            int[] arr = mat[i];
            int start = 0;
            int end = arr.length - 1;
            while(start <= end) {
                int mid = (start+end)/2;
                if(arr[mid] == key) {
                    System.out.println("key found at cell ("+i+","+mid+")");
                    return true;
                } else if(arr[mid] < key) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        System.out.println("key not found!");
        return false;
    }

    public static boolean searchBruteForce(int[][] mat, int key) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if(mat[i][j] == key) {
                    System.out.println("key found at cell ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key not found!");
        return false;
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
