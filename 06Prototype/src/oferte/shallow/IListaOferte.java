package oferte.shallow;

public interface IListaOferte extends Cloneable {
	IListaOferte copiaza() throws CloneNotSupportedException;
	void incarcaListaOferte();
}
