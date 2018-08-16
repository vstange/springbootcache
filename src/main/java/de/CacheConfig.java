package de;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * The explicit cache configuration can be used, but it isn't a must.
 * It should be defined as soon as the cache need to be transaction aware or
 * other cache libraries are used as well.
 *
 * @author Vincent Stange
 */
@Configuration
@Slf4j
public class CacheConfig {

//    @Bean
//    public EhCacheManagerFactoryBean ehCacheManagerFactory() {
//        EhCacheManagerFactoryBean cacheManagerFactoryBean = new EhCacheManagerFactoryBean();
//        cacheManagerFactoryBean.setConfigLocation(new ClassPathResource("ehcache2.xml"));
//        cacheManagerFactoryBean.setShared(true);
//        return cacheManagerFactoryBean;
//    }
//
//    @Bean
//    public EhCacheCacheManager ehCacheCacheManager() {
//        EhCacheCacheManager cacheManager = new EhCacheCacheManager();
//        cacheManager.setCacheManager(ehCacheManagerFactory().getObject());
//        cacheManager.setTransactionAware(false);
//        return cacheManager;
//    }

}
