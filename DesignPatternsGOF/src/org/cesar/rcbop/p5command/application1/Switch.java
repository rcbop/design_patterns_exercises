package org.cesar.rcbop.p5command.application1;

import java.util.ArrayList;
import java.util.List;

public class Switch {
	
	private List<Command> history;
	
	public Switch() {
		this.history = new ArrayList<>();
	}

	public void executeAndLogCommand(Command command){
		command.execute();
		history.add(command);
	}
	
	public List<Command> getHistory(){
		return history;
	}

}
