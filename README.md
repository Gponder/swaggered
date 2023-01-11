`SpringFox`
必须配置 spring.mvc.pathmatch.matching-strategy=ant_path_matcher 是swagger的uri匹配规则不配置无法启动
swagger3 api访问地址为/swagger-ui/index.html
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>
`Mybatis`
必须配置datasource数据源
mapper-locations xml路径
camel-case是字段下划线连接转大写可以自行选择是否配置
需要jdbc
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>3.0.0</version>
</dependency>
`ModelMapper`
无需配置直接装配ModelMapper即可使用
<dependency>
    <groupId>com.github.jmnarloch</groupId>
    <artifactId>modelmapper-spring-boot-starter</artifactId>
    <version>1.1.0</version>
</dependency>