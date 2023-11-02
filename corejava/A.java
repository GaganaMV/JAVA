package corejava;

public class A {

	public static void main(String[] args) {
		System.out.println(convertToStr("<div>\r\n"
				+ "        <b>John&nbsp; Johnz</b><br><i>Area&nbsp;51,&nbsp;Arizona&nbsp;&nbsp;U.S.A</i>\r\n"
				+ "    </div>"));
		
	}
	public static String convertToStr (String htmlStr) {
		 htmlStr=htmlStr.replace("&nbsp;", " ");
		 htmlStr=htmlStr.replace("<br>","\n");
		 htmlStr=htmlStr.replaceAll("<.*?>", "");
		 return htmlStr;
		 
		 
	}
}
