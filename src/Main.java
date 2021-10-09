import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //Scanner scan = new Scanner(System.in);
       /*реверсия слова
        String str = "абвгдеёжзи";
        String reverse = null;
        try {
            reverse = new StringBuffer(str).reverse().toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\nСтрока до реверса: " + str);
        System.out.println("Строка в обратном порядке, после реверса: " + reverse);
        String str1 = "ProgLang.su";
            char[] reverseArray1 = str1.toCharArray(); // Преобразуем строку str в массив символов (char)
        System.out.print("1. Массив в обратном порядке: ");
        for (int i = reverseArray1.length-1; i >= 0; i--) System.out.print(reverseArray1[i]);

        double[] reverseArray2 = {1.2, 1.9, 11.4, 23.8};
        System.out.print("\n2. Массив в обратном порядке: ");
        for (int i = reverseArray2.length-1; i >= 0; i--) {
            System.out.print(reverseArray2[i] + " ");*/
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
