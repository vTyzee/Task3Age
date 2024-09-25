import java.util.Scanner;

public class Personality {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String firstName = scanner.nextLine();

        System.out.print("Введите вашу фамилию: ");
        String lastName = scanner.nextLine();

        System.out.print("Введите ваш личный код: ");
        String isikukood = scanner.nextLine();

        if (isikukood.length() != 11) {
            System.out.println("Невернo. Он должен содержать 11 цифр.");
            return;
        }

        char Gender = isikukood.charAt(0);
        int birth;
        switch (Gender) {
            case '1':
            case '2':
                birth = 1800;
                break;
            case '3':
            case '4':
                birth = 1900;
                break;
            case '5':
            case '6':
                birth = 2000;
                break;
            default:
                System.out.println("Неверный личный код.");
                return;
        }

        int day = Integer.parseInt(isikukood.substring(5, 7)); //50510 11 0015
        int month = Integer.parseInt(isikukood.substring(3, 5));//505 10 110015
        int year = birth + Integer.parseInt(isikukood.substring(1, 3));// 5 05 10110015

        String[] months = {
                "", "января", "февраля", "марта", "апреля", "мая", "июня",
                "июля", "августа", "сентября", "октября", "ноября", "декабря"
        };

        System.out.println(firstName + " " + lastName + " родился " + day + " " + months[month] + " " + year + " года.");
    }
}
