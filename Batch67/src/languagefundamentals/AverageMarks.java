package languagefundamentals;

public class AverageMarks {
      int tel;
      int hin;
      int math;
      int eng;
      int soc;
       int totalsub;	 
      

      void marks() {
    	  
       int  averagemarks = (tel+hin+math+eng+soc)/totalsub;
 	  System.out.println("total:"+averagemarks);        
      }

     

	public static void main(String[] args) {
		AverageMarks s = new AverageMarks();
		s.tel = 70;
		s.hin = 80;
		s.math= 90;
		s.eng = 85;
		s.soc = 89;
		s.totalsub=5;
		s.marks();
	

	}

}
