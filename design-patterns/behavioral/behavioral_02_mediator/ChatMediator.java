package behavioral_02_mediator;

public interface ChatMediator {
	public void sendMessage(String msg, User user);

	void addUser(User user);
}