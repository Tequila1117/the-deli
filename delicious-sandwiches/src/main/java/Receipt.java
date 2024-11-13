
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Receipt {
    private Order order;

    public Receipt(Order order) {
        this.order = order;
    }

    public void saveReceipt() {
        String timestamp = new SimpleDateFormat("yyyyMMdd-HHmmss").format(new Date());
        String filename = "receipts/" + timestamp + ".txt";
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(order.getOrderDetails());
            System.out.println("Receipt saved as " + filename);
        } catch (IOException e) {
            System.err.println("Error saving receipt: " + e.getMessage());
        }
    }
}
