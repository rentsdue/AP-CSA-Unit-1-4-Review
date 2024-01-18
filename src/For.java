public class For {
    //4.2 For Loops

    //Add the first 300 odd numbers this time (1+3+5...+599)
    public int first300OddNumbers() {
        int sum=0;
        for (int i=0; i<600; i++) {
            if (i%2 !=0) {
                sum +=i;
            }
        }
        return sum; //Desired output: 90000
    }

    public int alternateMethod() {
        int sum=0;
        for (int i=1; i<=599; i+=2) {
            sum +=i;
        }
        return sum; //Desired output: 90000
    }
}
