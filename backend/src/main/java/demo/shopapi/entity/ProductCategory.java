package demo.shopapi.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.NaturalId;

import lombok.Data;

/**
 * Created By Zhu Lin on 3/9/2018.
 */
@Entity
@Data
@DynamicUpdate
public class ProductCategory implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 96752059675081108L;

	@Id
    @GeneratedValue
    private Integer categoryId;

    private String categoryName;

    @NaturalId
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;


    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
