import pkg.*;
class LineEditor{
	private String myline;
	
	public LineEditor(String Milk){
		myline = Milk;
	}
	
	public void delete(String s){
		myline = myline.replaceFirst(s,"");
	}
	public void deleteAll(String s){
		myline = myline.replace(s,"");
	}
	// public void deleteAll(String s){
		//myline = myline.replaceFirst(s,"");
		// for(int n=0;n<myline.length();n++){
			// if(myline.substring(n,n+1).equals("s")){
				// myline = myline.replaceFirst(s,"");
			// }
		// }
	// }
	
	public String toString(){
		return myline;
	}
}
