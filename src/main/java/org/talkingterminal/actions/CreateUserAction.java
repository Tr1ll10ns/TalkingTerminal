package org.talkingterminal.actions;

import org.talkingterminal.Command;

public class CreateUserAction extends CommandAction {
    @Override
    public void doAction(Command command) {
        System.out.println("Successfully Created " + String.join(", ", command.getArgs()));
        System.out.println(":)");
    }
}
