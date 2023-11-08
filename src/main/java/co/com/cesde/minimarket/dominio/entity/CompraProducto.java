package co.com.cesde.minimarket.dominio.entity;

import javax.persistence.*;

@Entity
@Table(name= "compra_producto")
public class CompraProducto {

    @EmbeddedId
    private CompraProductoPk id;
    private Integer cantidad;
    private Double total;
    private Integer estado;

    @ManyToOne
    @JoinColumn(name = "id_compras", insertable = false, updatable = false)
    private Compras compras;

    @ManyToOne
    @JoinColumn(name = "id_productos", insertable = false,updatable = false)
    private Producto producto;




    //getters and setters

    public CompraProductoPk getId() {
        return id;
    }

    public void setId(CompraProductoPk id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }
}
