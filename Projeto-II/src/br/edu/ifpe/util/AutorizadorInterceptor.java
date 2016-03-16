package br.edu.ifpe.util;

import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AutorizadorInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object controller)
			throws Exception {

		String uri = request.getRequestURI();
		if (uri.contains("bootstrap")
				|| uri.contains("css")
				|| uri.contains("png")
				|| uri.contains("js")
				|| uri.contains("404")
				|| uri.contains("error")
				|| uri.contains("login")
				|| uri.endsWith("index")
				|| uri.endsWith("efetuarLogin")
			    || uri.endsWith("Projeto-II/")
				) {

			return true;
		}

		if (request.getSession().getAttribute("usuarioLogado") != null) {

			return true;
		}

		response.sendRedirect("/Projeto-II");
		return false;
	}

}
