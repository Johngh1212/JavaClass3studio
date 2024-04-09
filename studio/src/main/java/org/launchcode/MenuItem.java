package org.launchcode;

//public class MenuItem {
//    private double price;
//    private String description;
//    private String category;
//    private boolean isNew;
//
//    public MenuItem(double p, String d, String c, boolean iN) {
//        this.price = p;
//        this.description = d;
//        this.category = c;
//        this.isNew = iN;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public void setNew(boolean aNew) {
//        isNew = aNew;
//    }
//}



public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean isNew;

    public MenuItem(double price, String description, String category, boolean isNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;

        MenuItem menuItem = new MenuItem(10.00, "Empanadas", "Appetizer", false);
        MenuItem menuItem = new MenuItem(18.00, "Peruvian Chicken", "Entree", true);
        MenuItem menuItem = new MenuItem(6.00, "Tres Leches", "Dessert", false);



    }



    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
