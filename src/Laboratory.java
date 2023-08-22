import java.util.ArrayList;

public class Laboratory extends ClassRoom {

    ArrayList<String> substances = new ArrayList<>();
    String utensils;
    boolean ifSubstanceIsCaustic;

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
}
