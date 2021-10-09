
public class Third {
    private String str;
    private int i = 0;
    private int j = 0;
    private int cnt = 0;
    private char ch= ' ';

    Third(String str){
        this.str=str;
    }
    void outSymbol(){
        for (i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (str.indexOf(ch) < i)
                continue;
            for (j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch)
                    cnt++;
            }
            System.out.println("'"+ch+"'" + ": " + cnt);
            cnt = 0;
        }
    }
    String getStr(){
        return this.str;
    }
    void setStr(String str){
        this.str=str;
    }
}
