package sergio;

public class capicua{

	public static void main(String[]args)throws Exception{
			for(int cont=1;cont<=10000;cont++){
				if(cont==inverso(cont)){
					System.out.println(cont+" es capicua");
				}else{
					System.out.println(cont+" no es capicua");
				}	
			}
	}
	
	public static int inverso(int num){
		int resto=0,acum=0;
				acum=0;
				while(num>0){       
						resto=num%10;
						acum=acum*10+resto;
						num=num/10;
					
				}
				return acum;
	}
	
	
	
}
