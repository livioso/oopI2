package pair;

public interface IMyPair <K extends Comparable<K>, V> {
	public void setKeyValue (K key, V value);
	public V getValue();
}
