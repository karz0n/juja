package in.ua.denoming.juja.labs.lab19;

class ExchangeMoney {
    private static final int[] coinsRates  = {1, 2, 5, 10, 25, 50};

    static int exchangeAmountOfCoinsBrutForce(int amountForExchange) {
        return calcCombinationCount(coinsRates.length - 1, amountForExchange, new int[coinsRates.length]);
    }

    private static int calcCombinationCount(int index, int value, int[] combinations) {
        int sum = 0;
        int variantsCount = 0;

        while (sum < value) {
            if (index > 0) {
                variantsCount += calcCombinationCount(index - 1, value, combinations);
                resetCombinations(index, combinations);
            }
            combinations[index]++;
            sum = sumCombinations(combinations);
            if (sum == value) {
                variantsCount++;
            }
        }

        return variantsCount;
    }

    private static int sumCombinations(int[] combinations) {
        int sum = 0;
        for (int i = 0; i < combinations.length; i++) {
            sum += combinations[i] * coinsRates[i];
        }
        return sum;
    }

    private static void resetCombinations(int index, int[] combinations) {
        for (int i = 0; i < index; i++) {
            combinations[i] = 0;
        }
    }
}
