import java.time.LocalDate;
public class Main {
    //Метод к заданию 1
    public static void printYear(int number){
        if(number % 4 != 0) {
            System.out.println(number + " не високосный год");
        } else if(number % 100 == 0 && number % 400 == 0) {
            System.out.println(number + " високосный год");
        } else
            System.out.println(number + " високосный год");
    }

    //Метод к заданию 2
    public static void printNameOS (int OS, int year){
        if (OS == 0 && year < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (OS == 0 && year >= LocalDate.now().getYear()){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (OS == 1 && year < LocalDate.now().getYear()) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (OS == 1 && year >= LocalDate.now().getYear()){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        }

    //Метод к заданию 3
    public static void printDeliveryTime (int deliveryDistance){
        int bazaDeliveryTime = 1;
        int bazaDeliveryDistance = 20;
        int interval = 40;
        if (deliveryDistance <= bazaDeliveryDistance) {
            System.out.println("Потребуется дней: " + bazaDeliveryTime);
        } else if(deliveryDistance > bazaDeliveryDistance && deliveryDistance < (bazaDeliveryDistance + interval)){
            System.out.println("Потребуется дней: " + (bazaDeliveryTime + bazaDeliveryTime));
        } else if(deliveryDistance > (bazaDeliveryDistance + interval) && deliveryDistance < (bazaDeliveryDistance + 2 * interval)){
            System.out.println("Потребуется дней: " + (3 * bazaDeliveryTime));
        } else if(deliveryDistance > (bazaDeliveryDistance + 2 * interval) && deliveryDistance < (bazaDeliveryDistance + 3 * interval)) {
            System.out.println("Потребуется дней: " + (4 * bazaDeliveryTime));
        }
        }



    public static void main(String[] args) {
       //Задание 1
        System.out.println("Задание 1");
        int year = 2012;
        printYear(year);

        //Задание 2
        System.out.println("Задание 2");
        int userOS = 1;
        int userYear = 2022;
        printNameOS(userOS, userYear);

        //Задание 3
        System.out.println("Задание 3");
        int distance = 5;
        printDeliveryTime(distance);
    }
}