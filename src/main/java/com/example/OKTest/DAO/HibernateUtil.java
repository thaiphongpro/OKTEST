package com.example.OKTest.DAO;

import java.util.Properties;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
    private static final SessionFactory FACTORY;

    static {
        Configuration conf = new Configuration();
//        conf.addAnnotatedClass(Employee.class);

        Properties properties = new Properties();
        properties.put(Environment.DIALECT, "org.hibernate.dialect.SQLServerDialect");
        properties.put(Environment.DRIVER, "com.microsoft.sqlserver.jdbc.SQLServerDriver");
        properties.put(Environment.URL, DbMetadata.getConnectString());
        properties.put(Environment.SHOW_SQL, "true"); // Hiển thị câu lệnh SQL thực hiện
        // properties.put(Environment.HBM2DDL_AUTO, "create"); // tự động sinh db

        conf.setProperties(properties);
        // conf.addAnnotatedClass(ViecCanLam.class);

        ServiceRegistry registry = new StandardServiceRegistryBuilder()
                .applySettings(conf.getProperties())
                .build();
        FACTORY = conf.buildSessionFactory(registry);
    }

    public static SessionFactory getFactory() {
        return FACTORY;
    }

    public static synchronized Session getSession() {
        return FACTORY.openSession();
    }

    public static void main(String[] args) {
        getFactory();
        System.out.println("Hibernate run successfully!");
    }
}
