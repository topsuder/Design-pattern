# Design-pattern
## 单例模式
>【懒汉模式】LazySingleton
```java
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
    //volatile关键字防止jvm指令重排序
    //1.分配空间
    //2.初始化
    //3.设置值
    private volatile static LazySingleton instance = null; 
    private LazySingleton() {
    }
    public static LazySingleton getInstance() {
        //DCL双重检查锁
        //外部判空防止持有锁阻塞开销
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

```
