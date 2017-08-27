package in.ua.denoming.juja.labs.lab28;

import in.ua.denoming.juja.shared.Liner;

public class App {
    public static void main(String[] args) {
        Liner liner = new Liner("Ship 1", 125, 250, 50, 175);
        System.out.println(liner.toString() + " = " + liner.calculatePayment());
    }
}
