// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Домашнее задание №4");
        System.out.println("Условные операторы. Урок 1");
        //Задание 1
        task1();
        System.out.println(".....");
        //Задание 2
        task2();
        System.out.println(".....");
        //Задание 3
        task3();
        System.out.println(".....");
        //Задание 4
        task4();
        System.out.println(".....");
        //Задание 5
        task5();
        System.out.println(".....");
        //Задание 6
        task6();
        System.out.println(".....");
        //Задание 7
        task7();
        System.out.println("_________");
        System.out.println("Домашка закончилась. Всем спасибо, все свободны.");
    }

    private static void task7() {
        System.out.println("Задание 7");
        //Инициализация
        int one = 10;
        int two = 20;
        int three = 30;
        //Решение
        boolean boolOneUp = (one > two && one > three);
        boolean boolTwoUp = (two > one && two > three);
        boolean boolThree = (three > one && three > two);
        //Вывод
        System.out.print("Дано 3 переменные one, two, three. ");
        if (boolOneUp) {
            System.out.println("наибольшее значение имеет число one!");
        } else if (boolTwoUp) {
            System.out.println("наибольшее значение имеет число two!");
        } else if (boolThree) {
            System.out.println("наибольшее значение имеет число three!");
        } else {
            System.out.println("Все числа равны!");
        }
    }

    private static void task6() {
        System.out.println("Задание 6");
        //Инициализация
        int youTiket = 110;
        //Решение
        boolean boolTiket1 = (youTiket <= 60);
        boolean boolTiket2 = (youTiket > 60 && youTiket <= 102);
        //Вывод
        System.out.print("Вам достался билет с номером "+youTiket+", то вы ");
        if (boolTiket1) {
            System.out.println("можете пройти к сидяцим местам!");
        } else if (boolTiket2) {
            System.out.println("можно поехать только стоя!");
        } else {
            System.out.println("должны дождатся подачу дополнительного вагона!");
        }
    }

    private static void task5() {
        System.out.println("Задание 5");
        //Инициализация
        int youAge = 22;
        boolean bigFawer = true;
        //Решение
        boolean boolAge1 = (youAge < 5);
        boolean boolAge2 = (youAge >= 5 && youAge <= 14 || bigFawer);
        boolean boolAge3 = (youAge > 14);
        //Вывод
        System.out.print("Если возраст ребенка равен  "+youAge+", то ему ");
        if (boolAge1) {
            System.out.println("нельзя кататься на аттракционе!");
        } else if (boolAge2) {
            System.out.println("можно кататься на аттракционе в сопровождении взрослого!");
        } else if (boolAge3) {
            System.out.println("можно кататься на аттракционе без сопровождении взрослого!");
        }
    }

    private static void task4() {
        System.out.println("Задание 4");
        //Инициализация
        int youAge = 22;
        //Решение
        boolean boolAge1 = (youAge < 2);
        boolean boolAge2 = (youAge >= 2 && youAge <= 6);
        boolean boolAge3 = (youAge >= 7 && youAge < 18);
        boolean boolAge4 = (youAge >= 18 && youAge < 24);
        boolean boolAge5 = (youAge >= 24 && youAge < 60);
        boolean boolAge6 = (youAge >= 60);
        //Вывод
        System.out.print("Если возраст человека равен "+youAge+", то ему ");
        if (boolAge1) {
            System.out.println("пора спать!");
        } else if (boolAge2) {
            System.out.println("нужно ходить в детский сад!");
        } else if (boolAge3) {
            System.out.println("нужно ходить в школу!");
        } else if (boolAge4) {
            System.out.println("место в университете!");
        } else if (boolAge5) {
            System.out.println("пора ходить на работу!");
        } else if (boolAge6) {
            System.out.println("пора отдохнуть!");
        }
    }

    private static void task3() {
        System.out.println("Задание 3");
        //Инициализация
        int youSpeet = 77;
        int limitSpeed = 60;
        //Решение
        boolean shtraf = (youSpeet >= limitSpeed);
        //Вывод
        System.out.print("Вы ехали со скоростью "+youSpeet+"км/ч, при ограничении до "+limitSpeed+"км/ч, ");
        if (shtraf) {
            System.out.println("придется заплатить штраф!");
        } else {
            System.out.println("можно ездить спокойно!");
        }
    }

    public static void task2() {
        System.out.println("Задание 2");
        int tempCelciy = 4;
        System.out.print("Прогноз погоды: Сегодня "+tempCelciy+"🌡С! ");
        if (tempCelciy >= 5) {
            System.out.println("Сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице холодно, нужно надеть шапку");
        }

    }

    public static void task1() {
        System.out.println("Задание 1");
        int youAge = 25;
        System.out.print("Если возраст человека равеy "+youAge+", то ");
        if (youAge >= 18) {
            System.out.println("вы уже совершенолетний!");
        }
        if (youAge < 18) {
            System.out.println("возраст совершеннолетия еще не наступил и нужно немного подождать.");
        }

    }

}