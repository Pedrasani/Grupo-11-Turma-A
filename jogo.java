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
        
        System.out.println("\nPara acessar o jogo, crie um login e senha: ");
        System.out.print("Login: ");
        String login = input.next();
        System.out.print("Senha: ");
        String senha = input.next();
        System.out.println("Senha criada com sucesso! ");
        
        
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
        
                System.out.println("\nOla " + nome + " você ira passar por uma simulação em forma de um quiz onde iremos nos aprofundar na evolução da tecnologia! \nparece interessante não é mesmo, bom, sem enrolação vamos nessa!");
        
                System.out.println("\nHoje temos pleno entendimento da tecnologia, é inegável afirmar que a\n" +
"sociedade vem se transformando em função das evoluções tecnológicas,\n" +
"impondo, de forma direta e indireta, novos padrões de comportamento.\n" +
"Porém nem todos possuem o conhecimento de como foi o surgimento dessas\n" +
"inovações.\n" +
"Vamos embarcar em uma linha do tempo para compreender como foram os\n" +
"principais acontecimentos.");
        System.out.println("\n" + nome + " você está preparado para começar essa aventura? \n [SIM] ou [NÃO]");
        String escolha = input.next();
        switch (escolha){
            case "SIM":
            case "Sim":
            case "sim":
                
        //História da calculadora
                
                System.out.println("\n Para comerçarmos essa nossa incrivel aventura iremos voltar um pouquinho no tempo, \nvamos viajar para 3500 a.C.");
                System.out.println(" Nos tempos de hoje, a calculadora é uma ferramenta indispensável, \ndevido à extrema necessidade do homem moderno de fazer cálculos com maior rapidez e precisão.");
                System.out.println(" A primeira máquina de calcular foi o ábaco, que surgiu na antiga Mesopotâmia por volta de 3500 a.C. \nOs primeiros ábacos eram desenhados no chão e depois colocavam as bolas de pedras para calcular, \nmas com o passar do tempo, passaram a ser construídos em tábuas de pedra ou mármore, \nonde se lapidam as letras e se colocava depois bolas de pedras, para poder fazer os cálculos.");
                System.out.println("\n Agora é com você, precisamos da sua ajuda para darmos prosseguimento a nossa história, conto com você nessa em.");
                System.out.println("\n Podemos dizer que o ábaco foi a primeira calculadora da história, \ncriado no século 6 antes de Cristo, embora fosse um instrumento bastante limitado. \nO ábaco acabou sendo o principal mecanismo de cálculo durante os 24 séculos seguintes ?");
                System.out.println("");
                
        //Implementar a respotas        
                
                
                
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
"destruído se chama ENIAC (Eletronic Numerical Interpreter and Calculator)... Por sinal um\n" +
"nome bem estranho, algumas pessoas estão comentando por aí que esse será o primeiro\n" +
"computador digital e nos ajudará a comunicar com outros países, será verdade isso\n" +
"mesmo?");
                
                
                break;
            case "NÃO":
            case "Não":
            case "não":
            case "nao":
                System.out.println("Que pena, volte uma hora vez para nos ajudar!");
                
        }
                
        
    }
}
