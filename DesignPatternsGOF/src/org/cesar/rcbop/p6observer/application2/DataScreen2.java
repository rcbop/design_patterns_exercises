package org.cesar.rcbop.p6observer.application2;

public class DataScreen2 extends Screen implements OnUpdateDataListener {

	public DataScreen2() {
		Controller.getInstance().addDataListener(this);
	}

	@Override
	public void onUpdateData(String data) {
		displayData("["+getClass().getSimpleName()+"] "+data);
	}

}
