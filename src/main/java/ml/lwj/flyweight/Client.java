package ml.lwj.flyweight;

public class Client {
    public static void main(String[] args) {
        // 创建一个工厂类
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        // 客户要一个以新闻形式发布的网站
        WebSite webSite = webSiteFactory.getWebSiteCategory("新闻");
        webSite.use(new User("新浪"));

        // 客户要一个以博客形式发布的网站
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("博客");
        webSite1.use(new User("微信"));

        System.out.println("网站的分类共=" + webSiteFactory.getWebSiteCount());
    }

}
