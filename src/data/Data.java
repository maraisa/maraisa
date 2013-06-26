package data;

public class Data {
	public int dia;
	public int mes;
	public int ano;	

	public Data(int dia, int mes, int ano){
		if(dia < 0 && dia > 31) {
			this.dia = 1;
		} else {
			this.dia = dia;
		}
		if (mes<0 && mes>12){
			this.mes= 1;
		}else{
			this.mes=mes;
		}
		if(ano<0){
			this.ano=1900;

		}else{
			this.ano = ano;
		}
	}

	public int getDia() {
		return this.dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes(int mes){
		return this.mes;
	}
	public void setMes(int mes){
		this.mes=mes;
	}
	public int getAno(int ano){
		return this.ano;
	}
	public void setAno(int ano){
		this.ano = ano;
	}

	public String texto() {
		String data;

		data = new String(this.dia + "/" +this.mes+ "/" + this.ano);

		return data;
	}

	public void avancaDia(){
		this.dia= this.dia + 1;
		if(this.dia > 31) {
			this.mes=this.mes+1;
			this.dia=1;
		}
		if(this.mes > 12); {
			this.ano=this.ano+1;
		}
	}

	public static void main(String[] args) {
       Data d= new Data(20,06,2013);
       System.out.println(d.dia);
       d.avancaDia();
       System.out.println(d.texto());
       
       System.out.println(d.texto());
	}

}