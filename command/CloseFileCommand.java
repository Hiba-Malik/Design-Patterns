
package commandpattern;

public class CloseFileCommand implements Command{
	FileSystemReciever reciever;
	

	public CloseFileCommand(FileSystemReciever reciever) {
		this.reciever = reciever;
	}

	@Override
	public void execute() {
		reciever.closeFile();
		
	}

	@Override
	public void undo() {
		reciever.openFile();
		
	}
	

}