package org.talkingterminal;

import org.talkingterminal.actions.CommandAction;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * The Command class parses a command from the user
 * A command looks like this:
 *
 * ;DeleteUser[USERNAMEHERE]
 * ;CreateUser[NAME,TYPE,STATUS]
 */
public class Command {
    private String name;
    private CommandAction action;
    private String[] args;

    public Command (String name, CommandAction action) {
        this.name = name;
        this.action = action;
    }

    /**
     * The parse function takes a string as input, parses out this command and arguments and then returns the remaining
     * input, i.e.
     *
     * input = ";DeleteUser[Bob];CreateUser[Joe,Admin,Protected]
     *
     * if this Command's name is DeleteUser, this will set args = ["Bob"] and return
     * ;CreateUser[Joe,Admin,Protected]
     *
     *
     * @param input
     * @return
     */
    public String parse(String input) {
        String parsedInput = input;

        // does input have ;DeleteUser in it?
        if (input.contains(";" + this.name)) {
            // figure out arguments from input string
            Pattern commandPattern = Pattern.compile(";" +  this.name + "\\[(.*?)\\]");
            Matcher commandMatcher = commandPattern.matcher(input);

            // Check to see if our input has a ;Command[arg1, arg2] type command
            if (commandMatcher.find()) {
                // This matches something like Joe,Admin,Protected
                String argStr = commandMatcher.group(1);

                // this matches something like ;CreateUser[Joe,Admin,Protected]
                String fullCommand = commandMatcher.group(0);
                parsedInput = input.replace(fullCommand, "");

                // this creates an array like ["Joe", "Admin", "Protected"]
                this.args = argStr.split(",");

                this.action.doAction(this);
            } else if (input.contains(";" +  this.name)) {
                // This will execute if our input has just the ";Command" style command with no arguments
                parsedInput = input.replace(";" + this.name, "");
                this.action.doAction(this);
            }
            else {
                // TODO: Print some error, return failure
            }
        }

        return parsedInput;
    }
    public String getName() {
        return name;
    }

    public String[] getArgs() {
        return args;
    }
}
