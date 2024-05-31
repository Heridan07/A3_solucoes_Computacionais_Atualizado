/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pessoas;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class Paciente extends Pessoa {

	private String celular;    
	
        
        
	//Classe Scanner	
        Scanner sc = new Scanner (System.in);
        
        //Construtor Vazio
	public Paciente() {
		super();
	}
        
        
        //Construtor
	public Paciente(String nome, String cpf, String rg, Character sexo, String dataNasc, String celular) {
		super(nome, cpf, rg, sexo, dataNasc);
		this.celular = celular;
	}
        
        
        //Declaracao da arrayList para armazenar todos os objetos cadastrados 
          
        public ArrayList<Paciente> listPacientes = new ArrayList<>();
       
        
        //REVER	- metodo personalizado para cadastrar novo paciente
        public void cadastrarPaciente(Scanner sc) {   	
           
            
            System.out.println("Informe os dados do novo paciente: "); 
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
            System.out.print("Celular: ");
            String celular = sc.next();
            this.celular = celular;		

                  
                    
            listPacientes.add(new Paciente(this.nome,this.cpf,this.rg,this.sexo,this.dataNasc,this.celular)); 


            System.out.println("Paciente cadastrado: ");
            System.out.println(this); 
            System.out.println(); 
                    
            
        }
        
        
        
         public void editarCadastroDePaciente(){
             
             
            int opcao;
    
                System.out.println("Escolha uma das opções:");
                System.out.println();
                System.out.println("Editar dados cadastrais[1].");
                System.out.println("Excluir cadastro[2].");
                System.out.println();
                System.out.print("Selecione: ");
                opcao =sc.nextInt();

                switch(opcao) {

                    case 1://Para editar cadastro
                       

                     break;


                   case 2://Para excluir cadastro  
                   System.out.println("Informe o CPF:"); 

                   String excluirPaciente=sc.next();

                   for (int i = 0; i < listPacientes.size(); i++) {
                       if (listPacientes.get(i).getCpf().equals(excluirPaciente)) {
                         listPacientes.remove(i);
                       }
                   }
                   break;
                }
             
             
        
        }

        
        public void relacaoPacientes() {
            
        int opcao;
       
        System.out.println("Escolha uma das opções:");
        System.out.println();
        System.out.println("Buscar Paciente[1].");
        System.out.println("Imprimir relação de pacientes[2].");
        System.out.println();
        System.out.print("Selecione: ");
        opcao =sc.nextInt();
       
        switch(opcao) {
            
        case 1:
            
        System.out.println("Insira o nome de um Paciente: ");
        
        String buscar = sc.next();
        boolean encontrado = false;
        
        for (Paciente p: listPacientes){
            if (p.getNome().equalsIgnoreCase(buscar)) {
                encontrado = true;
                System.out.println("Paciente encontrado:");
                System.out.println(p);
                
            }
        }
        if (!encontrado) {
            System.out.println("Paciente não encontrado.");
        }
        
        break;
        
        
        case 2:
            
         System.out.println("Lista de Pacientes:");
         
            for (int i = 0; i < listPacientes.size(); i++) {
                
            System.out.println(listPacientes.get(i));		
            System.out.println();
            
            }
        break;
        
        
        default: //caso escolham uma opcao inexistente
          System.out.println("Opção inválida, tente novamente.");
          break;
        
        }
            
    }
        
       


        public void teste(){
            
             //Objetos cadastrados atomaticamnete.
             
            System.out.println("Cadastramento automático para teste: ");
                        System.out.println("-----------------------------------------------------------------");
            listPacientes.add(new Paciente("Amos Santos", "11111111111", "1111111111", 'M', "03/01/2000", "999999999"));
            listPacientes.add(new Paciente("Juliana", "22222222222", "222222", 'M', "28/12/1992", "999999999"));
            listPacientes.add(new Paciente("Miguel", "33333333333", "222222", 'M', "03/01/2000", "999999999"));
            listPacientes.add(new Paciente("Nair", "44444444444", "222222", 'M', "03/01/2000", "999999999"));
            listPacientes.add(new Paciente("Yule", "55555555555", "222222", 'M', "03/01/2000", "999999999"));
            listPacientes.add(new Paciente("Joao", "66666666666", "222222", 'M', "03/01/2000", "999999999"));
            listPacientes.add(new Paciente("Maria", "777777777777", "222222", 'M', "03/01/2000", "999999999"));

            for(Paciente p: listPacientes){
                System.out.println(p);
            }
                      System.out.println("-----------------------------------------------------------------");

            System.out.println();


        }
        
        
        
        //Métodos Get e Set
	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
    
    
}
