package tfg.quiz.servicioAplicacion;

import tfg.quiz.objetoNegocio.Reto;

public interface SAReto {
	public void crear(Reto reto);
	public Reto buscar(int id);
	public void buscarTodos();
}
