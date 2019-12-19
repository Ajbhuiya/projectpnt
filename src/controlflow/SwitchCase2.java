package controlflow;

public class SwitchCase2 {
    public static void main(String[] args) {

        int foodNumber = 1;
        String foodName;

        switch (foodNumber) {
            case 1:
                foodName = "pizza";
                break;
            case 2:
                foodName = "sandwich";
                break;
            case 3:
                foodName = "fish";
                break;
            case 4:
                foodName = "chinese";
                break;
            default:
                foodName = "no food";
                break;

        }
        System.out.println("My fav food is " + foodName);
    }
}