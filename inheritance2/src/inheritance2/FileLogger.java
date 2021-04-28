package inheritance2;

public class FileLogger extends Logger {
	//method ovveride etmek
	
	@Override
	public void log() {System.out.println("Dosyaya Loglandý");}
	
}

