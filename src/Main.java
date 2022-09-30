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
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високостный!");
        } else {
            System.out.println(year + " год не високостный");
        }
        //Задание 4
        int deliveryDistance = 10, deliveryDays = 1;

        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется " + deliveryDays + " день");
        } else if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        if (deliveryDistance > 80) {
            deliveryDays++;
            System.out.println("Потребуется " + deliveryDays + " дня");
        }


        //Задание 5
        int monthNumber = 11;
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


        //Задача 6
        int age = 22;
        double salary = 10000;
        double limit = 1;
        if (age < 23) {
            if (salary < 50000) {
                limit = salary * 2;
            }

            if (salary >= 50000 && salary < 80000) {
                limit = salary * 2 * 1.2;
            }

            if (salary >= 80000) {
                limit = salary * 2 * 1.5;
            }

            System.out.println("Мы готовы вам выдать карту с лимитом " + limit + " рублей.");
        }
        if (age >= 23) {
            if (salary < 50000) {
                limit = salary * 3;
            }

            if (salary >= 50000 && salary < 80000) {
                limit = salary * 3 * 1.2;
            }

            if (salary >= 80000) {
                limit = salary * 3 * 1.5;
            }

            System.out.println("Мы готовы вам выдать карту с лимитом " + limit + " рублей.");
        }

        //Задача 7
        int wantedSum = 330_000; // желаемая сумма кредита
        double maxMonthPay = salary * 0.5; // максимальный возможный  ежемесячный платеж при ЗП
        double interestRate = 0.1; // процентная ставка
        if (age < 30 && age >= 23) {
            interestRate = interestRate + 0.005;
        }
        if (age < 23) {
            interestRate = interestRate + 0.01;
        }
        if (salary >= 80_000) {
            interestRate = interestRate - 0.007;
        }
        double monthPay = (wantedSum + (wantedSum * interestRate)) / 12; // месячный платёж
        if (maxMonthPay > monthPay) {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthPay + " рублей. Ежемесячный латеж по кредиту составит " + monthPay + " рублей. Кредит одобрен. ");
        } else {
            System.out.println("Максимальный платеж при ЗП " + salary + " равен " + maxMonthPay + " рублей. Ежемесячный латеж по кредиту составит " + monthPay + " рублей. В выдаче кредита отказано. ");
        }

    }


}
