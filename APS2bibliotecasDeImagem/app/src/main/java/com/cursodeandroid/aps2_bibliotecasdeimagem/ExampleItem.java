package com.cursodeandroid.aps2_bibliotecasdeimagem;

public class ExampleItem {
    private String imagemDaUrl;
    private String criador;
    private int curtidas;

    public ExampleItem(String imageUrl, String creator, int likes) {
        imagemDaUrl = imageUrl;
        criador = creator;
        curtidas = likes;
    }

    public String getImagemDaUrl() { return imagemDaUrl; }

    public String getCriador() {  return criador; }

    public int getContadorDeCurtidas() {
        return curtidas;
    }

}
