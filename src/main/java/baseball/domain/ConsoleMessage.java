package baseball.domain;

public enum ConsoleMessage {

    EXCEPTION_OUT_OF_BOUNDS_BASEBALL_NUMBER("%d는 %d~%d 범위에 포함되는 숫자가 아닙니다."),
    EXCEPTION_INVALID_BASEBALL_NUMBERS("%d~%d 범위에 포함되는 %d개의 숫자로 구성되어야 합니다."),
    EXCEPTION_DUPLICATED_BASEBALL_NUMBERS("중복된 숫자가 포함되어 있습니다.");

    private final String message;

    ConsoleMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
