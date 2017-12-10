package in.ua.denoming.juja.labs.lab38;

public class AccountManager {
    public static boolean transfer(Account[] accounts, int[] delta) {
        int k = 0;
        while (k < accounts.length) {
            try {
                accounts[k].change(delta[k]);
            } catch (TryAgainException e) {
                continue;
            } catch (BlockAccountException e) {
                try {
                    while (--k >= 0) {
                        accounts[k].change(-delta[k]);
                    }
                } catch (TryAgainException | BlockAccountException never) {
                    e.printStackTrace();
                }
                return false;
            }
            k++;
        }
        return true;
    }
}
