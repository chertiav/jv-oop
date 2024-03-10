package core.basesyntax;

public class Truck extends Machine {
    @Override
    public void doWork() {
        System.out.println("The " + this.getClass().getSimpleName() + " started working!");
    }

    @Override
    public void stopWork() {
        System.out.println("The " + this.getClass().getSimpleName() + " stopped working!");
    }
}