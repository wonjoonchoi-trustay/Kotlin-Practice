package baseball

/*
    * 유저의 입력값을 받습니다
    * 숫자가 아닌 값은 NumberFormatException을 던집니다
    * 3자리가 아닌 값은 IllegalArgumentException을 던집니다
 */
fun getValidInputNumber(): Int {
    print(GameMessage.INPUT_NUMBER_MESSAGE.message)

    // 올바른 형식 체크
    val guessNumber = readln().toIntOrNull() ?: throw NumberFormatException(GameError.NOT_NUMBER.message)

    // 3자리 체크
    if (guessNumber !in 111..999) throw IllegalArgumentException(GameError.NOT_THREE_DIGITS.message)

    return guessNumber
}



/*
    * 게임 종료 메시지를 출력합니다.
 */
fun printGameEndMessage() {
    println(GameMessage.THREE_STRIKE_MESSAGE.message)
    println(GameMessage.RESTART_OR_QUIT_MESSAGE.message)
}

/*
    * 게임 재시작 여부를 입력받습니다.
    * 1 또는 2가 아닌 경우 IllegalArgumentException을 던집니다.
 */
fun getRestartInput(): Int {
    val input = readln().toIntOrNull() ?: throw IllegalArgumentException(GameError.INVALID_RESTART_INPUT.message)
    if (input != 1 && input != 2) throw IllegalArgumentException(GameError.INVALID_RESTART_INPUT.message)
    return input
}