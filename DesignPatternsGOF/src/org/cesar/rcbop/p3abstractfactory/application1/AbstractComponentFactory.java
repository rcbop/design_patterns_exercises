package org.cesar.rcbop.p3abstractfactory.application1;

public abstract class AbstractComponentFactory {

	enum ComponentType {
		CPU, MEMORY;
	}

	public AbstractComponentFactory getFactory(ComponentType type) {
		
		switch (type) {
		case CPU:
			return new CPUFactory();
		case MEMORY:
			return new MemoryFactory();
		}
		throw new IllegalArgumentException("Non existing component type " + type);
	}
}
