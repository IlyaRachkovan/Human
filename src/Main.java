public class Main {
    public static void main(String[] args) {
        Human [] humans = new Human[10];
        CraftHuman craftHuman = new CraftHuman();
        humans = craftHuman.addHumanRouting(humans);
        craftHuman.readHumanRouting(humans);
    }
}
