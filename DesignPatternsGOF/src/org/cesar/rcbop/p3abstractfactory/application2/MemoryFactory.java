package org.cesar.rcbop.p3abstractfactory.application2;

public class MemoryFactory implements AbstractComponent {

	public enum MemoryType {
		FLASH, HARD_DISK;
	}

	public Memory createMemory(MemoryType type) {
		switch (type) {
		case FLASH:
			return new FlashMemory();
		case HARD_DISK:
			return new HardDisk();
		}
		throw new IllegalArgumentException("non existing memory type " + type);
	}

	@Override
	public AbstractComponent getFactory() {
		return new MemoryFactory();
	}

}
