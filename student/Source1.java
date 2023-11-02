package student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Insect{
	private String insectName;
	private int insectWeight;
	public String getInsectName() {
		return insectName;
	}
	public void setInsectName(String insectName) {
		this.insectName = insectName;
	}
	public int getInsectWeight() {
		return insectWeight;
	}
	public void setInsectWeight(int insectWeight) {
		this.insectWeight = insectWeight;
	}
	public Insect(String insectName, int insectWeight) {
		super();
		this.insectName = insectName;
		this.insectWeight = insectWeight;
	}
	@Override
	public String toString() {
		return "Insect [insectName=" + insectName + ", insectWeight=" + insectWeight + "]";
	}
	
	
}

class Insecticides{
	public List<String> mapInsectstName(List<Insect> list){
		List<String> output =new ArrayList<String>();
		for (Insect insect : list) {
			String insectName = insect.getInsectName();
			output.add(insectName);
		}
		return output;
	}
	
	public List<Insect> getWeight(List<Insect> list){
		List<Insect> insect=new ArrayList<Insect>();
		Iterator<Insect> itr = list.iterator();
		for (Insect in : list) {
			if(in.getInsectWeight()>40) {
				in.getInsectName();
				in.getInsectWeight();
				insect.add(in);
			}
			
		}
		return insect;
	}
}

public class Source1 {

	public static void main(String[] args) {
		Insecticides i=new Insecticides();
		List<Insect> list=new ArrayList<Insect>();
		list.add(new Insect("Ant", 45));
		list.add(new Insect("Cockroach", 65));
		list.add(new Insect("bee", 99));
		list.add(new Insect("paper wasp", 11));
		System.out.println(i.mapInsectstName(list));
		System.out.println("-------------------------------------------------------");
		System.out.println(i.getWeight(list));
		

	}

}
