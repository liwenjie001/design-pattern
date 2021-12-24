package ml.lwj.flyweight;

class ConcreteWebSite extends WebSite {
    // 内部状态
    private String type = ""; // 文章发布的形式
    @Override
    public void use(User user) {
        System.out.println("网站的发布形式：" +type + "在使用。。。 使用者是" + user.getName());
    }

    public ConcreteWebSite(String type) {
        this.type = type;
    }
}
