public class MyMain {

    // Returns the mean of the 2D array mat
    // add all together and divide
    public static double mean(double[][] mat) { 
        double sum = 0; 
        int size = 0;

        System.out.println(mat[0].length + ", " + mat.length);

        for (int i = 0; i <= mat[0].length-1; i++){
            for (int j = 0; j <= mat.length-1; j++){
                sum += mat[i][j];
                size ++;
            }
        }
        System.out.println(sum/size);
        return sum/size;
    }

    // Returns the median of the 2D array mat
    // find the middle number
    public static double median(double[][] mat) { 
        int colLength = mat.length;
        int rowLength = mat[0].length;
        double median = -1.0;

        // if odd # of rows
        if (colLength%2 != 0){
            
            //if odd # of cols
            if( (rowLength % 2) != 0 ){
                int row = colLength/2;
                int col = rowLength/2;
                median = mat[row][col];

            }

            //if even # of cols
            if(rowLength%2 == 0){
                int row = colLength/2;
                int col1 = rowLength/2 -1;
                int col2 = rowLength/2;
                median = ((mat[row][col1]) + (mat[row][col2]))/2;
            }

        }

        // if even # of rows
        if (colLength%2 == 0){

            int row1 = colLength/2 -1;
            int row2 = colLength/2;

            median = ((mat[row1][rowLength-1]) + (mat[row2][0]))/2;

        }
        System.out.println(median);
        return median;
    }
    

    // Returns the mode of the 2D array mat
    // number that occurs most often, assume no tie
    public static double mode(double[][] mat) { 
        
        double prevNum = 0;
        int count = 0; 
        int highestCount = 0;
        double mode = -1.0;

        for (int i = 0; i <= mat.length-1; i++){
            for (int j = 0; j <= mat[0].length-1; j++){
                
                if (mat[i][j] == prevNum){
                    count ++;
                }
                else{
                    count = 0;
                    prevNum = mat[i][j];
                }

                if (count > highestCount){
                    highestCount = count;
                    mode = prevNum;
                }
            }
        }
        return mode;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!

        double[][] m2 = { {1,  2,  4,  5,  6},
                          {7,  9,  10, 12, 13},
                          {14, 15, 17, 18, 20},
                          {22, 23, 27, 30, 32},
                          {33, 37, 38, 42, 44} };
        mean(m2);
    }
}
