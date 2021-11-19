package lista;

import java.util.*;
import javax.swing.*;

public class main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		JOptionPane.showMessageDialog(null,"          BEM VINDO(A) ! \n \n - JAVINHA MARKET LIST - \n \n                   :)");
		
		String nome;
		nome = JOptionPane.showInputDialog("Quem irá fazer as compras hoje ?");

		String frutas;
		System.out.println("Olá "+nome+" Quais Frutas você irá comprar hoje ?");
		frutas = input.nextLine();
		
		String verduras;
		System.out.println("Anote aqui as verduras: ");
		verduras = input.nextLine();
		
		String carnes;
		System.out.println("Algum tipo de carne ?");
		carnes = input.nextLine();
		
		String lanches;
		System.out.println("Que tal anotar alguns salgadinhos e lanches ?");
		lanches = input.nextLine();
		
		String lacticinios;
		System.out.println("Gostaria de anotar alguns lacticinios ?");
		lacticinios = input.nextLine();
		
		String bebidas;
		System.out.println("Alguma bebidas ?");
		bebidas = input.nextLine();
		
		String higienePessoal;
		System.out.println("Não se esqueça de anotar itens para higiene pessoal: ");
		higienePessoal = input.nextLine();
		
		String limpeza;
		System.out.println("Algum item para limpeza ?");
		limpeza = input.nextLine();
		
		
		
		String cont = frutas+" "+verduras+" "+carnes+" "+lanches+" "+lacticinios+" "+bebidas+" "+higienePessoal+" "+limpeza;
		String [] contagem = cont.split("\\s+");
		
		ArrayList <ListaDeCompras> lista1 = new ArrayList();
		
		
		lista1.add(new ListaDeCompras("compras", contagem.length, frutas, verduras, carnes, lanches, lacticinios, bebidas, higienePessoal, limpeza));
		
		Thread.sleep(1000);
		System.out.printf("GERANDO LISTA , AGUARDE");
		Thread.sleep(1000);
		System.out.printf(".");
		Thread.sleep(1000);
		System.out.printf(".");
		Thread.sleep(1000);
		System.out.printf(".");
		Thread.sleep(1000);
		System.out.println("\n");
		
		
		
		for (ListaDeCompras al : lista1) {
			
			System.out.println(al);
			
			System.out.println(nome+" Voce anotou " + contagem.length+" itens diferentes :)");
			
			System.out.println("*      ! BOAS COMPRAS !     *" );

			
		}
		
		
	}

}
