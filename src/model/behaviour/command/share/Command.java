package model.behaviour.command.share;
/**
 * 命令接口
 */
public interface Command {
    /**
     * 执行命令
     */
    public void execute();
    /**
     * 撤销命令
     */
    public void undo();
}