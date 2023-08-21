import java.util.ArrayList;

public class Cooker extends SchoolService{
    ArrayList<String> ingredientList = new ArrayList<>();

    @Override
    public void goToSchool() {
        super.goToSchool();
        System.out.println("7:00");
    }
    @Override
    public void leaveSchool() {
        super.leaveSchool();
        System.out.println("15:00");
    }

    @Override
    public void work() {
        super.work();
        System.out.println("Cook");
    }
    public void prepareIngridientes(){
        System.out.println("Cut vegetables");
    }

    public void makeOrder(){
        System.out.println("The new order:");
        for(String element: ingredientList){
            System.out.println("- " + element);
        }
    }

}
