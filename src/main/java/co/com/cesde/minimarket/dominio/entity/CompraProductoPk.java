package co.com.cesde.minimarket.dominio.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CompraProductoPk  implements Serializable {

    @Column(name="id_compras")
    private Integer idCompras;

    @Column(name = "id_productos")
    private  Integer idProductos;

    public Integer getIdCompras() {
        return idCompras;
    }

    public void setIdCompras(Integer idCompras) {
        this.idCompras = idCompras;
    }

    public Integer getIdProductos() {
        return idProductos;
    }

    public void setIdProductos(Integer idProductos) {
        this.idProductos = idProductos;
    }




}
