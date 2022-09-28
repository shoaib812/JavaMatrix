public class EqualMatrix5
{
    public static void main(String[]args) {
        int row1, col1, row2, col2;
        boolean flag = true;

        int a[][] = {{1, 2, 3}, {8, 4, 6}, {4, 5, 7}};
        int b[][] = {{1, 2, 3}, {8, 4, 6}, {4, 5, 7}};

        row1 = a.length;
        col1 = a[0].length;

        row2 = b.length;
        col2 = b[0].length;

        if(row1 != row2 || col1 != col2)
        {
            System.out.println("Matrix are not equal");
        }

        else{

            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < b.length; j++) {
                    if (a[i][j] != b[i][j]) {
                        flag = false;
                        break;
                    }
                }
            }
        }

        if(flag)
        {
            System.out.println("Matrix are equal");
        }

        else {
            System.out.println("Matrix are not equal");
        }
    }
}
