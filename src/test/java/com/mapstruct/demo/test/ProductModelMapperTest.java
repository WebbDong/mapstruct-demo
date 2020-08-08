package com.mapstruct.demo.test;

import com.mapstruct.demo.model.domain.Product;
import com.mapstruct.demo.model.domain.ProductSkc;
import com.mapstruct.demo.model.dto.UserDto;
import com.mapstruct.demo.model.mapper.ProductModelMapper;
import com.mapstruct.demo.model.vo.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.joda.money.CurrencyUnit;
import org.joda.money.Money;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductModelMapperTest {

    @Test
    public void testDoToVo() {
        Product product = new Product();
        product.setId(1000L);
        product.setName("prod1");
        product.setPrice(Money.of(CurrencyUnit.of("CNY"), 58.65));
        ProductSkc skc = new ProductSkc();
        skc.setColorCode("458");
        skc.setColorName("红色");
        skc.setSkcCode("789456132abcd");
        product.setProductSkc(skc);
        ProductVo productVo = ProductModelMapper.INSTANCE.doToVo(product);
        log.info("{}", productVo);
    }

}
