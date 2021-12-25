package ml.lwj.flyweight;


import java.util.HashMap;

// 网站工厂类，根据需求返回一个网站
public class WebSiteFactory {
    // 集合 ，充当池的作用
    private HashMap<String,ConcreteWebSite> pool = new HashMap<>();

    // 根据网站的类型，返回一个网站，如果没有创建一个网站，并放到池中，并返回
    public WebSite getWebSiteCategory(String type) {
        if(!pool.containsKey(type)){
            // 就创建一个网站，并放到池中
            pool.put(type,new ConcreteWebSite(type));
        }
        return pool.get(type);
    }

    // 获取网站分类的总数(池中有多个网站类型)
    public int getWebSiteCount(){
        return pool.size();
    }
 }