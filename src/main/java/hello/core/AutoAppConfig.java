package hello.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        basePackages = "hello.core.member",
        basePackageClasses = AutoAppConfig.class, //hello core 부터 찾는 것
        //지정하지 않으면 default 값은 -> componentScan을 붙인 class의 패키지 부터 시작해서
        //하위패키지를 다 찾는다.
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
        //appConfig를 빼기위해 excludeFilters 사용
)
public class AutoAppConfig {

}
