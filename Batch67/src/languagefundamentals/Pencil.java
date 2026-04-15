package languagefundamentals;

public class Pencil {
	  int totalamount = 97;
	   int pencilcost = 7;

	   int totalpencils = totalamount/pencilcost;
	   int expences = totalpencils*pencilcost;
       int remaining = totalamount-expences;
      
  	public static void main(String[] args) {
  		Pencil d = new Pencil ();
      
  		 System.out.println("TOTALAMOUNT:"+d.totalamount);
  		 System.out.println("PENCILCOST:"+d.pencilcost);
  		 System.out.println("TOTALPENCILS:"+d.totalpencils);
  		 System.out.println("EXPENCES:"+d.expences);
  		System.out.println("REMAINING:"+d.remaining);
  		 
  		 
  		 
	}

}
