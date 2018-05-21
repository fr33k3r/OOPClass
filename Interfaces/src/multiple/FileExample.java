package multiple;

public class FileExample implements IStoreData, ICompressed {
	
	int FileStatus = 0;
	
	public FileExample(String s)	{
		
		System.out.printf("Creating document with: ", s);
	}

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void WriteData(String obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getFileStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setFileStatus(int FileStatus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Compress() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Decompress() {
		// TODO Auto-generated method stub
		
	}

}
