public class Operacion{

	float divide(int x, int y){
		float res = 0;
		try{
		 res = (x/y);
		}catch(ArithmeticException var){
			System.out.println("No se puede ese tipo de divisiones");
		}
		return res;
	}

	float restar(int x, int y){
		if(x==0 && y==0){
			throw new ArithmeticException("No se puede hacer la resta con estos operadores");
		}
		return x-y;
	}

}