package root.demo.model;

public class RecenzijaDTO {
	
	private Long id;

    private String rad;
    private String komentarAutor;
    private String komentarUrednik;
    private String odluka;
    
	public RecenzijaDTO(Long id, String rad, String komentarAutor, String komentarUrednik, String odluka) {
		super();
		this.id = id;
		this.rad = rad;
		this.komentarAutor = komentarAutor;
		this.komentarUrednik = komentarUrednik;
		this.odluka = odluka;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRad() {
		return rad;
	}

	public void setRad(String rad) {
		this.rad = rad;
	}

	public String getKomentarAutor() {
		return komentarAutor;
	}

	public void setKomentarAutor(String komentarAutor) {
		this.komentarAutor = komentarAutor;
	}

	public String getKomentarUrednik() {
		return komentarUrednik;
	}

	public void setKomentarUrednik(String komentarUrednik) {
		this.komentarUrednik = komentarUrednik;
	}

	public String getOdluka() {
		return odluka;
	}

	public void setOdluka(String odluka) {
		this.odluka = odluka;
	}
    
	
    

}
