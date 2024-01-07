public class GryffindorStudent extends HogwartsStudent {
    private final String  facultyName = String.valueOf(this.getClass()).replace("class", "");
    public GryffindorStudent(String fullName, int nobility, int honor, int courage){
        super(fullName, nobility, honor, courage, 0, 0, 0, 0, 0, 0, 0, 0,0 ,0, 0, 0);
    }
    public GryffindorStudent(String fullName,
                             int nobility,
                             int honor,
                             int courage,
                             int hardworking,
                             int loyal,
                             int honest,
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
        return ( getNobility() + getCourage() + getHonor() ) / 3 * 10;
    }
    @Override
    public int getTransgressDistance(){
        return ( getCourage() + getNobility() + getHonor() ) / 3 * 1000;
    }
    @Override
    public boolean compareTo(HogwartsStudent other) {
        if(this.getClass() != other.getClass()) {
            System.out.println("Сравниваются ученики разных факультетов");
            return false;
        }
        GryffindorStudent obj = (GryffindorStudent) other;

        int thisPoint = this.getSumOfProps(this);
        int otherPoint = other.getSumOfProps(obj);

        if(thisPoint > otherPoint) {
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Качества " + this.getFullName() + " с учетом факультета " +
                "- nobility: " + getNobility() +
                ", honor: " + getHonor() +
                ", courage: " + getCourage()+ "\n" +
                super.toString();
    }

    //getters

    public String getFacultyName() {
        return facultyName;
    }
}
