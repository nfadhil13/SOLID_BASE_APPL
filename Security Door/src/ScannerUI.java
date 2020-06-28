import interfaces.ISecurityUI;

import java.util.Scanner;

public class ScannerUI implements ISecurityUI {
    @Override
    public String requestKeyCard() {
        System.out.println("Slide your card Here");
        return new Scanner(System.in).nextLine();
    }

    @Override
    public int requestPinCode() {
        System.out.println("Enter your pin code:");
        return new Scanner(System.in).nextInt();
    }
}
