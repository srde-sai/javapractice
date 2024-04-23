package srd.srdesai.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import srd.srdesai.repository.CourseRepo;
import srd.srdesai.service.CourseService;

@Configuration
@ComponentScan("srd.srdesai")
public class AppConfig {


    //    @Bean
//    public CourseRepository getCourseRepository() {
//        return new CourseRepository();
//    }
//
//    @Bean("courseService")
//    public CourseService getCourseService() {
//        return new CourseService(getCourseRepository());
//    }

}
