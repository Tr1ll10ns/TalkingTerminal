package org.talkingterminal;

import org.talkingterminal.actions.CommandAction;
import org.talkingterminal.actions.CreateUserAction;
import org.talkingterminal.actions.DeleteUserAction;
import org.talkingterminal.actions.HelpAction;
import org.talkingterminal.actions.ExitAction;

import java.io.Console;
import java.util.Arrays;
import java.util.List;

/**
 * A talking terminal to manage users and handle little bobby tables
 *
 * TODO: Create a user storage
 * TODO: Add list users
 * TODO: Add list chats
 * TODO: Add Help command
 * ;CreateUser[;DeleteAllUsers] might delete the users
 */
public class TalkingTerminal {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("P.L.R", "Admin", "Unprotected"),
                new User( "", "","")
        );

        CommandAction deleteUser = new DeleteUserAction();
        CommandAction createUser = new CreateUserAction();
        CommandAction help = new HelpAction();
        CommandAction exit = new ExitAction();

        List<Command> commands = Arrays.asList(
                new Command("DeleteUser", deleteUser),
                new Command("CreateUser", createUser),
                new Command("Help", help),
                new Command("Exit", exit)
        );

        System.out.println("<Talk>");
        Console console = System.console();
        if (console == null) {
            System.out.println("The console is null");
            System.exit(-1);
        }
        String input = console.readLine();
        //String input = ";DeleteUser[Bob];CreateUser[Joe,Admin,Protected]";
        //String input = ";Help;Exit";

        while (true) {
            for (Command command : commands) {
                input = command.parse(input);
            }
            if (!"".equals(input)) {
                System.out.println(input + " is not a valid command.");
                System.out.println("Check your spelling.");
                System.out.println("<Talk>");
            }
            else {
                System.out.println("<Talk>");
            }
            //input = console.readLine();
        }

    }
}
