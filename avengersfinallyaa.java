import java.util.Random;
import java.util.Scanner;

public class avengers {


	public static void limpartela(){
		for (int i = 0; i < 100; ++i)  
		   System.out.println();  
		}


	static void dificuldade() {
	   limpartela();
	   System.out.println("               OLÁ SEJA BEM-VINDO HERÓI                   ");
       System.out.println("       SELECIONE UMA OPÇÃO ABAIXO PARA INCIAR O JOGO      ");
       System.out.println(" ________________________________________________________ ");
       System.out.println("                                                       ");
       System.out.println("                  (1) Capitão America                   ");
       System.out.println("                  (2) Thor                              ");
       System.out.println("                  (3) Homen de Ferro                    ");
       System.out.println("                                                	 ");
       System.out.println("                                                        ");
       System.out.println("                                                        ");
       System.out.println("                Aguardando Escolha...                 ");
       System.out.println("                                                      ");
       System.out.println("________________________________________________________");
       System.out.print(">  ");            
		
	}

	static void menu() {
		limpartela();		
		System.out.println(" ________________________________________________________ ");
		System.out.println("                                                        ");
		System.out.println("                  (1) Instruções                  		"); 
		System.out.println("                  (2) Jogar                             ");
		System.out.println("                  (3) Créditos                         ");
		System.out.println("                  (4) Sair                              ");
		System.out.println("                                                        ");
		System.out.println("                                                        ");
		System.out.println("                 Aguardando comando...                 ");
		System.out.println("                                                       ");
		System.out.println("________________________________________________________");
		System.out.print(">  ");            
	}

	static void embaralhar(String Vetor[]) { // FUNÇÃO QUE EMBARALHA AS ALTERNATIVAS CONTIDAS NO VETOR

		Random random = new Random();

		for (int i = 0; i < Vetor.length; i++) {
			int indice2 = random.nextInt(Vetor.length);
			String posicao = Vetor[i];
			Vetor[i] = Vetor[indice2];
			Vetor[indice2] = posicao;
		}

	}

