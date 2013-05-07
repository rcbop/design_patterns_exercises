package org.cesar.rcbop.p3abstractfactory.application1;

public class CPUFactory extends AbstractComponentFactory {

	public enum CPUArchitecture{
		INTELx86, AMDx64;
	}
	
	public CPU getCPU(CPUArchitecture architecture){
		switch (architecture) {
		case INTELx86:
			return new Intel86xProcessor();
		case AMDx64:
			return new Amd64xProcessor();
		}
		throw new IllegalArgumentException("non existing architecture " + architecture);
	}
}
