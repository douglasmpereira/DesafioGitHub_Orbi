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
		System.out.print("O resultado da soma é: " + a + " + " + b + " = " + result + ".");
		validar = false;
		break;
	case 2:
		result = a - b;
		System.out.print("O resultado da subtração é: " + a + " - " + b + " = " + result + ".");
		validar = false;
		break;
	case 3:
		result = a * b;
		System.out.print("O resultado da multiplicade é: " + a + " X " + b + " = " + result + ".");
		break;
	case 4:
		if (b == 0) {
			System.out.println("Opção invalida. Não é possivel divisão por 0.\nTente novamente  com outro numero.");
			validar = true;
			break;
		} else {
			result = a / b;
			System.out.print("O resultado da divisão é: " + a + " / " + b + " = " + result + ".");
			validar = false;
			break;
		}
	case 5:
		result = a % b;
		System.out.print("O resto da divisão de " + a + " por " + b + " é " + result + ".");
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
	
	System.out.print("Escolha uma opção de cálculo: \n");
	
	System.out.print("Opções\n\n");
	System.out.print("   1- Soma\n");
	System.out.print("   2- Subtração\n");
	System.out.print("   3- Multiplicação\n");
	System.out.print("   4- Divisão\n");
	System.out.print("   5- Resto da divisão\n");
	
	
	resposta = Console.readInt();
	
	return resposta;	
}
public static boolean continuarMenu () {
	int resposta;
	 boolean continua=true;
	System.out.println("\nDeseja continua? 1-Sim e 2-Não");
	resposta = Console.readInt();
	if(resposta==2) {
		System.out.println("\nObrigado por utilizar nossa calculadora");
		continua=false;
		return continua;
	}
	return continua;
	}	
}






	
	


