import java.util.Scanner;


public class CraftHuman {


    HumanRedactor humanRedactor = new HumanRedactor();

    public Human [] addHumanRouting (Human [] humans){
        Human tmpHuman = new Human();
        String name;
        System.out.println("Please enter Data to create a new Human");
        System.out.println("Name: ");
        tmpHuman.setName(readFromConsole());
        System.out.println("Last name: ");
        tmpHuman.setLastName(readFromConsole());
        System.out.println("Age: ");
        tmpHuman.setAge(Integer.parseInt(readFromConsole()));

       return humanRedactor.addHuman(humans, tmpHuman);

    }

    public void readHumanRouting (Human[] humans){
        humanRedactor.infoHuman(humans);

    }

//    private Human [] updateHuman (Human [] arr){
//        int index;
//        String value;
//
//        System.out.println("Please enter value of human");
//        index =  Integer.parseInt(readFromConsole());
//        arr = humanRedactor.updateHuman(arr, )
//
//    }

    protected String readFromConsole (){

        String newHuman;
        Scanner scanner = new Scanner(System.in);
        newHuman = scanner.nextLine();
        return newHuman;
    }
}
