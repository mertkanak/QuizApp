package com.example.quizappdemo

object Constants {
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1, "What country does this flag belong to",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia","Austria",
            1,
        )
        val que2 = Question(
            1, "What country does this flag belong to",
            R.drawable.ic_flag_of_australia,
            "Argentina", "Australia", "Armenia","Brazil",
            2,
        )
        val que3 = Question(
            1, "What country does this flag belong to",
            R.drawable.ic_flag_of_belgium,
            "Belgium", "Australia", "Argentina","Austria",
            1,
        )
        val que4 = Question(
            1, "What country does this flag belong to",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Australia", "Brazil","Austria",
            3,
        )
        val que5 = Question(
            1, "What country does this flag belong to",
            R.drawable.ic_flag_of_fiji,
            "Argentina", "Fiji", "Armenia","Austria",
            2,
        )
        questionsList.add(que1)
        questionsList.add(que2)
        questionsList.add(que3)
        questionsList.add(que4)
        questionsList.add(que5)
        return questionsList
    }
}