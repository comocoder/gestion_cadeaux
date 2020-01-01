package controleurs;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cadeaux.entities.Adresse;
import cadeaux.entities.Client;
import cadeaux.metiers.ClientRemote;

@WebServlet("/ClientControleur")
public class ClientControleur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ClientControleur() {
		super();

	}

	private @EJB ClientRemote remote;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			String nom = request.getParameter("nom");
			String prenom = request.getParameter("prenom");
			String tel = request.getParameter("tel");
			String rue = request.getParameter("rue");
			int codePostal = Integer.parseInt(request.getParameter("cp"));
			String ville = request.getParameter("ville");

			
			Client client = null;
			try {
				Adresse adr = new Adresse(rue, codePostal, ville);
				client = remote.ajouterClient(nom, prenom, tel, adr);

			} catch (Exception e) {
				e.printStackTrace();
			}

			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<h3>Client ajouté avec succès</h3>");
			out.println("Client: " + "Nom : " + client.getNom() + "<br>Prénom: " + client.getPrenom() + "<br>Telephone "
					+ client.getTel() + "<br>Adresse: " + rue + " " + ville + " " + codePostal);
			// request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);;
	}
		


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// doGet(request, response);
	}

}