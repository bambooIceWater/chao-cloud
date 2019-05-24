package com.chao.cloud.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.chao.cloud.common.config.web.EnableWeb;
import com.chao.cloud.common.extra.mybatis.annotation.EnableMybatisPlus;
import com.chao.cloud.common.extra.token.annotation.EnableFormToken;

/**
 * admin-后台管理系统
 * @功能：
 * @author： 薛超
 * @时间：2019年3月13日
 * @version 1.0.0
 */
@SpringBootApplication
@EnableCaching // 缓存
@EnableWeb // web
@EnableFormToken // 防止表单重复提交
@EnableMybatisPlus // 数据库插件-乐观锁
public class ChaoAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChaoAdminApplication.class, args);
    }

}
