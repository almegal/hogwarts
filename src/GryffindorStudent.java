public class GryffindorStudent extends HogwartsStudent {
    //gryffindor props
    private int nobility, honor, courage;

    public GryffindorStudent(String fullName, int nobility, int honor, int courage, int magicPower, int transgressDistance){
        super(fullName, magicPower, transgressDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
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
        return nobility + honor + courage;
    }

    @Override
    public String toString(){
        return super.toString() + " качества с учетом факультета " +
                "- nobility: " + getNobility() +
                ", honor: " + getHonor() +
                ", courage: " + getCourage()+ "\n";
    }

    //getters
    public int getNobility() {
        return nobility;
    }
    public int getHonor() {
        return honor;
    }
    public int getCourage() {
        return courage;
    }
}
