package command;

public interface ICommand {
    void execute();
    void undo();
    void redo();
}
