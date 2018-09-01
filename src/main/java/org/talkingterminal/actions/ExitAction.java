package org.talkingterminal.actions;

import org.talkingterminal.Command;

public class ExitAction extends CommandAction {
    @Override
    public void doAction(Command command) {
        System.out.println("<Conversation Ended>");
        System.exit(0);
    }
}
