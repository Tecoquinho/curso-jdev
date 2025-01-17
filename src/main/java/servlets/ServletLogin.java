package servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ModelLogin;

/*Os chamados Controller s�o as Servlets ou ServletLoginController*/
@WebServlet("/ServletLogin") /*Mapeamento de URL que vem da tela */
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ServletLogin() {
    }
    /*Recebe os dados pela url em parametros*/
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	/*Recebe os dados enviados pelo formulario*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		if (login != null && !login.isEmpty() && senha != null && !senha.isEmpty()) {
			ModelLogin modelLogin = new ModelLogin();
			modelLogin.setLogin(login);
			modelLogin.setSenha(senha);
		}else {
			RequestDispatcher redirecionar = request.getRequestDispatcher("index.jsp");
			request.setAttribute("msg", "Informe o Login e Senha");
			redirecionar.forward(request, response); //Redirecionamento para o index
		}
		
	}

}
