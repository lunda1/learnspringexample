package com.liupeng.example30url;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.net.URL;
import java.util.List;
/**
 * Created by liupeng on 2017/1/20.
 */
public class TestEhcache {
    private static final Logger LOG = LoggerFactory.getLogger(TestEhcache.class);
    public static void main(String[] args) {
        URL url = new TestEhcache().getClass().getResource("/hello.xml");
        CacheManager manager = CacheManager.create(url);

        //创建Cache对象
        Cache cache = manager.getCache("ecache1");

        //cache缓存名称
        LOG.info("cache name: " + cache.getName());
        System.out.println("cache name: " + cache.getName());

        //将对象放入缓存
        Element element  = new Element("hello", "world");
        Element element2 = new Element("aaa", "222");
        Element element3 = new Element("bbb", "333");
        //Element element4 = new Element("aaa", "444");
        Element element5 = new Element("ddd", "555");
        cache.put(element);
        cache.put(element2);
        cache.put(element3);
        //cache.put(element4);//key相同时会被覆盖
        cache.get("hello");
        cache.get("hello");
        cache.get("aaa");

        cache.put(element5);

        //cache缓存对象个数
        System.out.println("size: " + cache.getSize());

        // 从cache中取回元素
        //System.out.println("hello: " + cache.get("hello").getObjectValue());

        List<String> keys = cache.getKeys();//所有缓存对象的key

        // 遍历所有缓存对象
        for(String key : keys ){
            System.out.println(key + " : " + cache.get(key));
        }

        // 从Cache中移除一个元素
        System.out.println(cache.remove("hello"));
        System.out.println(cache.remove("hello2"));

        for(String key : keys ){
            System.out.println(key + " : " + cache.get(key));
        }

        //移除所有缓存对象
        cache.removeAll();

        System.out.println("size: " + cache.getSize());

        manager.shutdown();
    }

}
