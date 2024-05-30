/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;
    import Operacoes.*;
    import Pessoas.*;

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
            System.out.println("[3] Ver relação de pacientes.");
            
        	System.out.println(); 
        	System.out.println("[4] Cadastrar novo medico.");				
        	System.out.println("[5] Editar cadastro de medico existente.");
            System.out.println("[6] Ver relação de medicos."); 
            
        	System.out.println();          
        	System.out.println("[7] Agendar nova consulta.");	
        	System.out.println("[8] Editar agendamento existente.");  
            System.out.println("[9] Ver relação de consultas."); 
            
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
        		novoPaciente.relacaoPacientes();
                    break;
                    
                    
                case 4: //Cadastrar novo médico
                    
                    novoMedico.cadastrarMedico(sc);
                    break;
                    
                case 5://Editar cadastro de médico
                   
                   novoMedico.editarCadastroDeMedico();
                    break;
                    
                case 6: //Relação de médicos
                    
                    novoMedico.listarMedico();
                    break;
                    
                case 7: //Cadastrar nova consulta
                   
                    novaConsulta.agendarConsulta(sc);
                    break;
                
                case 8:
                    
                    novaConsulta.editarConsulta();
                    break;
                
                case 9:
                    
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


