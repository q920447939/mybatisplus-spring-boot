package com.baomidou.springboot.test.generator;

import com.baomidou.mybatisplus.generator.config.TemplateConfig;
import org.apache.velocity.VelocityContext;
import org.junit.Test;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * @Description:测试生成代码
 * @param:
 * @return:
 * @auther: liming
 * @date: 2018/5/22 11:34
 */
public class GeneratorServiceEntity {

    private  String packageName = "cn.withmes.ten.square.gathering";

    private String[] tableNames = {"tb_gathering","tb_usergath"};

    private String dbUrl = "jdbc:mysql://182.254.234.193:3308/tensquare_gathering";

    private String dbUserName = "root";

    private String dbPassWord ="123456";

    @Test
    public void generateCode() {
        boolean serviceNameStartWithI = false;//user -> UserService, 设置成true: user -> IUserService
        generateByTables(serviceNameStartWithI, packageName, tableNames);
    }

    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
      //  String dbUrl = "jdbc:mysql://127.0.0.1:3306/blissmall_msgcenter";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();

        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername(dbUserName)
                .setPassword(dbPassWord)
                .setDriverName("com.mysql.jdbc.Driver");


        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames).setRestControllerStyle(true);//修改替换成你需要的表名，多个表名传数组


        // 自定义实体，公共字段
        // strategyConfig.setSuperEntityColumns(new String[] { "test_id", "age" });
        // 自定义 mapper 父类
         strategyConfig.setSuperMapperClass(" cn.withmes.common.dal.BaseMapper");
        // 自定义 service 父类
         strategyConfig.setSuperServiceClass("cn.withmes.common.service.BaseService");
        // 自定义 service 实现类父类
         strategyConfig.setSuperServiceImplClass("cn.withmes.common.service.BaseServiceImpl");
        // 自定义 controller 父类
         strategyConfig.setSuperControllerClass("cn.withmes.common.web.BaseRestfulController");
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);// 表名生成策略
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setControllerMappingHyphenStyle(true);
        strategyConfig.entityTableFieldAnnotationEnable(true);


         //setFileOverride(true) 设置文件覆盖
        // setBaseResultMap(true) 此处设置生成xml模板里面的内容
        // setBaseColumnList(true) 此处设置生成xml模板里面的内容(返回列类型)
        // setActiveRecord(true) 看翻译是记录活动  没懂什么意思;
        config.setActiveRecord(false)
                .setAuthor("leegoo")
                .setOutputDir("d:\\codeGen")
                .setFileOverride(true).setControllerName("%sController").setBaseResultMap(true).setBaseColumnList(true).setEnableCache(false);

        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }

        //此处配置生成controller mapper 等模板 默认放在resouces/下
        // 如上任何一个模块如果设置 空 OR Null 将不生成该模块。
        TemplateConfig tc = new TemplateConfig();
        tc.setController("/templates/controller.java.vm");
         tc.setEntity("/templates/entity.java.vm");
         tc.setMapper("/templates/mapper.java.vm");
         tc.setXml("/templates/mapper.xml.vm");
         tc.setService("/templates/service.java.vm");
         tc.setServiceImpl("/templates/serviceImpl.java.vm");
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")
                ).setTemplate(tc).execute();
    }

    private void generateByTables(String packageName, String... tableNames) {
        generateByTables(true, packageName, tableNames);
    }
}
