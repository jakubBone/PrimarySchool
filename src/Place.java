public abstract class Place {
    boolean ifIsInside;
    int coordinateX;
    int coordinateY;

    public String setCoordinates(){
        return coordinateX + " " + coordinateY;
    }
    public void goToPlace() {
        System.out.println("Go to " + setCoordinates());
        if (ifIsInside) {
            System.out.println("Change your shoes");
        }

}
