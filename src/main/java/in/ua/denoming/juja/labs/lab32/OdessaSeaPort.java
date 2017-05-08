package in.ua.denoming.juja.labs.lab32;

import in.ua.denoming.juja.labs.shared.AbstractShip;

import java.util.Arrays;

/**
 * juja: in.ua.denoming.juja.labs.lab31
 * User: DENIS
 * Date: 08.05.2017
 * Time: 11:57
 */
@SuppressWarnings("WeakerAccess")
class OdessaSeaPort {
    public static String sortSumPaymentAsc(AbstractShip[] arrayShips) {
        if (arrayShips == null || arrayShips.length == 0) {
            return "";
        }

        Arrays.sort(arrayShips, AbstractShip.PaymentComparator);

        StringBuilder output = new StringBuilder();
        for (AbstractShip arrayShip : arrayShips) {
            output.append(arrayShip.getName());
            output.append("=");
            output.append(arrayShip.calculatePayment());
        }

        return output.toString();
    }
}
