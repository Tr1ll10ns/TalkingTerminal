package org.talkingterminal.actions;

import org.apache.commons.io.IOUtils;
import org.talkingterminal.Command;

public class HelpAction extends CommandAction {
    @Override
    public void doAction(Command command) {
        try {
            String helpTRext = IOUtils.toString(this.getClass().getResourceAsStream("/help.txt"),
                    "UTF-8");

            //System.out.println("HALP MEH!");
            System.out.println(helpTRext);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
