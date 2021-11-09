package com.seenons.wastebackend.rest.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This class <description of functionality>
 *
 * @author jipderksen
 */

public class Config implements WebMvcConfigurer {
  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
      .allowedMethods("GET", "POST", "PUT", "DELETE")
      .allowedOrigins("*");
  }

  /**
   * Necessary to serve static content
   *
   * @param registry
   */
  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    // for static folder
    registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
    // for swagger
    registry.addResourceHandler("swagger-ui.html")
      .addResourceLocations("classpath:/META-INF/resources/");
    registry.addResourceHandler("/webjars/**")
      .addResourceLocations("classpath:/META-INF/resources/webjars/");
  }
}
