package org.cesar.rcbop.p3abstractfactory.application2;

public class CPUFactory implements AbstractComponent {

	public enum CPUArchitecture{
		INTELx86, AMDx64;
	}
	
	public CPU createCPU(CPUArchitecture architecture){
		switch (architecture) {
		case INTELx86:
			return new Intel86xProcessor();
		case AMDx64:
			return new Amd64xProcessor();
		}
		throw new IllegalArgumentException("non existing architecture " + architecture);
	}

	@Override
	public AbstractComponent getFactory() {
		return new CPUFactory();
	}
}
