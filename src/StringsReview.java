public class StringsReview {
    
    //4.3 Strings Review
    public String str="brad Lin";
    public String str2="Grad Lin ";
    public String subString;

    //Equals function
    public boolean isEqualTo() {
        if (str.equals(str2)) {
            return true;
        }
        return false;
    }

    public String playWithSubString() {
        subString=str.substring(5, 7);
        return subString;
    }

    public char returnCharacter(int index) {
        return str.charAt(index);
    }

    public boolean isIncludedInString(char c) {
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)==c) { //String and character must use ==!
                return true;
            }
        }
        return false;
    }
}
