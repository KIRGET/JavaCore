
/*

Продемонстрировать применение условного оператора if .
Присвоить исходному файлу имя " IfSaiaple . java"

*/

public class ifSample {
    public static void main(String[] args) {
        int x,y;

        x=10;
        y=20;

        if (x < y) System.out.println("x меньше y");

        x = x * 2;
        if (x == y) System.out.println("x равно y");

        x = x * 2;
        if (x > y) System.out.println("x теперь больше y");

        // этот оператор не будет ни чего выводить
        if (x == y) System.out.println(" вы не увидите этого");
        
    }

}
