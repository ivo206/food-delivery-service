package ivo.rakar.api.core.menu.item;

public class MenuItem {
    private final int menuItemId;
    private final String name;
    private final int price;
    private final String serviceAddress;

    public MenuItem() {
        menuItemId = 0;
        name = null;
        price = 0;
        serviceAddress = null;
    }

    public MenuItem(int productId, String name, int price, String serviceAddress) {
        this.menuItemId = productId;
        this.name = name;
        this.price = price;
        this.serviceAddress = serviceAddress;
    }

    public int getMenuItemId() {
        return menuItemId;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return price;
    }

    public String getServiceAddress() {
        return serviceAddress;
    }
}
