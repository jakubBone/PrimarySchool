import java.util.ArrayList;

public class Laboratory extends ClassRoom {

    ArrayList<String> substances = new ArrayList<>();
    ArrayList<String> utensiles = new ArrayList<>();

    @Override
    public void goToPlace() {
        super.goToPlace();
        System.out.println("Put a laboratory coat");
    }

    @Override
    public void learn() {
        super.learn();
            System.out.println("Use items from the list:");
            for(String element: educationItems){
                System.out.println("- " + element);
        }
    }

    public void makeChemicalSolution(String utensil, String substance1, String substance2 ){
        System.out.println("Mix " + substance1 + " and " + substance2 + " in " + utensil);
    }
}
