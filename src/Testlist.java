
import java.util.ArrayList;
	import java.util.Collections;
public class Testlist {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			ArrayList <String> list1 = new ArrayList <>();
			
			list1.add("Kullanard");
			list1.add("Sittichoe");		
			list1.add("Pattamaporn");
			
			for (String list:list1){
				System.out.println(list);
			
			}
			Collections.sort(list1);
			for (String list:list1){
				System.out.println(list);
			}
		}	
		
		}

