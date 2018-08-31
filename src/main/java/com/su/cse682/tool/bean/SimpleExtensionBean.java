package com.su.cse682.tool.bean;

import org.springframework.beans.factory.InitializingBean;

import java.util.List;

/**
 *  Strategy Pattern tool
 *  xxxService(Interface) extends SimpleExtensionBean
 *  xxxServiceImpl implement xxxService and register to SimpleExtensionBeanManager
 *  @see SimpleExtensionBeanManager
 *  @author yirong.wang
 */
public interface SimpleExtensionBean extends InitializingBean {
    default <T extends SimpleExtensionBean> Class<T> getExtensionInterfaceClass(){
        Class<?> currentClazz = this.getClass();
        Class<?> [] classes = currentClazz.getInterfaces();
        while (classes.length == 0) {
            currentClazz = currentClazz.getSuperclass();
            classes = currentClazz.getInterfaces();
        }
        for (Class clazz : classes) {
            if (SimpleExtensionBean.class.isAssignableFrom(clazz)) {
                return clazz;
            }
        }
        throw new RuntimeException("Not a SimpleExtensionBean" + this.getClass().getName());
    }

    /**
     * Every Strategy should return its name (Usually a enum name)
     * @return
     */
    List<String> applicationScenes();

    /**
     * Register to SimpleExtensionBeanManager
     */
    @Override
    default void afterPropertiesSet(){
        SimpleExtensionBeanManager.register(this);
    }

}