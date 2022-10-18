public class SingleResponsibility {
    public static void main(String[] args) {

    }

}
class ProductService{
    public void addProduct() {
        System.out.println("add product logic...");
    }

    public Product getProduct() {
        return null;
    }

    public Product getProductById(Long id) {
        return null;
    }

    public void sendSms() {
        System.out.println("sms sent");
    }

    public void sendEmail() {
        System.out.println("email sent");
    }
}

class Product{
    private String name;
}