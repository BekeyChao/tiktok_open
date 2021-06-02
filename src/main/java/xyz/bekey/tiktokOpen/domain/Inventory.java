package xyz.bekey.tiktokOpen.domain;

public class Inventory {

    private String warehouse_id;

    private String out_warehouse_id;

    private Integer inventory_type;

    private String inventory_type_desc;

    public String getWarehouse_id() {
        return warehouse_id;
    }

    public void setWarehouse_id(String warehouse_id) {
        this.warehouse_id = warehouse_id;
    }

    public String getOut_warehouse_id() {
        return out_warehouse_id;
    }

    public void setOut_warehouse_id(String out_warehouse_id) {
        this.out_warehouse_id = out_warehouse_id;
    }

    public Integer getInventory_type() {
        return inventory_type;
    }

    public void setInventory_type(Integer inventory_type) {
        this.inventory_type = inventory_type;
    }

    public String getInventory_type_desc() {
        return inventory_type_desc;
    }

    public void setInventory_type_desc(String inventory_type_desc) {
        this.inventory_type_desc = inventory_type_desc;
    }
}
