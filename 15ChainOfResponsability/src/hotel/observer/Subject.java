package hotel.observer;

public interface Subject {
	void trimiteNotificare(String mesaj);
	void adaugaObserver(Observer observer);
	void stergerObserver(Observer observer);

}
