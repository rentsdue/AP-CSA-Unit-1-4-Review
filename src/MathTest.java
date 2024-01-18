public class MathTest {

    public int returnAbsoluteValue(int num) {
        return Math.abs(num);
    }

    public int returnMaxValue(int x, int y) {
        return Math.max(x, y);
    }

    public int returnMinValue(int x, int y) {
        return Math.min(x, y);
    }

    public double returnSquareRoot(int a) {
        return Math.sqrt(a);
    }

    public double returnRandomNumber() { //Must return a double value since random is from 0.0 to 1.0
        return Math.random();
    }

    public int randNumFrom1to100() {
        return (int)(Math.random()*101);
    }

}
