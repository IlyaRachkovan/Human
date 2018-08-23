import java.util.Scanner;


public class CraftHuman {
    HumanRedactor humanRedactor = new HumanRedactor();

    private Human [] addHuman (Human [] arr){
        System.out.println("Please enter value to create a new Human");
        String value = getNewHuman();
        arr = humanRedactor.addHuman(arr,human);
        return arr;
    }

    protected String getNewHuman (){
        String newHuman;
        Scanner scanner = new Scanner(System.in);
        newHuman = scanner.nextLine();
        return newHuman;
    }
}
