package in.ua.denoming.juja.labs.lab30;

import in.ua.denoming.juja.labs.shared.Cargo;

/**
 * juja: in.ua.denoming.juja.labs.lab30
 * User: DENIS
 * Date: 05.05.2017
 * Time: 22:30
 */
public class App {
    public static void main(String[] args) {
        Cargo cargo = new Cargo("Ship Tanker 1", 254, 120, 100, 60);
        System.out.println(cargo.toString() + " = " + cargo.calculatePayment());
    }
}
