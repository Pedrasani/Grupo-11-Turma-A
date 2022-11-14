package com.mycompany.jogo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class Jogopi {
    
    //historia do eniac
    
    public static int Eniac(){
        
        Scanner entrada = new Scanner(System.in);
        boolean acertou = false;
        int resposta1 = 0;
        
        List alternativas = new ArrayList();
        
        alternativas.add("30000");
        alternativas.add("300000"); // resposta certa
        alternativas.add("200000");
        alternativas.add("10000");
        
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
        
        do{
            Collections.shuffle(alternativas);
            
            System.out.println("O Projeto do ENIAC tinha uma forma de U, e pesava em torno \"\n" +
"                + \"\\nde 30 toneladas, você sabe me dizer qual é esse peso em quilos? ");
            System.out.println("a) " + alternativas.get(0));
            System.out.println("b) " + alternativas.get(1));
            System.out.println("c) " + alternativas.get(2));
            System.out.println("d) " + alternativas.get(3));
            
            System.out.println("");
            String resposta = entrada.next();
            
            switch(resposta){
                case"a":
                case"A":
                    if(alternativas.get(0).equals("300000")){
                        System.out.println("Resposta certa!");
                        acertou = true;
                        resposta1 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("300000")){
                        System.out.println("Resposta certa!");
                        acertou = true;
                        resposta1 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("300000")){
                        System.out.println("Resposta certa!");
                        acertou = true;
                        resposta1 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("300000")){
                        System.out.println("Resposta certa!");
                        acertou = true;
                        resposta1 = 1;
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
    
    public static int Calculadora(){
        
        Scanner entrada = new Scanner(System.in);
        
        int resposta2 = 0;
        
        List alternativas = new ArrayList();
        
        alternativas.add("1440");
        alternativas.add("1423"); //resposta certa
        alternativas.add("1427");
        alternativas.add("1430");
        
        
        System.out.println("\n Para comerçarmos essa nossa incrível aventura iremos voltar um pouquinho no tempo, \nvamos viajar para 3500 a.C.");
        System.out.println(" A primeira máquina de calcular foi o ábaco, que surgiu na antiga Mesopotâmia. \nOs primeiros ábacos eram desenhados no chão e depois colocavam as bolas de pedras para calcular, \nmas com o passar do tempo, passaram a ser construídos em tábuas de pedra ou mármore, \nonde se lapidam as letras e se colocava depois bolas de pedras, para poder fazer os cálculos.");
        System.out.println("\n Agora é com você, precisamos da sua ajuda para darmos prosseguimento a nossa história, conto com você nessa em.");
        
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
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("1423")){
                        System.out.println("Resposta certa!");
                        resposta2 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("1423")){
                        System.out.println("Resposta certa!");
                        resposta2 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("1423")){
                        System.out.println("Resposta certa!");
                        resposta2 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
            }
            
            
        
        alternativas.add("2330");
        alternativas.add("2342");
        alternativas.add("2334");//resposta correta
        alternativas.add("2298");
        
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
                        resposta2 = + 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("2334")){
                        System.out.println("Resposta certa!");
                        resposta2 = + 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("2334")){
                        System.out.println("Resposta certa!");
                        resposta2 = + 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("2334")){
                        System.out.println("Resposta certa!");
                        resposta2 = + 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
            }
        
        return resposta2;
        
    }
    
    public static int Cobol(){
        
        Scanner entrada = new Scanner(System.in);
        
        int resposta3 = 0;
        
        List alternativas = new ArrayList();
        
        alternativas.add("facilitar o controle de negocios");//resposta certa
        alternativas.add("criar programas para empresas");
        alternativas.add("atrair desenvolvedores para a linguagem");
        alternativas.add("projetar novas tecnologias");
        
        
        System.out.println("Criada em 1959, o Cobol é uma das linguagens de programação mais antigas do universo da computação.\n" +
                    "Ela surgiu quando um grupo de empresas de tecnologia, entre elas a IBM, e órgãos governamentais dos EUA se reuniram para \n"
                            + " criar uma linguagem de programação com objetivo de facilitaro controle dos negócios.\n" +
                    "Em 1968, a ANSI desenvolveu a primeira especificação padrão do Cobol. Isso significa que ele é compatível com diferentes \n"
                            + " plataformas e, por isso, os códigos escritos em Cobol podem ser compilados e executados em diversos sistemas.");
        
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
                        resposta3 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("facilitar o controle de negocios")){
                        System.out.println("Resposta certa!");
                        resposta3 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("facilitar o controle de negocios")){
                        System.out.println("Resposta certa!");
                        resposta3 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("facilitar o controle de negocios")){
                        System.out.println("Resposta certa!");
                        resposta3 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
            }
            
            
        
        alternativas.add("implementar mais uso dentro das empresas");
        alternativas.add("tornar compativel com diferentes plataformas");//resposta correta
        alternativas.add("facilitar o uso da linguagem");
        alternativas.add("deixar a tecnologia mais funcional");
        
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
                        resposta3 = + 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("tornar compativel com diferentes plataformas")){
                        System.out.println("Resposta certa!");
                        resposta3 = + 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("tornar compativel com diferentes plataformas")){
                        System.out.println("Resposta certa!");
                        resposta3 = + 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("tornar compativel com diferentes plataformas")){
                        System.out.println("Resposta certa!");
                        resposta3 = + 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
            }
        
        return resposta3;
        
    }
    
    
        //Historia da internet
    
        public static int Internet(){
        
        Scanner entrada = new Scanner(System.in);
        
        int resposta4 = 0;
        
        List alternativas = new ArrayList();
        
        alternativas.add("Comercialização e geração de renda");
        alternativas.add("Interligar laboratorios de pesquisas");//resposta certa
        alternativas.add("Melhorar a comunicação entre empresas");
        alternativas.add("Conectar países de diferentes continentes");
        
        
        System.out.println("Criada em 1959, o Cobol é uma das linguagens de programação mais antigas do universo da computação.\n" +
                    "Ela surgiu quando um grupo de empresas de tecnologia, entre elas a IBM, e órgãos governamentais dos EUA se reuniram para \n"
                            + " criar uma linguagem de programação com objetivo de facilitaro controle dos negócios.\n" +
                    "Em 1968, a ANSI desenvolveu a primeira especificação padrão do Cobol. Isso significa que ele é compatível com diferentes \n"
                            + " plataformas e, por isso, os códigos escritos em Cobol podem ser compilados e executados em diversos sistemas.");
        
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
                    if(alternativas.get(0).equals("Interligar laboratorios de pesquisas")){
                        System.out.println("Resposta certa!");
                        resposta4 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("Interligar laboratorios de pesquisas")){
                        System.out.println("Resposta certa!");
                        resposta4 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("Interligar laboratorios de pesquisas")){
                        System.out.println("Resposta certa!");
                        resposta4 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("Interligar laboratorios de pesquisas")){
                        System.out.println("Resposta certa!");
                        resposta4 = 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
            }
            
            
        
        alternativas.add("1990");
        alternativas.add("1985");
        alternativas.add("1987");//resposta correta
        alternativas.add("1993");
        
            Collections.shuffle(alternativas);
            
            System.out.println("\nEm qual ano foi liberado o uso comercial da internet?");
            
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
                        resposta4 = + 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"b":
                case"B":
                    if(alternativas.get(1).equals("1987")){
                        System.out.println("Resposta certa!");
                        resposta4 = + 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"c":
                case"C":
                    if(alternativas.get(2).equals("1987")){
                        System.out.println("Resposta certa!");
                        resposta4 = + 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                case"d":
                case"D":
                    if(alternativas.get(3).equals("1987")){
                        System.out.println("Resposta certa!");
                        resposta4 = + 1;
                    }else{
                        System.out.println("Resposta incorreta");
                    }
                    break;
                    
                default:
                    System.out.println("Escolha invalida");
            }
        
        return resposta4;
        
    }
    
    
    public static void main(String[]args){
       
    }
