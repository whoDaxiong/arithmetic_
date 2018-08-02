package proxy.dynamic_proxy;

import java.io.File;

/**
 * 自定义代理类
 */
public class MyProxy {
    /**
     * 返回代理对象
     * @return
     */
    public static Object newProxyInstance(){
        String str = "package proxy.static_proxy;" +"\r\n"+
                "public class $Proxy0 implements Moveable {"+"\r\n"+
                "    private Moveable move;"+"\r\n"+
                "    public $Proxy0(Moveable move) {" +"\r\n"+
                "        super();"+"\r\n"+
                "        this.move = move;"+"\r\n"+
                "    }"+"\r\n"+
                "    @Override"+"\r\n"+
                "    public void move() {"+"\r\n"+
                "        long startTime = System.currentTimeMillis();" +"\r\n"+
                "        System.out.println(\"car runtime begin..\");" +"\r\n"+
                "        move.move();" +"\r\n"+
                "        long endTime = System.currentTimeMillis();" +"\r\n"+
                "        System.out.println(\"car running :\"+(endTime-startTime)+\"ms\");" +"\r\n"+
                "    }"+"\r\n"+
                "}";
        String filename = System.getProperty("user.dir")+"/bin/com/proxy/dynamic_proxy/$Proxy.java";
        File file = new File(filename);
        return null;
    }

    public static void main(String arg[]) {
        MyProxy myProxy = new MyProxy();
        myProxy.newProxyInstance();
    }
}
