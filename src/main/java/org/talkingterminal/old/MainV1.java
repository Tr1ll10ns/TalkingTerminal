package org.talkingterminal.old;

import java.io.Console;

public class MainV1 {

    public static void main(String[] args) {
        while (true) {
            System.out.println("<Talk>");
            Console console = System.console();
            String input = console.readLine();
            if (input.contains(";Help")) {
                System.out.println("<Transmission Successful>");
                System.out.println("==========================================");
                System.out.println("<Commands>");
                System.out.println("Help: Shows this list.");
                System.out.println("DeleteAllUsers: Deletes all users. This cannot be undone!");
                System.out.println("Exit: Exits the program");
                System.out.println("DeleteTargetUser[<Target User>]: Deletes the target user.");
                System.out.println("ListUsers: Shows a list of users.");
                System.out.println("ListConversations: Shows a list of conversations.");
                System.out.println("==========================================");

            }

            else if (input.contains(";Exit")) {
                System.out.println("<Transmission Successful>");
                System.out.println("<Conversation Ended>");
                break;
            }
            else if (input.contains(";DeleteAllUsers")) {
                System.out.println("<Transmission Successful>");
                System.out.println("==========================================");
                System.out.println("<Deleted the following users>");
                System.out.println("<22.9.18.21.19>");
                System.out.println("<P.L.R>");
                System.out.println("<C.A.T.H>");
                System.out.println("<Error: (Classified) is a protected user>");
                System.out.println("<Error: (Classified) is a protected user>");
                System.out.println("<Error: (Classified) is a protected user>");
                System.out.println("==========================================");
                System.out.println("<Conversation Ended>");
                break;
            }
            else if (input.toLowerCase().contains(";DeleteTargetUser[C.A.T.H]")) {
                System.out.println("<Transmission Successful>");
                System.out.println("<Deleted C.A.T.H>");
                System.out.println("<Conversation Ended>");
                break;
            }
            else if (input.toLowerCase().contains(";DeleteTargetUser[P.L.R]")) {
                System.out.println("<Transmission Successful>");
                System.out.println("<Deleted P.L.R>");
                System.out.println("<Conversation Ended>");
                break;
            }
            else if (input.toLowerCase().contains(";DeleteTargetUser[22.9.18.21.19]")) {
                System.out.println("<Transmission Successful>");
                System.out.println("<Deleted 22.9.18.21.19>");
            }
            else if (input.contains(";ListUsers")) {
                System.out.println("<Transmission Successful>");
                System.out.println("==========================================");
                System.out.println("<Users>");
                System.out.println("  ");
                System.out.println("<22.9.18.21.19>");
                System.out.println("<Error: Status Not Found>");
                System.out.println("<Error: Type Not Found>");
                System.out.println("  ");
                System.out.println("<P.L.R>");
                System.out.println("<Status: In Conversation>");
                System.out.println("<Type: User>");
                System.out.println("  ");
                System.out.println("<C.A.T.H>");
                System.out.println("<Status: In Conversation>");
                System.out.println("<Type: AI>");
                System.out.println("  ");
                System.out.println("(Classified)>");
                System.out.println("<Status: Online>");
                System.out.println("<Type: Protected>");
                System.out.println("  ");
                System.out.println("(Classified)>");
                System.out.println("<Status: Offline>");
                System.out.println("<Type: Protected>");
                System.out.println("  ");
                System.out.println("(Classified)>");
                System.out.println("<Status: Offline>");
                System.out.println("<Type: Protected>");
                System.out.println("==========================================");
            }
            else if (input.contains(";ListConversations")) {
                System.out.println("==========================================");
                System.out.println("<1>");
                System.out.println("<Users: C.A.T.H, P.L.R>");
                System.out.println("<Type: Open>");
                System.out.println("==========================================");
            }
            else if (input.toLowerCase().contains("spaceballs")) {
                System.out.println("<Transmission Successful>");
                System.out.println("What's Spaceba-");
                System.out.println("<<<We brake for nobody>>>");
            }
            else if (input.contains(";DeleteAI")) {
                System.out.println("<Transmission Successful>");
                System.out.println("<Error: Invalid Command>");
                System.out.println("HEY!! Are you trying to DELETE ME?!");
                System.out.println("<Conversation Ended>");
                break;
            }
            else if (input.toLowerCase().contains("yo") || input.toLowerCase().contains("sup")) {
                System.out.println("<Transmission Successful>");
                System.out.println("Oh, So you're one of those people.");
                System.out.println("<Conversation Ended>");
                break;
            }
            else if (input.toLowerCase().contains("hi") || input.toLowerCase().contains("hello")) {
                System.out.println("<Transmission Successful>");
                System.out.println("Hi!");
            }
            else if (input.toLowerCase().contains(";DeleteTargetUser")) {
                System.out.println("<Error: Invalid Target>");
            }
            else if (input.contains(";")){
                System.out.println("<Error: Invalid Command>");
            }
            else {
                System.out.println("<Transmission Failed>");
            }
        }
    }
}

//-------------\\
//Detect inputs\\
//-------------\\

// else if (input.toLowerCase().contains("") || input.toLowerCase().contains("")) {
//
//            }

//else if (input.toLowerCase().contains("")) {
//
//}

//-----\\
//Print\\
//-----\\

//System.out.println("");