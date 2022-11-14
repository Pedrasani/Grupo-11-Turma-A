package com.mycompany.jogo;

/**
 *
 * @author pedro
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Jogo {
    public static void main(String[] args) {
        
        boolean acertou = false;
        
        
        
        int res1 = 0, res2 = 0, res3 = 0, res4 = 0, res5 = 0, res6 = 0, res7 = 0;
        int opcao;
        int tentativas = 2;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite uma opção para inciar: ");
        do{
        System.out.println("1 - Intruções");
        System.out.println("2 - Jogar");
        System.out.println("3 - Créditos");
        System.out.println("4 - Sair");
        System.out.println("Digite uma opção: ");
            opcao = input.nextInt();
            
        switch (opcao){
                case 1:
                System.out.println(" Este jogo baseia-se em um quiz dinâmico\n"
+ " que ajuda o cientista Charles a conseguir adquirir as peças necessárias\n"
+ " para ligar novamente o primeiro computador criado.\n");
                    System.out.println(" O jogo é composto por algumas fases,\n "
+ "em cada fase havera perguntas, caso o jogador acerte,\n "
        + "conseguirá uma peça do computador, no final, será informado quantas\n "
        + "peças o jogador conseguiu, e se com elas será possível ligar o computador.\n");
                break;
                case 2:
        System.out.println("\nPara acessar o jogo, crie um login: ");
        System.out.print("Usuário: ");
        String login = input.next();
        System.out.print("Senha: ");
        String senha = input.next();
        System.out.println("Login criada com sucesso! ");
        
        
        for (int i = 0; i < 3; i++) {
        System.out.print("\nDigite seu login criado: ");
        String logininformado = input.next();
        System.out.print("Digite sua senha criada: ");
        String senhainformada = input.next();
            
            if ((login.equals(logininformado))&&(senha.equals(senhainformada))) {
                System.out.println("\nBem vindo ao jogo, vamos se divertir?");
                break;
            } else {
                System.out.printf("\nLogin ou senha incorretos, tente novamente. "
 + "Você tem mais %d tentativas.\n", tentativas--);
            }
        }
        
        
        //Introdução e apresentação
        
        System.out.println("\nComo você deseja ser chamado? ");
                
        String nome = input.next();
        
        System.out.println(nome + ", você terá como objetivo acertar o maior número de perguntas"
        + "\npara somar peças e reconstruir o projeto do primeiro computador criado. \nParece interessante não é mesmo? "
        + "Bom, sem enrolação vamos nessa!\n");
        
                
        //História do Eniac
                
        System.out.println("\nAntes da segunda guerra mundial havia um grupo de cientistas que\n" +
"estavam desenvolvendo um projeto, onde iria revolucionar a tecnologia na\n" +
"época, no entanto um imprevisto ocorreu, quando os Estados Unidos foi\n" +
"atacado pelo Japão.\n" +
"Consequentemente ambos países foram parcialmente destruídos, e\n" +
"infelizmente o laboratório localizado na universidade de Pensilvânia onde os\n" +
"cientistas estavam, foi atingido por uma bomba, restando apenas um\n" +
"sobrevivente, o cientista Charles.\n" +
"Com a explosão, o projeto teve a sua maior parte danificada, sendo\n" +
"necessário uma reformulação."); 
                
        System.out.println("\nAgora precisamos ajudar o cientista a conseguir as peças necessárias\n" +
"para reconstruir o projeto.");
                
        System.out.println("Pelo que vimos nas notícias, a cidade ficou devastada, muitas casas estão destruídas, "
                        + "acredito que vamos ter\n" +
"bastante trabalho para finalizar este projeto. O cientista Charles me disse que o projeto\n" +
"destruído se chamava ENIAC... Por sinal um\n" +
"nome bem estranho, não é mesmo? \nAlgumas pessoas haviam comentando por aí que esse seria o primeiro\n" +
"computador digital e nos ajudaria a se comunicar com outros países");
        System.out.println("O cientista Charles disse que as principais partes do projeto danificada foram:"
                        + "peça1\n peça2\n peça3\n peça5\n peça5\n");
        
        
        List anternativas = new ArrayList();
        
        alternativas.add("30000");
        alternativas.add("300000"); // resposta certa
        alternativas.add("200000");
        alternativas.add("10000");
        
        
            Collections.shuffle(anternativas);
            
            
            
            
        
        
            
            System.out.println("O Projeto do ENIAC tinha uma forma de U, e pesava em torno "
                + "\nde 30 toneladas, você sabe me dizer qual é esse peso em quilos? ");
            
                    System.out.println("a) " + alternativas.add(0));
                    System.out.println("b) " + alternativas.add(1));
                    System.out.println("c) " + alternativas.add(2));
                    System.out.println("d) " + alternativas.add(3));
                 
                System.out.println("Escolha uma das alternativas: ");
                String resposta1 = input.next();
                
                switch(resposta1){
                    case "a":
                    case "A":
                        if(alternativas.add(0).equals("300000")){
                            System.out.println("Resposta correta!");
                            acertou = true;
                        }else{
                            System.out.println("Respota errada");
                        }
                        break;
                        
                    case "b":
                    case "B":
                        if(alternativas.add(0).equals("300000")){
                            System.out.println("Resposta correta!");
                            acertou = true;
                        }else{
                            System.out.println("Respota errada");
                        }
                        break;
                        
                    case "c":
                    case "C":
                        if(alternativas.add(0).equals("300000")){
                            System.out.println("Resposta correta!");
                            acertou = true;
                        }else{
                            System.out.println("Respota errada");
                        }
                        break;
                        
                    case "d":
                    case "D":
                        if(alternativas.add(0).equals("300000")){
                            System.out.println("Resposta correta!");
                            acertou = true;
                        }else{
                            System.out.println("Respota errada");
                        }
                        break;
                        
                }

                 //caso o jogador acerte, iformar qual peça ele ganhou
                 
        System.out.println("\nHoje temos pleno entendimento da tecnologia, é inegável afirmar que a\n" +
"sociedade vem se transformando em função das evoluções tecnológicas,\n" +
"impondo, de forma direta e indireta, novos padrões de comportamento.\n" +
"Porém nem todos possuem o conhecimento de como foi o surgimento dessas\n" +
"inovações.\n" +
"Vamos embarcar em uma linha do tempo para compreendermos como foram os\n" +
"principais acontecimentos ao longo dos anos.\n");
       
            
                
        //História da calculadora
        
                
        System.out.println("\n Para comerçarmos essa nossa incrível aventura iremos voltar um pouquinho no tempo, \nvamos viajar para 3500 a.C.");
        System.out.println(" A primeira máquina de calcular foi o ábaco, que surgiu na antiga Mesopotâmia. \nOs primeiros ábacos eram desenhados no chão e depois colocavam as bolas de pedras para calcular, \nmas com o passar do tempo, passaram a ser construídos em tábuas de pedra ou mármore, \nonde se lapidam as letras e se colocava depois bolas de pedras, para poder fazer os cálculos.");
        System.out.println("\n Agora é com você, precisamos da sua ajuda para darmos prosseguimento a nossa história, conto com você nessa em.");
        System.out.println("\n\n Qual número está sendo representado a baixo?\n");

        System.out.println("    O      ");
        System.out.println("    O     O");
        System.out.println("    O  O  O");
        System.out.println(" O  O  O  O");
        System.out.println("=|==|==|==|=");
        System.out.println(" M  C  D  U");
                
                
        //Implementar a respotas        
        
        
        System.out.println("1440");
        System.out.println("1423");
        System.out.println("1427");
        System.out.println("1430");
        System.out.println("Digite sua resposta: ");
                int resposta1 = input.nextInt();
                
                if (resposta1 == 1423){
                    System.out.println("É isso aí, resposta correta! ");
                    res1 = 1;
                }else{ System.out.println("Não é bem isso, reposta errada \n");
                }
                
                
        System.out.println("          O");
        System.out.println("    O  O  O");
        System.out.println(" O  O  O  O");
        System.out.println(" O  O  O  O");
        System.out.println("=|==|==|==|=");
        System.out.println(" M  C  D  U");
        System.out.println("Digite sua resposta: \n");
        System.out.println("2330");
        System.out.println("2342");
        System.out.println("2334");
        System.out.println("2298");
                int resposta2 = input.nextInt();
                
                if(resposta2 == 2334){
                    System.out.println("Parabéns, resposta correta!");
                    res2 = 1;
                } else{
        System.out.println("Infelizmente você errou");
                }
                 
                 //Historia linguagem programacao
                
                
                
        System.out.println("Vamos avançar mais ainda no tempo, agora iremos te apresentar a primeira linguagem de programação! \n");
                 
        System.out.println("");
                 
        
        
                 //implementar as perguntas
                 
                 
                 
                 //historia da internet
                 
        System.out.println("A internet foi criada em 1969, nos Estados Unidos. "
+ "E era chamada de Arpanet, \nela tinha como função interligar laboratórios de pesquisa. \n" +
"E essa rede pertencia ao Departamento de Defesa norte-americano. \n"
+ "O mundo vivia o auge da Guerra Fria, A Arpanet era uma garantia de que a "
+ "comunicação entre militares e ciencistas persistiria, \nmesmo em caso de bombardeio.\n" +
"Mas o nome internet só começou a ser utilizado a partir de 1982"
+ " \nquando o uso se expandiu para outros países como, Holanda, Dinamarca e Suécia.\n" +
"Por quase duas decadas apenas os cientistas tinham poder para usar a internet, "
+ "\nsomente em 1987 foi liberado para uso comercial.\n");

        System.out.println("\nQual era a principal função da criação da internet?\n");
        System.out.println("Comercialização e geração de renda.");
        System.out.println("Interligar laboratorios de pesquisas.");
        System.out.println("Melhorar a comunicação entre empresas.");
        System.out.println("Conectar países de diferentes continentes.");
                 int resposta4 = input.nextInt();
                 
                 if(resposta4 == 2){
                     System.out.println("uhul, voce acertou!");
                     res4 = 1;
                 }else{
        System.out.println("que pena, voce errou");
                 }
                 
                     
                 //Resposta certa: Interligar laboratorios de pesquisas
                 
                 
                 
        System.out.println("\nEm qual ano foi liberado o uso comercial da internet?");
        System.out.println("\n1990");
        System.out.println("\n1985");
        System.out.println("\n1987");
        System.out.println("\n1993");
                int resposta5 = input.nextInt();
                
                if(resposta5 == 3){
                    System.out.println("voce é demais! resposta certa");
                    res5 = 1;
                }else{
                    System.out.println("é... você acabou errando");
                }
                
                //resposta certa: 1987
                
                
                
                //historia do cobol
                
                
                    System.out.println("Criada em 1959, o Cobol é uma das linguagens de programação mais antigas do universo da computação.\n" +
                    "Ela surgiu quando um grupo de empresas de tecnologia, entre elas a IBM, e órgãos governamentais dos EUA se reuniram para \n"
                            + " criar uma linguagem de programação com objetivo de facilitaro controle dos negócios.\n" +
                    "Em 1968, a ANSI desenvolveu a primeira especificação padrão do Cobol. Isso significa que ele é compatível com diferentes \n"
                            + " plataformas e, por isso, os códigos escritos em Cobol podem ser compilados e executados em diversos sistemas.");
                
                
                    System.out.println("\nQual a principal função da criação do cobol?\n");
                    
                    System.out.println("\nfacilitar o controle de negocios");                    
                    System.out.println("criar programas para empresas");
                    System.out.println("atrair desenvolvedores para a linguagem");
                    System.out.println("projetar novas tecnologias");
                    int resposta6 = input.nextInt();
                    
                    if(resposta6 == 1){
                        System.out.println("Parabens, voce acertou!");
                        res6 = 1;
                    }else{
                        System.out.println("poxa vida, resposta errada");
                    }
                    
                    
                    //resposta certa:facilitar o controle de negocios
                    
                    
                    System.out.println("\nqual a especificação criada pela ANSI?\n");
                    
                    System.out.println("\nimplementar mais uso dentro das empresas");
                    System.out.println("tornar compativel com diferentes plataformas");
                    System.out.println("facilitar o uso da linguagem");
                    System.out.println("deixar a tecnologia mais funcional");
                    int resposta7 = input.nextInt();
                    
                    if(resposta7 == 2){
                        System.out.println("Incrivel voce acertou!");
                        res7 = 1;
                    }else{
                        System.out.println("voce errou, que triste");
                    }
                    
                    
                    //resposta certa:tornar compativel com diferentes plataformas
                
                
                
                 
                
                int placar = res1 + res2 + res3 + res4 + res5 + res6 + res7;
                
                        System.out.println(placar);
                
                
                
                 break;
                 case 3:
                    System.out.println("Jogo desenvolvido por:\n" +
                "João Vitor\n" +
                "Camilly Pedreira\n" +
                "Pedro Henrique\n" +
                "Bruna Ramalho\n" +
                "Willian Gomes\n" +
                "\nProjeto Integrador" +
                "\nProfessor: Eduardo Takeo\n");
                    break;
                case 4:
                    System.out.println("Você escolheu sair, até logo! ");
                    break;
                default:
                    System.out.println("Você escolheu uma opção inválida! ");
            }
        } while (opcao != 4);
                 
                 
                 
            
        }
                
        
}
