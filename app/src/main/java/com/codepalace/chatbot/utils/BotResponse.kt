package com.codepalace.chatbot.utils

import com.codepalace.chatbot.utils.Constants.OPEN_GOOGLE
import com.codepalace.chatbot.utils.Constants.OPEN_SEARCH
import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat

object BotResponse {

    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message =_message.toLowerCase()

        return when {



            //Hello
            message.contains("hello") -> {

                  "hey there !\n Tap 1 : PurPlePlay, what is it?  \n Tap 2 : What can I watch on PurPlePlay  \n Tap 3 : Information  about Musics \n Tap 4 : more assistance"


            }
            //Hello
            message.contains("hi") -> {

                "hey there !\n Tap 1 : PurPlePlay, what is it?  \n Tap 2 : What can I watch on PurPlePlay  \n Tap 3 : Information  about Musics \n Tap 4 : more assistance"


            }
            //Hello
            message.contains("aslema") -> {

                "hey there !\n Tap 1 : PurPlePlay, what is it?  \n Tap 2 : What can I watch on PurPlePlay  \n Tap 3 : Information  about Musics \n Tap 4 : more assistance"


            }
            //Hello
            message.contains("hola") -> {

                "hey there !\n Tap 1 : PurPlePlay, what is it?  \n Tap 2 : What can I watch on PurPlePlay  \n Tap 3 : Information  about Musics \n Tap 4 : more assistance"


            }
            //Hello
            message.contains("salut") -> {

                "hey there !\n Tap 1 : PurPlePlay, what is it?  \n Tap 2 : What can I watch on PurPlePlay  \n Tap 3 : Information  about Musics \n Tap 4 : more assistance"


            }

            //1
            message.contains("1") -> {
                "PURPlePlay is a media app offres a vast catalog including award-winning feature films and music . With PurPlePlay Discover new movies and songs every week, there's something for everyone."
            }
            //2
            message.contains("2") -> {
                " PurplePlay is a streaming service that delivers a wide selection of movies, anime and other programs. \n - Watch whatever you want. "            }
            //3
            message.contains("3") -> {
                " - Access music and podcasts from home or your favorite creators\n - Browse millions of songs,meditations and save favorites to your library or custom playlists. \n - Enjoy personalizet playlists. "            }

            //4
            message.contains("4") -> {
                 "  Contact us :\n 💌 purpleplay@dev.tn  \n ☎️ +216 22 407 863  "}



            //Open Google
            message.contains("open") && message.contains("google")-> {
                OPEN_GOOGLE
            }

            //Search on the internet
            message.contains("search")-> {
                OPEN_SEARCH
            }

            //When the programme doesn't understand...
            else -> {
                when (random) {
                    0 -> "I don't understand..."
                    1 -> "Try asking me something different"
                    2 -> "say hello first PLEASE"
                    3 -> "We are so happy to visit us , Thank you!  "
                    else -> "error"
                }
            }
        }
    }
}