import java.util.List;

public class Bean<T extends Number> {
	private T dato;
	public Bean(T dato) {
		this.dato=dato;
	}
	public void setDato(T dato) {
		this.dato=dato;
	}
	public T getDato() {
		return dato;
	}
	public void saveData(List<T> lst) {
		
	}
	public void print(List<? super T> arg) {
		
	}
}

class Uso{
	
	public void test() {
		Bean<Double> bean=new Bean<>(4.5);
		
	}
}