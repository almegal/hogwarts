public class HufflepuffStudent extends HogwartsStudent {
    private final String  facultyName = String.valueOf(this.getClass()).replace("class", "");
    public HufflepuffStudent(String fullName, int hardworking, int loyal, int honest ){
        super(fullName, 0, 0, 0,hardworking, loyal, honest, 0, 0, 0, 0, 0, 0, 0, 0,0);
    }
    public HufflepuffStudent(String fullName,
                             int hardworking,
                             int loyal,
                             int honest,
                             int nobility,
                             int honor,
                             int courage,
                             int smart,
                             int wise,
                             int witty,
                             int creativity,
                             int cunning,
                             int determination,
                             int ambition,
                             int resourcefulness,
                             int thirstForPower) {
        super(fullName ,nobility,honor,courage,hardworking,loyal,honest,smart,wise,witty,creativity,cunning,determination, ambition,resourcefulness,thirstForPower);
    }
    @Override
    public int getMagicPower(){
        return ( getHardworking() + getLoyal() + getHonest() ) / 3 * 10;
    }
    @Override
    public int getTransgressDistance(){
        return ( getHardworking() + getLoyal() + getHonest()) / 3 * 1000;
    }
    @Override
    public void compareTo(HogwartsStudent other) {
        if(this.getClass() != other.getClass()) System.out.println("Сравниваются ученики разных факультетов");
        HufflepuffStudent obj = (HufflepuffStudent) other;

        int thisPoint = this.getSumOfProps(this);
        int otherPoint = other.getSumOfProps(obj);

        if(thisPoint > otherPoint) {
            System.out.println(this.getFullName() + " better in " + facultyName + " than " + obj.getFullName());
        } else if(otherPoint > thisPoint) {
            System.out.println(obj.getFullName() + " better in " + facultyName + " than " + this.getFullName());
        } else {
            System.out.println(obj.getFullName() + " and " + this.getFullName() + " have the same point in " + facultyName);
        }

    }
    @Override
    public String toString(){
        return "Качества " + this.getFullName() + " с учетом факультета " +
                "- nobility: " + getHardworking() +
                ", honor: " + getLoyal() +
                ", courage: " + getHonest()+ "\n" +
                super.toString();
    }
    //getters
    public String getFacultyName() {
        return facultyName;
    }
}