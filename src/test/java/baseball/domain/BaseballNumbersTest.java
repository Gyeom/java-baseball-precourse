package baseball.domain;

import baseball.domain.exceptions.BaseballIllegalArgumentException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static baseball.domain.ConsoleMessage.EXCEPTION_DUPLICATED_BASEBALL_NUMBERS;
import static baseball.domain.ConsoleMessage.EXCEPTION_INVALID_BASEBALL_NUMBERS;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

@DisplayName("야구 숫자 세트 테스트")
class BaseballNumbersTest {

    @Test
    @DisplayName("야구 숫자 세트 생성 성공")
    void init() {
        // when
        BaseballNumbers baseballNumbers = new BaseballNumbers("123");

        // then
        assertThat(baseballNumbers.getBaseballNumbers()).containsExactly(
                new BaseballNumber(1), new BaseballNumber(2), new BaseballNumber(3)
        );
    }

    @ParameterizedTest(name = "{displayName} [input : {arguments}]")
    @ValueSource(strings = {"aaa", "2b3", "34c", "123456", "abcde"})
    @DisplayName("야구 숫자 세트 생성 실패 (잘못된 형식의 입력 값)")
    void initException(String input) {
        // when & then
        assertThatExceptionOfType(BaseballIllegalArgumentException.class)
                .isThrownBy(() -> new BaseballNumbers(input))
                .withMessageMatching(EXCEPTION_INVALID_BASEBALL_NUMBERS.getMessage()
                        .replace("%d", "\\d+"));
    }

    @ParameterizedTest(name = "{displayName} [input : {arguments}]")
    @ValueSource(strings = {"111", "226", "633"})
    @DisplayName("야구 숫자 세트 생성 실패 (중복된 숫자 포함)")
    void initException2(String input) {
        // when & then
        assertThatExceptionOfType(BaseballIllegalArgumentException.class)
                .isThrownBy(() -> new BaseballNumbers(input))
                .withMessageMatching(EXCEPTION_DUPLICATED_BASEBALL_NUMBERS.getMessage());
    }
}