

public interface Subject
{
	//adds an observer
	public void add(Observer o);
    // removes observer
	public void remove(Observer o);
    //gets notifies Observers
	public void notifyObservers(int notificationType);
  
}