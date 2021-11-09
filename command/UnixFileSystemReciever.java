

package commandpattern;

public class UnixFileSystemReciever implements FileSystemReciever{

	@Override
	public void openFile() {
		System.out.println("File is opened by Unix OS");
		
	}

	@Override
	public void closeFile() {
		System.out.println("File is closed by Unix OS");
		
	}

	@Override
	public void writeFile() {
		System.out.println("File is written by Unix OS");
		
	}

}