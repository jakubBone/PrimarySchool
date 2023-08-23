import java.util.ArrayList;

public abstract class ClassRoom extends Place {
    public int howManyItems;
    ArrayList<String> educationItems = new ArrayList<>();

    public void goToPlace() {
        super.goToPlace();
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
