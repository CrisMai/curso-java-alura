package herdadoconta;

public class TesteSaca {
	
	public static void main(String[] args) throws SaldoInsuficienteException {
        Conta conta = new ContaCorrente(123, 321);

        conta.deposita(200.0);
        
        try {
        	
        	conta.saca(250.0);	
        } catch (Exception ex) {
        	
        	System.out.println("Ex: " + ex.getMessage());  	
        }
        
        System.out.println(conta.getSaldo());
    }

}
