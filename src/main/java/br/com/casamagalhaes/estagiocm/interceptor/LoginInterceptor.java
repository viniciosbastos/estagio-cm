package br.com.casamagalhaes.estagiocm.interceptor;

import br.com.caelum.vraptor.InterceptionException;
import br.com.caelum.vraptor.Intercepts;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.core.InterceptorStack;
import br.com.caelum.vraptor.interceptor.Interceptor;
import br.com.caelum.vraptor.ioc.RequestScoped;
import br.com.caelum.vraptor.resource.ResourceMethod;
import br.com.casamagalhaes.estagiocm.component.LoggedUser;
import br.com.casamagalhaes.estagiocm.controller.LoginController;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Intercepts
@RequestScoped
public class LoginInterceptor implements Interceptor {

    @Autowired
    private LoggedUser loggedUser;

    @Autowired
    private Result result;

    @Autowired
    private HttpServletRequest httpRequest;

    @Override
    public void intercept(InterceptorStack stack, ResourceMethod method, Object resourceInstance) throws InterceptionException {
        String uri = httpRequest.getRequestURI();
        if (!(Objects.equals(uri, "/") || Objects.equals(uri, "/login"))
                && loggedUser.getName() == null)
            result.redirectTo(LoginController.class).login();
        else {
            stack.next(method, resourceInstance);
        }
    }

    @Override
    public boolean accepts(ResourceMethod method) {
        return true;
    }
}
