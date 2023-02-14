public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        var dog =8.0;
        System.out.println(dog);
        var cat =3.6;
        System.out.println(cat);
        var paper =763789;
        System.out.println(paper);
    }

    public static void task2() {
        System.out.println("Задача 2");
        var dog =8.0;
        dog = dog + 4;
        System.out.println(dog);
        var cat =3.6;
        cat = cat + 4;
        System.out.println(cat);
        var paper =763789;
        paper = paper +4;
        System.out.println(paper);
    }

    public static void task3() {
        System.out.println("Задача 3");
        var dog =8.0;
        dog = dog - 3.5;
        System.out.println(dog);
        var cat =3.6;
        cat = cat - 1.6;
        System.out.println(cat);
        var paper =763789;
        paper = paper - 7639;
        System.out.println(paper);
    }

    public static void task4() {
        System.out.println("Задача 4");
        var friend =19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
    }

    public static void task5() {
        System.out.println("Задача 5");
        var frog =3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }

    public static void task6() {
        System.out.println("Задача 6");
        var vesBokser1 = 78.2;
        var vesBokser2 = 82.7;
        var itog = 0.0;
        itog = vesBokser1 + vesBokser2;
        System.out.println("Общий вес двух бойцов " + itog);
        itog = vesBokser2 - vesBokser1;
        System.out.println("Разница между весами бойцов " + itog);
    }

    public static void task7() {
        System.out.println("Задача 7");
        var vesBokser1 = 78.2;
        var vesBokser2 = 82.7;
        var itog = 0.0;
        itog = vesBokser2 - vesBokser1;
        System.out.println("Вычитание из большего веса меньшего " + itog);
        itog = vesBokser2 % vesBokser1;
        System.out.println("Разница между весами бойцов " + itog);
    }

    public static void task8() {
        System.out.println("Задача 8");
        var workTime = 8.0;
        var workTimeItog = 640;
        var itog = 0.0;
        itog = workTimeItog/workTime;
        System.out.println("Всего сотрудников в компании " + itog);
        itog = itog +94;
        workTime = workTimeItog / itog;
        System.out.println("Если в компании работает " + itog + " человек, то всего " +workTime+ " часов работы может быть поделено между сотрудниками");
    }
}

