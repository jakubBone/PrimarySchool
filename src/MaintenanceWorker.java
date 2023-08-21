public class MaintenanceWorker extends SchoolService{
    boolean ifSomethingBroken;
    @Override
    public void goToSchool() {
        super.goToSchool();
        System.out.println("8:00");
    }
    @Override
    public void leaveSchool() {
        super.leaveSchool();
        System.out.println("16:00");
    }
    @Override
    public void work() {
        super.work();
        if(ifSomethingBroken)
            System.out.println("Rapair");
    }

}
