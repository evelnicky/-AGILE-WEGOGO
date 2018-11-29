/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowerorderingsystem;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Evel
 */
@Entity
@Table(name = "ORDERS", catalog = "", schema = "ADMINDB")
@NamedQueries({
    @NamedQuery(name = "Orders.findAll", query = "SELECT o FROM Orders o"),
    @NamedQuery(name = "Orders.findByOrderid", query = "SELECT o FROM Orders o WHERE o.orderid = :orderid"),
    @NamedQuery(name = "Orders.findByOrderdesc", query = "SELECT o FROM Orders o WHERE o.orderdesc = :orderdesc"),
    @NamedQuery(name = "Orders.findByCustomerid", query = "SELECT o FROM Orders o WHERE o.customerid = :customerid"),
    @NamedQuery(name = "Orders.findByPickupdate", query = "SELECT o FROM Orders o WHERE o.pickupdate = :pickupdate")})
public class Orders implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ORDERID")
    private String orderid;
    @Column(name = "ORDERDESC")
    private String orderdesc;
    @Column(name = "CUSTOMERID")
    private String customerid;
    @Column(name = "PICKUPDATE")
    @Temporal(TemporalType.DATE)
    private Date pickupdate;

    public Orders() {
    }

    public Orders(String orderid) {
        this.orderid = orderid;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        String oldOrderid = this.orderid;
        this.orderid = orderid;
        changeSupport.firePropertyChange("orderid", oldOrderid, orderid);
    }

    public String getOrderdesc() {
        return orderdesc;
    }

    public void setOrderdesc(String orderdesc) {
        String oldOrderdesc = this.orderdesc;
        this.orderdesc = orderdesc;
        changeSupport.firePropertyChange("orderdesc", oldOrderdesc, orderdesc);
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        String oldCustomerid = this.customerid;
        this.customerid = customerid;
        changeSupport.firePropertyChange("customerid", oldCustomerid, customerid);
    }

    public Date getPickupdate() {
        return pickupdate;
    }

    public void setPickupdate(Date pickupdate) {
        Date oldPickupdate = this.pickupdate;
        this.pickupdate = pickupdate;
        changeSupport.firePropertyChange("pickupdate", oldPickupdate, pickupdate);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (orderid != null ? orderid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Orders)) {
            return false;
        }
        Orders other = (Orders) object;
        if ((this.orderid == null && other.orderid != null) || (this.orderid != null && !this.orderid.equals(other.orderid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "flowerorderingsystem.Orders[ orderid=" + orderid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
