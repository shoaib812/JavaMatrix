public class Subtract_Matrix4 {
    public static void main(String[] args) {

        int mat1[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int mat2[][] = {{1, 3, 4}, {2, 4, 3}, {3, 4, 5}};
        int mat3[][] = new int[3][3];  // for storing the value of subtraction

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //here i is no. of rows and j is no. of columns
                mat3[i][j] = mat1[i][j] - mat2[i][j];  //subtract both matrix into mat3
                System.out.print(mat3[i][j] + " ");       //print the addition
            }
            System.out.println();   // for new line
        }
    }
}