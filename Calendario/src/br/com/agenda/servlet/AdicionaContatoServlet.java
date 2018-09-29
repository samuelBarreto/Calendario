package br.com.agenda.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.agenda.dao.ContatoDao;
import br.com.agenda.modelo.Contato;

/**
 * Servlet implementation class AdicionaContatoServlet
 */
@WebServlet("/adicionaContato")
public class AdicionaContatoServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//busca o writer
		PrintWriter out = response.getWriter();
		
		//busando os parâmetros no request
		String nome = request.getParameter("nome");
		String projeto = request.getParameter("projeto");
		String email = request.getParameter("email");
		String dataEmTexto = request.getParameter("dataNascimento");
		String dataEmTextoFinal = request.getParameter("dataFinal");
		
		Calendar dataNascimento = null;
		Calendar dataFinal = null;
		
		//fazendo a conversão da data
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTexto);
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
			
			Date fimData = new SimpleDateFormat("dd/MM/yyyy").parse(dataEmTextoFinal);
			dataFinal = Calendar.getInstance();
			dataFinal.setTime(fimData);
			
		} catch (ParseException e) {
			out.println("Erro de conversão da data");
			return;
		}
		
		Contato contato = new Contato();
		contato.setNome(nome);
		contato.setProjeto(projeto);
		contato.setEmail(email);
		contato.setDataNascimento(dataNascimento);
		contato.setDataFinal(dataFinal);
		//salva o contato
		ContatoDao dao = new ContatoDao();
		dao.adiciona(contato);
		
		RequestDispatcher rd = request.getRequestDispatcher("/contato-adicionado.jsp");
		rd.forward(request, response);
	}

}
