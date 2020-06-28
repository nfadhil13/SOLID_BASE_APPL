import java.util.Scanner;

public class SecurityManager {

    private KeyCardCheck keyCardCheck;
    private PinCodeCheck pinCodeCheck;

    public SecurityManager(KeyCardCheck keyCardCheck, PinCodeCheck pinCodeCheck) {
        this.keyCardCheck = keyCardCheck;
        this.pinCodeCheck = pinCodeCheck;
    }

    public void Check(){
        System.out.println("Choose Option : \n1 - keyCard \n2 - PinCode");
        int option = new Scanner(System.in).nextInt();
        switch (option){
            case 1:
                System.out.println(keyCardCheck.validateUser());
                break;
            case 2:
                System.out.println(pinCodeCheck.validateUser());
                break;
        }
    }
}
