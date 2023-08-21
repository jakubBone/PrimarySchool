import java.util.ArrayList;

public class CleanServiceWorker extends SchoolService{

    ArrayList<String> taskList = new ArrayList<>();

    @Override
    public void goToSchool() {
        super.goToSchool();
        System.out.println("6:00");
    }
    @Override
    public void leaveSchool() {
        super.leaveSchool();
        System.out.println("14:00");
    }
    @Override
    public void work() {
        super.work();
        cleanSchool();
    }

    public void cleanSchool(){
        System.out.println("Cleaning checklist: ");
        for(String element: taskList){
            System.out.println("- " + element);
        }
    }


}
