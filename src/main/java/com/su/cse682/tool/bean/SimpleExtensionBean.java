package com.su.cse682.tool.bean;

import org.springframework.beans.factory.InitializingBean;

import java.util.List;

/**
 *
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

    List<String> applicationScenes();

    @Override
    default void afterPropertiesSet(){
        SimpleExtensionBeanManager.register(this);
    }

}