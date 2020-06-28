public class Main {
    public static void main(String args[]){
        ScannerUI UI = new ScannerUI();
        KeyCardCheck keyCardCheck = new KeyCardCheck(UI);
        PinCodeCheck pinCodeCheck = new PinCodeCheck(UI);
        SecurityManager securityManager = new SecurityManager(keyCardCheck , pinCodeCheck);
        securityManager.Check();
    }
}


