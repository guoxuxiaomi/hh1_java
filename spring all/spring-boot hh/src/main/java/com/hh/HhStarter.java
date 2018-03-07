package com.hh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HhStarter {



    /**
     * 除了在Eclipse中右键执行run，还可以使用命令：mvn spring-boot:run
     *
     * 运行之后在浏览器中输入：http://localhost:8080/。最后发现这两种的结果一样。
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(HhStarter.class,args);
    }
}
