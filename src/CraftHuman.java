import java.util.Scanner;

public class CraftHuman {

    protected String getNewHuman (){
        String newHuman;
        Scanner scanner = new Scanner(System.in);
        newHuman = scanner.nextLine();
        return newHuman;
    }
}
