class Receita {
    private int idReceita;
    private String ingredientes;
    private String preparo;
    private String rendimento;

    public Receita(int idReceita, String ingredientes, String preparo, String rendimento) {
        this.idReceita = idReceita;
        this.ingredientes = ingredientes;
        this.preparo = preparo;
        this.rendimento = rendimento;
    }
    public int getIdReceita() { return idReceita; }
    public String getIngredientes() { return ingredientes; }
    public String getPreparo() { return preparo; }
    public String getRendimento() { return rendimento; }
    public void setIdReceita(int idReceita) { this.idReceita = idReceita; }
    public void setIngredientes(String ingredientes) { this.ingredientes = ingredientes; }
    public void setPreparo(String preparo) { this.preparo = preparo; }
    public void setRendimento(String rendimento) { this.rendimento = rendimento; }
}
