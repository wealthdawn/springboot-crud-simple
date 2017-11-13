package com.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * 
 * @author zheng
 *
 * 2017年9月20日
 */
@SpringBootApplication
@MapperScan("com.test.mapper")          //mapper映射器扫描包路径          相当于在具体的mapper类上写了@Mapper
public class Application extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		/*控制banner是否显示在控制台
		 * SpringApplication app=new SpringApplication(Application.class);
		app.setBannerMode(Banner.Mode.LOG);
		app.run(args);
		*/
		   
		
		//打包需要以下代码   begin
	   /*   Properties properties = new Properties();  
	      InputStream in = Application.class.getClassLoader().getResourceAsStream("application.properties");  
	      try {
			properties.load(in);
		} catch (IOException e) {
			e.printStackTrace();
		}  
	      SpringApplication app = new SpringApplication(Application.class);  
	      app.setDefaultProperties(properties);  
	      app.run(args);  */
		}
	
	/* @Override  
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {  
	        builder.sources(this.getClass());  
	        return super.configure(builder);  
	    }  */
	 //打包代码结束                end
}