package com.example.inteli5.firebasecostos.entidades;

public class Cliente {

    long id_cliente;
    String nom_cliente;
    String nom_local;
    String des_local;
    String dir_local;
    String tel_local;
    double lon_local;
    double lat_local;
    String img_local;
    String log_local;
    boolean tarjeta;
    boolean parqueadero;
    boolean mayorista;
    boolean ofertas;
    boolean actualizado_local;
    String palabras_clave;
    String campo_busqueda;
    int calidad;
    int atencion;
    int precios;


    public Cliente() {
    }

    public Cliente(long id_cliente, String nom_cliente, String nom_local, String des_local, String dir_local, String tel_local, double lon_local, double lat_local, String img_local, String log_local, boolean tarjeta, boolean parqueadero, boolean mayorista, boolean ofertas, boolean actualizado_local, String palabras_clave, String campo_busqueda, int calidad, int atencion, int precios) {
        this.id_cliente = id_cliente;
        this.nom_cliente = nom_cliente;
        this.nom_local = nom_local;
        this.des_local = des_local;
        this.dir_local = dir_local;
        this.tel_local = tel_local;
        this.lon_local = lon_local;
        this.lat_local = lat_local;
        this.img_local = img_local;
        this.log_local = log_local;
        this.tarjeta = tarjeta;
        this.parqueadero = parqueadero;
        this.mayorista = mayorista;
        this.ofertas = ofertas;
        this.actualizado_local = actualizado_local;
        this.palabras_clave = palabras_clave;
        this.campo_busqueda = campo_busqueda;
        this.calidad = calidad;
        this.atencion = atencion;
        this.precios = precios;
    }


    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNom_cliente() {
        return nom_cliente;
    }

    public void setNom_cliente(String nom_cliente) {
        this.nom_cliente = nom_cliente;
    }

    public String getNom_local() {
        return nom_local;
    }

    public void setNom_local(String nom_local) {
        this.nom_local = nom_local;
    }

    public String getDes_local() {
        return des_local;
    }

    public void setDes_local(String des_local) {
        this.des_local = des_local;
    }

    public String getDir_local() {
        return dir_local;
    }

    public void setDir_local(String dir_local) {
        this.dir_local = dir_local;
    }

    public String getTel_local() {
        return tel_local;
    }

    public void setTel_local(String tel_local) {
        this.tel_local = tel_local;
    }

    public double getLon_local() {
        return lon_local;
    }

    public void setLon_local(double lon_local) {
        this.lon_local = lon_local;
    }

    public double getLat_local() {
        return lat_local;
    }

    public void setLat_local(double lat_local) {
        this.lat_local = lat_local;
    }

    public String getImg_local() {
        return img_local;
    }

    public void setImg_local(String img_local) {
        this.img_local = img_local;
    }

    public String getLog_local() {
        return log_local;
    }

    public void setLog_local(String log_local) {
        this.log_local = log_local;
    }

    public boolean isTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(boolean tarjeta) {
        this.tarjeta = tarjeta;
    }

    public boolean isParqueadero() {
        return parqueadero;
    }

    public void setParqueadero(boolean parqueadero) {
        this.parqueadero = parqueadero;
    }

    public boolean isMayorista() {
        return mayorista;
    }

    public void setMayorista(boolean mayorista) {
        this.mayorista = mayorista;
    }

    public boolean isOfertas() {
        return ofertas;
    }

    public void setOfertas(boolean ofertas) {
        this.ofertas = ofertas;
    }

    public boolean isActualizado_local() {
        return actualizado_local;
    }

    public void setActualizado_local(boolean actualizado_local) {
        this.actualizado_local = actualizado_local;
    }

    public String getPalabras_clave() {
        return palabras_clave;
    }

    public void setPalabras_clave(String palabras_clave) {
        this.palabras_clave = palabras_clave;
    }

    public String getCampo_busqueda() {
        return campo_busqueda;
    }

    public void setCampo_busqueda(String campo_busqueda) {
        this.campo_busqueda = campo_busqueda;
    }

    public int getCalidad() {
        return calidad;
    }

    public void setCalidad(int calidad) {
        this.calidad = calidad;
    }

    public int getAtencion() {
        return atencion;
    }

    public void setAtencion(int atencion) {
        this.atencion = atencion;
    }

    public int getPrecios() {
        return precios;
    }

    public void setPrecios(int precios) {
        this.precios = precios;
    }
}
