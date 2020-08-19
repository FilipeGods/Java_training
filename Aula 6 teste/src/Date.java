
public class Date {
	private int day;
	private int mounth;
	private String mounthString;
	private int year;
	
	public Date(int m,int d,int y) {
		
		mounth=checkMounth(m);
		
		day=checkDay(d);
		
		year=y;
	}
	
	public Date(String m, int d,int y) {
		mounth=mounthStringToInt(m);
		
		mounthString=m;
		
		day=checkDay(d);
		
		year=y;
	}
	
	public Date(int d,int y) {
		mounth=0;
		
		day=checkDayFull(d);
		
		year=year;
		
		
	}





 	public int checkMounth(int m) {
 		m=((m>=1 && m<=12) ? m : 1);
 		if(m==1)
 			System.out.println("Valor para mes invalido, novo valor: 1");
 		return m;
    }
 
 	
 	public int checkDay(int d) {
 		int[] m = {0,31,28,31,30,31,30,31,31,30,31,30,31};
 		
 		d=((d>=1 && d<=m[mounth]) ? d : 1);
 		if(d==1)
 			System.out.println("Valor para dia invalido, novo valor: 1");
 		return d;
 	}
 	
 	public int mounthStringToInt(String m) {
 		String[] mounths = new String[20];
 		mounths[1]="January"; mounths[2]="Febuary"; mounths[2]="March";
 		mounths[4]="April"; mounths[5]="May"; mounths[6]="June"; mounths[7]="July";
 		mounths[8]="August"; mounths[9]="September"; mounths[10]="October"; 
 		mounths[11]="November"; mounths[12]="December";
 		int aux=0;
 		for(int i=1;i<=12;i++) {
 			if(m.equals(mounths[i])) 
 				aux=i;
 			if(i==13) { 
 				System.out.println("Valor para mes invalido, novo valor: 1");
 				aux=1;
 			}	
 		}
 		
 		return aux;
 	}
 		public String mounthIntToString(int m) {
 	 		String[] mounths = new String[20];
 	 		mounths[1]="January"; mounths[2]="Febuary"; mounths[2]="March";
 	 		mounths[4]="April"; mounths[5]="may"; mounths[6]="June"; mounths[7]="July";
 	 		mounths[8]="August"; mounths[9]="September"; mounths[10]="October"; 
 	 		mounths[11]="November"; mounths[12]="December";
 	 		
 	 		for(int i=1;i<=12;i++) {
 	 			if(m==i) 
 	 				return mounths[i];
 	 			if(i==13) { 
 	 				System.out.println("Valor para mes invalido, novo valor: 1");
 	 				return mounths[1];
 	 			}	
 	 		}
			return null;
 	 		
 	 		
 	}
 	
 	public int checkDayFull(int d) {
 		int aux = ((d>=0 && d<=365) ? d : 1 );
 		if(aux==1)
 			System.out.println("Valor para dia invalido, novo valor: 1");
 		return aux;
 	}
 	
 	public int mounthIntToDay(int m,int d) {
 		int aux=0;
 		switch(m){
 			case 1: aux=d; break;
 			case 2: aux=31+d; break;
 			case 3: aux=59+d; break;
 			case 4: aux=90+d; break;
 			case 5: aux=120+d; break;
 			case 6: aux=151+d; break;
 			case 7: aux=181+d; break;
 			case 8: aux=212+d; break;
 			case 9: aux=243+d; break;
 			case 10: aux=273+d; break;
 			case 11: aux=304+d; break;
 			case 12: aux=335+d; break;
 			default: System.out.println("Valor para mes invalido, novo valor: 1");
 					 aux=d;
 		}
 		return aux;
 	}
 	
 	public int mounthStringToDay(String m,int d) {
 		int aux=0;
 		switch(m){
 			case "January": aux=d; break;
 			case "Febuary": aux=31+d; break;
 			case "March": aux=59+d; break;
 			case "April": aux=90+d; break;
 			case "May": aux=120+d; break;
 			case "June": aux=151+d; break;
 			case "July": aux=181+d; break;
 			case "August": aux=212+d; break;
 			case "September": aux=243+d; break;
 			case "October": aux=273+d; break;
 			case "November": aux=304+d; break;
 			case "December": aux=335+d; break;
 			default: System.out.println("Valor para mes invalido, novo valor: 1");
 					 aux=d;
 		}
 		return aux;
 	}
 	
 	public void getDates() {
 		String aux = mounthIntToString(mounth);
 		int aux1 = mounthIntToDay(mounth,day); 
 		
 		
 		System.out.printf("%d/%d/%d\n", mounth, day, year);
 		System.out.printf("%s %d, %d\n", aux, day, year);
 		System.out.printf("%d %d\n", aux1, year); 
 	}
 	
 	
 	
 	
 }