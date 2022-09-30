package baseball.domain;

public class BaseballNumbers {

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
        // TODO : value 검증 로직 추가
    }

    public BaseballNumber[] getBaseballNumbers() {
        return baseballNumbers;
    }
}
