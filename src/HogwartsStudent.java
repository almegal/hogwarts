
public abstract class HogwartsStudent {
    private final String fullName;
    //gryffindor props
    private int nobility, honor, courage;
    //hufflepuff props
    private int hardworking, loyal, honest;
    //ravenclaw props
    private int smart, wise, witty, creativity;
    //Slytherin props
    private int cunning, determination, ambition, resourcefulness, thirstForPower;

    public HogwartsStudent(String fullName,
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
        this.fullName = fullName;
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }
    abstract public int getMagicPower();
    abstract public int getTransgressDistance();
    abstract public boolean compareTo(HogwartsStudent obj);

    public static HogwartsStudent compareMagicPowerBetween(HogwartsStudent a, HogwartsStudent b){

        int aPoint = a.getMagicPower();
        int bPoint = b.getMagicPower();

        if(aPoint > bPoint) {
            return a;
        }
        return b;
    }
    public static HogwartsStudent compareTrangressDistanceBetween(HogwartsStudent a, HogwartsStudent b) {
        int aPoint = a.getTransgressDistance();
        int bPoint = b.getTransgressDistance();

        if(aPoint > bPoint) {
            return a;
        } else if(bPoint > aPoint) {
            return b;
        }
        return null;
    }
    public String toString() {
        return "Все качества: " +
                "nobility: " + nobility +
                ", honor: " + honor +
                ", courage: " + courage +
                "\nhardworking: " + hardworking +
                ", loyal: " + loyal +
                ", honest: " + honest +
                "\nsmart: " + smart +
                ", wise: " + wise +
                ", witty: " + witty +
                ", creativity: " + creativity +
                "\ncunning: " + cunning +
                ", determination: " + determination +
                ", ambition: " + ambition +
                ", resourcefulness: " + resourcefulness +
                ", thirstForPower: "  + thirstForPower;
    }

    public int getSumOfProps(GryffindorStudent student){
        int result = student.getNobility() + student.getHonor() + student.getCourage();
        return result;
    }
    public int getSumOfProps(HufflepuffStudent student){
        int result = student.getHardworking() + getLoyal() + student.getHonest();
        return result;
    }
    public int getSumOfProps(RavenclawStudent student){
        int result = student.getSmart() + student.getWise() + student.getWitty() + getCreativity();
        return result;
    }
    public int getSumOfProps(SlytherinStudent student){
        int result = student.getCunning() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getThirstForPower();
        return result;
    }
    public void makeMagic() {
        System.out.println(fullName + " колдует с силой: " + getMagicPower());
    }
    public void transgress() {
        System.out.println(fullName + " трансгрессировует на расстояние: " + getTransgressDistance() + "km");
    }
    //getter
    public String getFullName(){
        return fullName;
    }
    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

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

    // setter

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public void setCourage(int courage) {
        this.courage = courage;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public void setLoyal(int loyal) {
        this.loyal = loyal;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public void setWise(int wise) {
        this.wise = wise;
    }

    public void setWitty(int witty) {
        this.witty = witty;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }
}
