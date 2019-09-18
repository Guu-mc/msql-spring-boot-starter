package com.githup.mc.msql.spring.boot.starter;

import com.github.mc.msql.Start;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({Start.class})
public class MsqlAutoConfiguration {

}
