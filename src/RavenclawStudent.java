public class RavenclawStudent extends HogwartsStudent {
    private final String  facultyName = String.valueOf(this.getClass()).replace("class", "");
    public RavenclawStudent(String fullName, int smart, int wise, int witty, int  creativity){
        super(fullName, 0, 0, 0,0 , 0, 0, smart, wise, witty, creativity, 0, 0, 0, 0,0);
    }
    public RavenclawStudent(String fullName,
                            int smart,
                            int wise,
                            int witty,
                            int nobility,
                            int honor,
                            int courage,
                            int hardworking,
                            int loyal,
                            int honest,
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
        return ( getSmart() + getWitty() + getWise() + getCreativity() ) / 4 * 10;
    }
    @Override
    public int getTransgressDistance(){
        return (  getSmart() + getWitty() + getWise() + getCreativity() ) / 4 * 1000;
    }
    @Override
    public void compareTo(HogwartsStudent other) {
        if(this.getClass() != other.getClass()) System.out.println("Сравниваются ученики разных факультетов");
        RavenclawStudent obj = (RavenclawStudent) other;

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
                "- smart: " + getSmart() +
                ", wise: " + getWise() +
                ", witty: " + getWitty() +
                ", creativity: " + getCreativity()+ "\n" +
                super.toString();
    }
    //getters
    public String getFacultyName() {
        return facultyName;
    }
}
