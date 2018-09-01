package org.talkingterminal.actions;

import org.talkingterminal.Command;

public class DeleteUserAction extends CommandAction {
    @Override
    public void doAction(Command command) {
        System.out.println("Successfully Executed " + command.getName());
        System.out.println(":)");
    }
}
