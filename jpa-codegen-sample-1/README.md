# SpringBoot1.x

基本没什么变化，但是由于SpringBoot1.x和SpringBoot2.x有一些改变，所以我们的代码模板需要修改下

## [repository.ftl](https://github.com/gcdd1993/jpa-codegen-sample/blob/master/jpa-codegen-sample-1/src/test/resources/template/repository.ftl)

![](https://i.loli.net/2019/09/10/Q3tDkFSrjVPcTYW.png)

可以发现，SpringBoot2.x挺坑的，将QuerydslPredicateExecutor变更为QueryDslPredicateExecutor，就修改了一个字母，但是项目升级的话，这些可都是要修改的！

## [service.ftl](https://github.com/gcdd1993/jpa-codegen-sample/blob/master/jpa-codegen-sample-1/src/test/resources/template/service.ftl)

![](https://i.loli.net/2019/09/10/wWMNqypr9Z678bP.png)

## [controller.ftl](https://github.com/gcdd1993/jpa-codegen-sample/blob/master/jpa-codegen-sample-1/src/test/resources/template/controller.ftl)

![](https://i.loli.net/2019/09/10/W3oKjcxaXeNslhO.png)