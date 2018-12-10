/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowerorderingsystem;

/**
 *
 * @author Evel
 */
public class User {
        public String orderID;
        public String orderDesc;
        public String custID;
        public double totalAmount;
        public String pickupdate;
        public String orderStatus;

   
        
        public User(String orderID, String orderDesc, String custID, double totalAmount, String pickupdate, String orderStatus)
        {
            this.orderID = orderID;
            this.orderDesc = orderDesc;
            this.custID = custID;
            this.totalAmount = totalAmount;
            this.pickupdate = pickupdate;
            this.orderStatus = orderStatus;
        }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }
    
     public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderDesc() {
        return orderDesc;
    }

    public void setOrderDesc(String orderDesc) {
        this.orderDesc = orderDesc;
    }

    public String getCustID() {
        return custID;
    }

    public void setCustID(String custID) {
        this.custID = custID;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getPickupdate() {
        return pickupdate;
    }

    public void setPickupdate(String pickupdate) {
        this.pickupdate = pickupdate;
    }
}