	public static void main(String[] args) {
		/*
		 * CÓDIGO PRINCIPAL!
		 * 
		 * pontoG == PONTOS GANHOS pontoP == PONTOS PERDIDOS TESTANDO, DEPOIS MUDAR
		 * 
		 */
		Scanner imput = new Scanner(System.in);
		Scanner imput2 = new Scanner(System.in);

		// DECLARAÇÃO DE VARIAVÉIS
		int ponto = 100, total = 0, pontoG = 100, pontoP = 50, opcao, navegacao = 1;
		String usuario = "";

		do {
			menu();
			opcao = imput.nextInt();

			switch (opcao) {
				
			case 1:
				do {

					limpartela();
		System.out.println(" __________________________________INSTRUÇÕES______________________________");
		System.out.println("                                                       					  ");
		System.out.println("           > O jogador começa com 100 pontos iniciais 					  "); 
		System.out.println("          > Cada questão vale 100 pontos do heroi      				      ");
		System.out.println("           > Caso erre uma pergunta você sofre penalidade em 50 pontos     ");
		System.out.println("           > Caso acerte uma pergunta você ganha 100 pontos do heroi       ");
		System.out.println("           > Você tera 3 tentativas para cada questão                      ");
		System.out.println("                                                                           ");
		System.out.println("                              Aguardando comando...                        ");
		System.out.println(" 							  Digite 0 para voltar	                      ");
		System.out.println("___________________________________________________________________________");
		System.out.print(">  ");         					
					navegacao = imput.nextInt();

				} while (navegacao != 0);

				break;

			case 2:
				// INICIO DO JOGO
				do {
					limpartela();
					System.out.println(" ___________________________________________________INICIO__________________________________________________________ ");
					System.out.println("                                                       																");
					System.out.println("Bem vindo recruta! Me chamo Nick Fury (Diretor da S.H.I.E.L.D)														");
					System.out.println("Queremos dar ínicio a iniciativa vingadores, essa equipe de super herois vai mudar o   								");
					System.out.println("futuro, e o mundo que conhecemos!								   										   			");
					System.out.println("Caso acerte uma pergunta você ganha 100 pontos do heroi      														");
					System.out.println("           						                      																");
					System.out.println("-> Você tem algumas observações para o jogo                                           	           					");
					System.out.println("Se não assitiu os filmes da Marvel, você não está vivo! KKKK brincadeira                   							");
					System.out.println("Falando sério agora! Assista os filmes do super heroi que vai escolher				        						");
					System.out.println("Mostre que você é bom o sufuciente para fazer parte da iniciativa vingadores e se torne um dos heróis				");
					System.out.println("que irá mudar o mundo!																								");
					System.out.println("-> Objetivo do jogo																									");
					System.out.println("O seu objetivo é ajudar o herói escolhido a ser recrutado para os vingadores,										");
					System.out.println("mostre a todos que você é um nerd de respeito! kkkk novamente, brincadeira											");
					System.out.println("Enfrente os desafios e vença a missão!																				");
					System.out.println("Ah, e o mais importante, DIVIRTA-SE! 																				");
					System.out.println("																														");
					System.out.println(" 						Digite 0 para voltar e 1 para começar o jogo.												");
					System.out.println("____________________________________________________________________________________________________________________");
			

					navegacao = imput.nextInt();
					if (navegacao == 1) {
						dificuldade();
						opcao = imput.nextInt();

						

						if (opcao == 1) { 
							
							System.out.println("Informe seu nome recruta:");
							usuario = imput2.nextLine();

							boolean acertou = false;
							int contador = 0;
							String alternativa1[] = new String[5];
							alternativa1[0] = "Buck Barnes";
							alternativa1[1] = "Peggy Cater";
							alternativa1[2] = "Abraham Erskine";
							alternativa1[3] = "Howard Stark";
							alternativa1[4] = "Steve Rogers";// RESPOSTA CORRETA
							 
							
							limpartela();	
							System.out.println(" ____________________________________________________________________________");
							System.out.println("        																        "); 
							System.out.println("           												   				    ");
							System.out.println("              															    ");
							System.out.println("                														  		");
							System.out.println("    > (Nick Fury) Esse é o seu primeiro desafio recruta, seja preciso!     	");
							System.out.println("                                                                           	");
							System.out.println("                                                     					    ");
							System.out.println("							                                               		");
							System.out.println("_____________________________________________________________________________");




							do {
								
								System.out.println("Qual dessas pessoas tomaram o soro do super soldado?");
								System.out.println("\n");
								embaralhar(alternativa1);
								System.out.println("a) " + alternativa1[0]);
								System.out.println("b) " + alternativa1[1]);
								System.out.println("c) " + alternativa1[2]);
								System.out.println("d) " + alternativa1[3]);
								System.out.println("e) " + alternativa1[4]);
								System.out.println("\n");
								System.out.print("Qual a alternativa certa?: ");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa1[0] == ("Steve Rogers")) {
										limpartela();
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "b":
								case "B":
									if (alternativa1[1] == ("Steve Rogers")) {
										limpartela();
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "c":
								case "C":
									if (alternativa1[2] == ("Steve Rogers")) {
										limpartela();
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "d":
								case "D":
										limpartela();
									if (alternativa1[3] == ("Steve Rogers")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "e":
								case "E":
									if (alternativa1[4] == ("Steve Rogers")) {
										limpartela();
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								default:
									System.out.println("\n");
									System.out.println("Escolha Invalida.");
									System.out.println("\n");
								}
								contador++;
							} while (!acertou && contador <= 2);
							if (acertou == false) {
								System.out.println("GAME OVER.");
								break;

							}
							System.out.println("Parabéns voce passou do primeiro desafio.");
							System.out.println(">  Digite 1 para continuar.");
							navegacao = imput.nextInt();
							if (navegacao == 1) {

								// QUESTÃO DE NÚMERO 2: FÁCIL
								acertou = false;
								contador = 0;
								String alternativa2[] = new String[5];
								alternativa2[0] = "Peggy Carter";
								alternativa2[1] = "Arnim Zola";
								alternativa2[2] = "Bucky Barnes";
								alternativa2[3] = "Howard Stark"; // RESPOSTA CORRETA
								alternativa2[4] = "Abraham Erskine";								

							


								limpartela();	
								System.out.println(" ____________________________________________________________________________");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println("                														  		");
								System.out.println("    > (Nick Fury) Chegamos ao segundo desáfio recruta, não vá dar bobeira!   ");
								System.out.println("                                                                           	");
								System.out.println("                                                     					    ");
								System.out.println("							                                               		");
								System.out.println("_____________________________________________________________________________");


								do {
									System.out.println("Quem Fez o Escudo do Capitão America ?");
									System.out.println("\n");
									embaralhar(alternativa2);
									System.out.println("a) " + alternativa2[0]);
									System.out.println("b) " + alternativa2[1]);
									System.out.println("c) " + alternativa2[2]);
									System.out.println("d) " + alternativa2[3]);
									System.out.println("e) " + alternativa2[4]);

									System.out.println("\n");
									System.out.print("Qual a alternativa certa?: ");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa2[0] == ("Howard Stark")) {
											limpartela();
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa2[1] == ("Howard Stark")) {
											limpartela();
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											limpartela();
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa2[2] == ("Howard Stark")) {
											limpartela();
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											limpartela();
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa2[3] == ("Howard Stark")) {
											limpartela();
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa2[4] == ("Howard Stark")) {
											limpartela();
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
							}
							System.out.println("Parabéns voce passou do segundo nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO DE NÚMERO 3: FÁCIL
							if (navegacao == 1) {
								acertou = false;
								contador = 0;

								String alternativa3[] = new String[5];
								alternativa3[0] = "Heinz Kruger";
								alternativa3[1] = "Hydra";
								alternativa3[2] = "Víbora";
								alternativa3[3] = "Arnim Zola";
								alternativa3[4] = "Jöhann Schmidt";// RESPOSTA CORRETA							


								limpartela();	
								System.out.println(" ___________________________________________________________________________________________________ ");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println("                														  		");
								System.out.println("    > (Coronel Chester Phillips) Não se ganha a guerra com flores...., se ganha a guerra com coragem     ");
								System.out.println("                                                                           	");
								System.out.println("                                                     					    ");
								System.out.println("							                                               		");
								System.out.println("_____________________________________________________________________________________________________");



								do {
									embaralhar(alternativa3);
									System.out.println("Como é conhecido o Caveira vermelha, um dos principais inimigos do Capitão America?");
									System.out.println("\n");

									System.out.println("a) " + alternativa3[0]);
									System.out.println("b) " + alternativa3[1]);
									System.out.println("c) " + alternativa3[2]);
									System.out.println("d) " + alternativa3[3]);
									System.out.println("e) " + alternativa3[4]);

									System.out.println("\n");
									System.out.print("Qual a alternativa certa?: ");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa3[0] == ("Jöhann Schmidt")) {
											limpartela();
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa3[1] == ("Jöhann Schmidt")) {
											limpartela();
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa3[2] == ("Jöhann Schmidt")) {
											limpartela();
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa3[3] == ("Jöhann Schmidt")) {
											limpartela();
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa3[4] == ("Jöhann Schmidt")) {
											limpartela();
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										limpartela();
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
							}
							System.out.println("Parabéns você passou do terceiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// 4 questao facil
							if (navegacao == 1) {
								acertou = false;
								contador = 0;

								String alternativa4[] = new String[5];
								alternativa4[0] = "Acidente de Avião";
								alternativa4[1] = "Morto pelos Nazistas";
								alternativa4[2] = "Arremessado de um trem"; // resposta correta
								alternativa4[3] = "Pelo Caveira Vermelha";
								alternativa4[4] = "Explosão em Base Militar";



								limpartela();	
								System.out.println(" ____________________________________________________________________________");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println("     (Arnim Zola) Essa Arma vai mudar o rumo da guerra...           			");
								System.out.println("     (Caveira Vermelha) Essa Arma vai mudar o mundo...						");
								System.out.println("                                                                           	");
								System.out.println("                                                     					    ");
								System.out.println("							                                               		");
								System.out.println("_____________________________________________________________________________");


								do {
									embaralhar(alternativa4);
									System.out.println(	"Como Buck Burnes morreu?");
									System.out.println("\n");

									System.out.println("a) " + alternativa4[0]);
									System.out.println("b) " + alternativa4[1]);
									System.out.println("c) " + alternativa4[2]);
									System.out.println("d) " + alternativa4[3]);
									System.out.println("e) " + alternativa4[4]);

									System.out.println("\n");
									System.out.print("Qual a alternativa certa?: ");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa4[0] == ("Caiu de um trem em movimento")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");// testando, para ver se roda certo.
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");// testando, para ver se roda certo.
										}
										break;
									case "b":
									case "B":
										if (alternativa4[1] == ("Caiu de um trem em movimento")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa4[2] == ("Caiu de um trem em movimento")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa4[3] == ("Caiu de um trem em movimento")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa4[4] == ("Caiu de um trem em movimento")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										limpartela();
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
							}
							System.out.println("Parabéns você passou do quarto nível.");
							System.out.println("Digite 1 para continuar.");
							limpartela();
							navegacao = imput.nextInt();

							//05 Questão facil
							if (navegacao == 1) {
								acertou = false;
								contador = 0;

								String alternativa5[] = new String[5];
								alternativa5[0] = "Capturados e torturados pelos Nazistas";
								alternativa5[1] = "Radiação";
								alternativa5[2] = "Camará de Gás";
								alternativa5[3] = "Baleados na em combate";
								alternativa5[4] = "Gás Mostarda e Pneumonia "; // resposta correta


								limpartela();	
								System.out.println(" _____________________________________________________________________________________________________________");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println("                														  		");
								System.out.println("  (Abraham Erskine) Há tantos homens grandes lutando nesta guerra, pode ser que precisamos de um pequeno !   ");
								System.out.println("                                                                           	");
								System.out.println("                                                     					    ");
								System.out.println("							                                               		");
								System.out.println("_____________________________________________________________________________________________________________");



								do {
									embaralhar(alternativa5);
									System.out.println(
											"Como os Pais do Steve Rogers morreram ?");
									System.out.println("\n");
									System.out.println("a) " + alternativa5[0]);
									System.out.println("b) " + alternativa5[1]);
									System.out.println("c) " + alternativa5[2]);
									System.out.println("d) " + alternativa5[3]);
									System.out.println("e) " + alternativa5[4]);

									System.out.println("\n");

									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa5[0] == ("Gás Mostarda e Pneumonia  ")) {
											System.out.println("Resposta Correta! ");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa5[1] == ("Gás Mostarda e Pneumonia ")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa5[2] == ("Nick Fury")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa5[3] == ("Gás Mostarda e Pneumonia ")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa5[4] == ("Gás Mostarda e Pneumonia ")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											limpartela();
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.println("Recruta => " + usuario);
											System.out.println("|" + total + " => pontos|");
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										limpartela();
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
								System.out.println("Parabéns você conseguiu ajudar o Capitão America a entrar no projeto Vingadores");
								System.out.println("Digite 0 para voltar ao menu principal.");
								limpartela();
								navegacao = imput.nextInt();
							}

						}
						// DIFICULDADE: NORMAL

						if (opcao == 2) { // DIFICULDADE: NORMAL

							// QUESTÃO DE NÚMERO 1: NORMAL
							limpartela();	
							System.out.println("Informe seu nome recruta:");
							usuario = imput2.next();

							boolean acertou = false;
							int contador = 0;
							String alternativa1[] = new String[5];
							alternativa1[0] = "Gavião Arqueiro";
							alternativa1[1] = "Capitão America";
							alternativa1[2] = "Visão";
							alternativa1[3] = "Hulk";
							alternativa1[4] = "Homem de Ferro";// RESPOSTA CORRETA
							
							
							


							limpartela();	
								System.out.println(" ____________________________________________________________________________");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println("     (Thor) Ela é muito poderosa, eu não tenho martelo     	       			");
								System.out.println("     (Odin) Você é Thor, Deus dos martelos?...   							");
								System.out.println("                                                                           	");
								System.out.println("                                                     					    ");
								System.out.println("							                                               		");
								System.out.println("_____________________________________________________________________________");



							do {
								System.out.println("Qual foi o primeiro Vingador que Thor enfrentou??");
								System.out.println("\n");
								embaralhar(alternativa1);
								System.out.println("a) " + alternativa1[0]);
								System.out.println("b) " + alternativa1[1]);
								System.out.println("c) " + alternativa1[2]);
								System.out.println("d) " + alternativa1[3]);
								System.out.println("e) " + alternativa1[4]);
								System.out.println("\n");
								System.out.print("Qual a alternativa certa?: ");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa1[0] == ("Homem de Ferro")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "b":
								case "B":
									if (alternativa1[1].equals("Capitão America")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "c":
								case "C":
									if (alternativa1[2].equals("Homem de Ferro")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "d":
								case "D":
									if (alternativa1[3].equals("Homem de Ferro")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								case "e":
								case "E":
									if (alternativa1[4].equals("Homem de Ferro")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
										System.out.println("\r\n");
									}
									break;
								default:
									System.out.println("\n");
									System.out.println("Escolha Invalida.");
									System.out.println("\n");
								}
								contador++;
							} while (!acertou && contador <= 2);
							if (acertou == false) {
								System.out.println("GAME OVER.");
								break;

							}
							System.out.println("Parabéns voce passou do primeiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();
							limpartela();

							if (navegacao == 1) {
								// QUESTÃO DE NÚMERO 2: NORMAL

								acertou = false;
								contador = 0;
								String alternativa2[] = new String[5];
								alternativa2[0] = "Midgard";
								alternativa2[1] = "Vormir";
								alternativa2[2] = "Nidavellir"; // RESPOSTA CORRETA
								alternativa2[3] = "Hell";
								alternativa2[4] = "Jotunheim";
								



								limpartela();	
								System.out.println(" __________________________________________________________________________________");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println("                														  		");
								System.out.println("(Thor) Mesmo quando você tinha dois olhos, você apenas enxergava metade do todo.   ");
								System.out.println("                                                                           	");
								System.out.println("                                                     					    ");
								System.out.println("							                                               		");
								System.out.println("___________________________________________________________________________________");



								do {
									System.out.println("Para obter uma nova Arma, Onde Thor foi?");
									System.out.println("\n");
									embaralhar(alternativa2);
									System.out.println("a) " + alternativa2[0]);
									System.out.println("b) " + alternativa2[1]);
									System.out.println("c) " + alternativa2[2]);
									System.out.println("d) " + alternativa2[3]);
									System.out.println("e) " + alternativa2[4]);

									System.out.println("\n");
									System.out.print("Qual a alternativa certa?: ");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa2[0] == ("Nidavelhir")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa2[1] == ("Nidavelhir")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa2[2] == ("Nidavelhir")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa2[3] == ("Nidavelhir")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa2[4] == ("Nidavelhir")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
							}
							System.out.println("Parabéns voce passou do segundo nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO DE NÚMERO 3: NORMAL

							if (navegacao == 1) {
								acertou = false;
								contador = 0;

								String alternativa3[] = new String[5];
								alternativa3[0] = "Loki";
								alternativa3[1] = "Heimdall";
								alternativa3[2] = "Valquiria"; // RESPOSTA CORRETA
								alternativa3[3] = "Odin";
								alternativa3[4] = "Frigga (Sua Mãe)";
								
								


								limpartela();	
								System.out.println(" ___________________________________________________________________________________________________________________");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println("                														  		");
								System.out.println(" (Thor) A vida é sobre crescimento e mudança. Mas você, meu querido irmão deus da trapaça, só quer ficar na mesma   ");
								System.out.println("                                                                           	");
								System.out.println("                                                     					    ");
								System.out.println("							                                               		");
								System.out.println("____________________________________________________________________________________________________________________");


								do {
									embaralhar(alternativa3);
									System.out.println("Thor passou o trono de Asgard para quem?");
									System.out.println("\n");

									System.out.println("a) " + alternativa3[0]);
									System.out.println("b) " + alternativa3[1]);
									System.out.println("c) " + alternativa3[2]);
									System.out.println("d) " + alternativa3[3]);
									System.out.println("e) " + alternativa3[4]);

									System.out.println("\n");
									System.out.print("Qual a alternativa certa?: ");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa3[0] == ("Valquiria")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG; //
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa3[1] == ("Valquiria")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa3[2] == ("Valquiria")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa3[3] == ("Valquiria")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa3[4] == ("Valquiria")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
							}
							System.out.println("Parabéns você passou do terceiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();
							// QUESTÃO DE NÚMERO 4: NORMAL

							if (navegacao == 1) {

								acertou = false;
								contador = 0;

								String alternativa4[] = new String[5];
								alternativa4[0] = "Loki";
								alternativa4[1] = "Hela"; // RESPOSTA CORRETA
								alternativa4[2] = "Odin";
								alternativa4[3] = "Thanos";
								alternativa4[4] = "Ultron";
								limpartela();	

								
							System.out.println(" _________________________________________________________________________________________________");
							System.out.println("        																        "); 
							System.out.println("           												   				    ");
							System.out.println("              															    ");
							System.out.println("                														  		");
							System.out.println("  (Odin) Quem quer achar seu caminho neste mundo começa admitindo que não sabe onde está.     	");
							System.out.println("                                                                           	");
							System.out.println("                                                     					    ");
							System.out.println("							                                               		");
							System.out.println("_________________________________________________________________________________________________");	



								do {
									embaralhar(alternativa4);

									System.out.println("Quem arrancou o olho direito de Thor?");
									System.out.println("\n");
									System.out.println(
											"Assinale a alternativa correta, em relação á saída do código acima.");
									System.out.println("\n");

									System.out.println("a) " + alternativa4[0]);
									System.out.println("b) " + alternativa4[1]);
									System.out.println("c) " + alternativa4[2]);
									System.out.println("d) " + alternativa4[3]);
									System.out.println("e) " + alternativa4[4]);
									System.out.println("\n");
									System.out.println("Qual é a alternativa correta?");
									String resposta = imput.next();
									limpartela();
									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa4[0] == ("Hela")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa4[1] == ("Hela")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa4[2] == ("Hela")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa4[3] == ("Hela")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa4[4] == ("Hela")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while ((!acertou) && (contador <= 2));

								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;
								}
							}
							System.out.println("Parabéns você passou do quarto nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();
							limpartela();	
							// QUESTÃO DE NÚMERO 5: NORMAL

							if (navegacao == 1) {
								acertou = false;
								contador = 0;

								String alternativa5[] = new String[5];
								alternativa5[0] = "Hela";
								alternativa5[1] = "Heimdall";
								alternativa5[2] = "Valquiria"; // RESPOSTA CORRETA
								alternativa5[3] = "Loki";
								alternativa5[4] = "Odin";


								limpartela();	
								System.out.println(" _____________________________________________________________________________________________________");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println("                														  		");
								System.out.println(" (Hela) Eu não sou uma rainha, ou um monstro… eu sou a deusa da morte! Você é o deus de quê, mesmo?   ");
								System.out.println("                                                                           	");
								System.out.println("                                                     					    ");
								System.out.println("							                                               		");
								System.out.println("_______________________________________________________________________________________________________");		


								do {
									embaralhar(alternativa5);
									System.out.println("Quem o levou para Sakaar");
									System.out.println("\n");
									System.out.println("a) " + alternativa5[0]);
									System.out.println("b) " + alternativa5[1]);
									System.out.println("c) " + alternativa5[2]);
									System.out.println("d) " + alternativa5[3]);
									System.out.println("e) " + alternativa5[4]);

									System.out.println("\n");

									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa5[0] == ("Valquiria")) {
											System.out.println("Resposta Correta! ");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa5[1] == ("Valquiria")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa5[2] == ("Valquiria")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa5[3] == ("Valquiria")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa5[4] == ("Valquiria")) {
											System.out.println("Resposta Correta!");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);
											System.out.println("\r\n");

										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while (!acertou && contador <= 2);
								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;

								}
							}
							System.out.println("Parabéns você ajudou o Homem de Ferro a ser recrutado para os Vingadores!!!");
							System.out.println("Digite 0 para voltar ao menu principal.");
							navegacao = imput.nextInt();
						}
						// DIFICULDADE: DIFÍCIL

						if (opcao == 3) { // DIFICULDADE: DIFÍCIL

							// QUESTÃO DE NÚMERO 1: DIFÍCIL

							System.out.println("Informe seu nome recruta:");
							usuario = imput2.next();

							boolean acertou = false;
							int contador = 0;
							String alternativa1[] = new String[5];
							alternativa1[0] = "Steve Jobs";
							alternativa1[1] = "Howard Hughes"; // RESPOSTA CORRETA
							alternativa1[2] = "Elon Musk";
							alternativa1[3] = "Jeff Besus";
							alternativa1[4] = "John Davison Rockefeller";
								



							limpartela();	
								System.out.println(" ____________________________________________________________________________");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println("                														  		");
								System.out.println(" (Odin) Asgard não é um lugar, é um povo. E as pessoas precisam da sua ajuda.");
								System.out.println("                                                                           	");
								System.out.println("                                                     					    ");
								System.out.println("							                                               		");
								System.out.println("_____________________________________________________________________________");



							do {
								embaralhar(alternativa1);
								// ALTERNATIVA NO SYSTEM ABAIXO
								System.out.println(
										"Qual empresário foi usado como inspiração para a criação do personagem Tony Stark (Homem de Ferro)?  ");
								System.out.println("\n");

								System.out.println("a) " + alternativa1[0]);
								System.out.println("b) " + alternativa1[1]);
								System.out.println("c) " + alternativa1[2]);
								System.out.println("d) " + alternativa1[3]);
								System.out.println("e) " + alternativa1[4]);
								System.out.println("\n");
								System.out.println("Qual é a alternativa correta?");
								String resposta = imput.next();

								System.out.println("\n");
								switch (resposta) {
								case "a":
								case "A":
									if (alternativa1[0] == ("Howard Hughes")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									}
									break;
								case "b":
								case "B":
									if (alternativa1[1] == ("Howard Hughes")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									}
									break;
								case "c":
								case "C":
									if (alternativa1[2] == ("Howard Hughes")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									}
									break;
								case "d":
								case "D":
									if (alternativa1[3] == ("Howard Hughes")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									}
									break;
								case "e":
								case "E":
									if (alternativa1[4] == ("Howard Hughes")) {
										System.out.println("Resposta Correta.");
										System.out.println("\n");
										acertou = true;
										total = ponto + pontoG;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									} else {
										System.out.println("\n");
										System.out.println("Resposta Incorreta.");
										System.out.println("\n");
										total = ponto - pontoP;
										ponto = total;
										System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

										System.out.println("\r\n");
									}
									break;
								default:
									System.out.println("\n");
									System.out.println("Escolha Inválida.");
									System.out.println("\n");
								}
								contador++;
							} while ((!acertou) && (contador <= 2));

							if (acertou == false) {
								System.out.println("GAME OVER.");
								break;
							}

							System.out.println("Parabéns você passou do primeiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO DE NÚMERO 2: DIFÍCIL

							if (navegacao == 1) {

								acertou = false;
								contador = 0;

								String alternativa2[] = new String[5];
								alternativa2[0] = "Howard Stark Júnior";
								alternativa2[1] = "Anthony Edward Stark"; // RESPOSTA CORRETA
								alternativa2[2] = "Tony Stark";
								alternativa2[3] = "Howard Anthony Stark Júnior";
								alternativa2[4] = "Howard Edward Anthony Stark Júnior";
								



								limpartela();	
								System.out.println(" ____________________________________________________________________________");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println("                														  		");
								System.out.println(" (Nick Fury) Você conhece bem o herói que está ajudando recruta? 			  ");
								System.out.println("                                                                           	");
								System.out.println("                                                     					    ");
								System.out.println("							                                               		");
								System.out.println("_____________________________________________________________________________");

								

								do {
									embaralhar(alternativa2);
									// ALTERNATIVA NO SYSTEM ABAIXO
									System.out.println(
											" Qual é nome completo de Tony Stark?");
									System.out.println("\n");

									System.out.println("a) " + alternativa2[0]);
									System.out.println("b) " + alternativa2[1]);
									System.out.println("c) " + alternativa2[2]);
									System.out.println("d) " + alternativa2[3]);
									System.out.println("e) " + alternativa2[4]);
									System.out.println("\n");
									System.out.println("Qual é a alternativa correta?");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa2[0] == ("Anthony Edward Stark")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa2[1] == ("Anthony Edward Stark")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa2[2] == ("Anthony Edward Stark")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa2[3] == ("Anthony Edward Stark")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa2[4] == ("Anthony Edward Stark")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while ((!acertou) && (contador <= 2));

								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;
								}
							}
							System.out.println("Parabéns você passou do segundo nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO NÚMERO 3: DIFÍCIL

							if (navegacao == 1) {

								acertou = false;
								contador = 0;

								String alternativa3[] = new String[5];
								alternativa3[0] = "Mark XLII - Mark II - Mark VI";
								alternativa3[1] = "Mark IV - Mark V - Mark VI"; // RESPOSTA CORRETA
								alternativa3[2] = "Mark XXXIII - Mark XLII - Mark V";
								alternativa3[3] = "Mark III - Mark II - Mark VI";
								alternativa3[4] = "Mark IV - Mark XLII - Mark I";
								limpartela();	

							
								System.out.println(" ____________________________________________________________________________");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println("                														  		");
								System.out.println("  (Nick Fury) Acredito que daqui em diante o caldo vai engrossar recruta!    ");
								System.out.println("                                                                           	");
								System.out.println("   Como diria um certo amigo meu: Mother Fuck!                               ");
								System.out.println("							                                               		");
								System.out.println("_____________________________________________________________________________");






								do {
									embaralhar(alternativa3);
									// ALTERNATIVA NO SYSTEM ABAIXO
									System.out.println(
											" Quais são as armaduras que aparecem em Homem de Ferro II?");
									System.out.println("\n");

									System.out.println("a) " + alternativa3[0]);
									System.out.println("b) " + alternativa3[1]);
									System.out.println("c) " + alternativa3[2]);
									System.out.println("d) " + alternativa3[3]);
									System.out.println("e) " + alternativa3[4]);
									System.out.println("\n");
									System.out.println("Qual é a alternativa correta?");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa3[0] == ("Mark IV - Mark V - Mark VI")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa3[1] == ("Mark IV - Mark V - Mark VI")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa3[2] == ("Mark IV - Mark V - Mark VI")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa3[3] == ("Mark IV - Mark V - Mark VI")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa3[4] == ("Mark IV - Mark V - Mark VI")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while ((!acertou) && (contador <= 2));

								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;
								}
							}
							System.out.println("Parabéns você passou do terceiro nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO NÚMERO 4: DIFÍCIL

							if (navegacao == 1) {

								acertou = false;
								contador = 0;

								String alternativa4[] = new String[5];
								alternativa4[0] = "Chumbo";
								alternativa4[1] = "Paládio"; // RESPOSTA CORRETA
								alternativa4[2] = "Titanio";
								alternativa4[3] = "Enxofre";
								alternativa4[4] = "Vibranium";







								limpartela();	
								System.out.println(" _____________________________________________________________________________________");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println(" (Nick Fury) Em Homem de Ferro II Tony Stark começa a perceber que está sendo afetado             														  		");
								System.out.println("  por um elemento quimíco presente no gerador ARC    ");
								System.out.println("  que está em seu peito, você deve ajuda-lo rápido!                                                                         	");
								System.out.println("                                                     					    ");
								System.out.println("							                                               		");
								System.out.println("______________________________________________________________________________________");




								do {
									embaralhar(alternativa4);
									// ALTERNATIVA NO SYSTEM ABAIXO
									System.out.println("Qual é o elemento quimíco que está afetando Tony?");
									System.out.println("\n");

									System.out.println("a) " + alternativa4[0]);
									System.out.println("b) " + alternativa4[1]);
									System.out.println("c) " + alternativa4[2]);
									System.out.println("d) " + alternativa4[3]);
									System.out.println("e) " + alternativa4[4]);
									System.out.println("\n");
									System.out.println("Qual é a alternativa correta?");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa4[0] == ("Paládio")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa4[1] == ("Paládio")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa4[2] == ("Paládio")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa4[3] == ("Paládio")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa4[4] == ("Paládio")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|ID => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while ((!acertou) && (contador <= 2));

								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;
								}
							}
							System.out.println("Parabéns você passou do quarto nível.");
							System.out.println("Digite 1 para continuar.");
							navegacao = imput.nextInt();

							// QUESTÃO NÚMERO 5: DIFÍCIL

							if (navegacao == 1) {

								acertou = false;
								contador = 0;

								String alternativa5[] = new String[5];
								alternativa5[0] = "Stephen Strange e Howard Stark";
								alternativa5[1] = "Howard Stark e Anton Vanko"; // RESPOSTA CORRETA
								alternativa5[2] = "Tony Stark e Ivan Vanko";
								alternativa5[3] = "Bruce Banner e Ivan Vanko";
								alternativa5[4] = "Tony Stark e Jane Foster";
								limpartela();
								
								



									
								System.out.println(" ____________________________________________________________________________");
								System.out.println("        																        "); 
								System.out.println("           												   				    ");
								System.out.println("              															    ");
								System.out.println("                														  		");
								System.out.println("  (Nick fury) Ciêntistas e suas criações malucas...						   ");
								System.out.println("                                                                           	");
								System.out.println("                                                     					    ");
								System.out.println("							                                               		");
								System.out.println("_____________________________________________________________________________");








								do {
									embaralhar(alternativa5);
									// ALTERNATIVA NO SYSTEM ABAIXO
									System.out.println("Quais os nomes dos ciêntistas responsáveis pela criação do gerador ARC?");
									System.out.println("\n");

									System.out.println("a) " + alternativa5[0]);
									System.out.println("b) " + alternativa5[1]);
									System.out.println("c) " + alternativa5[2]);
									System.out.println("d) " + alternativa5[3]);
									System.out.println("e) " + alternativa5[4]);
									System.out.println("\n");
									System.out.println("Qual é a alternativa correta?");
									String resposta = imput.next();

									System.out.println("\n");
									switch (resposta) {
									case "a":
									case "A":
										if (alternativa5[0] == ("Howard Stark e Anton Vanko")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "b":
									case "B":
										if (alternativa5[1] == ("Howard Stark e Anton Vanko")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "c":
									case "C":
										if (alternativa5[2] == ("Howard Stark e Anton Vanko")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "d":
									case "D":
										if (alternativa5[3] == ("Howard Stark e Anton Vanko")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									case "e":
									case "E":
										if (alternativa5[4] == ("Howard Stark e Anton Vanko")) {
											System.out.println("Resposta Correta.");
											System.out.println("\n");
											acertou = true;
											total = ponto + pontoG;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										} else {
											System.out.println("\n");
											System.out.println("Resposta Incorreta.");
											System.out.println("\n");
											total = ponto - pontoP;
											ponto = total;
											System.out.printf("|Recruta => %s |Pontos => %d |", usuario, total);

											System.out.println("\r\n");
										}
										break;
									default:
										System.out.println("\n");
										System.out.println("Escolha Inválida.");
										System.out.println("\n");
									}
									contador++;
								} while ((!acertou) && (contador <= 2));

								if (acertou == false) {
									System.out.println("GAME OVER.");
									break;
								}
							}
							System.out.println("Parabéns você ajudou o Homem de Ferro a entrar para a iniciativa Vingadores !!!");
							System.out.println("Digite 0 para voltar ao menu principal.");
							navegacao = imput.nextInt();
						}

					} else {
						System.out.println("Opção inválida!");
					}

				} while (navegacao != 0);
				break;

			case 3:
			
				do {								
					try { Thread.sleep (4000); } catch (InterruptedException ex) {}
					





					
					System.out.println(
							"-------------------------------------------------------------------------------------------------------");
					System.out.println(
							"+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");
					System.out.println(
							"+ + +                                                                                             + + +");
					System.out.println(
							"+ + +                                      Desenvolvido por:                                      + + +");
					System.out.println(
							"+ + +                                   João Pedro de Oliveira                                    + + +");
					System.out.println(
							"+ + +                                    Gabriel V. Horisawa                                      + + +");
					System.out.println(
							"+ + +                                       Gustavo Braz                                          + + +");
					System.out.println(
							"+ + +                                      Livia Monteiro                                         + + +");
					System.out.println(
							"+ + +                                                                                             + + +");
					System.out.println(
							"+ + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + + +");
					System.out.println(
							"-------------------------------------------------------------------------------------------------------");
					System.out.println("\r\n");
					System.out.println("Digite 0 para voltar para o menu.");
					navegacao = imput.nextInt();

				} while (navegacao != 0);

				break;

			case 4:
				System.out.println("Você está saindo do jogo...");
				break;

			default:
				System.out.println("Opção inválida.");

			}

		} while (opcao != 4);

	}

}
// FIM ;)
