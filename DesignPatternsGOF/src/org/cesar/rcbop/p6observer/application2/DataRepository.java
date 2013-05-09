package org.cesar.rcbop.p6observer.application2;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
	
	private static DataRepository instance;
	
	private List<OnUpdateDataListener> listeners;
	
	public void addListener(OnUpdateDataListener listener) {
		if (listeners == null) {
			listeners = new ArrayList<>();
		}
		listeners.add(listener);
	}
	
	public void updateData(String data){
		if (listeners != null && listeners.size() > 0) {
			for (OnUpdateDataListener listener : listeners) {
				listener.onUpdateData(data);
			}
		}
	}
	
	public synchronized static DataRepository getInstance() {
		if (instance == null) {
			instance = new DataRepository();
		}
		return instance;
	}

}
