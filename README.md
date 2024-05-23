# jeeweb

代码生成器运行说明
-----------------------------------
* 代码生成器需要安装mysql数据库，并创建generator数据库。
* 执行jeeweb-generator/sql/mysql.sql脚本，生成数据库表。
* 修改jeeweb-generator/src/main/resources/application.properties文件，配置数据库连接信息。
* 执行jeeweb-generator/src/main/java/com/jfinal/gen/Generator.java文件，生成代码。
