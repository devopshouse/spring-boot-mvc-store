package demo.shopapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import demo.shopapi.entity.ProductInfo;

/**
 * Created By Zhu Lin on 3/10/2018.
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {
    ProductInfo findByProductId(String id);
    // onsale product
    Page<ProductInfo> findAllByProductStatusOrderByProductIdAsc(Integer productStatus, Pageable pageable);

    // product in one category
    Page<ProductInfo> findAllByCategoryTypeOrderByProductIdAsc(Integer categoryType, Pageable pageable);

    Page<ProductInfo> findAllByOrderByProductId(Pageable pageable);

}
