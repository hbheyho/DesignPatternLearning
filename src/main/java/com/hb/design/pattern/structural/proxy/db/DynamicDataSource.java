package com.hb.design.pattern.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
/**
 * @Author: HB
 * @Description: 分库的实现 - 把数据分布存储到不同的数据库中
 * @CreateDate: 11:35 2020/2/12
 */

public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }
}
