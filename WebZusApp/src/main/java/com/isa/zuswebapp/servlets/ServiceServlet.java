package com.isa.zuswebapp.servlets;

import com.isa.zuswebapp.freemarker.TemplateSupplier;
import com.isa.zuswebapp.model.OrderDao;
import com.isa.zuswebapp.model.OrderDaoBean;
import freemarker.template.Template;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@WebServlet("service")
public class ServiceServlet extends HttpServlet {

    Logger logger = Logger.getLogger(getClass().getName());

    Template template;


    @Inject
    OrderDaoBean orderDAO;

    private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("primary");


    public void init(){

        try{
            template = TemplateSupplier.createTemplate(getServletContext(), "main.ftlh");
        }catch (IOException ex){
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {


        response.setContentType("text/html;charset=UTF-8");
        Map<String, Object> data = new HashMap();
        PrintWriter printWriter = response.getWriter();

        printWriter.print("test");



        EntityManager entityManager = entityManagerFactory.createEntityManager();
        printWriter.print(entityManager.find(OrderDaoBean.class, 1));


      /*  data.put("content", "contents/service-panel");

        try{
            template.process(data, printWriter);
        }catch (TemplateException ex){
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }*/

    }


}
