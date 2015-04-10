package servlet;

import serviceImpl.ProjectServiceImpl;
import service.ProjectService;

import javax.servlet.annotation.WebServlet;


/**
 * Created by tamiand on 26/03/2015.
 */
@WebServlet(name="ProjectServlet", urlPatterns="/home")
public class ProjectServlet {

    private ProjectService projectServiceImpl = new ProjectServiceImpl();
    private static String idInstance;

}
