package com.mycompany.mavenproject1;

/**
 *
 * @author victo
 */
import java.util.Scanner;
public class Jogo {
    static int temp_dialog =70, temp_narrativa = 150, temp_transicao = 25;
    public static void main(String[] args) {
        int tentativas = 2;
        Scanner input = new Scanner(System.in);
        
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
                System.out.printf("\nLogin ou senha incorretos, tente novamente. Você tem mais %d tentativas.\n", tentativas--);
            }
        }
        
        
        //Introdução e apresentação
        
                System.out.println("\nComo você deseja ser chamado? ");
                String nome = input.next();
        
                System.out.println("\nOlá " + nome + " Você irá passar por uma simulação em forma de um quiz onde iremos nos aprofundar na evolução da tecnologia! Você terá como objetivo acertar o maior número de perguntas"
                        + "\n para somar peças e reconstruir o projeto do primeiro computador criado. \nParece interessante não é mesmo? Bom, sem enrolação vamos nessa!");
        
                System.out.println("\nHoje temos pleno entendimento da tecnologia, é inegável afirmar que a\n" +
"sociedade vem se transformando em função das evoluções tecnológicas,\n" +
"impondo, de forma direta e indireta, novos padrões de comportamento.\n" +
"Porém nem todos possuem o conhecimento de como foi o surgimento dessas\n" +
"inovações.\n" +
"Vamos embarcar em uma linha do tempo para compreenbrunder como foram os\n" +
"principais acontecimentos.");
        System.out.println("\n" + nome + " você está preparado para começar essa aventura? \n 1 - [SIM] ou 2 - [NÃO]");
        String escolha = input.next();
        switch (escolha){
            case "1":
            
                
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
                } else{
                    System.out.println("Infelizmente você errou");
                }
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
                
                System.out.println("\nAgora precisamos ajudar o cientista a encontrar as peças necessárias\n" +
"para reconstruir o projeto.");
                
                System.out.println("Pelo que vimos nas notícias, a cidade ficou devastada, muitas casas estão destruídas, pelo visto vamos ter\n" +
"bastante trabalho para finalizar este projeto. O cientista Charles me disse que o projeto\n" +
"destruído se chamava ENIAC... Por sinal um\n" +
"nome bem estranho, não é mesmo? \nAlgumas pessoas haviam comentando por aí que esse seria o primeiro\n" +
"computador digital e nos ajudaria a se comunicar com outros países");
                System.out.println("O cientista Charles disse que as principais partes do projeto danificada foram: peça1\n peça2\n peça3\n peça5\n peça5\n");
                System.out.println("O Projeto do ENIAC tinha uma forma de U, e pesava em torno "
                + "\nde 30 toneladas, você sabe me dizer qual é esse peso em quilos? ");
                System.out.println("Digite sua resposta: ");
                System.out.println("30000");
                System.out.println("300000");
                System.out.println("200000");
                System.out.println("10000");
                int resposta3 = input.nextInt();
                 if(resposta3 == 30000){
                    System.out.println("Resposta certa!");
                } else{
                    System.out.println("Infelizmente você errou");
                }

                
                
                break;
            case "2":
                System.out.println("Que pena, volte uma outra vez para nos ajudar!");
            default: 
                System.out.println("Digite uma opção que seja 1 ou 2");
                
        }
                
        
    }
}
