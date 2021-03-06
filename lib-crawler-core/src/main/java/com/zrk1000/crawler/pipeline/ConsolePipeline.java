package com.zrk1000.crawler.pipeline;


import com.alibaba.fastjson.JSONObject;
import com.zrk1000.crawler.executor.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 打印到控制台的管道
 * User: zhouRongKang
 * Date: 2017/8/31
 * Time: 10:25
 */
public class ConsolePipeline implements Pipeline {

    private static Logger logger = LoggerFactory.getLogger(ConsolePipeline.class);

    @Override
    public void process(Context context) {
        context.getTicket().getDomain();

        if(logger.isDebugEnabled()){
            logger.debug("'ConsolePipeline' Output to console -- >");
        }
        System.out.println("=========ConsolePipeline start=========");
        System.out.println(JSONObject.toJSONString(context,true));
        System.out.println("=========ConsolePipeline end===========");
    }

}
