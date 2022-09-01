package fun.suder.designPattern.singleton;


/**
 * <span>Form File</span>
 * <p>Description</p>
 * <p>Copyright: Copyright (c) 2022 版权</p>
 * <p>Company:QQ 752340543</p>
 *
 * @author topsuder
 * @version v1.0.0
 * @DATE 2022/9/1-14:40
 * @Description
 * @see fun.suder.designPattern.singleton Design-pattern
 */
public class LazySingleton {

    public static void main(String[] args){

        final LazySingleton instance1 = LazySingleton.getInstance();
        System.out.println(instance1);

    }
    private volatile static LazySingleton instance = null;
    private LazySingleton() {
    }
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class){
                if (instance==null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }


}
