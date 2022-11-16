package com.mycompany.jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Jogo {
    
    
    //historia do eniac
    
    public static int Eniac(){
        
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int resposta1 = 0;
        
        List alternativas = new ArrayList();
        
        
        //declarar alternativas
        
        alternativas.add("30000"); // resposta certa
        alternativas.add("300000"); 
        alternativas.add("200000");
        alternativas.add("10000");
        
        
        
        System.out.println("\nAntes da segunda guerra mundial havia um "
                + "grupo de cientistas que\n" 
                + "estavam desenvolvendo um projeto, "
                + "onde iria revolucionar a tecnologia na\n" 
                + "época, no entanto um imprevisto ocorreu, "
                + "quando os Estados Unidos foi\n" 
                + "atacado pelo Japão.\n" 
                + "Consequentemente ambos países foram"
                + " parcialmente destruídos, e\n" 
                + "infelizmente o laboratório localizado na universidade "
                + "de Pensilvânia onde os\n" 
                + "cientistas estavam, foi atingido por uma bomba, "
                + "restando apenas um\n" 
                + "sobrevivente, o cientista Charles.\n" 
                +"Com a explosão, o projeto teve a sua maior parte"
                + " danificada, sendo\n" 
                + "necessário uma reformulação."); 
                
        System.out.println("\nAgora precisamos ajudar o cientista a conseguir as peças necessárias\n" +
"para reconstruir o projeto.");
                
        System.out.println("Pelo que vimos nas notícias, a cidade ficou devastada, "
                + "muitas casas estão destruídas, "
                + "acredito que vamos ter\n" 
                + "bastante trabalho para finalizar este projeto. "
                + "O cientista Charles me disse que o projeto\n" 
                + "destruído se chamava ENIAC... Por sinal um\n" 
                + "nome bem estranho, não é mesmo? \n"
                + "Algumas pessoas haviam comentando por "
                + "aí que esse seria o primeiro\n" +
"computador digital e nos ajudaria a se comunicar com outros países");
        System.out.println("O cientista Charles disse que as principais "
                + "partes do projeto danificada foram:"
                + "Painéis\n "
                + "Tubos de vácuo\n "
                + "Interruptores\n "
                + "Capacitores\n "
                + "Válvulas\n"
                + "Cartão de Dados\n"
                + "Réles\n");
        
        do{
            
            //embaralhar alternativas
            
            Collections.shuffle(alternativas);
            
            System.out.println("O Projeto do ENIAC tinha uma forma de U, "
                    + "e pesava em torno" +
                    "+\nde 30 toneladas, você sabe me dizer qual é esse peso em quilos? ");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            
            System.out.println("Escolha uma alternativa: ");
            String resposta = entrada.next();
            
            switch(resposta){
                case"a":
                case"A":
                    if(alternativas.get(0).equals("30000")){
                        System.out.println("Resposta certa!");
                        acertou = true;
                        resposta1 = 1;
                        System.out.println("Parabens voce recuperou os Painéis");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("30000")){
                        System.out.println("Resposta certa!");
                        acertou = true;
                        resposta1 = 1;
                        System.out.println("Parabens voce recuperou os Painéis");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("30000")){
                        System.out.println("Resposta certa!");
                        acertou = true;
                        resposta1 = 1;
                        System.out.println("Parabens voce recuperou os Painéis");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("30000")){
                        System.out.println("Resposta certa!");
                        acertou = true;
                        resposta1 = 1;
                        System.out.println("Parabens voce recuperou os Painéis");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
            }
        }while(!acertou);
        return resposta1;
    }
    
    //historia da calculadora
    
    public static int Calculadora(){
        
        Scanner entrada = new Scanner(System.in);
        
        int resposta2 = 0;
        
        //declarar alternativas
        
        List alternativas = new ArrayList();
        
        alternativas.add("1440");
        alternativas.add("1423"); //resposta certa
        alternativas.add("1427");
        alternativas.add("1430");
        
        
        System.out.println("\n Para comerçarmos essa nossa incrível"
                + " aventura iremos voltar um pouquinho no tempo, "
                + "\nvamos viajar para 3500 a.C.");
        System.out.println(" A primeira máquina de calcular foi o ábaco,"
                + " que surgiu na antiga Mesopotâmia. "
                + "\nOs primeiros ábacos eram desenhados no chão e depois "
                + "colocavam as bolas de pedras para calcular, "
                + "\nmas com o passar do tempo, passaram a ser construídos"
                + " em tábuas de pedra ou mármore, "
                + "\nonde se lapidam as letras e se colocava "
                + "depois bolas de pedras, para poder fazer os cálculos.");
        System.out.println("\n Agora é com você, precisamos da sua "
                + "ajuda para darmos prosseguimento a nossa história, "
                + "conto com você nessa em.");
        
        //embaralhar alternativas    
        
        Collections.shuffle(alternativas);
            
            System.out.println("\n\n Qual número está sendo representado a baixo?\n");
            System.out.println("    O      ");
            System.out.println("    O     O");
            System.out.println("    O  O  O");
            System.out.println(" O  O  O  O");
            System.out.println("=|==|==|==|=");
            System.out.println(" M  C  D  U\n");
            
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            
            System.out.println("Escolha a alternativa: ");
            String resposta = entrada.next();
            
            switch(resposta){
                case"a":
                case"A":
                    if(alternativas.get(0).equals("1423")){
                        System.out.println("Resposta certa!");
                        resposta2 = 1;
                        System.out.println("\nParabens voce recuperou os tubos de vácuo");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("1423")){
                        System.out.println("Resposta certa!");
                        resposta2 = 1;
                        System.out.println("\nParabens voce recuperou os tubos de vácuo");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("1423")){
                        System.out.println("Resposta certa!");
                        resposta2 = 1;
                        System.out.println("\nParabens voce recuperou os tubos de vácuo");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("1423")){
                        System.out.println("Resposta certa!");
                        resposta2 = 1;
                        System.out.println("\nParabens voce recuperou os tubos de vácuo");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
                }
            return resposta2;
    }
            
        //segunda pergunta da calculadora
    
        public static int Calculadora2(){    
            
            Scanner entrada = new Scanner(System.in);
            
            int resposta3 = 0;
            
            //declarar alternativas
            
            List alternativas = new ArrayList();
        
        alternativas.add("2330");
        alternativas.add("2342");
        alternativas.add("2334");//resposta correta
        alternativas.add("2298");
        
            //embaralhar alternativas
        
            Collections.shuffle(alternativas);
            
            System.out.println("\n\n Qual número está sendo representado a baixo?\n");
            System.out.println("          O");
            System.out.println("    O  O  O");
            System.out.println(" O  O  O  O");
            System.out.println(" O  O  O  O");
            System.out.println("=|==|==|==|=");
            System.out.println(" M  C  D  U\n");
            
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            
            System.out.println("Escolha a alternativa: ");
            String resposta1 = entrada.next();
            
            switch(resposta1){
                case"a":
                case"A":
                    if(alternativas.get(0).equals("2334")){
                        System.out.println("Resposta certa!");
                        resposta3 = + 1;
                        System.out.println("\nParabens voce recuperou os interruptores");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("2334")){
                        System.out.println("Resposta certa!");
                        resposta3 = + 1;
                        System.out.println("\nParabens voce recuperou os interruptores");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("2334")){
                        System.out.println("Resposta certa!");
                        resposta3 = + 1;
                        System.out.println("\nParabens voce recuperou os interruptores");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("2334")){
                        System.out.println("Resposta certa!");
                        resposta3 = + 1;
                        System.out.println("\nParabens voce recuperou os interruptores");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
            }
        
        return resposta3;
        
    }
    
        //historia do cobol
        
    public static int Cobol(){
        
        Scanner entrada = new Scanner(System.in);
        
        int resposta4 = 0;
        
        //declarar alternativas
        
        List alternativas = new ArrayList();
        
        alternativas.add("facilitar o controle de negocios");//resposta certa
        alternativas.add("criar programas para empresas");
        alternativas.add("atrair desenvolvedores para a linguagem");
        alternativas.add("projetar novas tecnologias");
        
        
        System.out.println("Criada em 1959, o Cobol é uma das linguagens "
                + "de programação mais antigas do universo da computação.\n" 
                + "Ela surgiu quando um grupo de empresas de tecnologia,"
                + "entre elas a IBM, e órgãos governamentais dos EUA se reuniram para \n"
                + " criar uma linguagem de programação com objetivo "
                + "de facilitaro controle dos negócios.\n" 
                + "Em 1968, a ANSI desenvolveu a primeira especificação padrão do Cobol. "
                + "Isso significa que ele é compatível com diferentes \n"
                + " plataformas e, por isso, os códigos escritos em Cobol podem ser"
                + " compilados e executados em diversos sistemas.");
        
            //embaralhar alternativas
        
            Collections.shuffle(alternativas);
            
            System.out.println("\nQual a principal função da criação do cobol?\n");
            
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            
            System.out.println("Escolha a alternativa: ");
            String resposta = entrada.next();
            
            switch(resposta){
                case"a":
                case"A":
                    if(alternativas.get(0).equals("facilitar o controle de negocios")){
                        System.out.println("Resposta certa!");
                        resposta4 = 1;
                        System.out.println("\nParabens voce recuperou os capacitores");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("facilitar o controle de negocios")){
                        System.out.println("Resposta certa!");
                        resposta4 = 1;
                        System.out.println("\nParabens voce recuperou os capacitores");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("facilitar o controle de negocios")){
                        System.out.println("Resposta certa!");
                        resposta4 = 1;
                        System.out.println("\nParabens voce recuperou os capacitores");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("facilitar o controle de negocios")){
                        System.out.println("Resposta certa!");
                        resposta4 = 1;
                        System.out.println("\nParabens voce recuperou os capacitores");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
            }
            return resposta4;
    }
    
        //segunda pergunta cobol
    
    public static int Cobol2(){
            
            Scanner entrada = new Scanner(System.in);
            
            int resposta5 = 0;
            
            //declarar alternativas
            
            List alternativas = new ArrayList();
        
        alternativas.add("implementar mais uso dentro das empresas");
        alternativas.add("tornar compativel com diferentes plataformas");//resposta correta
        alternativas.add("facilitar o uso da linguagem");
        alternativas.add("deixar a tecnologia mais funcional");
        
            //embaralhar alternativas
        
            Collections.shuffle(alternativas);
            
            System.out.println("\nqual a especificação criada pela ANSI?\n");
            
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            
            System.out.println("Escolha a alternativa: ");
            String resposta1 = entrada.next();
            
            switch(resposta1){
                case"a":
                case"A":
                    if(alternativas.get(0).equals("tornar compativel com diferentes plataformas")){
                        System.out.println("Resposta certa!");
                        resposta5 = + 1;
                        System.out.println("\nParabens voce recuperou os válvulas");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("tornar compativel com diferentes plataformas")){
                        System.out.println("Resposta certa!");
                        resposta5 = + 1;
                        System.out.println("\nParabens voce recuperou os válvulas");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("tornar compativel com diferentes plataformas")){
                        System.out.println("Resposta certa!");
                        resposta5 = + 1;
                        System.out.println("\nParabens voce recuperou os válvulas");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("tornar compativel com diferentes plataformas")){
                        System.out.println("Resposta certa!");
                        resposta5 = + 1;
                        System.out.println("\nParabens voce recuperou os válvulas");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
            }
        
        return resposta5;
        
    }
    
    
        //Historia da internet
    
        public static int Internet(){
        
        Scanner entrada = new Scanner(System.in);
        
        int resposta6 = 0;
        
        //declarar alternativas
        
        List alternativas = new ArrayList();
        
        alternativas.add("Comercialização e geração de renda");
        alternativas.add("Interligar laboratorios de pesquisas");//resposta certa
        alternativas.add("Melhorar a comunicação entre empresas");
        alternativas.add("Conectar países de diferentes continentes");
        
        
        System.out.println("A internet foi criada em 1969, nos Estados Unidos. "
                + "E era chamada de Arpanet, \nera tinha como função interligar "
                + "laboratórios de pesquisa. \nNo ano de criação um dos maiores "
                + "feitos da epoca foi o primeiro e-mail enviado na historia.\n" 
                + "E essa rede pertencia ao Departamento de Defesa norte-americano. "
                + "\nO mundo vivia o auge da Guerra Fria, A Arpanet era uma garantia "
                + "de que a comunicação entre militares e ciencistas persistiria, "
                + "\nmesmo em caso de bombardeio.\n" 
                + "Mas o nome internet só começou a ser utilizado "
                + "a partir de 1982 \nquando o uso se expandiu para outros "
                + "países como, Holanda, Dinamarca e Suécia.\n" 
                + "Por quase Duas decadas apenas os cientistas tinham poder "
                + "para usar a internet, \nsomente em 1987 foi "
                + "liberado para uso comercial.\n" 
                + "No Brasil, a exploração comercial foi liberada em 1995. "
                + "\nUniversidades como as federais do Rio Grande do Sul e do "
                + "Rio de Janeiro estavam conectadas a rede desde 1989.");
        
            //embaralhar alternativas
        
            Collections.shuffle(alternativas);
            
            System.out.println("\nQual era a principal função da criação da internet?\n");
            
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            
            System.out.println("Escolha a alternativa: ");
            String resposta = entrada.next();
            
            switch(resposta){
                case"a":
                case"A":
                    if(alternativas.get(0).equals("Interligar laboratorios "
                    + "de pesquisas")){
                        System.out.println("Resposta certa!");
                        resposta6 = 1;
                        System.out.println("\nParabens voce recuperou os cartões de dados");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("Interligar laboratorios "
                    + "de pesquisas")){
                        System.out.println("Resposta certa!");
                        resposta6 = 1;
                        System.out.println("\nParabens voce recuperou os cartões de dados");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("Interligar laboratorios "
                    + "de pesquisas")){
                        System.out.println("Resposta certa!");
                        resposta6 = 1;
                        System.out.println("\nParabens voce recuperou os cartões de dados");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("Interligar laboratorios "
                    + "de pesquisas")){
                        System.out.println("Resposta certa!");
                        resposta6 = 1;
                        System.out.println("\nParabens voce recuperou os cartões de dados");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
            }
            return resposta6;
            
        }
         
        //segunda pergunta internet
        
        public static int Internet2(){
            
            Scanner entrada = new Scanner(System.in);
            
            int resposta7 = 0;
            
            //declarar alternativas
            
            List alternativas = new ArrayList();
        
        alternativas.add("1990");
        alternativas.add("1985");
        alternativas.add("1987");//resposta correta
        alternativas.add("1993");
        
            Collections.shuffle(alternativas);
            
            System.out.println("\nEm qual ano foi liberado o uso "
            + "comercial da internet?");
            
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            
            System.out.println("Escolha a alternativa: ");
            String resposta1 = entrada.next();
            
            switch(resposta1){
                case"a":
                case"A":
                    if(alternativas.get(0).equals("1987")){
                        System.out.println("Resposta certa!");
                        resposta7 = + 1;
                        System.out.println("\nParabens voce recuperou os réles");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("1987")){
                        System.out.println("Resposta certa!");
                        resposta7 = + 1;
                        System.out.println("\nParabens voce recuperou os réles");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("1987")){
                        System.out.println("Resposta certa!");
                        resposta7 = + 1;
                        System.out.println("\nParabens voce recuperou os réles");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("1987")){
                        System.out.println("Resposta certa!");
                        resposta7 = + 1;
                        System.out.println("\nParabens voce recuperou os réles");
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
            }
        
        return resposta7;
        
    }
            
        public static void main(String[]args){
        
            Scanner input = new Scanner(System.in);
        
            int opcao;
        
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
        + "em cada fase há uma pergunta dissertativa, caso o jogador acerte,\n "
        + "conseguirá uma peça do computador, no final, será informado quantas\n "
        + "peças o jogador conseguiu, e se com elas será possível ligar o computador.\n");
                    break;
                case 2:
                    System.out.println("Iniciando jogo");
                    int resposta1 = Eniac();
                    int resposta2 = Calculadora();
                    int resposta3 = Calculadora2();
                    int resposta4 = Cobol();
                    int resposta5 = Cobol2();
                    int resposta6 = Internet();
                    int resposta7 = Internet2();

                    if(resposta1 == 1){
                System.out.println("\nVocê recuperou os painéis");
            }
            if(resposta2 == 1){
                System.out.println("\nVocê recuperou os tubos de vácuo");
            }
            if(resposta3 == 1){
                System.out.println("\nVocê recuperou os interruptores");
            }
            if(resposta4 == 1){
                System.out.println("\nVocê recuperou os capacitores");
            }
            if(resposta5 == 1){
                System.out.println("\nVocê recuperou as válvulas");
            }
            if(resposta6 == 1){
                System.out.println("\nVocê recuperou os cartões de dados");
            }
            if(resposta7 == 1){
                System.out.println("\nVocê recuperou os réles");
            }
            
            int placar = resposta1 + resposta2 + resposta3 + resposta4 + resposta5 + resposta6 + resposta7;
            
            if(placar >= 5){
                System.out.println("\nPARABENS!!! Você ganhou o jogo e o computador ligou novamente");
            }else{
                System.out.println("\nTENTE NOVAMENTE!!! Infelizmente o computador ainda não está funcionando");
            }
                    
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
                    System.exit(0);
                    break;
                default:
                    System.out.println("Você escolheu uma opção inválida! ");
            }
        } while (opcao != 4);
            
       
    }}
