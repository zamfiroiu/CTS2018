package undo.clase;

public interface Command {
	void executa();
	void unexecute();
}
