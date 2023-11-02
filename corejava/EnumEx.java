package corejava;

public class EnumEx {
	public enum enumEx {
		Winter(0),Summer(1);
		
		private int index;

		private enumEx(int index) {
			this.index = index;
		}
		
		
	}
   public static void main(String[] args) {
		System.out.println(enumEx.Summer.index);
	}
		
	}
	
	
	
	
	

