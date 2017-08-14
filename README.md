# SSM框架的整合

目录结构：
1.控制器层
com.cms.controller

2.实体类
com.cms.entity

3.VO类(用于接受视图数据)
com.cms.dto

4.数据层DAO
com.cms.dao(存interface)
com.cms.mapper(存mapper.xml)
或者
com.cms.mapper(存interface和mapper.xml)


5.业务层(事务的控制在这一层，还有参数的判断)
com.cms.service
com.cms.service.impl

6.视图层

7.资源层
com.cms.config
db.properties
log4j.properties
或
com.cms.spring(放spring相关的配置文件)
spring-mvc.xml
spring-mybatis.xml
spring-aop.xml
spring-quartz.xml
spring-redis.xml


配置流程
web.xml配置dispatcherServlet顺便init-param配置spring-mvc.xml或者加载全部的spring-*.xml

配置mybatisConfig.xml 设置mybatis的一些全局设置

配置spring-mybatis
	设置加载db.properties
	配置数据源(看选择什么数据库连接池)
	配置管理SqlSessionFactory
	配置MapperScanner，由spring来生成mapper代理对象并且放到spring容器中作为Bean(如果xml和interface是分开的那么就要在配置sqlSessionFactoer的时候配置扫描xml文件)

配置spring-aop



坑爹
BeanDefinitionStoreException: Failed to read candidate component
这个错误是因为jdk1.8和spring3不匹配
重新换过一个spring包就OK了
