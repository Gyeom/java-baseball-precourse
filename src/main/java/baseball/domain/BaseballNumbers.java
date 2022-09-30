package baseball.domain;

import baseball.domain.exceptions.BaseballIllegalArgumentException;

import java.util.HashSet;
import java.util.Set;

import static baseball.domain.BaseballNumber.MAX_VALUE;
import static baseball.domain.BaseballNumber.MIN_VALUE;
import static baseball.domain.ConsoleMessage.EXCEPTION_DUPLICATED_BASEBALL_NUMBERS;
import static baseball.domain.ConsoleMessage.EXCEPTION_INVALID_BASEBALL_NUMBERS;

public class BaseballNumbers {

    public static final int SIZE = 3;
    private static final String REGEX_BASEBALL_NUMBERS = String.format("[%d-%d]{%d}", MIN_VALUE, MAX_VALUE, SIZE);
    private static final int BASEBALL_NUMBER_SIZE = 3;

    private final BaseballNumber[] baseballNumbers;

    public BaseballNumbers(final String value) {
        verifyValue(value);
        this.baseballNumbers = new BaseballNumber[BASEBALL_NUMBER_SIZE];
        for(int index = 0; index < value.length(); index ++) {
            int numericValue = Character.getNumericValue(value.charAt(index));
            this.baseballNumbers[index] = new BaseballNumber(numericValue);
        }
    }

    private void verifyValue(final String value) {
        isValidNumberRange(value);
        isUniqueNumbers(value);
    }

    private void isUniqueNumbers(final String value) {
        Set<Character> uniqueValues = toSet(value.toCharArray());
        if(uniqueValues.size() != SIZE) {
            throw new BaseballIllegalArgumentException(EXCEPTION_DUPLICATED_BASEBALL_NUMBERS);
        }
    }

    private Set<Character> toSet(char[] chars) {
        Set<Character> uniqueValues = new HashSet<>();
        for(Character c : chars) {
            uniqueValues.add(c);
        }
        return uniqueValues;
    }

    private void isValidNumberRange(final String value) {
        if(!value.matches(REGEX_BASEBALL_NUMBERS)) {
            throw new BaseballIllegalArgumentException(
                    EXCEPTION_INVALID_BASEBALL_NUMBERS, MIN_VALUE, MAX_VALUE, SIZE);
        }
    }

    public BaseballNumber[] getBaseballNumbers() {
        return baseballNumbers;
    }
}
