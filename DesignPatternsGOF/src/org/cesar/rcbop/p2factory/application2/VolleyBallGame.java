package org.cesar.rcbop.p2factory.application2;

public class VolleyBallGame extends BeachSports {

	public VolleyBallGame() {
		Ball ball1 = playGame();
		Ball ball2 = playGame();
		Ball ball3 = playGame();
		ball1.bounce();
		ball2.bounce();
		ball3.bounce();
	}

	@Override
	protected Ball playGame() {
		return new VolleyBall();
	}

}
