package override;

class Rbi {
	public float getRateofInt() {
		return 1.0f;
	}
}

class ICICI extends Rbi{
	 @Override
	 public float getRateofInt() {
		 return 1.3f;
	 }
	 public ICICI getObj() {
		 return this;
	 }
 }
 
class Yes extends Rbi{
	 @Override
	 public float getRateofInt() {
		 return 1.6f;
	 }
	 public Yes getObj() {
		 return this;
	 }
 }
 
public class Main1 {
	    public static void main(String[] args) {
	        Rbi r = new Rbi();
	        ICICI i = new ICICI();
	        Yes y = new Yes();

	        System.out.println("RBI: " + r.getRateofInt());
	        System.out.println("ICICI: " + i.getRateofInt());
	        System.out.println("Yes: " + y.getRateofInt());
	    }
	}



