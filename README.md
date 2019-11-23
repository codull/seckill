
# seckill
 基于Spring+SpringMVC+Mybatis+redis的高并发秒杀系统
___
## 介绍
该项目是SSM项目很好的入门学习例子，后端采用redis进行缓存优化
前端采用bootstrap，非本人编写
___
## 技术栈
后端：Spring+SpringMVC+Mybatis+redis+MySql 
前端：bootstrap
___
## 目录结构
```
|-- [main]                   			 // 源码
    -- [java/com/anthony1314]            // 组件代码
    	-- [dao]                		 //数据库操作接口
    		-- [cache]                	 //关于redis接口
    	-- [dto]                		 //数据传输对象
    	-- [entity]                 	 //实体类
    	-- [enums]               	 	 //枚举信息（秒杀信息返回结果）
    	-- [exception]                   //秒杀异常
    	-- [service]                	 //秒杀事务
    	-- [utils]                		 //工具类（redis操作）
    	-- [web]                 		 //前端控制器
    -- [resources]               	     //配置资源文件
    	-- [mapper]                		 //mybatis相关映射配置
    	-- [spring]                		 //spring相关配置
|-- [test/java/com/anthony1314]   		 //测试类
```
