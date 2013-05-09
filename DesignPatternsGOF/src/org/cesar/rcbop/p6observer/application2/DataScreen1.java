package org.cesar.rcbop.p6observer.application2;

public class DataScreen1 extends Screen implements OnUpdateDataListener {

	public DataScreen1() {
		Controller.getInstance().addDataListener(this);
	}

	@Override
	public void onUpdateData(String data) {
		displayData("["+getClass().getSimpleName()+"] "+data);
	}

}
