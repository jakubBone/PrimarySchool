public abstract class Teacher extends Worker{
    String degreeLevel;
    boolean isSupervisor;
    int whichClassTeaches;

    @Override
    public void goToSchool() {
        super.goToSchool();
        System.out.println("8:00");
    }

    @Override
    public void finishWork() {
        super.finishWork();
        System.out.println("15:00");
    }
    @Override
    public void work() {
        super.work();
    }
    public void testStudents(){
    }
}
