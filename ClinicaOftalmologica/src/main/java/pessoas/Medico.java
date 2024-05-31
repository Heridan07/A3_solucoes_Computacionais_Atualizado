/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pessoas;

import java.util.ArrayList;
import java.util.Scanner;

public class Medico extends Pessoa {

	private String crm;
        
         //Classe Scanner:
        Scanner sc = new Scanner(System.in);
        
        
        //Declaraçao da arrayList para armazenar todos os objetos cadastrados.
        public ArrayList<Medico> listMedicos = new ArrayList<>(); 
        
        //Construtor Vazio
	public Medico() {
		super();
	}
        //Construtor
	public Medico(String nome, String cpf, String rg, Character sexo, String dataNasc, String crm) {
		super(nome, cpf, rg, sexo, dataNasc);
		this.crm = crm;
	}
        
       
       

        
     //MÉTODOS PERSONALIZADOS:
     
    public void cadastrarMedico(Scanner sc){   	
    	System.out.println("Informe os dados do novo medico: "); 
    	System.out.print("Nome: "); 
    	String nome = sc.next();
    	this.nome = nome;
       	System.out.print("CPF: ");
       	String cpf = sc.next();
        this.cpf = cpf;
        System.out.print("RG: ");
        String rg = sc.next();
        this.rg = rg;
        System.out.print("Sexo: ");
        Character sexo = sc.next().charAt(0);
        this.sexo = sexo;
        System.out.print("Data de Nascimento: ");
        String dataNasc = sc.next();
        this.dataNasc = dataNasc;
        System.out.print("CRM: ");
        String crm = sc.next();
        this.crm = crm;		

    	 
        listMedicos.add(new Medico(this.nome,this.cpf,this.rg,this.sexo,this.dataNasc,this.crm)); 
    	
	   	System.out.println("Medico cadastrado! ");
		System.out.println(this); 
		System.out.println(); 		      
    }
    
    
    
    
    
    
    public void editarCadastroDeMedico(){ //Método para exclusão/alteração de dados cadastrais.
            int count=0;
        System.out.println("Informe o nome do Medico: ");
         String procurarMedico =sc.next();

               
        for (int i = 0; i < listMedicos.size(); i++) {
          if (listMedicos.get(i).getNome().equals(procurarMedico)) {
             
               count++;

              System.out.println("Selecione a atualização: "); 
              System.out.println("Atualizar nome:[1]");
              System.out.println("Atualizar cpf:[2]");
              System.out.println("Atualizar rg:[3]");
              System.out.println("Atualizar sexo:[4]");
              System.out.println("Atualizar Data de Nascimento:[5]");
              System.out.println("Atualizar CRM:[6]");
              System.out.println("Encerrar operação:[0]");

                  int selecao=sc.nextInt();


                  switch (selecao) {
                      case 1:
		          System.out.println("Informe o novo dado cadastral");
                          System.out.print("Nome: ");
                          String nome = sc.next();
                          listMedicos.get(i).setNome(nome);
                          break;
                      case 2:
		          System.out.println("Informe o novo dado cadastral");
                          System.out.print("CPF: ");
                          String cpf = sc.next();
                          listMedicos.get(i).setCpf(cpf);
                          break;
                      case 3:
			  System.out.println("Informe o novo dado cadastral");
                          System.out.print("RG: ");
                          String rg = sc.next();
                          listMedicos.get(i).setRg(rg);
                          break;
                      case 4:
		          System.out.println("Informe o novo dado cadastral");
                          System.out.print("Sexo: ");
                          Character sexo = sc.next().charAt(0);
                          listMedicos.get(i).setSexo(sexo);
                          break;
                      case 5:
			  System.out.println("Informe o novo dado cadastral");
                          System.out.print("Data de Nascimento: ");
                          String dataNasc = sc.next();
                          listMedicos.get(i).setDataNasc(dataNasc);
                          break;
                      case 6:
			  System.out.println("Informe o novo dado cadastral");
                          System.out.print("Celular: ");
                          String crm = sc.next();
                          listMedicos.get(i).setCrm(crm);
                          break;
                      case 0:
                          System.out.println("Operação encerrada.");
                          break;

                      default:
                          break;

                  }

                 System.out.println("Dados do médico atualizados com sucesso!");

          }
          else {
              
              if(count!=0){

              System.out.println("Médico não encontrado.");
              
              }
            }

             
        }  
                 
        
        
     }
    
    
    
    
    
    public void excluirMedico(){
        
    System.out.println("Informe o CRM:"); 

           String excluirMedico=sc.next();

           for (int i = 0; i < listMedicos.size(); i++) {
               if (listMedicos.get(i).getCrm().equals(excluirMedico)) {
                 listMedicos.remove(i);
               }
           }
           
    
    }
    

    
    //REVER- Método personalizado para listar todos os médicos
    public void listarMedico(){
        
        int opcao;
       
        
        System.out.println("Escolha uma das opções:");
        System.out.println();
        System.out.println("Buscar médico especifico[1].");
        System.out.println("Imprimir relação de médicos[2].");
        System.out.println();
        System.out.print("Selecione: ");
        opcao =sc.nextInt();
       
        switch(opcao) {
            
        case 1:
            
        System.out.println("Insira o nome de um médico: ");
        
        String buscar = sc.next();
        boolean encontrado = false;
        
        for (Medico m: listMedicos){
            if (m.getNome().equalsIgnoreCase(buscar)) {
                encontrado = true;
                System.out.println("Médico encontrado:");
                System.out.println(m);
                
            }
        }
        if (!encontrado) {
            System.out.println("Médico não encontrado.");
        }
        
        break;
        
        
        case 2:
        for(Medico m: listMedicos){
        	System.out.println(m.toString());
        }
        break;
        
        
        default: //caso escolham uma opcao inexistente
          System.out.println("Opção inválida, tente novamente.");
          break;
        
        }
        
       
    }
    
    
    
    
     //Métodos Get e Set
	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}
    
}
