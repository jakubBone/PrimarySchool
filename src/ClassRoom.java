import java.util.ArrayList;

public abstract class ClassRoom extends Place {
    public int howManyItems;
    ArrayList<String> educationItems = new ArrayList<>();

    public void goToPlace() {
        System.out.println("Go to " + setCoordinates());
        if (ifIsInside) {
            System.out.println("Change your shoes");
        }
    }
    public void learn() {
        int limitOfElements = 0;
        for (String element : educationItems) {
            educationItems.add(element);
            limitOfElements++;
            if (limitOfElements == howManyItems)
                break;
        }
        System.out.println("Use items from the list:");
        for(String element: educationItems){
            System.out.println("- " + element);
        }
    }
}
