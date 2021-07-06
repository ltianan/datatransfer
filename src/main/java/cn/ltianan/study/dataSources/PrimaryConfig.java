package cn.ltianan.study.dataSources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
 
import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Map;
 
/**
 * 第一个数据源连接类，默认数据源
 */
@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    entityManagerFactoryRef="entityManagerFactoryPrimary",
    transactionManagerRef="transactionManagerPrimary",
    basePackages= {"cn.ltianan.study.repository.primaryRepository"})//扫描jpa的sql语句的包
public class PrimaryConfig {
 
    @Autowired
    @Qualifier("primaryDataSource")
    private DataSource primaryDataSource;
 
 
    @Autowired(required=false)
    private JpaProperties jpaProperties;
 
 
    @Primary
    @Bean(name = "entityManagerPrimary")
    public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
        return entityManagerFactoryPrimary(builder).getObject().createEntityManager();
    }
 
    @Primary
    @Bean(name = "entityManagerFactoryPrimary")
    public LocalContainerEntityManagerFactoryBean entityManagerFactoryPrimary (EntityManagerFactoryBuilder builder) {
        return builder
            .dataSource(primaryDataSource)
            //设置实体类所在位置
            .packages("cn.ltianan.study.domain","cn.ltianan.study.dto")
            
            .persistenceUnit("primaryPersistenceUnit")
            .properties(getVendorProperties())
            .build();
    }
 
 
    //1.5.x版本的与2.0.x版本的配置这里不同
    private Map<String, String> getVendorProperties() {
        /**
         * springboot1.5.x版本的方式jpaProperties.getHibernateProperties(new DataSource());
         * springboot2.0.x版本的阿方式jpaProperties.getHibernateProperties(new HibernateSettings());
         */
//        return jpaProperties.getHibernateProperties(new HibernateSettings());
    	return jpaProperties.getProperties();
    }
 
    @Primary
    @Bean(name = "transactionManagerPrimary")
    public PlatformTransactionManager transactionManagerPrimary(EntityManagerFactoryBuilder builder) {
        return new JpaTransactionManager(entityManagerFactoryPrimary(builder).getObject());
    }
 
}