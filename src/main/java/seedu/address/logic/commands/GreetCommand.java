package seedu.address.logic.commands;

import seedu.address.logic.CommandHistory;
import seedu.address.model.Model;

/**
 * Greets the user for a wholesome experience.
 */
public class GreetCommand extends Command {

    public static final String COMMAND_WORD = "greet";

    public static final String MESSAGE_SUCCESS = "Hello there, beautiful human! Hope you have a good experience "
            + "with our product and a even better day ahead! Come again :)";

    @Override
    public CommandResult execute(Model model, CommandHistory history) {
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
