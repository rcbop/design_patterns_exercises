package org.cesar.rcbop.p3abstractfactory.application1;

public class MemoryFactory extends AbstractComponentFactory{

	public enum MemoryType{
		FLASH, HARD_DISK;
	}
	
	public Memory getMemory(MemoryType type){
		switch (type) {
		case FLASH:
			return new FlashMemory();
		case HARD_DISK:
			return new HardDisk();
		}
		throw new IllegalArgumentException("non existing memory type " + type);
	}
}
