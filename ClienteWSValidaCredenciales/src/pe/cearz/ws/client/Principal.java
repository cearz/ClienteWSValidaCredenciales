package pe.cearz.ws.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import pe.cearz.ws.bean.BeanLogin;
import pe.cearz.ws.service.ImplLogin;
import pe.cearz.ws.service.ImplLoginProxy;

public class Principal {

	public static void main(String[] args) throws IOException {
		ImplLogin iface = new ImplLoginProxy("http://localhost:8080/ValidaCredenciales/services/ImplLogin");
		BeanLogin obj = new BeanLogin();
		obj.setUsuario("cearz2");
		obj.setPassword("admin");
		try {
			obj = iface.validaLogin(obj);
			if(obj.isStatus()){
				System.out.println("Bienvenido");
			}else{
				System.out.println(obj.getMensaje());
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String sURL = "http://freegeoip.net/json/"; //just a string

	    // Connect to the URL using java's native library
	    URL url;
		try {
			url = new URL(sURL);
		    HttpURLConnection request = (HttpURLConnection) url.openConnection();
		    request.connect();

		    // Convert to a JSON object to print data
		    JsonParser jp = new JsonParser(); //from gson
		    JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
		    JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object. 
		    String country_name = rootobj.get("country_name").getAsString(); 
		    System.out.println("ZIP CODE = " + country_name);

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}

}
