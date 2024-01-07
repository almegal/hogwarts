public class SlytherinStudent extends HogwartsStudent {
    private final String  facultyName = String.valueOf(this.getClass()).replace("class", "");
    public SlytherinStudent(String fullName, int cunning, int determination, int ambition, int resoursefulness, int thirstForPower){
        super(fullName, 0,0, 0, 0, 0, 0, 0, 0, 0, 0, cunning, determination, ambition,  resoursefulness, thirstForPower);
    }
    public SlytherinStudent(String fullName,
                            int cunning,
                            int determination,
                            int ambition,
                            int resourcefulness,
                            int thirstForPower,
                            int nobility,
                            int honor,
                            int courage,
                            int hardworking,
                            int loyal,
                            int honest,
                            int smart,
                            int wise,
                            int witty,
                            int creativity) {
        super(fullName, cunning,determination, ambition,resourcefulness,thirstForPower ,nobility,honor,courage,hardworking,loyal,honest,smart,wise,witty,creativity);
    }

    @Override
    public int getMagicPower(){
        return ( getCunning() + getDetermination() + getAmbition() + getResourcefulness() +getThirstForPower()) / 5 * 10;
    }
    @Override
    public int getTransgressDistance(){
        return ( getCunning() + getDetermination() + getAmbition() + getResourcefulness() +getThirstForPower())  / 5 * 1000;
    }
    @Override
    public boolean compareTo(HogwartsStudent other) {
        if(this.getClass() != other.getClass()) {
            System.out.println("Сравниваются ученики разных факультетов");
            return false;
        }
        SlytherinStudent obj = (SlytherinStudent) other;

        int thisPoint = this.getSumOfProps(this);
        int otherPoint = other.getSumOfProps(obj);

        if(thisPoint < otherPoint) {
            return false;
        }
        return true;
    }
    @Override
    public String toString(){
        return "Качества " + this.getFullName() + " с учетом факультета " +
                "- cunning: " + getCunning() +
                ", determination: " + getDetermination() +
                ", ambition: " + getAmbition() +
                ", resourcefulness: " + getResourcefulness() +
                ", thirst for power: " + getThirstForPower() + "\n" +
                super.toString();
    }

    //getters

    public String getFacultyName() {
        return facultyName;
    }
}
