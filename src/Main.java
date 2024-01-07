// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GryffindorStudent harry = new GryffindorStudent("Гарри Поттер",84,87,93);
        GryffindorStudent germiona = new GryffindorStudent("Гермиона Грейнджер", 95, 87, 73);
        GryffindorStudent ron = new GryffindorStudent("Рон Уизли", 94, 81, 83);

        HufflepuffStudent zaharia = new HufflepuffStudent("Захария Смит", 70, 65, 66);
        HufflepuffStudent sedrik = new HufflepuffStudent("Седрик Диггори", 80, 55, 78);
        HufflepuffStudent justin = new HufflepuffStudent("Джастин Финч-Флетчли", 80, 90, 75);

        SlytherinStudent draco = new SlytherinStudent("Драко Малфой", 89, 75, 90, 90, 80);
        SlytherinStudent grehem = new SlytherinStudent("Грэхэм Монтегю", 83, 70, 55, 86, 90);
        SlytherinStudent gregory = new SlytherinStudent("Грегори Гойл ", 75, 70, 80, 70, 50);

        RavenclawStudent joy = new RavenclawStudent("Чжоу Чанг", 95, 84, 56, 75);
        RavenclawStudent padma = new RavenclawStudent("Падма Патил", 95, 80, 60, 70);
        RavenclawStudent marcus = new RavenclawStudent("Маркус Белби", 85, 90, 70, 85);

        HogwartsStudent[] arr = {harry, germiona, ron, zaharia,sedrik,justin, draco, gregory, grehem, joy, padma, marcus};

        System.out.println("Посмотрим мощность магии и дистанцию трангрессии каждого ученика: ");
        System.out.println();

        for (HogwartsStudent hogwartsStudent : arr) {
            hogwartsStudent.makeMagic();
            hogwartsStudent.transgress();
            System.out.println();
        }

        System.out.println("Сравним студентов одного факультеа");
        harry.compareTo(ron);
        germiona.compareTo(harry);
        joy.compareTo(padma);
        padma.compareTo(marcus);

        System.out.println();
        System.out.println("Найдем студентов между собой по силе магии и трангрессии: ");
        for (int i = 0; i < arr.length - 1; i++) {
            final HogwartsStudent studentA = arr[i];
            final HogwartsStudent studentB = arr[i + 1];

            HogwartsStudent.compareMagicPowerBetween(studentA, studentB);
            HogwartsStudent.compareTrangressDistanceBetween(studentA, studentB);
            System.out.println();
        }



    }
}