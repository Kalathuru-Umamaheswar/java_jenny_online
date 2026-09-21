public class TwoDArrayExercises {
    /*static void displayCount(int[][] myArray){
        for(int i=0;i<myArray.length;i++){
            int count=0;
            for(int j=0;j<myArray[i].length;j++){
                count++;
            }
            System.out.println("Row "+(i+1)+" has "+count+" elements");
        }
    } */
    static void calculateSum(int[][] myArray){
        for(int i=0;i<myArray.length;i++){
            int sum=0;
            for(int j=0;j<myArray[i].length;j++){
                sum += myArray[i][j];
            }
            System.out.println("Row "+(i+1)+"sum : "+sum);
        }
    }
    public static void main(String[] args) {
        //int[][] jaggedArray=new int[2][];
        int[][] jaggedArray={{1,2,3},{1,2,3,4,5}};
        //jaggedArray[0]=new int[3];
        //jaggedArray[1]=new int[5];
        //displayCount(jaggedArray);
        calculateSum(jaggedArray);
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows for matrix1 :");
        int rows1 = sc.nextInt();
        System.out.println("Enter number of columns for matrix1 :");
        int cols1 = sc.nextInt();
        int[][] matrix1 = new int[rows1][cols1];

        System.out.println("Enter number of rows for matrix2 :");
        int rows2 = sc.nextInt();
        System.out.println("Enter number of columns for matrix2 :");
        int cols2 = sc.nextInt();
        int[][] matrix2 = new int[rows2][cols2];

        if(cols1!=rows2){
            System.out.println("can not multiply these matrices");
            return;
        }

        System.out.println("Enter the elements for matrix1 :");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements for matrix2 :");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Printing Matrix1 :");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print(matrix1[i][j] + " ");
                //sum += myArray[i][j];
            }
            System.out.println();
        }
        System.out.println("Printing Matrix2 :");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrix2[i][j] + " ");
                //sum += myArray[i][j];
            }
            System.out.println();
        }

        int[][] matrix3=new int[rows1][cols2];
        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols2;j++){
                int sum=0;
                for(int k=0;k<cols1;k++){
                    sum=sum+(matrix1[i][k]*matrix2[k][j]);
                    matrix3[i][j]=sum;
                }
            }
        }

        System.out.println("Printing Matrix3 :");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matrix3[i][j] + " ");
                //sum += myArray[i][j];
            }
            System.out.println();
        }


        /*System.out.println("The Transpose of matrix is :");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(myArray[j][i] + " ");
                //sum += myArray[i][j];
            }
            System.out.println();
        }*/


        //System.out.println(sum);
        /*int maxElement = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (myArray[i][j] > maxElement) {
                    maxElement = myArray[i][j];
                }
            }
        }
        System.out.println("Maximum element is :" + maxElement); */
    }
}
