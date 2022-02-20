package eu.tusshar.electrothon

import java.util.ArrayList

object Constants {
    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_questions"
    const val CORRECT_ANSWERS:String="correct_answers"

    fun getQuestions():ArrayList<Question>{
        val questionList=ArrayList<Question>()
        val ques1=Question(
            1, question = "If you are at risk from earthquake,what can you do to prepare for an earthquake?",
            R.drawable.just2,
             "Choose a safe place in every room in your home, such as under a sturdy table or desk.",
            "Develop a Family Disaster Plan.",
             "BOTH of the above; choose a safe place and develop a Family Disaster Plan.",
             "None of the above",
            3
        )
        questionList.add(ques1)
        val ques2=Question(
            2, question = "If you are INSIDE when the shaking from an earthquake begins, you should:",
            R.drawable.onlyjust1,
            "Run outside immediately.",
            " DUCK, COVER and HOLD ON! Duck or drop down to the floor.",
            "Call your friends and relatives as soon as possible to find out if they are OK.",
            "Get in a doorway",
            2
        )
        questionList.add(ques2)
        val ques3=Question(
            3, question = "If you feel a STRONG coastal earthquake that lasts 20 seconds or longer, you should:",
            R.drawable.justno3,
            "Drop, cover, and hold on.",
            "When the shaking stops, evacuate quickly.",
            "BOTH of the above; drop, cover, and hold on and when the shaking stops, evacuate quickly.",
            "None of the above",
            3
        )
        questionList.add(ques3)
        val ques4=Question(
            4, question = "If an earthquake has generated a tsunami wave,what should you do? ",
            R.drawable.just4,
            "Return Home",
            "Wait until local officials tell you it is safe",
            "Go to the beach to inspect the effects of tsunami",
            "Stop and pack your most cherished possessions",
            2
        )
        questionList.add(ques4)
        val ques5=Question(
            5, question = "What should you do if you are caught in a landslide?",
            R.drawable.just5,
            "Lay on the ground as flat as possible.",
            "Quickly move out of the path of the landslide or debris flow.",
            "Stand in the same place and do not move.",
            "Climb a nearby tree or pole",
            2
        )
        questionList.add(ques5)
        val ques6=Question(
            6, question = "What should you do after a landslide?",
            R.drawable.just6,
            "Inspect the damage caused by the landslide.",
            "Stay away from the slide area.",
            "Touch nearby electric wires or poles",
            "walk over the loose material",
            2
        )
        questionList.add(ques6)
        val ques7=Question(
            7, question = "Wherever you are, if you hear or see a tornado coming, what should you do?",
            R.drawable.justno7,
            "Run away from the tornado as fast as possible.",
            "Stay where you are and do not move.",
            "Take cover right away.",
            "Stand near a window",
            3
        )
        questionList.add(ques7)
        val ques8=Question(
            8, question = "If you are outside and there is no building nearby, what should you do if a tornado is coming?",
            R.drawable.just8,
            "Move to higher ground.",
            "Lie flat in a low spot and use your arms and hands to protect your head.",
            "Get into a car if one is nearby.",
            "Take shelter near a bridge or a tree",
            2
        )
        questionList.add(ques8)
        val ques9=Question(
            9, question = "What should you do if you come upon flood waters?",
            R.drawable.justno9,
            "Try to drive through the water.",
            " Try to swim through the water.",
            "Stop! Turn around and go another way.",
            "Try to walk through the running flood water",
            3
        )
        questionList.add(ques9)
        val ques10=Question(
            10, question = "How many inches of fast-moving flood water can knock you off your feet?",
            R.drawable.only10,
            " 6 inches",
            " 8 inches",
            "10 inches",
            "12 inches",
            1
        )
        questionList.add(ques10)
        val ques11=Question(
            11, question = "If you are in an area at risk from hurricanes, what are some things you can do to plan for a hurricane?",
            R.drawable.just11,
            "Develop a Family Disaster Plan.",
            " Develop an Evacuation Plan.",
            "BOTH of the above; develop a Family Disaster Plan and an Evacuation Plan.",
            "None of the above",
            3
        )
        questionList.add(ques11)
        val ques12=Question(
            12, question = "What is the most damaging result of a hurricane?",
            R.drawable.just12,
            "Rain",
            "Storm surge",
            "High winds",
            "Hail",
            2
        )
        questionList.add(ques12)
        val ques13=Question(
            13, question = "If you hear a thunderstorm coming, what should you do?",
            R.drawable.justno13,
            "Stand under a tree for protection.",
            "Go immediately inside a sturdy building or vehicle with a metal top and side.",
            "Lie down flat on the ground.",
            "Use a cliff or a rocky overhang for shelter",
            2
        )
        questionList.add(ques13)
        val ques14=Question(
            14, question = "If you can't get inside during a thunderstorm,what should you do?",
            R.drawable.just14,
            "Stand under a tree to keep from getting wet",
            "Stand outside in open away from tree",
            "Run towards a substantial building or vehicle with metal top and sides",
            "Get in a nearby pond or lake",
            3
        )
        questionList.add(ques14)
        val ques15=Question(
            15, question = "Volcanoes are:",
            R.drawable.justno15,
            "Randomly distributed over the Earth's surface.",
            "Concentrated at the north and south poles.",
            "Concentrated on the edges of continents beneath the sea forming long mountain ranges.",
            "Concentrated only at the equator",
            3
        )
        questionList.add(ques15)
        val ques16=Question(
            16, question = "If you live near an active volcano, what can you do to plan for a volcanic eruption?",
            R.drawable.justno16,
            "Develop an Evacuation Plan.",
            "Learn about your community warning systems and emergency plans.",
            "BOTH of the above; develop an Evacuation Plan and learn about your community warning systems and emergency plans. ",
            "None of the above",
            3
        )
        questionList.add(ques16)
        val ques17=Question(
            17, question = "If your home is at risk from wildfire, what can you do to reduce the fire hazard?",
            R.drawable.justno17,
            "Mow and water the grass regularly.",
            "Regularly dispose of newspapers and rubbish at an approved site.",
            "BOTH of the above; mow and water the grass regularly and regularly dispose of newspapers and rubbish at an approved site.",
            "None of the above",
            3
        )
        questionList.add(ques17)
        val ques18=Question(
            18, question = "What is the most vulnerable part of a house in the event of a wildfire?",
            R.drawable.justno18,
            "Porch",
            "Deck",
            "Roof",
            "Floor",
            3
        )
        questionList.add(ques18)
        val ques19=Question(
            19, question = "What should a Disaster Supplies Kit include?",
            R.drawable.just19,
            "Flashlight and extra batteries",
            "First aid kit",
            "BOTH of the above; flashlight and extra batteries and a first aid kit.",
            "None of the above",
            3
        )
        questionList.add(ques19)
        val ques20=Question(
            20, question = "What is an example of something you should practice to prepare for a disaster?",
            R.drawable.just20,
            "DUCK, COVER and HOLD ON during an earthquake.",
            " Lie down as flat as possible on the ground if lightning is about to strike.",
            "Stop and drop if your clothes catch on fire.",
            "Stand under a tree to keep from getting wet during a thunderstorm",
            1
        )
        questionList.add(ques20)

        return questionList


    }

}