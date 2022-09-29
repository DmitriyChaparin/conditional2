public class Main {
    public static void main(String[] args) {
        //Задание 1
        int clientOS = 1;
        boolean clientIOS = clientOS == 0;
        if (clientIOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //Задание 2
        int clientDeviceYear = 2015;
        if (clientIOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientIOS && clientDeviceYear < 2015) {
            System.out.println("Установите упрощённую версию приложения для iOS по ссылке");
        }
        boolean clientAndroidOS = clientOS != 0;
        if (clientAndroidOS && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientAndroidOS && clientDeviceYear < 2015) {
            System.out.println("Установите упрощённую версию приложения для Android по ссылке");
        }
        //Задание 3
        int year = 800;
        int monthNumber = 0;
        if (year % 4 == 0 && year % 100 !=0 || year % 400 ==0) {
            System.out.println(year + " год високостный!");
        }else {
            System.out.println(year + " год не високостный"); }
        //Задание 4
        int deliveryDistance = 10, deliveryDays = 1;
        if (deliveryDistance > 0) {
            if (deliveryDistance > 20)
            deliveryDays ++;
            if (deliveryDistance >60)
            deliveryDays ++;
            if (deliveryDistance >80)
            deliveryDays++;
            System.out.println("Потребуется " + deliveryDays + " дня");
        }



        //Задание 5
        {
        }monthNumber = 11;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
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