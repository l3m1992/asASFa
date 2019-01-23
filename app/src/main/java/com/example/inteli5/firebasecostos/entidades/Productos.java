package com.example.inteli5.firebasecostos.entidades;

public class Productos {

    long id_producto;
    String nom_producto;
    String des_producto;
    String mat_procuto;
    String marca_producto;
    boolean oferta;
    int garantia;
    String img_producto;

    public Productos() {
    }


    public Productos(long id_producto, String nom_producto, String des_producto, String mat_procuto, String marca_producto, boolean oferta, int garantia, String img_producto) {
        this.id_producto = id_producto;
        this.nom_producto = nom_producto;
        this.des_producto = des_producto;
        this.mat_procuto = mat_procuto;
        this.marca_producto = marca_producto;
        this.oferta = oferta;
        this.garantia = garantia;
        this.img_producto = img_producto;
    }

    public long getId_producto() {
        return id_producto;
    }

    public void setId_producto(long id_producto) {
        this.id_producto = id_producto;
    }

    public String getNom_producto() {
        return nom_producto;
    }

    public void setNom_producto(String nom_producto) {
        this.nom_producto = nom_producto;
    }

    public String getDes_producto() {
        return des_producto;
    }

    public void setDes_producto(String des_producto) {
        this.des_producto = des_producto;
    }

    public String getMat_procuto() {
        return mat_procuto;
    }

    public void setMat_procuto(String mat_procuto) {
        this.mat_procuto = mat_procuto;
    }

    public String getMarca_producto() {
        return marca_producto;
    }

    public void setMarca_producto(String marca_producto) {
        this.marca_producto = marca_producto;
    }

    public boolean isOferta() {
        return oferta;
    }

    public void setOferta(boolean oferta) {
        this.oferta = oferta;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    public String getImg_producto() {
        return img_producto;
    }

    public void setImg_producto(String img_producto) {
        this.img_producto = img_producto;
    }
}
