package behavioral_03_chain_of_responsibility;

public interface DispenseChain {
	void setNextChain(DispenseChain nextChain);

	void dispense(Currency cur);
}
