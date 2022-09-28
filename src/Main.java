public class Main {
    public static void main(String[] args) {
     //Задание 1
        int clientOS = 1;
        boolean clientIOS = clientOS == 0;
     if (clientIOS) {
         System.out.println("Установите версию приложения для iOS по ссылке");}
     else {
         System.out.println("Установите версию приложения для Android по ссылке");
     }
     //Задание 2
       int clientDeviceYear = 2015;
     if (clientIOS && clientDeviceYear >= 2015) {
         System.out.println("Установите версию приложения для iOS по ссылке");
     } else if (clientIOS && clientDeviceYear < 2015) {
         System.out.println("Установите упрощённую версию приложения для iOS по ссылке");
     }boolean clientAndroidOS = clientOS != 0;
     if (clientAndroidOS && clientDeviceYear >=2015) {
         System.out.println("Установите версию приложения для Android по ссылке");
     } else if (clientAndroidOS && clientDeviceYear < 2015) {
            System.out.println("Установите упрощённую версию приложения для Android по ссылке");
        }
     //Задание 3
        int year = 2021;
     //Задание 5
        int monthNumber = 10;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверно указан месяц");
        }
    }
}