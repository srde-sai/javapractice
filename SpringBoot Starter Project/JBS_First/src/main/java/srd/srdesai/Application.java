package srd.srdesai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import srd.srdesai.config.AppConfig;
import srd.srdesai.repository.CourseRepo;
import srd.srdesai.service.CourseService;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        CourseService service = appContext.getBean("courseService", CourseService.class);
        CourseRepo repo = appContext.getBean("courseRepo", CourseRepo.class);
        System.out.println(service.list1());
        System.out.println(repo.findAll());
    }
}
