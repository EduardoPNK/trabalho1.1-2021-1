package br.edu.unidep.models;

public class Venda {
	
	private int id;
	private String data;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	@Override
	public String toString() {
		return "Venda [id=" + id + ", data=" + data + "]";
	}

	
	
}
