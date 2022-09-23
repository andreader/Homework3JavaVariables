
public class Main {
    static int task;
    public static void taskNum () {
        task++;
        System.out.println();
        System.out.println("Task №" + task);
    }
    public static void main(String[] args) {
        taskNum();
        byte byteVar = 127;
        short shortVar = 32766;
        int integerVar = 1234567891;
        long longVar = 1234567891011121314L;
        float floatVar = 23.12345F;
        double doubleVar = 334.1234567891011;
        System.out.println("byteVar = " + byteVar);
        System.out.println("shortVar = " + shortVar);
        System.out.println("integerVar = " + integerVar);
        System.out.println("longVar = " + longVar);
        System.out.println("floatVar = " + floatVar);
        System.out.println("doubleVar = " + doubleVar);

        taskNum();
        System.out.println("Look at the main file to check the task");
        float f = 27.12f;
        long l = 987678965549L;
        float f2 = 2.786f;
        boolean bo = false;
        short s = 569;
        short minS = -159;
        short s2 = 27897;
        byte by = 67;

        taskNum();
        byte class1 = 23;
        byte class2 = 27;
        byte class3 = 30;
        System.out.println("Учеников в классе Людмилы Павловны = " + class1);
        System.out.println("Учеников в классе Анны Сергеевны = " + class2);
        System.out.println("Учеников в классе Екатерины Андреевны = " + class3);
        int totalStudents = class1 + class2 + class3;
        System.out.println("Общее количество учеников = " + totalStudents);
        short paper = 480;
        System.out.println("Всего листов бумаги = " + paper);
        int paper1Student = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + paper1Student + " листов бумаги.");

        taskNum();
        byte output2Min = 16;
        int output1Min = output2Min / 2;
        int output20Min = output1Min * 20;
        int output24Hours = output1Min * 24 * 60;
        int output3Days = output24Hours * 3;
        int outputMonth = output24Hours * 30;
        System.out.println("За 2 минуты машина произвела бутылок = " + output2Min + " штук.");
        System.out.println("За 1 минуту машина произвела бутылок = " + output1Min + " штук.");
        System.out.println("За 20 минут машина произвела бутылок = " + output20Min + " штук.");
        System.out.println("За 24 часа машина произвела бутылок = " + output24Hours + " штук.");
        System.out.println("За 3 дня машина произвела бутылок = " + output3Days + " штук.");
        System.out.println("За месяц машина произвела бутылок = " + outputMonth + " штук.");

        taskNum();
        byte totalPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int classPaint = whitePaint + brownPaint;
        int totalClasses = totalPaint / classPaint;
        int totalWhite = whitePaint * totalClasses;
        int totalBrown = brownPaint * totalClasses;
        System.out.print("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски, и ");
        System.out.println(totalBrown + " банок коричневой краски.");

        taskNum();
        byte bananaWeight = 80;
        byte milkWeight = 105;
        byte iceCreamWeight = 100;
        byte eggWeight = 70;
        int breakfastWeightGram = 5 * bananaWeight + 2 * milkWeight + 2 * iceCreamWeight + 4 * eggWeight;
        System.out.println("Вес спорт-завтрака в граммах = " + breakfastWeightGram);
        float breakfastWeightKilo = breakfastWeightGram / 1000F;
        System.out.println("Вес спорт-завтрака в килограммах = " + breakfastWeightKilo);

        taskNum();
        int overWeight = 7000;
        int day1 = 250;
        int day2 = 500;
        int totalDays1 = overWeight / day1;
        int totalDays2 = overWeight / day2;
        int averageDays = (totalDays1 + totalDays2) / 2;
        System.out.print("У спортсмена уйдет " + totalDays1 + " дней на похудение, если он будет скидывать по ");
        System.out.println(day1 + " грамм в день.");
        System.out.print("У спортсмена уйдет " + totalDays2 + " дней на похудение, если он будет скидывать по ");
        System.out.println(day2 + " грамм в день.");
        System.out.println("В среднем у спортсмена уйдет " + averageDays + " день на похудение.");

        taskNum();
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int krisSalary = 76230;
        double salaryGrows = 0.1;
        double mashaGrows = salaryGrows * mashaSalary;
        double denisGrows = salaryGrows * denisSalary;
        double krisGrows = salaryGrows * krisSalary;
        System.out.print("Маша теперь получает = " + (mashaSalary+mashaGrows) + " рублей.");
        System.out.println(" Годовой доход вырос на " + (mashaGrows*12) + " рублей.");
        System.out.print("Денис теперь получает = " + (denisSalary+denisGrows) + " рублей.");
        System.out.println(" Годовой доход вырос на " + (denisGrows*12) + " рублей.");
        System.out.print("Кристина теперь получает = " + (krisSalary+krisGrows) + " рублей.");
        System.out.println(" Годовой доход вырос на " + (krisGrows*12) + " рублей.");
    }
}