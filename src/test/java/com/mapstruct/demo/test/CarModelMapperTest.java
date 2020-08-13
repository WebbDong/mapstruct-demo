package com.mapstruct.demo.test;

import com.mapstruct.demo.model.domain.Car;
import com.mapstruct.demo.model.dto.CarDto;
import com.mapstruct.demo.model.mapper.CarModelMapper;
import com.mapstruct.demo.model.vo.CarVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class CarModelMapperTest {

    @Test
    public void testCar2CarDTO() {
        Car car = new Car();
        car.setBrand("BMW 3");
        car.setNumberOfSeats(4);
        car.setPrice(37.99);
        CarDto carDto = CarModelMapper.INSTANCE.carToCarDto(car);
        log.info("{}", carDto);
    }

    @Test
    public void testCarDTO2ToCar() {
        CarDto carDTO = new CarDto();
        carDTO.setBrand("BMW 3");
        carDTO.setPrice("$37.99");
        carDTO.setSeatCount(4);
        Car car = CarModelMapper.INSTANCE.carDtoToCar(carDTO);
        log.info("{}", car);
    }

    @Test
    public void testCar2CarVO() {
        Car car = new Car();
        car.setBrand("BMW 3");
        car.setNumberOfSeats(4);
        car.setPrice(37.99);
        CarVo carVO = CarModelMapper.INSTANCE.carToCarVo(car);
        log.info("{}", carVO);
    }

    @Test
    public void testUpdateCarFromCarDTO() {
        CarDto carDto = new CarDto();
        carDto.setBrand("BENZ");
        carDto.setSeatCount(2);
        Car car = new Car();
        CarModelMapper.INSTANCE.updateCarFromCarDto(carDto, car);
        log.info("{}", car);
    }

    @Test
    public void testPrices() {
        List<Double> prices = new ArrayList<>();
        prices.add(37.99);
        prices.add(25.99);
        prices.add(30.99);
        prices.add(40.99);
        List<String> pricesList = CarModelMapper.INSTANCE.prices(prices);
        log.info("{}", pricesList);
    }

    @Test
    public void testCarDtoList() {
        List<Car> carList = new ArrayList<>();
        carList.add(Car.builder()
                .brand("BMW")
                .numberOfSeats(4)
                .price(600000.00)
                .build());
        carList.add(Car.builder()
                .brand("Ferrari")
                .numberOfSeats(4)
                .price(60000000.00)
                .build());
        List<CarDto> carDtoList = CarModelMapper.INSTANCE.carDtoList(carList);
        log.info("{}", carDtoList);
    }

    @Test
    public void testLongDateMapToStringStringMap() {
        Map<Long, Date> map = new HashMap<>();
        map.put(10L, new Date());
        map.put(11L, new Date());
        Map<String, String> stringStringMap = CarModelMapper.INSTANCE.longDateMapToStringStringMap(map);
        log.info("{}", stringStringMap);
    }

    @Test
    public void testLongLocalDateTimeMapToStringStringMap() {
        Map<Long, LocalDateTime> map = new HashMap<>();
        map.put(10L, LocalDateTime.now());
        map.put(11L, LocalDateTime.now());
        Map<String, String> stringStringMap = CarModelMapper.INSTANCE.longLocalDateTimeMapToStringStringMap(map);
        log.info("{}", stringStringMap);
    }

    @Test
    public void testIntegerStreamToStringSet() {
        List<Integer> integers = new ArrayList<>();
        integers.add(100);
        integers.add(200);
        integers.add(300);
        Set<String> strings = CarModelMapper.INSTANCE.integerStreamToStringSet(integers.stream());
        log.info("{}", strings);
    }

}
