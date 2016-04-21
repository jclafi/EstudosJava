package hibernatecfgclass;

class Endereco {
	
    private Integer codigo;
    private String rua;
    private String estado;
    private String cep;
    private String cidade;
    private float latitude;
    private float longitude;    

    public String getCep() { return cep; }
    public void setCep(String cep) { this.cep = cep; }
    public String getCidade() { return cidade; }
    public void setCidade(String cidade) { this.cidade = cidade; }
    public Integer getCodigo() { return codigo; }
    public void setCodigo(Integer codigo) { this.codigo = codigo; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getRua() { return rua; }
    public void setRua(String rua) { this.rua = rua; }    
    public float getLatitude() { return latitude; }
    public void setLatitude(float latitude ) { this.latitude = latitude; }
    public float getLongitude() { return longitude; }
    public void setLongitude(float longitude ) { this.longitude = longitude; }
    
    public Endereco() {
    	
    }
    
}