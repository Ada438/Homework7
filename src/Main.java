import org.w3c.dom.ls.LSOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        var i = 0;
        var salary = 0;
        while (salary<2459000) {
            salary=salary+15000;
            i++;}
        System.out.println("Месяц " + i + ", сумма накоплений равна " + salary + " рублей");

        System.out.println("Задача 2");
        var a=1;
        while (a<=10) {
            System.out.print(a+" ");
            a++;
        }
        System.out.println();
        while (a>1) {
            a--;
            System.out.print(a+" ");
        }
        System.out.println("Задача 3");
        var population = 12_000_000;
        var year = 1;
        while (year<=10) {
            System.out.println("Год " + year + ", численность населения составляет " + population);
            population = population + (17*population/1000) - (8*population/1000);
            year++;
        }
        System.out.println("Задача 4");
        double money = 15000;
        var month = 0;
        while (money<12_000_000) {
            money = money*0.07+money;
            month++;
            System.out.println("месяц: "+ month + ", сумма: " + money);
        }
        System.out.println("Василию понадобится " + month + " месяцев");

        System.out.println("Задача 5");
        money = 15000;
        month = 0;
        while (money<12_000_000) {
            money = money * 0.07 + money;
            month++;
            if (month % 6 == 0) {
                System.out.println("месяц: " + month + ", сумма: " + money);
            }
        }
        System.out.println("Задача 6");
        money = 15000;
        month = 0;
        while (month<=12*9) {
            money = money * 0.07 + money;
            month++;
            if (month % 6 == 0) {
                System.out.println("месяц: " + month + ", сумма: " + money);
            }
        }
        System.out.println("Задача 7");
        var fr = 4;
        while (fr<=31) {
            System.out.println("Сегодня пятница, " + fr + "-е число. Необходимо подготовить отчет");
            fr+=7;
        }
        System.out.println("Задача 8");
        var yearComet = 0;
        var upperLimit = 2124;
        var lowerLimit = 1824;
        while (yearComet<=upperLimit) {
            if (yearComet >=lowerLimit) {
            System.out.print (yearComet+" ");}
                yearComet+=79;
        }







    }
}