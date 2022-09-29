package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("야구 숫자 테스트")
class BaseballNumberTest {

    @ParameterizedTest(name = "{displayName} [input : {arguments}]")
    @ValueSource(ints = {1, 2, 3, 4, 5, 6, 7, 8, 9})
    @DisplayName("야구 숫자 생성 성공")
    void init(int input) {
        // when
        BaseballNumber baseballNumber = new BaseballNumber(input);

        // then
        assertThat(baseballNumber.getValue()).isEqualTo(input);
    }
}