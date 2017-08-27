package in.ua.denoming.juja.labs.lab30;

import in.ua.denoming.juja.shared.Cargo;

public class App {
    public static void main(String[] args) {
        Cargo cargo = new Cargo("Ship Tanker 1", 254, 120, 100, 60);
        System.out.println(cargo.toString() + " = " + cargo.calculatePayment());
    }
}
