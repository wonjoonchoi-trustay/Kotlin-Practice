package baseball

/*
    * 게임을 실행합니다
    * 3스트라이크가 될 때까지 반복합니다
    * 3스트라이크가 되면 게임 종료 메시지를 출력하고 재시작 여부를 입력받습니다
    * 재시작 여부에 따라 1 또는 2를 반환합니다
 */
fun play(): Int {
    val answer = generateRandom()
    while (true) {
        var guess: Int = getValidInputNumber()
        val (balls, strikes) = getResult(answer, guess)
        println(resultMessage(balls, strikes))
        if (strikes == 3) break
    }
    printGameEndMessage()
    return getRestartInput()
}