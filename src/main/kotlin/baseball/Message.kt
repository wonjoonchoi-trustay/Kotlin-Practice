package baseball


/*
    * 게임 일반 메시지를 관리하는 Enum 클래스
 */
enum class GameMessage(val message: String) {
    INPUT_NUMBER_MESSAGE("숫자를 입력해주세요 :"),
    THREE_STRIKE_MESSAGE("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    RESTART_OR_QUIT_MESSAGE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
}

/*
    * 게임 오류 메시지를 관리하는 Enum 클래스
 */
enum class GameError(val message: String) {
    NOT_NUMBER("숫자가 아닙니다"),
    NOT_THREE_DIGITS("3자리 숫자가 아닙니다"),
    INVALID_RESTART_INPUT("1 또는 2를 입력해주세요");
}