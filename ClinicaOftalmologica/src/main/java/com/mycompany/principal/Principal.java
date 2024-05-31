/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;
    import operacoes.*;
    import pessoas.*;

    import java.util.Scanner;
   
public class Principal {

    public static void main(String[] args) {
      
       //Classes instanciadas
        Paciente novoPaciente = new Paciente();
        Medico novoMedico = new Medico();
        Consulta novaConsulta = new Consulta();	
        
	//Classe Scanner	
        Scanner sc = new Scanner (System.in);

	novoPaciente.teste();//Para iniciar o sistema cadastrando automaticamente 7 objetos da classe Paciene.
        
        while (true) {
        	System.out.println("*** MENU ***");	
        	System.out.println();              
        	System.out.println("[1] Cadastrar novo paciente.");	
        	System.out.println("[2] Editar cadastro de paciente existente.");
                System.out.println("[3] Excluir Cadastro de paciente");
                System.out.println("[4] Ver relação de pacientes.");
            
        	System.out.println(); 
        	System.out.println("[5] Cadastrar novo medico.");				
        	System.out.println("[6] Editar cadastro de medico existente.");
                System.out.println("[7] Excluir cadastro de médico");
                System.out.println("[8] Ver relação de medicos.");
            
        	System.out.println();          
        	System.out.println("[9] Agendar nova consulta.");	
        	System.out.println("[10] Editar agendamento existente.");  
                System.out.println("[11] Excluir consulta");
                System.out.println("[12] Ver relação de consultas.");
            
        	System.out.println(); 
        	System.out.println("[0] Encerrar programa.");	
        	System.out.println();          
        	System.out.print("Digite a opção desejada:");
                
               
        	//entrada da opção escolhida:
        	int op = sc.nextInt();       
        	System.out.println();
                
    
        	switch(op) {
                    
        	case 1: //opção 1-Cadastrar novo paciente
                            
                     novoPaciente.cadastrarPaciente(sc);
                    
                    break;
                    
                case 2://Editar cadastro
                    
                    novoPaciente.editarCadastroDePaciente();
                    
                    break;
                    
 
                case 3: //opção 3-Ver relação de pacientes
        		novoPaciente.excluirPaciente();
                    break;
                    
                    
                    
                    
                case 4 :
                    novoPaciente.relacaoPacientes();
                    
                  break;
                    
                  
                  
                  
                    
                case 5: //Cadastrar novo médico
                    
                    novoMedico.cadastrarMedico(sc);
                    break;
                    
                case 6://Editar cadastro de médico
                   
                   novoMedico.editarCadastroDeMedico();
                    break;
                    
                case 7: //Relação de médicos
                    novoMedico.excluirMedico();
                    
                    break;
                    
                case 8:
                    novoMedico.listarMedico();
                   break;
                    
                    
                    
                    
                    
                    
                case 9: //Cadastrar nova consulta
                   
                    novaConsulta.agendarConsulta(sc);
                    break;
                
                case 10:
                    
                    novaConsulta.editarConsulta();
                    break;
                
                case 11:
                    
                    novaConsulta.excluirConsulta();
                    break;
                    
                case 12:
                    novaConsulta.listarConsultas();
                    break;
                    
                    
                case 0: //Encerrar programa
                     System.out.println("Encerrando o programa...");
                     sc.close();
                     return;
                     

                default: //caso escolham uma opcao inexistente
                     System.out.println("Opção inválida, tente novamente.");
                     break;
       		}
 
        	
        }
        
    }
}


