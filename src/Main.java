//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1
        int os = 0;
        if (os == 0) {
            System.out.println("Установите версию приложения для IOS по ссылке");
        } else if (os == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ваша ОС не поддерживается");
        }

        //2
        int year = 2013;
        if (os == 0) {
            if (year < 2015) {
                System.out.println("Установите облегченную  версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
            else if (os == 1) {
                if (year < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите  версию приложения для Android по ссылке");
                }else{
                    System.out.println("Ваша ОС не поддерживается");
                }

                //3
                year = 2021;
                if (year >= 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) ;
                System.out.println("високосный год");
            } else {
                System.out.println("невисокосный год");
            }

            //4
            int days = 0;
            int distance = 47;
            if (distance < 20) {
                days = 1;
            } else if (distance < 60) {
                days = 2;
            } else if (days < 100) {
                days = 3;
            } else {
                days = -1;
            }
            if (days >= 0) {
                System.out.println("доставка займет" + days + "дней");
            } else {
                System.out.println("доставки нет");
            }

            //5
            int monthNumber = 11;
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

                    System.out.println("такого месяца нет");
            }


        }
    }
}
        }