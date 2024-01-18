public class While {

    public static int noOfLoops=0;
    public int testVar=6;

    //4.1 While loops review

    //Adds the first 100 integers(1+2+3...+99+100)
    public int first100Integers() { //Not static
        int sum=0;
        int i=0;
        while (i<101) {
            sum+=i;
            i++;
        }
        noOfLoops++;
        return sum;
    }

    //Adds the first 100 integers (1+2+3...+99+100) but sum starts at 100
    public static int countdown100() { //Static method
        int sum=0;
        int i=100;
        while(i > 0){
            sum+=i;
            i--;
        }
        noOfLoops++;
        return sum; //Desired output: 5050
    }

}
