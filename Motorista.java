
package cnh;

public class Motorista {
    private String nome;
    private char tipoCNH;
    private int ano_nasc;
    private int idade;
    
        public Motorista(String nome, int ano_nasc){
            this.nome=nome;
            this.ano_nasc=ano_nasc;
        }
        public String getNome(){
            return nome;
        }
        public int getAno_nasc(){
            return ano_nasc;
        }
        
        public char getTipoCNH(){
            return tipoCNH;
        }
        
        int idade(int ano, int ano_atual){
            idade=ano_atual-ano;
             return idade;
        }
        
        public int getIdade(){
            return idade;
        }

       char getTipoCNH(char cnh){
             if(cnh=='A'){
                System.out.println("Tipo da CNH: Moto.");
            }else if(cnh=='B'){
                System.out.println("Tipo da CNH: Carro.");
            }else if(cnh=='Z'){
                System.out.println("Tipo da CNH: Moto e Carro");
            }else{
                 System.out.println("Tipo da CNH: -");
            }
             return tipoCNH;
        }
        
        
        public void setTipoCNH(char CNH){
            if(CNH=='A'){
                System.out.println("Mudou CNH para tipo A.");
            }else if(CNH=='B'){
                System.out.println("Mudou CNH para tipo B.");
            }else if(CNH=='Z'){
                System.out.println("Mudou CNH para tipo Z");
            }else{
                System.out.println("Mudou CNH para tipo -");
            }
            
        }
}
