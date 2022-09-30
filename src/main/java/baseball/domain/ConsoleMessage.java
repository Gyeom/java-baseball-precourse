package baseball.domain;

public enum ConsoleMessage {

    EXCEPTION_OUT_OF_BOUNDS_BASEBALL_NUMBER("%d는 %d~%d 범위에 포함되는 숫자가 아닙니다.");

    private final String message;

    ConsoleMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
