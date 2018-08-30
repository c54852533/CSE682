package com.su.cse682.tool.bean;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/**
 *
 *  @author yirong.wang
 */
public abstract class SimpleExtensionBeanManager {
    private static final ConcurrentMap<String, SimpleExtensionBean> BEAN_CONCURRENT_MAP =
            new ConcurrentHashMap<>();

    public static void register(SimpleExtensionBean simpleExtensionBean) {
        List<String> applicationScenes = simpleExtensionBean.applicationScenes();
        for (String applicationScene : applicationScenes) {
            String id = generateId(simpleExtensionBean.getExtensionInterfaceClass(), applicationScene);
            BEAN_CONCURRENT_MAP.put(id, simpleExtensionBean);
        }
    }

    public static <T extends SimpleExtensionBean> T beanOf (Class<T> clazz, String bizType) {
        String id = clazz.getName() + "_" + bizType;
        return (T)BEAN_CONCURRENT_MAP.get(id);
    }


    private static <T extends SimpleExtensionBean> String generateId(Class<T> clazz, String bizType){
        return clazz.getName() + "_" + bizType;
    }


}

