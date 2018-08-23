public class HumanRedactor {

    public Human[] addHuman(Human[] arr, Human human) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                arr[i] = human;
                return arr;
            }
        }
        return arr;
    }

    public void infoHuman(Human[] arr) {
        for (Human human : arr) {
            System.out.print(human + ", ");
        }
    }

    public void infoHuman(Human[] arr, int humanIndex) {
        if (checkHuman(arr, humanIndex)) {
            System.out.println("Human number: " + arr[humanIndex]);
        }
    }

    public boolean checkHuman(Human[] arr, int humanIndex) {
        boolean chekerHuman = humanIndex < arr.length - 1 && humanIndex >= 0;
        if (!chekerHuman) System.out.println("There is no human!");
        return chekerHuman;
    }

    public Human[] updateHuman(Human[] arr, int indexHuman, Human value) {
        if (checkHuman(arr, indexHuman)) {
            arr[indexHuman] = value;
        }
        return arr;
    }
    public Human[] deleteHuman (Human [] arr, int humanIndex){
        if (checkHuman(arr, humanIndex)){
            arr[humanIndex] = null;
        }
        return arr;
    }
}
