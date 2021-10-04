package Numbers;

public abstract class Numbers {
    private double numberValue;

    public Numbers(double numberValue) {
        this.numberValue = numberValue;
    }

    public double getNumberValue() {
        return numberValue;
    }

    public void setNumberValue(double numberValue) {
        this.numberValue = numberValue;
    }
}
