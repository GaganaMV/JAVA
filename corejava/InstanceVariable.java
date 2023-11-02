package corejava;

public class InstanceVariable {
	int scienceMarks;
	int mathsMarks;
	int gkMarks;
	
	
	
	public static void main(String[] args) {
		InstanceVariable instance =new InstanceVariable();
		instance.scienceMarks =80;
		instance.mathsMarks=89;
		instance.gkMarks=76;
		InstanceVariable i2= new InstanceVariable();
		i2.scienceMarks=88;
		i2.mathsMarks=78;
		i2.gkMarks=99;
		
		System.out.println("ScienceMarks :"+instance.scienceMarks);
		System.out.println("MathsMarks :"+instance.mathsMarks);
		System.out.println("GkMarks :" +instance.gkMarks);
		System.out.println(i2.scienceMarks);
		System.out.println(i2.mathsMarks);
		System.out.println(i2.gkMarks);
		
		InstanceVariable i1=new InstanceVariable();
		i1.scienceMarks=76;
		i1.mathsMarks=88;
		i1.gkMarks=77;
		System.out.println("ScienceMarks :"+i2.scienceMarks);
		System.out.println("MathsMarks :"+i2.mathsMarks);
		System.out.println("GKMarks :"+i1.gkMarks);
		i1.test();
		
		
	}
	
	public void test() {
		
		System.out.println("Hello");
		
		}

}
