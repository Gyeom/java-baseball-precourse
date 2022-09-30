package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

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
}