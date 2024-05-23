package cn.jeeweb.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * All rights Reserved, Designed By www.jeeweb.cn
 *
 * @version V1.0
 * @package cn.jeeweb.web
 * @title: Web启动入口
 * @description: Web启动入口
 * @author: 王存见 https://blog.csdn.net/u012943767/article/details/79360748
 * @date: 2018/5/22 14:56
 * @copyright: 2017 www.jeeweb.cn Inc. All rights reserved.
 */
@ComponentScan({"cn.jeeweb.ui.tags","cn.jeeweb.ui","cn.jeeweb.beetl.tags","cn.jeeweb.generator"})
@SpringBootApplication
@EnableAutoConfiguration
public class GeneratorBootApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(GeneratorBootApplication.class, args);
    }
}

