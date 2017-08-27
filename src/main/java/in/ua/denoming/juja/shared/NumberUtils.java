package in.ua.denoming.juja.shared;

import java.util.Collection;
import java.util.ArrayList;

class NumberUtils {
    static Number[] invert(Number[] input) {
        Number[] output = input.clone();
        for (int k = output.length / 2; k > 0; --k) {
            Number tmp = output[k - 1];
            output[k - 1] = output[output.length - k];
            output[output.length - k] = tmp;
        }
        return output;
    }

    static Number[] filterEven(Number[] input) {
        Collection<Number> co = new ArrayList<>();
        for (Number value : input) {
            if ((value.longValue() % 2) == 0) {
                co.add(value);
            }
        }
        return co.toArray(new Number[0]);
    }

    static Number[] filterOdd(Number[] input) {
        Collection<Number> co = new ArrayList<>();
        for (Number anInput : input) {
            if ((anInput.longValue() % 2) != 0) {
                co.add(anInput);
            }
        }
        return co.toArray(new Number[0]);
    }

    static Number[] mergeSorted(Number[] input1, Number[] input2) {
        Number[] output = new Number[input1.length + input2.length];
        int i = 0, j = 0;
        for (int k = 0; k < output.length; k++) {
            if (j >= input2.length || (i < input1.length && input1[i].longValue() < input2[j].longValue())) {
                output[k] = input1[i++];
            } else {
                output[k] = input2[j++];
            }
        }
        return output;
    }

    static Number[] lookForPositiveRange(Number[] input) {
        Number[] output = {};

        int index = 0;
        int startIndex = 0, stopIndex;
        int distance = -1;
        boolean flag = false;

        while (index < input.length) {
            if (input[index].longValue() <= 0) {
                if (flag) {
                    stopIndex = --index;
                    if ((stopIndex - startIndex) > distance) {
                        distance = stopIndex - startIndex;
                        output = new Number[]{startIndex, stopIndex};
                    }
                    flag = false;
                }
                index++;
                continue;
            }
            if (!flag) {
                startIndex = index;
                flag = true;
            }
            index++;
        }

        if (flag) {
            if ((input.length - startIndex - 1) > distance) {
                output = new Number[]{startIndex, input.length - 1};
            }
        }

        return output;
    }
}
