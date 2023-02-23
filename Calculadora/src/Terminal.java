import java.util.Scanner;

public class Terminal {

    public String input () {
        Scanner read = new Scanner(System.in);
        String operacio = read.nextLine();
        return operacio;

    }

    public void output (String out){
        System.out.println(out);
    }

}
