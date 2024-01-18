public class Main {
    public static void main(String[] args) {
        While whileloops=new While();
        
        //Non-static
        int answer1=whileloops.first100Integers(); 
        int answer2=whileloops.testVar;
       
        //Static function (note that creating an object is not needed)
        int answer3=While.countdown100();
        int answer4=While.noOfLoops;

        //For loops
        For forloops=new For();
        int output=forloops.first300OddNumbers();

        StringsReview stringsReview= new StringsReview();
        String string= stringsReview.playWithSubString();
        boolean bool=stringsReview.isEqualTo();
        char character=stringsReview.returnCharacter(5);
        boolean isTrue=stringsReview.isIncludedInString('b');

        Nested nestedLoops= new Nested();
        int sum= nestedLoops.altSumOfArray();
        int sum1= nestedLoops.sumOfArray();
        
        

        //Tests
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);
        System.out.println(answer4);
        System.out.println(sum);
        System.out.println(sum1);
    }
}
