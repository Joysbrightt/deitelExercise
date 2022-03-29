package ChapterFive;

import java.util.Scanner;

public class PhoneAppDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose any number 1-13: ");
        String menu = """
                1. phonebook
                2. messages
                3. chat
                4. Call Register
                5. Tones
                6. Settings
                7. Call divert
                8. Games
                9. Calculator
                10. Reminders
                11. Clock
                12. Profiles
                13. Sim services
                """;
        System.out.println(menu);
        int menuOptions = scanner.nextInt();
        switch (menuOptions) {
            case 1:
                String phonebookOps = """
                        1. Search;
                        2. Service Nos.
                        3. Add name
                        4. Erase
                        5. Edit
                        6. Assign tone
                        7. Send b'card
                        8. Options
                         """;
                System.out.println(phonebookOps);
                break;
            case 2:
                String messages = """
                         1. Write messages
                         2. Inbox
                         3. Outbox
                         4. Picture messages
                         5.Templates
                         6. Smileys
                         7. Message settings 
                         8.   Info service
                        9.   Voice mailbox number
                        10.  Service command editor
                                         
                         """;
                System.out.println(messages);
                int messageSettings = scanner.nextInt();

                if (messageSettings == 7) {
                    System.out.println("""
                            1. Set
                            2: Common
                            """);
                    int optionSeven = scanner.nextInt();
                    switch (optionSeven) {
                        case 1:
                            System.out.println("""
                                     1. Messages centre number
                                     2  Message sent as
                                     3. Message validity
                                    """);
                        case 2:
                            System.out.println("""
                                    1. Delivery
                                     2. Reply via same centre
                                     3. Character support
                                    """);
                    }

                }
                break;
            case 3:
                System.out.println("Chat");
                break;

            case 4:
                String CallRegister = """
                             1. Missed calls
                        2. Received calls
                        3. Dialled numbers
                        4. Erase recent call lists
                        5. Show call duration
                        6. Show call cost
                        7. Call settings
                        8. Prepaid credit
                            """;
                System.out.println(CallRegister);

                int callRegister = scanner.nextInt();
                if (callRegister == 5) {
                    System.out.println("""
                            1.Last call duration
                            2. All calls' duration
                            3. Received calls' duration
                            4. Dialled calls' duration
                            5. Clear timers
                            """);
                }

                if (callRegister == 6) {
                    System.out.println("""
                            1. Last call cost
                            2. All calls' cost
                            3. Clear counters
                            """);
                }

                if (callRegister == 7) {
                    System.out.println("""
                            1.Call cost limit
                            2. Show costs in
                            """);
                }

                break;
            case 5:
                String Tones = """
                        1. Ringing tone
                        2. Ringing volume
                        3. Incoming call alert
                        5. Message alert tone
                        6. Keypad tones
                        7. Warning and game tones
                        8. Vibrating alert
                        9. Screen save
                        """;
                System.out.println(Tones);
                break;
            case 6:
                String Settings = """
                        1. Call settings
                        2. Phone settings
                        3. Security settings
                        4. Restore factory settings
                                                            
                         """;
                System.out.println(Settings);

                int settings = scanner.nextInt();
                if (settings == 1) {
                    System.out.println(""" 
                            1. Automatic redial
                            2. Speed dialing
                            3. Call waiting options
                            4. Own number sending
                            5. Phone line in use
                            6. Automatic answer """);
                }

                if (settings == 2) {
                    System.out.println("""
                            1. Language
                            2.Cell info display
                            3. Welcome note
                            4. Network selection
                            5. Lights
                            6. Confirm SIM service actions
                            """);
                }

                if (settings == 3) {
                    System.out.println("""
                            1. PIN code request
                            2. Call barring service
                            3. Fixed dialling
                            4. Closed user group
                            5. Pone security
                            6. Change access codes
                            """);
                }
            case 7:
                System.out.println("Call Divert");
                break;
            case 8:
                System.out.println(" Games");
                break;
            case 9:
                System.out.println("Calculator");
                break;
            case 10:
                System.out.println("Reminders");
                break;
            case 11:
                String Clock = """
                        1. Alarm clock
                        2. Clock settings
                        3. Date setting
                        4. Stopwatch
                        5. Countdown timer
                        6. Auto update of date and time
                        """;
                System.out.println(Clock);
                break;
            case 12:
                System.out.println("Profiles");
                break;
            case 13:
                System.out.println("SIM services");
                break;

            default:
                String DoThisIfThereIsNOSim = """
                         1. Show only if supported by your SIM card.
                         2. The amount and names of sets may vary Each set appears in its own submenu.
                        3.The shortcut number depends on the amount of sets available.                 
                                       
                         """;
                System.out.println(DoThisIfThereIsNOSim);
        }


    }

}