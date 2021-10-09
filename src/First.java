public class First {
    private String str;
    private char[] reverseArray;

    First(String str){
        this.str=str;
    }
    String getStr(){
        return this.str;
    }
    void setStr(String str){
        this.str=str;
    }
    void reverseMassive(){
        this.reverseArray= this.str.toCharArray();
        for(int i=reverseArray.length-1; i>=0; i--){
            System.out.print(reverseArray[i]);
        }
    }
}
