package detector;
import java.util.Vector;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s1 = {"Trav"};
		String[] s2 = {"Fraud","Trav"};
		String[] s3 = {"FP","Trav","Fraud"};
		String[] s4 = {"OC"};
		String[] s5 = {"OC","CRP"};
		String[] s6 = {"IP","OC","Fraud"};
		
		Factor f1 = new Factor(1,s1);
		Factor f2 = new Factor(2,s2);
		Factor f3 = new Factor(3,s3);
		Factor f4 = new Factor(1,s4);
		Factor f5 = new Factor(2,s5);
		Factor f6 = new Factor(3,s6);
		
		double[] d1 = {0.05,0.95};
		double[] d2 = {0.01,0.004,0.99,0.996};
		double[] d3 = {0.9,0.9,0.1,0.01,0.1,0.1,0.9,0.99};
		double[] d4 = {0.7,0.3};
		double[] d5 = {0.1,0.9,0.001,0.999};
		double[] d6 = {0.02,0.01,0.011,0.001,0.98,0.99,0.989,0.999};
				
		f1.set(d1);
		f2.set(d2);
		f3.set(d3);
		f4.set(d4);
		f5.set(d5);
		f6.set(d6);

		Tools tools = new Tools();
		Vector<Factor> flst = new Vector<Factor>();
		flst.add(f1);
		flst.add(f2);
		flst.add(f3);
		flst.add(f4);
		flst.add(f5);
		flst.add(f6);
		String[] olst = {"OC"};
		String[] elst = {"FP","IP","Trav","CRP"};
		int[] vlst = {0,1,0,0};
		Factor f7 = tools.inference(flst, "Fraud", olst, elst, vlst);
		f7.print();
	}
}
