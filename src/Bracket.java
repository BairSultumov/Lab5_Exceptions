public class Bracket {
    private String str;
    private int countleft,countright;

    boolean checkBrackets(){
        char[] countChar = str.toCharArray();
        for(int i=countChar.length-1;i>=0;i--){
            if(countChar[i]=='(') countleft++;
            if(countChar[i]==')') countright++;
        }
        if(countleft == countright)
            return true;
        else
            return false;
    }
    public String getStr(){
        return this.str;
    }
    public void setStr(String str){
        this.str=str;
    }
}
