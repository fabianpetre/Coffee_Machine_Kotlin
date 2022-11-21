
fun alert(material : Int){
    println("Sorry, not enough $material!")
}

fun mainActivity( _water: Int, _coffeeBeans: Int, _milk: Int, _cups: Int, _money: Int){
    var water = _water
    var coffeeBeans = _coffeeBeans
    var milk = _milk
    var cups = _cups
    var money = _money
    println("Write action (buy, fill, take, remaining, exit):")
    var action = readln()
        action=action.lowercase()
        when(action){
            "buy"-> {
                println("What do you want to buy?")
                val buychoice= readln()
                if(buychoice!="back") {
                    val bchoice = buychoice.toInt()
                    when (bchoice) {
                            1 -> {
                                if (water >= 250)
                                    if (coffeeBeans >= 16) {
                                        money += 4
                                        water -= 250
                                        coffeeBeans -= 16
                                        cups--
                                    } else alert(coffeeBeans)
                                else alert(water)
                            }

                            2 -> {
                                if (water >= 350)
                                    if (milk >= 75)
                                        if (coffeeBeans >= 20) {
                                            money += 7
                                            water -= 350
                                            milk -= 75
                                            coffeeBeans -= 20
                                            cups--
                                        } else alert(coffeeBeans)
                                    else alert(milk)
                                else alert(water)
                            }

                            3 -> {
                                if (water >= 200)
                                    if (milk >= 100)
                                        if (coffeeBeans >= 12) {
                                            money += 6
                                            water -= 200
                                            milk -= 100
                                            coffeeBeans -= 12
                                            cups--
                                        } else alert(coffeeBeans)
                                    else alert(milk)
                                else alert(water)
                            }
                        }
                }
                mainActivity(water,coffeeBeans,milk,cups,money)
            }
            "fill"->{
                println("Write how many ml of water you want to add:")
                water+= readln().toInt()
                println("Write how many ml of milk you want to add:")
                milk+= readln().toInt()
                println("Write how many grams of coffee beans you want to add:")
                coffeeBeans+= readln().toInt()
                println("Write how many disposable cups you want to add:")
                cups+= readln().toInt()
                mainActivity(water,coffeeBeans,milk,cups,money)
            }
            "take"->{
                println("I gave you $money")
                money=0
                mainActivity(water,coffeeBeans,milk,cups,money)
            }
            "remaining"->{
                println("The coffee machine has:\n" +
                        "$water ml of water\n" +
                        "$milk ml of milk\n" +
                        "$coffeeBeans g of coffee beans\n" +
                        "$cups disposable cups\n" +
                        "\$$money of money")
                mainActivity(water,coffeeBeans,milk,cups,money)
            }
            else -> return
        }
}
fun main() {
    mainActivity(400, 120, 540, 9, 550)
}
