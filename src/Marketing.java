public class Marketing {

    private String employeename;
    private String productName;
    private double salesAmount;

    //Constructor
    public Marketing(String employeename, String productName, double salesAmount) {
        this.employeename = employeename;
        this.productName = productName;
        this.salesAmount = salesAmount;
    }
    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    @Override
    public String toString() {
        return "Marketing{" +
                "employeeName=" + employeename + '\'' +
                ", productName=" + productName + '\'' +
                ", salesAmount=" + salesAmount + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Marketing mar = (Marketing) obj;
        return employeename.equals(mar.employeename) &&
                productName.equals(mar.productName) &&
                salesAmount == mar.salesAmount;
    }

}
