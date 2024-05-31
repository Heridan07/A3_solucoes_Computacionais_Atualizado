/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operacoes;

import pessoas.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Consulta {
	private String pacienteNome;
	private String medicoNome;
	private String data;
	private String horario;
        
         //Classe Scanner:
        Scanner sc = new Scanner(System.in);
        
        //Declaracao da arrayList para armazenar todos os objetos cadastrados
	public ArrayList<Consulta> listConsultas = new ArrayList<>();
	
        
        //Construtor vazio
	public Consulta() {
		super();
	}
        //Construtor
	public Consulta(String pacienteNome, String medicoNome, String data, String horario) {
		super();
		this.pacienteNome = pacienteNome;
		this.medicoNome = medicoNome;
		this.data = data;
		this.horario = horario;
	}


      


//REVER	- metodo personalizado para agendar nova consulta
	public void agendarConsulta(Scanner sc){
    	System.out.println("Agendamento de consulta: "); 
    	System.out.print("Medico: "); 
    	String medicoNome = sc.next();
    	this.medicoNome = medicoNome;
        System.out.print("Paciente: ");
        String pacienteNome = sc.next();
        this.pacienteNome = pacienteNome;	
        System.out.print("Data: ");
        String data = sc.next();
        this.data = data;
        System.out.print("Horario: ");
        String horario = sc.next();
        this.horario = horario;

    	listConsultas.add(new Consulta(this.medicoNome,this.pacienteNome,this.data,this.horario));   
    	
        System.out.print("Consulta agendada! ");
        System.out.println(this); 
        System.out.println(); 	
    }
        
        
        public void editarConsulta(){
        int count=0;
        System.out.println("Informe o nome do Médico responsável: ");
         String procurarConsulta =sc.next();

               
        for (int i = 0; i < listConsultas.size(); i++) {
          if (listConsultas.get(i).getMedicoNome().equals(procurarConsulta)) {
             
               count++;

              System.out.println("Selecione a atualização: "); 
              System.out.println("Atualizar nome:[1]");
              System.out.println("Atualizar cpf:[2]");
              System.out.println("Atualizar rg:[3]");
              System.out.println("Atualizar sexo:[4]");
              System.out.println("Atualizar Data de Nascimento:[5]");
              System.out.println("Atualizar celular:[6]");
              System.out.println("Encerrar operação:[0]");

                  int selecao=sc.nextInt();


                  switch (selecao) {
                      case 1:

                          System.out.print("Nome do Médico: ");
                          String MedicoNome = sc.next();
                          listConsultas.get(i).setMedicoNome(MedicoNome);
                          break;
                      case 2:
                          System.out.print("Nome do Paciente: ");
                          String PacienteNome = sc.next();
                          listConsultas.get(i).setPacienteNome(PacienteNome);
                          break;
                      case 3:
                          System.out.print("Data: ");
                          String Data = sc.next();
                          listConsultas.get(i).setData(Data);
                          break;
                      case 4:
                          System.out.print("Horário: ");
                          String Horario = sc.next();
                          listConsultas.get(i).setHorario(Horario);
                          break;
                      
                      case 0:
                          System.out.println("Operação encerrada.");
                          break;

                      default:
                          break;

                  }

                 System.out.println("Dados do paciente atualizados com sucesso!");

          }
          else {
              
              if(count!=0){

              System.out.println("Paciente não encontrado.");
              
              }
          }

             
            }  
        
        }
        
        
        public void excluirConsulta(){
         System.out.println("Informe o nome do Medico:"); 

        String excluirConsulta=sc.next();

        for (int i = 0; i < listConsultas.size(); i++) {
            if (listConsultas.get(i).getMedicoNome().equals(excluirConsulta)) {
              listConsultas.remove(i);
            }
        }
        
        }

        //REVER	- metodo personalizado para listar todas as consultas
	public void listarConsultas(){
            
         int opcao;
       
        
        System.out.println("Escolha uma das opções:");
        System.out.println();
        System.out.println("Buscar Consulta[1].");
        System.out.println("Imprimir relação de consultas[2].");
        System.out.println();
        System.out.print("Selecione: ");
        opcao =sc.nextInt();
       
        switch(opcao) {
            
        case 1:
            
        System.out.println("Insira o mome do Paciente: ");
        
        String buscar = sc.next();
        boolean encontrado = false;
        
        for (Consulta c: listConsultas){
            if (c.getPacienteNome().equalsIgnoreCase(buscar)) {
                encontrado = true;
                System.out.println("Consulta encontrada:");
                System.out.println(c);
                
            }
        }
        if (!encontrado) {
            System.out.println("Consulta não encontrada.");
        }
        
        break;
        
        
        case 2:
        for(Consulta c: listConsultas){
        	System.out.println(c.toString());
        }
        break;
        
        
        default: //caso escolham uma opcao inexistente
          System.out.println("Opção inválida, tente novamente.");
          break;
        
        }
        
            
        }

        
        
      //Métodos Get e Set
	public String getPacienteNome() {
		return pacienteNome;
	}


	public void setPacienteNome(String pacienteNome) {
		this.pacienteNome = pacienteNome;
	}


	public String getMedicoNome() {
		return medicoNome;
	}


	public void setMedicoNome(String medicoNome) {
		this.medicoNome = medicoNome;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}

        
}