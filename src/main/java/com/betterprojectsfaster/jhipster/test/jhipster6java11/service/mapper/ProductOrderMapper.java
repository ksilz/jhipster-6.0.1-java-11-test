package com.betterprojectsfaster.jhipster.test.jhipster6java11.service.mapper;

import com.betterprojectsfaster.jhipster.test.jhipster6java11.domain.*;
import com.betterprojectsfaster.jhipster.test.jhipster6java11.service.dto.ProductOrderDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity {@link ProductOrder} and its DTO {@link ProductOrderDTO}.
 */
@Mapper(componentModel = "spring", uses = {UserMapper.class, ProductMapper.class, ShoppingOrderMapper.class})
public interface ProductOrderMapper extends EntityMapper<ProductOrderDTO, ProductOrder> {

    @Mapping(source = "buyer.id", target = "buyerId")
    @Mapping(source = "buyer.login", target = "buyerLogin")
    @Mapping(source = "product.id", target = "productId")
    @Mapping(source = "product.name", target = "productName")
    @Mapping(source = "overallOrder.id", target = "overallOrderId")
    @Mapping(source = "overallOrder.name", target = "overallOrderName")
    ProductOrderDTO toDto(ProductOrder productOrder);

    @Mapping(source = "buyerId", target = "buyer")
    @Mapping(source = "productId", target = "product")
    @Mapping(source = "overallOrderId", target = "overallOrder")
    ProductOrder toEntity(ProductOrderDTO productOrderDTO);

    default ProductOrder fromId(Long id) {
        if (id == null) {
            return null;
        }
        ProductOrder productOrder = new ProductOrder();
        productOrder.setId(id);
        return productOrder;
    }
}
