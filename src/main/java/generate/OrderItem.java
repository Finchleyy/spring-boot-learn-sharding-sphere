package generate;

import java.io.Serializable;
import lombok.Data;

/**
 * t_order_item0
 * @author 
 */
@Data
public class OrderItem implements Serializable {
    private Long orderItemId;

    private Long orderId;

    private String item;

    private Long userId;

    private static final long serialVersionUID = 1L;
}