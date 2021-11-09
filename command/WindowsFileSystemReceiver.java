

package commandpattern;
public class WindowsFileSystemReciever implements FileSystemReciever{

	@Override
	public void openFile() {
		System.out.println("File is opened by Windows OS");
		
	}

	@Override
	public void closeFile() {
		System.out.println("File is closed by Windows OS");
		
	}

	@Override
	public void writeFile() {
		System.out.println("File is written by Windows OS");
		
	}

}