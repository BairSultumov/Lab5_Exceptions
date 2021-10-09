import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        try {
            //Ошибка= деление на ноль
            int n=6/0;
            First sort = new First("aissur.gnalorP");
            sort.reverseMassive();
        }
        catch (Exception e) {int n=6;e.printStackTrace();}
        try {
            Bracket brac = new Bracket();
            brac.setStr("()()");
            if (brac.checkBrackets()) {
                System.out.println("\nОткрытые скобки равны закрытым");
            } else
                System.out.println("\nОткрытые скобки не равны закрытым");
        }
        catch (Exception e) {e.printStackTrace();}
        try {
            Third third1 = new Third("Каждый символ этой строки мечтает чтобы его пересчитали.");
            third1.outSymbol();
        }
        catch (Exception e){e.getStackTrace();}
    }
}
