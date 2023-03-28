public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Задача 1");
        int contribution = 15000;
        int total = 0;
        int i = 0;
        while (total <= 2459000) {
            i++;
            total = total + contribution;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей.");
        }
        // task 2
        System.out.println("Задача 2");
        int a = 1;
        while (a <= 10) {
            System.out.print(" " + a++);
        }
        System.out.println();
        int b = 10;
        for (; b >= 1; b--) {
            System.out.print(" " + b);
        }
        System.out.println();

        // task 3
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertilityYear = 17; // c 1000 в год
        int mortalityYear = 8; // с 1000 в год
        for (int c = 1; c <= 10; c++) {
            int populationGrowthYear = population / 1000 * (fertilityYear - mortalityYear);
            population = population + populationGrowthYear;
            System.out.println("Год " + c + " численность населения составляет " + population + " человек.");
        }

        // task 4
        System.out.println("Задание 4");
        int contributionBank = 15000;
        int totalBank = 0;
        int d = 0;
        while (totalBank <= 12_000_000) {
            d++;
            totalBank = totalBank + totalBank / 100 * 7;
            totalBank = totalBank + contributionBank;
            System.out.println("Месяц " + d + " сумма накоплений равна " + totalBank + " рублей.");
        }

        // task 5
        System.out.println("Задание 5");
        int contributionBankNew = 15000;
        int totalBankNew = 0;
        int e = 0;
        while (totalBankNew <= 12_000_000) {
            e++;
            totalBankNew = totalBankNew + totalBankNew / 100 * 7;
            totalBankNew = totalBankNew + contributionBankNew;
            if (e % 6 == 0) {
                System.out.println("Месяц " + e + " сумма накоплений равна " + totalBankNew + " рублей.");
            }
        }

        // task 6
        System.out.println("Задание 6");
        int contributionBankVasiliy = 15000;
        int totalBankVasiliy = 0;
        int f = 0;
        while (f <= 108) {
            f++;
            totalBankVasiliy = totalBankVasiliy + totalBankVasiliy / 100 * 7;
            totalBankVasiliy = totalBankVasiliy + contributionBankVasiliy;
            if (f % 6 == 0) {
                System.out.println("Месяц " + f + " сумма накоплений равна " + totalBankVasiliy + " рублей.");
            }
        }

        // task 7
        System.out.println("Задание 7");
        int friday = 3;
        int weekFriday = 7 + friday;
        int day = 1;
        for (; day <= 31; day++) {
            if (day == friday) {
                System.out.println("Сегодня пятница " + day + " чило");
            }
            if (day == weekFriday) {
                weekFriday = weekFriday + 7;
                System.out.println("Сегодня пятница " + day + " чило");
            }
        }

        // task 8
        System.out.println("Задача 8");
        int year = 0;
        int yearNow = 2023;
        int year200Before = yearNow - 200;
        int year100After = yearNow + 100;
        for (; year <= 3000; year = year + 79) {
            if (year >= year200Before && year <= year100After) {
                System.out.println(year);
            }
        }

    }
}