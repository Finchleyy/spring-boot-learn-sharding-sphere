package com.ypw.shardingsphere.manual.config;

import com.alibaba.druid.util.StringUtils;
import io.shardingsphere.api.algorithm.sharding.PreciseShardingValue;
import io.shardingsphere.api.algorithm.sharding.standard.PreciseShardingAlgorithm;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class OrderIdShardingAlgorithm implements PreciseShardingAlgorithm<Long> {
    /*@Resource(name = "hashRing")
    HashRing<Integer> hashRing;*/

    /**
     * 精确分片算法，用于=和IN
     *
     * @param availableTargetNames available data sources or tables's names
     * @param shardingValue        sharding value
     * @return sharding result for data source or table's name
     */
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Long> shardingValue) {
        //默认插到第一张表
        String databaseName = availableTargetNames.stream().findFirst().get();
        for (String dbName : availableTargetNames) {
            //选取数据库后缀和id关联关系
            String dbSuffix = dbName.substring(dbName.lastIndexOf("_") + 1);
            //直接 对 128 取余
            Long id = shardingValue.getValue() % 128;
            if (StringUtils.equals(dbSuffix, id + "")) {
                databaseName = dbName;
            }
        }
        return databaseName;
    }

}