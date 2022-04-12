import java.util.Scanner;



public class Main3{
    static void método1(){
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Digite o nome do usuario: ");
        String nome = scan1.nextLine();

        System.out.println("Digite a senha: ");
        int senha = scan1.nextInt();

        if(nome.contains("carlinda") && (senha == 3456) ){
            System.out.println("Usuario logado");
        } else{
            System.out.println("Usuario ou senha errados");
        }
    
        scan1.close();
    }

    static void método2(){
        Scanner scan2 = new Scanner(System.in);

        System.out.print("Digite uma nota: ");
        float nota1 = scan2.nextFloat();
    
        System.out.println("Digite uma nota: ");
        float nota2 = scan2.nextFloat();


        System.out.println("Digite uma nota: ");
        float nota3 = scan2.nextFloat();


        System.out.println("Digite uma nota: ");
        float nota4 = scan2.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4)/4;

        System.out.println("a média das notas digitadas é: "+ media );

        scan2.close();
    }  

    static void método3(){
        
        System.out.println("Seja muito bem vindo");

      
    }  

    static void método4(){
        Scanner scan3 = new Scanner(System.in);

        System.out.println("Digite o valor da variação do tempo: ");
        float tempo = scan3.nextFloat();

        System.out.println("Digite o valor da variação do espaço: ");
        float espaço = scan3.nextFloat();

        float velocidade = espaço/tempo;
        System.out.println("A velocidade média é:" + velocidade);


        scan3.close();
    }      

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite um número de 1 a 4: ");
        int num1 = scan.nextInt();

        if(num1 == 1){
            método1();    

        }
        if(num1 == 2){
            método2();

        }            
        if(num1 == 3){
            método3();

        }
        if(num1 == 4){
            método4();
            
        }
        if(num1 > 4){
            System.out.println("Digite um número valido de 1 a 4"); 

        }

        scan.close();
    }

}
