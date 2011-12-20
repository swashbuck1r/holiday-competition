package bees.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.management.ManagementFactory;

/**
 * Greatness goes here. Or not - the choice is yours.
 */
public class App extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double loadAvg = ManagementFactory.getOperatingSystemMXBean().getSystemLoadAverage();
        resp.getWriter().print(loadAvg * 10);
    }
}
