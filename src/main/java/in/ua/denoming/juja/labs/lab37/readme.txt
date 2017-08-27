Алгоритм реализующий циклический сдвиг строки вправо.

Примеры:

rightShift("ABCDE", 1) = "EABCD"
rightShift("ABCDE", 2) = "DEABC"
rightShift("ABCDE", 3) = "CDEAB"
rightShift("ABCDE", 4) = "BCDEA"

Допустимы следующие ситуации:
 + сдвигать на отрицательное расстояние (выходит сдвиг влево)
    rightShift("ABCDE", -1) = "BCDEA"
    rightShift("ABCDE", -2) = "CDEAB"
    rightShift("ABCDE", -7) = "CDEAB"
 + сдвиг на расстояние 0 и сдвиги строк длиной 0 и 1 символ - разрешены.