fun main() {
    var healthPoints: Int = 100;
    val playerNmae: String = "Madrigal";
    var isBlessed: Boolean = false;

    when (healthPoints) {
        100 ->
            println("$playerNmae is excellent");
        in 90..99 ->
            println("$playerNmae has a few scratches");
        in 75..89 ->
            when (isBlessed){
                true -> println("$playerNmae has some minor wounds but is healing quite quickly");
                false -> println("$playerNmae has some minor wounds.");
            };
        in 15..74 ->
            println("$playerNmae has pretty hurt")
        in 0..14 ->
            println("$playerNmae is awful condition")
    }
    println("playerName:$playerNmae     healthPoints:$healthPoints");
}
