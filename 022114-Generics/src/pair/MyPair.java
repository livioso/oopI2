package pair;

public class MyPair<K extends Comparable<K>, V> implements IMyPair<K, V> {

	protected K key;
	protected V value;
	
	@Override
	public void setKeyValue(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public V getValue() {
		// TODO Auto-generated method stub
		return null;
	}

}
