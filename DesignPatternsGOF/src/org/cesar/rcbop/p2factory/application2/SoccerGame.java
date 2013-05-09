package org.cesar.rcbop.p2factory.application2;

public class SoccerGame extends BeachSports {

	public SoccerGame(){
		Ball ball1 = playGame();
		ball1.bounce();
	}
	
	@Override
	protected Ball playGame() {
		return new SoccerBall();
	}

}
