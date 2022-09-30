package baseball.domain;

import java.util.Objects;

public class BaseballNumber {
    private final int value;

    public BaseballNumber(final int value) {
        verifyValue(value);
        this.value = value;
    }

    private void verifyValue(final int value) {
        // TODO : value 검증 로직 추가
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseballNumber that = (BaseballNumber) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
