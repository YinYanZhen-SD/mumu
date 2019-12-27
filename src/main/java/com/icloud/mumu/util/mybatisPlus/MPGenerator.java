package com.icloud.mumu.util.mybatisPlus;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

/**
 * mybatis-plus 代码生成器
 * @author YINYANZHEN
 * @description: TODO
 * @date 2019/12/18 17:05
 */
public class MPGenerator {

    public static void main(String[] args) {

        String tableName = "system_user";//表名
        String tablePrefix = "system_";//表前缀
        String moduleName = "system";//模块名
        String author = "yinyanzhen";//作者


        //数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setDbType(DbType.MYSQL)
            .setDriverName("com.mysql.cj.jdbc.Driver")
            .setUrl("jdbc:mysql://localhost:3306/mumuData?useUnicode=true&characterEncoding=utf-8&autoReconnect=true&failOverReadOnly=false&useSSL=true&serverTimezone=Asia/Shanghai")
            .setUsername("root")
            .setPassword("root");

        //数据库表配置
        StrategyConfig sc = new StrategyConfig();
        sc.setCapitalMode(true)//是否大写命名
            .setColumnNaming(NamingStrategy.underline_to_camel)//列驼峰命名
            .setNaming(NamingStrategy.underline_to_camel)//表驼峰命名
            .setEntityLombokModel(true)//是否为lombok模型
            .setInclude(tableName)//需要包含的表名，允许正则表达式
            .setTablePrefix(new String[]{tablePrefix})//表前缀
            .setSuperEntityClass("com.icloud.mumu.util.EntityUtilBase")//继承实体父类
            .setSuperEntityColumns(new String[]{"id","del_flag","create_time","create_user","update_time","update_user"})//公共字段
            .setEntityColumnConstant(false)//是否生成字段常量
            .entityTableFieldAnnotationEnable(true)//生成字段注解
            .setEntityBuilderModel(false)//建造者模式
            .setLogicDeleteFieldName("del_flag")
            ;
        //包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.icloud.mumu")//父包名
            .setModuleName(moduleName);//模块名
        //全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");//获取路径
        gc.setOutputDir(projectPath + "/src/main/java")//输出路径
            .setFileOverride(false)//是否覆盖
            .setAuthor(author)//作者
            .setOpen(false)//是否打开文件夹
            .setBaseResultMap(true)//resultMap
            .setBaseColumnList(true)//开启BaseColumnList
            ;

        //代码生成
        AutoGenerator mpg = new AutoGenerator();
        mpg.setTemplateEngine(new FreemarkerTemplateEngine())//切换模板为Freemarker
            .setDataSource(dsc)//数据源配置
            .setStrategy(sc)//数据库表配置
            .setPackageInfo(pc)//包配置
            .setGlobalConfig(gc)//全局配置
            ;
        //执行
        mpg.execute();
    }

}
