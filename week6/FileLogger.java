public class FileLogger implements Logger{

	private static FileLogger logger;

	private FileLogger(){
	}

	public static FileLogger getLogger() {
	if(logger == null){
		logger = new FileLogger();
	}
		return logger;
	}

	public synchronized void log(String msg) {
		FileUtil futil = new FileUtil();
		futil.writeToFile("log.txt", msg, true, true);
	}

}
