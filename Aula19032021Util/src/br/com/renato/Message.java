package br.com.renato;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Message implements Serializable {

	
	private static final long serialVersionUID = -2723363051271966964L;
	
	
	private String user;
	private String message;
	
	private static List<Message> LstMessage= new ArrayList<Message>();
	
	public Message (String user, String message) {
		
		this.user = user;
		this.message = message;
	}
	
	public String getUsuario() {
		return user;
	}
	
	public void setUsuario (String user) {
		this.user = user;
	}
	
	public String getMesagem () {
		return message;
	}
	
	public void setMensagem (String message) {
		this.message = message;
	}
	
	public static List<Message> getListMessage (){
		return LstMessage;
	}
	
	public static void setLstMessage (Message msg) {
		LstMessage.add(msg);
	}
}
