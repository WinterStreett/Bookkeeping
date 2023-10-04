### Bookkeeping
目标是基于Springboot实现一个简单的记账本，记录每笔支出的金额，信息，时间等信息。

技术细节
- 前端待定
- Springboot做后端
- docker-compose部署多容器(springboot+mysql)

进度记录
- 2023/10/4: 简易实现了后端，测试了docker-compose的部署过程，可以同时部署后端应用和mysql容器，docker-compose依赖名为`Mysql_Data`的volume，需要提前在docker中创建。