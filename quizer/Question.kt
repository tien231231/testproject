package com.hamker.quizer

data class Question(
    val id: Int,
    val text: String,

    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val correctAnswer: String
)


fun getQuestions(): ArrayList<Question> {
    val questions = ArrayList<Question>()

    questions.add(
        Question(
            0,
            "Who are all ________ people?",

            "this",
            "those",
            "them",
            "that",
            "those"
        )
    )
    questions.add(
        Question(
            1,
            "I ____ a car next year?",

            "buy",
            "am buying",
            "going to buy",
            "bought",
            "am buying"
        )
    )

    questions.add(
        Question(
            2,
            " Cái nào được sử dụng để triển khai vòng lặp vô hạn?",

            "For loop",
            "Infinix loop",
            "While loop",
            "Repeat loop",
            "While loop"
        )
    )

    questions.add(
        Question(
            3,
            "Chính xác thì từ khóa 'Int' được sử dụng trong các ngôn ngữ lập trình là gì?",

            "Loop",
            "Data type",
            "Collection",
            "International",
            "Data type"
        )
    )
    questions.add(
        Question(
            4,
            "When do you go ________ bed?",

            "to",
            "to the",
            "in",
            "in the",
            "to"
        )
    )
    questions.shuffle()
    return questions
}