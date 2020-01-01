package controleurs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cadeaux.metiers.CadeauRemote;
import cadeaux.entities.Cadeau;
import cadeaux.entities.Fournisseur;

@WebServlet("/CadeauControleur")
public class CadeauControleur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public CadeauControleur() {
		super();

	}

	private @EJB CadeauRemote cadeauRemote;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String nomCadeau = request.getParameter("cadeau");
		String nomFournisseur = request.getParameter("fournisseur");
		String numTel = request.getParameter("tel_fournisseur");
		Cadeau cadeau = null;
		try {
			Fournisseur fournisseur = new Fournisseur(nomFournisseur, numTel);
			cadeau = cadeauRemote.ajouterCadeau(nomCadeau, fournisseur);
		} catch (Exception e) {
			e.printStackTrace();
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h3>Cadeau ajouté avec succès</h3>");
		out.println("Cadeau: " + "Nom : " + cadeau.getNomCadeau() + "<br>Fournisseur: " + cadeau.getNomCadeau()
				+ "<br>Telephone " + cadeau.getFourn().getNom() + "<br>Fournisseur tel: " + cadeau.getFourn().getNoTel());
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
