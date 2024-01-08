public class SlytherinStudent extends HogwartsStudent {
    //Slytherin props
    private int cunning, determination, ambition, resourcefulness, thirstForPower;

    public SlytherinStudent(String fullName, int cunning, int determination, int ambition, int resoursefulness, int thirstForPower, int magicPower, int transgressDistance){
        super(fullName, magicPower, transgressDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resoursefulness;
        this.thirstForPower = thirstForPower;
    }

    @Override
    public boolean compareTo(HogwartsStudent other) {
        if(this.getClass() != other.getClass()) {
            System.out.println("Сравниваются ученики разных факультетов");
            return false;
        }

        int thisPoint = this.getSumOfProps();
        int otherPoint = other.getSumOfProps();

        return thisPoint > otherPoint;
    }

    @Override
    public int getSumOfProps() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }

    @Override
    public String toString(){
        return super.toString() + " качества с учетом факультета " +
                "- cunning: " + getCunning() +
                ", determination: " + getDetermination() +
                ", ambition: " + getAmbition() +
                ", resourcefulness: " + getResourcefulness() +
                ", thirst for power: " + getThirstForPower() + "\n";
    }

    //getters
    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }
}
