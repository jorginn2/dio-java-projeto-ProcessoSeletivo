import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

		public static void main(String[] args) {
			String[] candidatos = {"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "JORGE"};
			
			for (String candidato : candidatos) {
				//chamar métodos 
			}
		}
		public static void analisarCandidato(double salarioPretendido) {
				
				double salarioBase = 2000.00;
				
				if(salarioBase>salarioPretendido) {
					System.out.println("LIGAR PARA O CANDIDATO");
				}else if(salarioBase == salarioPretendido) 
					System.out.println("LIGAR PARA REALIZAR CONTRA-PROPOSTA");
				else {
					System.out.println("AGUARDANDO RESULTADO OS DEMAIS CANDIDATOS");
				}		
		}
		public static void selecionarCandidatos() {
			String[] candidatos = {"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "JORGE"};
			
			int candidatosSelecionados = 0;
			int candidatoAtual = 0;
			double salarioBase = 2000.00;
			
			while(candidatosSelecionados<5 && candidatoAtual< candidatos.length) {
				String candidato=candidatos[candidatoAtual];
					double salarioPretendido = valorPretendido();	
			
			System.out.println("O candidato "+candidato+" solicitou este valor de salário "+salarioPretendido);
				if(salarioBase>=salarioPretendido) {
					System.out.println("O candidato "+candidato+" foi selecionado para a vaga!");
						candidatosSelecionados++;
				}
			candidatoAtual++;	
			}
		}
		public static void imprimirCandidatos() {
			String[] candidatos = {"FELIPE","MARCIA", "JULIA", "PAULO", "AUGUSTO"};
				
			System.out.println("Imprimindo a lista de candidatos informando o índice do elemento");
			
			for(int indice=0; indice<candidatos.length;indice++) {
				System.out.println("O candidato de número "+(indice+1)+" é o "+candidatos[indice]);
			}
			System.out.println("\nForma abreviada de iteração");
			
			for (String candidato : candidatos) {
				System.out.println("O candidato selecionado foi "+candidato);
			}
		}
		public static void entrarEmContato(String candidato) {
			int tentativasRealizadas = 1;
			boolean continuarTentando = true;
			boolean atendeuLigacao = false;
			
			do{
				atendeuLigacao = atender();
					continuarTentando = !atendeuLigacao;
				
				if(continuarTentando) 
					tentativasRealizadas++;
				else
					System.out.println("Contato com "+candidato+" realizado com sucesso!");
			}while(continuarTentando && tentativasRealizadas<=3);
		
			if(atendeuLigacao)
				System.out.println("Conseguimos contato com "+candidato+" na "+tentativasRealizadas+"a tentativa!");
			else
				System.out.println("Não conseguimos contato com "+candidato+ ", número de tentativas: "+tentativasRealizadas);
		}
		public static double valorPretendido() {
			return ThreadLocalRandom.current().nextDouble(1800,2000);
		}
		public static boolean atender() {
			return new Random().nextInt(3)==1;
		}
}


