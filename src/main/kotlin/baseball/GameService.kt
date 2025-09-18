package baseball

/*
    * 중복되지 않는 1..9으로 구성된 3자리 수를 생성합니다
 */
fun generateRandom() : Int  {
    val digits = (1..9).shuffled().take(3)
    return digits.joinToString("").toInt()
}

/*
    * 랜덤값과 유저의 입력값을 비교해서 볼, 스트라이크의 갯수를 반환합니다
 */
fun getResult(randomNumber: Int, guessNumber: Int): Pair<Int, Int> {
    if (randomNumber == guessNumber) return Pair(0, 3)

    val randomNumberStr = randomNumber.toString()
    val guessNumberStr = guessNumber.toString()

    var balls = 0
    var strikes = 0

    for (i in 0..2) {
        when {
            guessNumberStr[i] == randomNumberStr[i] -> strikes++
            guessNumberStr[i] in randomNumberStr -> balls++
        }
    }

    return balls to strikes
}


/*
    * 결과값에 따라 메세지를 출력합니다
 */
fun resultMessage(balls: Int, strikes: Int): String =
    buildList {
        if (balls > 0) add("${balls}볼")
        if (strikes > 0) add("${strikes}스트라이크")
    }.joinToString(" ").ifBlank { "낫싱" }