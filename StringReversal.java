public class StringReversal {
    
    private String inputString;

    public String reverse(String inputString) {
        this.inputString = inputString;
        String reverseString = "";
        for(int i=0; i<this.inputString.length() ;i++){
            reverseString =  inputString.charAt(i) + reverseString;
        }
        return reverseString;
    }

}