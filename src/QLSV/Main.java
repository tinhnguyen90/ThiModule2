package QLSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        validate validate = new validate();
        PhuongThuc phuongThuc = new PhuongThuc();
        int choice;
        do {
            phuongThuc.showMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    phuongThuc.showInfo();
                    break;
                case 2:
                    phuongThuc.inPutInFo();
                    break;
                case 3:
                    phuongThuc.update();
                    break;
                case 4:
                    phuongThuc.delete();
                    break;
                case 5:
                    phuongThuc.ascending();
                    break;
                case 6:
                    phuongThuc.ReadFromFile1();
                    phuongThuc.showInfo();
                    break;
                case 7:
                    phuongThuc.WriteToFile1();
                    break;
                case 8:
                    return;
                default:
                    System.err.println("Nhập sai ");
            }


        } while (choice != 0);

    }
}



