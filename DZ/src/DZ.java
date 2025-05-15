import java.util.Scanner;
import static java.lang.Math.*;


public class DZ {
    public static void main(String[] args) {

        //НА 3333333333333333333333333333333333333333333333333333
        Scanner in = new Scanner(System.in);
        DesVDva(in);
        DvaVDes(in);
        DesVShes(in);
        ShesVDes(in);
        //НА 4444444444444444444444444444444444444444444444444444
        System.out.print("Введите первое двоичное число: ");
        String ban1 = in.nextLine();
        System.out.print("Введите второе двоичное число: ");
        String ban2 = in.nextLine();
        PlusDva(ban1, ban2);
//        MinusDva(in);
//        PlusShes(in);
//        MinusShes(in);
    }
    private static void DesVDva(Scanner scanner) {
        System.out.print("Введите десятичное число: ");
        int desyat = scanner.nextInt();
        String d = "";
        while (desyat > 0) {
            d = (desyat % 2) + d;
            desyat = desyat / 2;
        }
        System.out.println("Число в двоичном представлении: " + d);
    }

    private static void DvaVDes(Scanner scanner) {
        System.out.print("Введите десятичное число: ");
        String dvaaa = scanner.next();
        int desyat = 0;
        int c = 0;
        for (int i = dvaaa.length() - 1; i >= 0; i--) {
            if (dvaaa.charAt(i) == '1') {
                desyat += pow(2, c);
            }
            c++;
        }
        System.out.println("Число в двоичном представлении: " + desyat);
    }

    private static void ShesVDes(Scanner scanner) {
        System.out.print("Введите шестнадцатеричное число: ");
        String d = scanner.next();
        int desyat = 0;
        int p = 0;
        for (int i = d.length() - 1; i >= 0; i--) {
            char c = d.charAt(i);
            int s;
            if (c >= '0' && c <= '9') {
                s = c - '0';
            } else {
                s =  c - 'A' + 10;
            }
            desyat += s * pow(16, p);
            p++;
        }
        System.out.println("Число в десятичном представлении: " + desyat);
    }

    private static void DesVShes(Scanner scanner) {
        System.out.print("Введите десятичное число: ");
        int desyat = scanner.nextInt();
        String d = "";
        while (desyat > 0) {
            d = (desyat % 16) + d;
            d = switch (d) {
                case "10" -> "A";
                case "11" -> "B";
                case "12" -> "C";
                case "13" -> "D";
                case "14" -> "E";
                case "15" -> "F";
                default -> d;
            };
            desyat = desyat / 16;
        }
        System.out.println("Число в шестнадцатеричном представлении: " + d);
    }



    //НА 4444444444444444444444444444444444444444444444444444

    private static String PlusDva(String b1, String b2) {
        int le1 = b1.length();
        int le2 = b2.length();
        int c = 0;
        StringBuilder result = new StringBuilder();
        if (le1 < le2) {
            b1 = String.format("%" + le2 + "s", b1).replace(' ',  '0');
            le1 = le2;
        } else if (le2 < le1) {
            b2 = String.format("%" + le1 + "s", b2).replace(' ',  '0');
            le2 = le1;
        }
        for (int i = le1 - 1; i >= 0 ; i--) {
            int d1 = b1.charAt(i) - '0';
            int d2 = b2.charAt(i) - '0';
            int sum = d1 + d2 + c;
            switch (sum) {
                case 0:
                    result.insert(0, '0');
                    c = 0;
                    break;
                case 1:
                    result.insert(0, '1');
                    c = 0;
                    break;
                case 2:
                    result.insert(0, '0');
                    c = 1;
                    break;
                case 3:
                    result.insert(0, '1');
                    c = 1;
                    break;
            }
        }
        if (c == 1) {
            result.insert(0, '1');
        }
        return result.toString();
    }

//    private static void MinusDva(Scanner scanner) {
//
//    }
//
//    private static void PlusShes(Scanner scanner) {
//
//    }
//
//    private static void MinusShes(Scanner scanner) {
//
//    }

}
