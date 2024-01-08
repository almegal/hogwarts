public abstract class ServiceHogwarts {
    public static void printBetterInFacylty(HogwartsStudent a, HogwartsStudent b) {
        // hint!!! ЗАДАТЬ ВОПРОС
        //a.getFacultyName
        System.out.println(a.getFullName() + " лучше на факультете чем " + b.getFullName());
    }
    public static void printBestInFacylty(HogwartsStudent a){
        System.out.println(a.getFullName() + " лучший студент на факультете " + a.getClass().getSimpleName());
    }
    public static void printBestInHogwarts(HogwartsStudent a){
        System.out.println(a.getFullName() +  " лучший волшебник в школе!");
    }
    public static void  printBestWithMagicPower(HogwartsStudent a, HogwartsStudent b){
        System.out.println(a.getFullName() + " обладает большей магической мощностью чем " + b.getFullName());
    }
    public static void  printBestWithTrangressDistance(HogwartsStudent a, HogwartsStudent b){
        System.out.println(a.getFullName() + " обладает большей дальностью трасгрессии чем " + b.getFullName());
    }
    public static HogwartsStudent findBestInFaculty(HogwartsStudent[] arr) {
        HogwartsStudent best = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            HogwartsStudent b = arr[i + 1];

            if(!best.compareTo(b)) {
                best = b;
            }
        }

        return best;
    }
    public static HogwartsStudent findBestInHogwarts(HogwartsStudent [] arr){
        HogwartsStudent best = arr[0];

        for (HogwartsStudent hogwartsStudent : arr) {
            best = best.findBetter(hogwartsStudent);
        }
        return best;
    }
}
