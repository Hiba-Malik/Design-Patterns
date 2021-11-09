
package commandpattern;

public class FileInvoker {
	// implement stack
	Command cmd;
        boolean isExecuted;
	public FileInvoker(Command cmd) {
		this.cmd = cmd;
	}
	void execute(){
		cmd.execute();
                isExecuted=true;
	}
	void undo(){
		cmd.undo();
                isExecuted=false;
	}
	
}