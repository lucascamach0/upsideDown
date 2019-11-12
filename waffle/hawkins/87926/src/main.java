import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class main {

	public static void main(String[] args) {
		//escreva o código aqui		
	}
	
	/**
	 * N�O PRECISA MEXER NESSE M�TODO!
	 * M�todo para tentar destrancar a porta do primeiro andar. Nela se encontra uma trava com um c�digo de 5 digitos numericos.
	 * @param uma senha de 5 digitos numericos em formato String.
	 * @return se a senha estiver correta, retorna 'Unlocked', caso a senha estiver errada, a porta continua trancada e retorna 'Locked'
	 **/
	public static String PortaPrimeiroAndar(String senha) {
		try {
			URL url = new URL("http://localhost:8000/portaPrimeiroAndar/" + senha);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            
            in.close();
            
            //retorna Senha incorreta ou Senha correta
            return response.toString();
            
		} catch (Exception ex) {
			System.out.println("ERRO ao tentar abrir porta");
		}
		
		return null;
	}
	
	/**
	 * N�O PRECISA MEXER NESSE M�TODO!
	 * M�todo para tentar destrancar a porta do segundo andar. Nela se encontra uma trava com um c�digo de 5 letra, pelo visto apenas vogais.
	 * @param uma senha de 5 letras em formato String.
	 * @return se a senha estiver correta, retorna 'Unlocked', caso a senha estiver errada, a porta continua trancada e retorna 'Locked'
	 **/
	public static String PortaSegundoAndar(String senha) {
		try {
			URL url = new URL("http://localhost:8000/portaSegundoAndar/" + senha);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			con.setRequestMethod("GET");
			
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();

            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            
            in.close();
            
            //retorna Senha incorreta ou Senha correta
            return response.toString();
            
		} catch (Exception ex) {
			System.out.println("ERRO ao tentar abrir porta");
		}
		
		return null;
	}
}
