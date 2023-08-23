public class Playgroung extends Field{
    String toy;

    @Override
    public void goToPlace() {
        super.goToPlace();
    }

    @Override
    public void play() {
        super.play();
        System.out.println("Let's play " + kindOfGame + "! Take the " + toy + " and have fun!");
    }
}
