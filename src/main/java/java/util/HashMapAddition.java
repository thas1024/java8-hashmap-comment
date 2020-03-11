package java.util;

/**
 * HashMap 和 LinkedHashMap 相互耦合, 本类用来替代HashMap中依赖LinkedHashMap的部分
 *
 * @author <a href="mailto:thascc1024@gmail.com">thas</a>
 * @date 2020/3/11 23:19
 */
public class HashMapAddition {

    static class Entry<K,V> extends HashMap.Node<K,V> {
        HashMapAddition.Entry<K,V> before, after;
        Entry(int hash, K key, V value, HashMap.Node<K,V> next) {
            super(hash, key, value, next);
        }
    }
}
