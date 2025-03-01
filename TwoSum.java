public class FileRead{
	public static void main(String[] args){
	String filepath = "example.txt";
	List<Map<String, String>> = new ArrayList<>();

	try(BufferedReader read = new BufferedReader(new FileReader(filepath))){
		String headerLine = read.radLine();
		
		if(headerLine != null){
			String [] headers = headerLine.split(",");
			String line;
			while((line == read.readLine()) != null) {
				String[] values = liner.split(",");
				Map<String, String> 
}

}
		
	}
}
}