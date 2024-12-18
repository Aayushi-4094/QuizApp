CREATE TABLE if not exists Question (
                          id INT AUTO_INCREMENT PRIMARY KEY,
                          category VARCHAR(255) NOT NULL,
                          difficulty_level VARCHAR(255) NOT NULL,
                          question_title VARCHAR(255) NOT NULL,
                          option1 VARCHAR(255) NOT NULL,
                          option2 VARCHAR(255) NOT NULL,
                          option3 VARCHAR(255) NOT NULL,
                          option4 VARCHAR(255) NOT NULL,
                          right_answer VARCHAR(255) NOT NULL
);

