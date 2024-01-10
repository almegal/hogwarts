public class HufflepuffStudent extends HogwartsStudent {
    //hufflepuff props
    private int hardworking, loyal, honest;
    public HufflepuffStudent(String fullName, int hardworking, int loyal, int honest, int magicPower, int transgressDistance ){
        super(fullName, magicPower, transgressDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public boolean compareTo(HufflepuffStudent other) {
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
        return hardworking + loyal + honest;
    }

    @Override
    public String toString(){
        return super.toString() + " качества с учетом факультета " +
                "- nobility: " + getHardworking() +
                ", honor: " + getLoyal() +
                ", courage: " + getHonest()+ "\n";
    }
    //getters

    public int getHardworking() {
        return hardworking;
    }
    public int getLoyal() {
        return loyal;
    }
    public int getHonest() {
        return honest;
    }
}
