public class Nested {

    public int [][] TwoDimensionalArray={{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public int sumOfArray() {
        int sum=0;
        for (int[] numArray: TwoDimensionalArray) {
            for (int num: numArray) {
                sum+=num;
            }
        }
        return sum; //Desired output: 45
    }

    public int altSumOfArray() {
        int sum=0;
        for (int i=0; i<TwoDimensionalArray.length;i++) {
            for (int j=0; j<TwoDimensionalArray[i].length;j++) {
                sum+=TwoDimensionalArray[i][j];
            }
        }
        return sum; //Desired output: 45
    }
    
}
