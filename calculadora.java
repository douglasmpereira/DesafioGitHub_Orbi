package aula1;



public class calculadora {
	
	public static double  a, b	;
	public static boolean  validar=true;
	
public static void main(String[] args) {

	do {
		do {
			informeNumeros();
			escolhaOpcao(menu());
		} while (validar);
	} while (continuarMenu());
}
	
public static void escolhaOpcao (int presposta) {	
	
	double result;
		
	switch (presposta) {

	case 1:
		result = a + b;
		System.out.print("O resultado da soma �: " + a + " + " + b + " = " + result + ".");
		validar = false;
		break;
	case 2:
		result = a - b;
		System.out.print("O resultado da subtra��o �: " + a + " - " + b + " = " + result + ".");
		validar = false;
		break;
	case 3:
		result = a * b;
		System.out.print("O resultado da multiplicade �: " + a + " X " + b + " = " + result + ".");
		break;
	case 4:
		if (b == 0) {
			System.out.println("Op��o invalida. N�o � possivel divis�o por 0.\nTente novamente  com outro numero.");
			validar = true;
			break;
		} else {
			result = a / b;
			System.out.print("O resultado da divis�o �: " + a + " / " + b + " = " + result + ".");
			validar = false;
			break;
		}
	case 5:
		result = a % b;
		System.out.print("O resto da divis�o de " + a + " por " + b + " � " + result + ".");
		validar = false;
		break;
	default:
		System.out.print("\nDado invalido!");
		validar = false;
		break;
	}
}
public static void informeNumeros() {

	System.out.print("\n\nInsira o primeiro numero: ");
	a = Console.readInt();
	System.out.print("\nInsira o segundo numero: ");
	b = Console.readInt();

	}

public static int menu() {
	
	
	int resposta;
	
	System.out.print("Escolha uma op��o de c�lculo: \n");
	
	System.out.print("Op��es\n\n");
	System.out.print("   1- Soma\n");
	System.out.print("   2- Subtra��o\n");
	System.out.print("   3- Multiplica��o\n");
	System.out.print("   4- Divis�o\n");
	System.out.print("   5- Resto da divis�o\n");
	
	
	resposta = Console.readInt();
	
	return resposta;	
}
public static boolean continuarMenu () {
	int resposta;
	 boolean continua=true;
	System.out.println("\nDeseja continua? 1-Sim e 2-N�o");
	resposta = Console.readInt();
	if(resposta==2) {
		System.out.println("\nObrigado por utilizar nossa calculadora");
		continua=false;
		return continua;
	}
	return continua;
	}	
}






	
	


