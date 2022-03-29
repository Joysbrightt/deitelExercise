package ChapterSix;

import java.util.Scanner;

public class Myers_BriggsQuestionanire {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countA1 = 0;
        int countB1 = 0;
        int countA2 = 0;
        int countB2 = 0;
        int countA3 =0 ;
        int countB3 = 0;
        int countA4 = 0;
        int countB4 = 0;

        int question = 1;

        System.out.println("Myers Briggs Questionnaire");
        for (; question <= 20; question++) {
String userInput;

            switch (question) {
                case 1 -> {
                    String prompt = """
                              1.
                               A. Expend energy, enjoy groups
                               B. Conserve energy, enjoy one-on-one
                            """;
                    System.out.println(prompt);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA1++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB1++;
                        System.out.println();
                    }
                }
                case 2 -> {
                    String prompt2 = """
                            2.
                            A. Interpret literally
                            B. look for meaning and possibilities
                                                
                            """;
                    System.out.println(prompt2);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA2++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB2++;
                        System.out.println();
                    }
                }
                case 3 -> {
                    String prompt3 = """
                            3.
                            A. Logical, thinking, questioning
                            B. empathetic, feeling, accommodating
                            """;
                    System.out.println(prompt3);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA3++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB3++;
                        System.out.println();
                    }
                }
                case 4 -> {
                    String prompt4 = """
                            4.
                            A. Organizing, orderly
                            B. flexible, adaptable
                            """;
                    System.out.println(prompt4);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA4++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB4++;
                        System.out.println();
                    }
                }
                case 5 -> {
                    String promt5 = """
                            A. more outgoing, think out loud
                            B. more reversed, think to yourself
                            """;
                    System.out.println(promt5);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA1++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB1++;
                        System.out.println();
                    }
                }
                case 6 -> {
                    String prompt6 = """
                            6.
                            A. practical, realistic, experiential
                            B. imaginative, innovative, theoretical
                            """;
                    System.out.println(prompt6);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA2++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB2++;

                    }
                }
                case 7 -> {
                    String prompt7 = """
                            7.
                            A. candid, straight forward, frank
                            B. tactful, kind encouraging
                             """;
                    System.out.println(prompt7);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA3++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB3++;

                    }
                }
                case 8 -> {
                    String promt8 = """
                            8.
                            A. plan, schedule
                            B. unplanned, spontaneous
                            """;
                    System.out.println(promt8);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA4++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB4++;

                    }
                }
                case 9 -> {
                    String promt9 = """
                            9.
                            A. seek many tasks, public activities, interaction with others
                            B. seek private, solitary activities with quiet to concentrate
                            """;
                    System.out.println(promt9);

                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA1++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB1++;
                    }
                }
                case 10 -> {
                    String promt10 = """
                            10.
                            A. Standard, usual, conventional
                            B. different, novel unique
                            """;
                    System.out.println(promt10);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA2++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB2++;

                    }
                }
                case 11 -> {
                    String prompt11 = """
                               11.
                            A. firm, tend to criticize, hold the line
                            B. gentle, tend to appreciate, conciliate
                               """; System.out.println(prompt11);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA3++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB3++;
                    }
                }
                case 12 -> {
                    String promt12 = """
                            12.
                             A. regulated, structured
                             B. easygoing, "live" and "let live"
                            """;
                    System.out.println(promt12);

                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA4++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB4++;
                    }
                }
                case 13 -> {
                    String prompt13 = """
                            13.
                            A. external, communicative, express your
                            B. internal, reticent, keep to yourself
                            """;
                    System.out.println(prompt13);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA1++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB1++;
                    }
                }
                case 14 -> {
                    String promt14 = """
                            14.
                            A. focus here-and-now.
                            B. look to the future, global perspective, "big picture"
                            """;
                    System.out.println(promt14);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA2++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB2++;
                    }
                }
                case 15 -> {
                    String promt15 = """
                            15.
                            A. tough-minded, just
                            B. tender-hearted, merciful
                            """;
                    System.out.println(promt15);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA3++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB3++;
                    }
                }
                case 16 -> {
                    String promt16 = """
                             16.
                            A. preparation, plan ahead
                            B. go with the flow, adapt as you go
                             """;
                    System.out.println(promt16);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA4++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB4++;
                    }
                }
                case 17 -> {
                    String promt17 = """
                            17.
                            A. active, initiate
                            B.  reflective, deliberate
                            """;
                    System.out.println(promt17);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA1++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB1++;
                    }
                }
                case 18 -> {
                    String promt18 = """
                             18.
                            A. fact, things, "what is"
                            B. ideas, dreams, "what could be," philosophical

                             """;
                    System.out.println(promt18);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA2++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB2++;
                        System.out.println();
                    }
                }
                case 19 -> {
                    String promt19 = """
                            19.
                             matter of fact, issue-oriented
                             sensitive, people-oriented, compassionate

                            """;
                    System.out.println(promt19);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA3++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB3++;
                        System.out.println();
                    }
                }
                case 20 -> {
                    String promt20 = """
                            20.
                             A. control, govern
                             B. latitude, freedom

                            """;
                    System.out.println(promt20);
                    userInput = scanner.nextLine();
                    if (userInput.equalsIgnoreCase("A")) {
                        countA4++;
                    }
                    if (userInput.equalsIgnoreCase("B")) {
                        countB4++;
                        System.out.println();
                    }
                }
            }
            System.out.println();

        }
        System.out.println("Your personalities is: ");
        if(countA1 > countB1){
            System.out.println("Introvert");
        } else{
            System.out.println("Extrovert");
        }
        if(countA2 > countB2){
            System.out.println("Sensors");
        } else{
            System.out.println("Intuitive");
        }
        if(countA3 > countB3){
            System.out.println("Thinkers");
        }else{
            System.out.println("Feelers");
        }
        if(countA4 > countB4){
            System.out.println(" Judgers");
        }else{
            System.out.println("perceivers");
        }

    }

}

