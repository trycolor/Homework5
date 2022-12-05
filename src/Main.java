public class Main {
    public static void main(String[] args) {

        boolean clientOs = true;
        if (clientOs) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else {
            System.out.println("Установите версию приложения для iOS по ссылке") ;
        }

        //задание 2
        int clientDeviceYear = 2014;


        if (clientDeviceYear >= 2015) {
            System.out.println("установите наше приложение по ссылке");
        }
        else if (clientOs == true) {
            System.out.println("установите облегченную версию для Android");
        }
        else {
            System.out.println("установите облегченную версию для iOs");
        }
        //задание 3
        int year = 2020;
        if (year % 4 == 0) {
if((year % 100 !=0) ||  (year % 400 == 0)){
    System.out.println("год " + year + " високосный");}

        }
        //задание 4
        int deliveryDistance = 95;
        short deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется " + deliveryTime + " дня");
        }

        else if ((deliveryDistance > 20) && (deliveryDistance < 60)) {
            deliveryTime += 1;

            System.out.println("Потребуется " + deliveryTime + " дня");

        }

        else if ((deliveryDistance > 60) && (deliveryDistance < 100)) {
            deliveryTime +=2;
            System.out.println("Потребуется " + deliveryTime + " дня");

        }
        else {
            System.out.println("для доставки потребуется больше 3 дней");
        }
        //задание 5;
        short monthNumber = 11;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("осень");
                break;
            default:
                System.out.println("Такого месяца не существует");



    }
}}