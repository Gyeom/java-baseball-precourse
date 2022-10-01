package baseball.domain;


import static baseball.domain.BaseballNumber.MAX_VALUE;
import static baseball.domain.BaseballNumber.MIN_VALUE;
import static baseball.domain.BaseballNumbers.SIZE;
import static java.lang.String.*;

public enum ConsoleMessage {


    INPUT_BASEBALL_GAME_START(format("%d~%d 범위에 포함되는 서로 다른 숫자 %d자리를 입력해주세요.", MIN_VALUE, MAX_VALUE, SIZE)),
    OUTPUT_BASEBALL_GAME_WIN(format("%d스트라이크로 게임에 승리하였습니다.", SIZE)),
    EXCEPTION_OUT_OF_BOUNDS_BASEBALL_NUMBER("%d는 %d~%d 범위에 포함되는 숫자가 아닙니다."),
    EXCEPTION_INVALID_BASEBALL_NUMBERS(format("%d~%d 범위에 포함되는 %d개의 숫자로 구성되어야 합니다.", MIN_VALUE, MAX_VALUE, SIZE)),
    EXCEPTION_DUPLICATED_BASEBALL_NUMBERS("중복된 숫자가 포함되어 있습니다.");

    private final String message;

    ConsoleMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
