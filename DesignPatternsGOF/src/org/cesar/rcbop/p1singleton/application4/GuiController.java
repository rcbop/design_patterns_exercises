package org.cesar.rcbop.p1singleton.application4;

import java.util.ArrayList;
import java.util.List;

import org.cesar.rcbop.p1singleton.application4.views.InputView;
import org.cesar.rcbop.p1singleton.application4.views.OutputView;
import org.cesar.rcbop.p1singleton.application4.views.View;

public class GuiController {

	public enum Views {
		INPUT_VIEW(1), OUTPUT_VIEW(2);

		private final int id;

		private Views(int id) {
			this.id = id;
		}

		public int getId() {
			return id;
		}
	}

	private static GuiController instance;
	private List<OnChangedView> listenerList;
	private View currentView;

	private GuiController() {
	}

	public void addListener(OnChangedView listener) {
		if (listenerList == null) {
			listenerList = new ArrayList<>();
		}
		listenerList.add(listener);
	}

	public static GuiController getInstance() {
		if (instance == null) {
			instance = new GuiController();
		}
		return instance;
	}

	public void changeCurrentView(Views view) {
		switch (view) {
		case INPUT_VIEW:
			currentView = InputView.getInstance();
			break;
		case OUTPUT_VIEW:
			currentView = OutputView.getInstance();
		default:
			break;
		}
		alertListeners();
		currentView.showView();
	}

	private void alertListeners() {
		for (OnChangedView listener : listenerList) {
			listener.onChangedView();
		}
	}

}
