package cn.yirenzhuang.common.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
public class DruidConfiguration {
    @Autowired
    private IDataSourceProperties dataSourceProperties;

    @Bean // 声明其为Bean实例
    @Primary // 在同样的DataSource中，首先使用被标注的DataSource
    public DataSource dataSource(DataSourceProperties dataSourcePropertiesOld) {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(dataSourcePropertiesOld.getUrl());
        datasource.setUsername(dataSourcePropertiesOld.getUsername());
        datasource.setPassword(dataSourcePropertiesOld.getPassword());
        datasource.setDriverClassName(dataSourcePropertiesOld.getDriverClassName());

        // configuration
        datasource.setInitialSize(dataSourceProperties.getInitialSize());
        datasource.setMinIdle(dataSourceProperties.getMinIdle());
        datasource.setMaxActive(dataSourceProperties.getMaxActive());
        datasource.setMaxWait(dataSourceProperties.getMaxWait());
        datasource.setTimeBetweenEvictionRunsMillis(dataSourceProperties.getTimeBetweenEvictionRunsMillis());
        datasource.setMinEvictableIdleTimeMillis(dataSourceProperties.getMinEvictableIdleTimeMillis());
        datasource.setValidationQuery(dataSourceProperties.getValidationQuery());
        datasource.setTestWhileIdle(dataSourceProperties.isTestWhileIdle());
        datasource.setTestOnBorrow(dataSourceProperties.isTestOnBorrow());
        datasource.setTestOnReturn(dataSourceProperties.isTestOnReturn());
        datasource.setPoolPreparedStatements(dataSourceProperties.isPoolPreparedStatements());
        datasource.setMaxPoolPreparedStatementPerConnectionSize(dataSourceProperties.getMaxPoolPreparedStatementPerConnectionSize());
        try {
            datasource.setFilters(dataSourceProperties.getFilters());
        } catch (SQLException e) {
            System.err.println("druid configuration initialization filter: " + e);
        }
        datasource.setRemoveAbandonedTimeout(dataSourceProperties.getRemoveAbandonedTimeout());
        datasource.setRemoveAbandoned(dataSourceProperties.isRemoveAbandoned());
        datasource.setConnectionProperties(dataSourceProperties.getConnectionProperties());
        return datasource;
    }

}
