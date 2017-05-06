package in.ua.denoming.juja.labs.lab29;

import in.ua.denoming.juja.labs.shared.Tanker;

/**
 * juja: in.ua.denoming.juja.labs.lab29
 * User: DENIS
 * Date: 05.05.2017
 * Time: 22:26
 */
public class App {
    public static void main(String[] args) {
        Tanker tanker = new Tanker("Ship Tanker 1", 254, 120, 100, 60);
        System.out.println(tanker.toString() + " = " + tanker.calculatePayment());
    }
}
