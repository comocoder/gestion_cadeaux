package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.Adresse;
import entities.Client;
import metier.ClientRemote;


@WebServlet("/ClientController")
public class ClientController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ClientController() {
        super();
        
    }

    @EJB ClientRemote remote;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String tel = request.getParameter("tel");
		String rue = request.getParameter("rue");
		String cp = request.getParameter("cp");
		int codePostal = Integer.parseInt(cp);
		String ville = request.getParameter("ville");
		
		Client client = null;
		try {
			Adresse adr = new Adresse(rue, codePostal, ville);
			client = remote.ajouterClient(nom, prenom, tel, adr);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>Client ajouté avec succès</h3>");
		out.println("Client: "+ "Nom : " + client.getNom()+ "<br>Prénom: " + client.getPrenom() + "<br>Telephone " + client.getTel() + "<br>Adresse: "+ rue + " " + ville + " " + codePostal);	
		//request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);;
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
	}

}
