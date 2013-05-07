package org.cesar.rcbop.p1singleton.application6;

public class InitializationOnDemandHolder {
	
	/*
	 * http://en.wikipedia.org/wiki/Initialization_on_demand_holder_idiom
	 */
	private InitializationOnDemandHolder(){
		System.out.println("as lazy as it gets");
	}
	
	private static class LazyHolder{
		private static final InitializationOnDemandHolder VERY_LAZY_INSTANCE = new InitializationOnDemandHolder(); 
	}
	/**
	 * Thread safe without volatile or synchronized
	 * @return
	 */
	public static InitializationOnDemandHolder getInstance(){
		return LazyHolder.VERY_LAZY_INSTANCE;
	}
}
