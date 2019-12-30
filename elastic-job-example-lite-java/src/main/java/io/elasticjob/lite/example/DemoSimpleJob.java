package io.elasticjob.lite.example;

import io.elasticjob.lite.api.ShardingContext;
import io.elasticjob.lite.api.simple.SimpleJob;

public class DemoSimpleJob implements SimpleJob {

    @Override
    public void execute(final ShardingContext context) {
        System.out.println("execute start: "+ context.toString());
        try {
            Thread.sleep(60*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("execute end: "+ context.toString());
    }
}
