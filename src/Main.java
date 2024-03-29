// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        GryffindorStudent harry = new GryffindorStudent("Гарри Поттер",84,87,93, 1000, 5000);
        GryffindorStudent germiona = new GryffindorStudent("Гермиона Грейнджер", 95, 87, 73, 900, 4000);
        GryffindorStudent ron = new GryffindorStudent("Рон Уизли", 94, 81, 83, 950, 4500);

        HufflepuffStudent zaharia = new HufflepuffStudent("Захария Смит", 70, 65, 66, 900, 3000);
        HufflepuffStudent sedrik = new HufflepuffStudent("Седрик Диггори", 80, 55, 78, 700, 4500);
        HufflepuffStudent justin = new HufflepuffStudent("Джастин Финч-Флетчли", 80, 90, 75, 800, 2300);

        SlytherinStudent draco = new SlytherinStudent("Драко Малфой", 89, 75, 90, 90, 80, 950, 4900);
        SlytherinStudent grehem = new SlytherinStudent("Грэхэм Монтегю", 83, 70, 55, 86, 90, 600, 1000);
        SlytherinStudent gregory = new SlytherinStudent("Грегори Гойл ", 75, 70, 80, 70, 50, 700, 3800);

        RavenclawStudent joy = new RavenclawStudent("Чжоу Чанг", 95, 84, 56, 75, 850, 3000);
        RavenclawStudent padma = new RavenclawStudent("Падма Патил", 95, 80, 60, 70, 400, 5000);
        RavenclawStudent marcus = new RavenclawStudent("Маркус Белби", 85, 90, 70, 85, 300, 3400);

        HogwartsStudent[] arr = {harry, germiona, ron, zaharia,sedrik,justin, draco, gregory, grehem, joy, padma, marcus};

        System.out.println("Посмотрим мощность магии и дистанцию трангрессии каждого ученика: ");
        System.out.println();

        for (HogwartsStudent hogwartsStudent : arr) {
            hogwartsStudent.makeMagic();
            hogwartsStudent.transgress();
            System.out.println("*************************");
        }
        System.out.println("*************************");
        System.out.println("*************************");

        System.out.println("Сравним студентов одного факультета и найдем лучшего");
        GryffindorStudent[] arrGryff = {harry, ron, germiona};
        SlytherinStudent[] arrSlyth = {draco, gregory, gregory};
        RavenclawStudent[] arrRaven = {joy, padma, marcus};
        HufflepuffStudent[] arrHuff = {zaharia, sedrik, justin};
        //
        GryffindorStudent bestG =(GryffindorStudent) ServiceHogwarts.findBestInFaculty(arrGryff);
        ServiceHogwarts.printBestInFacylty(bestG);

        SlytherinStudent bestS = (SlytherinStudent) ServiceHogwarts.findBestInFaculty(arrSlyth);
        ServiceHogwarts.printBestInFacylty(bestS);

        RavenclawStudent bestR = (RavenclawStudent) ServiceHogwarts.findBestInFaculty(arrRaven);
        ServiceHogwarts.printBestInFacylty(bestR);

        HufflepuffStudent bestH = (HufflepuffStudent) ServiceHogwarts.findBestInFaculty(arrHuff);
        ServiceHogwarts.printBestInFacylty(bestH);

        System.out.println("*************************");
        System.out.println("*************************");
        System.out.println("*************************");

        System.out.println("Найдем лучшего волшебника");
        System.out.println("Способ №1");
        HogwartsStudent[] bestGHRS = {bestH, bestG, bestR, bestS};
        HogwartsStudent best = ServiceHogwarts.findBestInHogwarts(bestGHRS);
        ServiceHogwarts.printBestInHogwarts(best);

        System.out.println("Способ №2");
        HogwartsStudent b = ServiceHogwarts.findBestInHogwarts(arr);
        ServiceHogwarts.printBestInHogwarts(b);
        System.out.println(harry.toString());
    }
}