-- Creating the Questions table
CREATE TABLE IF NOT EXISTS question (
                                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                        question_text VARCHAR(255) NOT NULL,
    options VARCHAR(255) NOT NULL,
    correct_answer VARCHAR(255) NOT NULL
    );

-- Creating the QuizSession table
CREATE TABLE IF NOT EXISTS quiz_session (
                                            id BIGINT AUTO_INCREMENT PRIMARY KEY,
                                            user_id BIGINT NOT NULL,
                                            correct_answers INT DEFAULT 0,
                                            incorrect_answers INT DEFAULT 0
);
