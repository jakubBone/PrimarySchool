
public abstract class Worker extends Person{

    @Override
    public void goToSchool() {
        System.out.print("Go to school. ");
        startWork();
    }
    @Override
    public void leaveSchool() {
        System.out.print("It's time to leave. ");
        finishWork();
    }
    public void startWork(){
        System.out.print("The work begins at: ");
    }
    public void finishWork(){
        System.out.print("Finish work at: ");
    }
    public void work(){
    }
}
