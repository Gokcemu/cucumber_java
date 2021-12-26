package menuitems;

public class RestaurantMenuItem {

    private String MenuItemName;
    public RestaurantMenuItem(String menuItemName, String description, int price) {
        super();
        MenuItemName = menuItemName;
        Description = description;
        Price = price;
    }

    public String getMenuItemName() {
        return MenuItemName;
    }
    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    private String Description;
    private int Price;

    @Override
    public boolean equals(Object obj) {
        if ((obj == null)
                || (getClass() != obj.getClass())) {
            return false;
        }

        RestaurantMenuItem OtherMenuItem = (RestaurantMenuItem) obj;

        return (OtherMenuItem.getMenuItemName()).equals(this.MenuItemName);

    }

    @Override
    public int hashCode()
    {

        // We are returning the Geek_id
        // as a hashcode value.
        // we can also return some
        // other calculated value or may
        // be memory address of the
        // Object on which it is invoked.
        // it depends on how you implement
        // hashCode() method.
        return this.hashCode();
    }
}
