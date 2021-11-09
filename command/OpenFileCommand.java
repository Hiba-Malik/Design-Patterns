
package commandpattern;

public class OpenFileCommand implements Command{
	FileSystemReciever reciever;
	

	public OpenFileCommand(FileSystemReciever reciever) {
		this.reciever = reciever;
	}

	@Override
	public void execute() {
		reciever.openFile();
	}

	@Override
	public void undo() {
		reciever.closeFile();
	}

}