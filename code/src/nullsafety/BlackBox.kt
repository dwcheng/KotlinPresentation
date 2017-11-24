package nullsafety

import java.util.Random

data class Message(val text: String)

object BlackBox {
    fun getMessage(): Message? {
        val random = Random()
        
        if (random.nextInt() % 2 == 0) {
            return null
        } else {
            return Message("This is a message")
        }
    }
}
