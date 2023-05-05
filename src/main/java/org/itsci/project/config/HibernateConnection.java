//package org.itsci.project.config;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.itsci.project.model.*;
//
//import java.util.Properties;
//
//public class HibernateConnection {
//    public static SessionFactory sessionFactory;
//    static String url = "jdbc:mysql://localhost:3306/it411db?characterEncoding=UTF-8";
//    static String uname = "root";
//    static String pwd = "1234";
//
//    public static SessionFactory doHibernateConnection() {
//        Properties database = new Properties();
//        database.setProperty("hibernate.hbm2ddl.auto", "create"); //หลังจากสร้างตารางแล้วให้เอาออก
//        database.setProperty("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
//        database.setProperty("hibernate.connection.username", uname);
//        database.setProperty("hibernate.connection.password", pwd);
//        database.setProperty("hibernate.connection.url", url);
//        database.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
//        Configuration cfg = new Configuration()
//                .setProperties(database)
//                .addPackage("model")
//                .addAnnotatedClass(Student.class)
//                .addAnnotatedClass(Adviser.class)
//                .addAnnotatedClass(Category.class)
//                .addAnnotatedClass(Project.class)
//                .addAnnotatedClass(Projectchapter.class)
//                .addAnnotatedClass(Abstract.class)
//                .addAnnotatedClass(Video.class);
//        StandardServiceRegistryBuilder ssrb = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
//        sessionFactory = cfg.buildSessionFactory(ssrb.build());
//        return sessionFactory;
//    }
//}
