public class RavenclawStudent extends HogwartsStudent {
    //ravenclaw props
    private int smart, wise, witty, creativity;

    public RavenclawStudent(String fullName, int smart, int wise, int witty, int  creativity, int magicPower, int transgressDistance){
        super(fullName, magicPower, transgressDistance);
        this.smart = smart;
        this.wise = wise;
        this. witty = witty;
        this.creativity = creativity;
    }

    public boolean compareTo(RavenclawStudent other) {
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
        return smart + witty + wise + creativity;
    }

    @Override
    public String toString(){
        return  super.toString() + " качества с учетом факультета " +
                "- smart: " + getSmart() +
                ", wise: " + getWise() +
                ", witty: " + getWitty() +
                ", creativity: " + getCreativity()+ "\n";
    }
    //getters
    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }
}
