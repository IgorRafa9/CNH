
package cnh;


import java.util.Calendar;
import java.util.Scanner;
public class CnhMain {

    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c.getWeekYear());
        
        Scanner key=new Scanner(System.in);
        char Cnh;
        String mud="s";
        String mud2;
        
        System.out.println("Informe o nome:");
        String nome=key.next();
        
        
        System.out.println("Informe o ano de nascimento");
        int nasc=key.nextInt();
        
        Motorista cnh=new Motorista(nome,nasc);
        cnh.idade(nasc, c.getWeekYear());
        if(cnh.idade(nasc,c.getWeekYear())>18){
            System.out.println("Escolha o tipo de CNH:");
            System.out.println("A - Moto.");
            System.out.println("B - Carro.");
            System.out.println("Z - Carro e Moto.");
            Cnh=key.next().toUpperCase().charAt(0);
            System.out.println("---------------------Informações do Cadastrado------------------------------");
            System.out.println("Nome: "+cnh.getNome()+". Ano de Nascimento:"+cnh.getAno_nasc());
            cnh.getTipoCNH(Cnh);   
            
            System.out.println("-----------------------------------------------------");
            System.out.println("Deseja trocar carteira?");
            System.out.println("S-Sim");
            System.out.println("N-Não");
            mud2=key.next();
            if(mud2.equalsIgnoreCase(mud)){
                System.out.println("Informe qual?");
                System.out.println("A - Moto.");
                System.out.println("B - Carro.");
                System.out.println("Z - Carro e Moto.");
                Cnh=key.next().toUpperCase().charAt(0);
                System.out.println("---------------------Informações do Cadastrado------------------------------");
                System.out.println("Nome: "+cnh.getNome()+". Ano de Nascimento:"+cnh.getAno_nasc());
                cnh.setTipoCNH(Cnh);
                }else{
                    System.out.println("Operações Finalizadas.");
                }
        }else{
            System.out.println("Você é menor. Não pode tirar carteira.");
        }
    }
}
      
    
