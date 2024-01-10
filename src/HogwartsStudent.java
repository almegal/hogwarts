
public abstract class HogwartsStudent {
    private final String fullName;
    private int magicPower, transgressDistance;

    public HogwartsStudent(String fullName, int magicPower, int transgressDistance) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.transgressDistance = transgressDistance;
    }
    public boolean compareTo(HogwartsStudent other) {
        int aPoint = this.getMagicPower() + this.getTransgressDistance();
        int bPoint = other.getMagicPower() + other.getTransgressDistance();

        return aPoint > bPoint;
    };
    abstract public int getSumOfProps();


    public String toString() {
        return "{ " + this.fullName +
                " обладает силой магии: " +  getMagicPower() +
                " и может трансгрессировать на расстояние: " + getTransgressDistance() +
                " }";
    }
    public void makeMagic() {
        System.out.println(fullName + " колдует с силой: " + getMagicPower());
    }
    public void transgress() {
        System.out.println(fullName + " трансгрессировует на расстояние: " + getTransgressDistance() + "km");
    }

    //getter
    public String getFullName() {
        return fullName;
    }
    public int getMagicPower() {
        return magicPower;
    }
    public int getTransgressDistance() {
        return transgressDistance;
    }
}