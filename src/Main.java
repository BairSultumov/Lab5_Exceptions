import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try {
            int n=6/0;
            First sort = new First("aissur.gnalorP");
            sort.reverseMassive();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Bracket brac = new Bracket();
            brac.setStr("()()");
            if (brac.checkBrackets()) {
                System.out.println("\n'(' == ')'");
            } else
                System.out.println("\n'(' != ')'");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            Third third1 = new Third("Каждый символ этой строки мечтает чтобы его пересчитали.");
            third1.outSymbol();
        }
        catch (Exception e){e.getStackTrace();}
    }
}
