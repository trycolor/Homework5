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
        }}}