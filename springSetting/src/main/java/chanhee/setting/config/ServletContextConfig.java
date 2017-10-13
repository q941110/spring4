package chanhee.setting.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"chanhee.setting.controller"})
public class ServletContextConfig extends WebMvcConfigurerAdapter {
    /*
    // JSP viewResolver
    @Bean
    public ViewResolver viewResolver() {
         InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setViewClass(JstlView.class);
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }*/

//   @Override
//   public void addResourceHandlers(ResourceHandlerRegistry registry) {
//       registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");  //   webapp/resources 경로를 의미
//   }
    
    /*
    // Thymeleaf viewResolver
    @Bean
    public ViewResolver viewResolver(SpringTemplateEngine templateEngine) { 
       ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
       viewResolver.setTemplateEngine(templateEngine);
       
       return viewResolver;
    }

    @Bean
    public SpringTemplateEngine templateEngine(ITemplateResolver templateResolver) { 
       SpringTemplateEngine templateEngine = new SpringTemplateEngine();
       templateEngine.setTemplateResolver(templateResolver);
       
       return templateEngine;
    }

    @Bean
    public ITemplateResolver templateResolver() {   
       SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
       templateResolver.setPrefix("/WEB-INF/templates/");
       templateResolver.setSuffix(".html");
       templateResolver.setTemplateMode("HTML5");

       return templateResolver;
    }*/
   
   
/*   // Freemarker viewResolver
	@Bean 
	public FreeMarkerViewResolver freemarkerViewResolver() { 
		FreeMarkerViewResolver resolver = new FreeMarkerViewResolver(); 
		resolver.setCache(true); 
		resolver.setSuffix(".ftl"); 
       return resolver; 
	}
	
	@Bean 
	public FreeMarkerConfigurer freemarkerConfig() { 
	    FreeMarkerConfigurer freeMarkerConfigurer = new FreeMarkerConfigurer(); 
	    freeMarkerConfigurer.setTemplateLoaderPath("/WEB-INF/views/freemarker/");
	    return freeMarkerConfigurer; 
	}*/
   
   
   @Bean
   public TilesConfigurer tilesConfigurer(){
       TilesConfigurer tilesConfigurer = new TilesConfigurer();
       tilesConfigurer.setDefinitions(new String[] {"/WEB-INF/views/**/tiles.xml"});
       tilesConfigurer.setCheckRefresh(true);
       return tilesConfigurer;
   }

   @Override
   public void configureViewResolvers(ViewResolverRegistry registry) {
       TilesViewResolver viewResolver = new TilesViewResolver();
       registry.viewResolver(viewResolver);
   }
    
   @Override
   public void addResourceHandlers(ResourceHandlerRegistry registry) {
       registry.addResourceHandler("/static/**").addResourceLocations("/static/");
   }
}