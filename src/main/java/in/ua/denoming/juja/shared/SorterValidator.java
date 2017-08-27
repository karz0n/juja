package in.ua.denoming.juja.shared;

import java.util.Collection;
import java.util.LinkedList;

class SorterValidator {
    static String[] validateSortOrder(Array<?> entity) {
        Collection<String> warnings = new LinkedList<>();
        int size = entity.size();
        for (int i = 0; i < size - 1; i++) {
            if (entity.compare(i, i + 1) > 0) {
                warnings.add(String.format(
                    "Element ARRAY[%s]=%s not less ARRAY[%s]=%s element in sorted array",
                    i, entity.get(i).getValue(), i + 1, entity.get(i + 1).getValue()
                ));
            }
        }
        return warnings.toArray(new String[0]);
    }

    static String[] validateItemsPresent(Array<?> entity, Array<?> original) {
        Collection<String> warnings = new LinkedList<>();
        for (int i = 0; i < original.size(); i++) {
            Element<?> e = original.get(i);
            if (!isElementPresent(entity, e)) {
                warnings.add(String.format(
                    "Missing element ORIGINAL[%s]=I%s.%s in sorted array",
                    i, e.getId(), e.getValue()
                ));
            }
        }
        return warnings.toArray(new String[0]);
    }

    private static boolean isElementPresent(Array<?> input, Element<?> element) {
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i).equals(element)) {
                return true;
            }
        }
        return false;
    }
}
