package demo.shopapi.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

/**
 * Created By Zhu Lin on 3/10/2018.
 */
@Entity
@Data
@DynamicUpdate
public class ProductInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = -5249561807321680361L;

	@Id
    private String productId;

    /** 名字. */
    @NotNull
    private String productName;

    /** 单价. */
    @NotNull
    private BigDecimal productPrice;

    /** 库存. */
    @NotNull
    @Min(0)
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 0: on-sale 1: off-sale */

    @ColumnDefault("0")
    private Integer productStatus;

    /** 类目编号. */
    @ColumnDefault("0")
    private Integer categoryType;

    @CreationTimestamp
    private Date createTime;
    @UpdateTimestamp
    private Date updateTime;

    public ProductInfo() {
    }
}
