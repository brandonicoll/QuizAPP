package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answer"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        //1
        val que1 = Question(1, "What country does this flag belong too", R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia",
            "Armenia", "Austria", 1)

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionsList.add(que3)

        // 4
        val que4 = Question(
            4, "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )

        questionsList.add(que4)

        // 5
        val que5 = Question(
            5, "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionsList.add(que5)

        // 6
        val que6 = Question(
            6, "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionsList.add(que6)

        // 7
        val que7 = Question(
            7, "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionsList.add(que7)

        // 8
        val que8 = Question(
            8, "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionsList.add(que8)

        // 9
        val que9 = Question(
            9, "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionsList.add(que9)

        // 10
        val que10 = Question(
            10, "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionsList.add(que10)

        //11
        val que11 = Question(
            11, "What species of fish is this?",
            R.drawable.carp,
            "Bass", "Catfish",
            "Carp", "Ferenc", 3
        )

        questionsList.add(que11)

        //12
        val que12 = Question(
            12, "What species of fish is this?",
            R.drawable.pike,
            "Walleye", "Pike",
            "Muskellunge", "pickerel", 2
        )

        questionsList.add(que12)

        //13
        val que13 = Question(
            13, "What species of fish is this?",
            R.drawable.pike_perch,
            "White Bass", "Carp",
            "Sheephead", "Pike Perch", 4
        )

        questionsList.add(que13)

        //14
        val que14 = Question(
            14, "What species of fish is this?",
            R.drawable.largemouth_bass,
            "White Bass", "Smallmouth Bass",
            "Largemouth Bass", "Egyptian Bass", 3
        )

        questionsList.add(que14)

        //15
        val que15 = Question(
            15, "What species of fish is this?",
            R.drawable.tuna,
            "Tuna", "Bonito Tuna",
            "Skipjack Tuna", "False Albacore", 1
        )

        questionsList.add(que15)

        //16
        val que16 = Question(
            16, "What species of fish is this?",
            R.drawable.walleye,
            "Pike", "Radiation Bass",
            "Thanos", "Walleye", 4
        )

        questionsList.add(que16)

        //17
        val que17 = Question(
            17, "What species of fish is this?",
            R.drawable.white_grouper,
            "Yellow Bass", "Grouper",
            "White Grouper", "Yellow Fish", 3
        )

        questionsList.add(que17)

        //18
        val que18 = Question(
            18, "What species of fish is this?",
            R.drawable.yellow_perch,
            "Perch", "Yellow Perch",
            "Pike", "Yellow Pike", 2
        )

        questionsList.add(que18)

        //19
        val que19 = Question(
            19, "What species of fish is this?",
            R.drawable.yellowfin_grouper_tilapia,
            "Yellowfin Grouper", "Yellowfin Tuna",
            "Yellowfin Perch", "Yellowfin Mackerel", 1
        )

        questionsList.add(que19)

        //20
        val que20 = Question(
            20, "What species of fish is this?",
            R.drawable.mackerel,
            "Blue Tuna", "Blue Pike",
            "Atlantic Pike", "Mackerel", 4
        )

        questionsList.add(que20)

        return  questionsList
    }

}