package hibernateCfgClass;

import org.hibernate.*;
import org.hibernate.cfg.*;

class HbmSessionFactory {
	
	public static SessionFactory factory(Object[] classes) {
        
		Configuration config = new Configuration();

        config.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        config.setProperty("hibernate.connection.driver_class", "org.postgresql.Driver");
        config.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/estudosjava"); 
        config.setProperty("hibernate.connection.username", "postgres");
        config.setProperty("hibernate.connection.password", "postgres");
        config.setProperty("hibernate.show_sql", "true");           

       	for (int index = 0; index < classes.length; index++)        
       		config.addClass(classes[index].getClass());

        return config.buildSessionFactory();
	}
}