package com.mapstruct.demo.model.mapper;

import com.mapstruct.demo.model.domain.Car;
import com.mapstruct.demo.model.dto.CarDto;
import com.mapstruct.demo.model.vo.CarVo;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

/**
 * Car模型映射器
 */
@Mapper
public interface CarModelMapper {

    CarModelMapper INSTANCE = Mappers.getMapper(CarModelMapper.class);

    /**
     * Car对象转换成CarDto对象
     * @param car
     * @return
     */
    @Mappings({
            @Mapping(source = "numberOfSeats", target = "seatCount"),
            @Mapping(source = "price", target = "price", numberFormat = "$#.00")
    })
//    @Mapping(source = "numberOfSeats", target = "seatCount")
    CarDto carToCarDto(Car car);

    /**
     * CarDto对象转换成Car对象
     * @param carDto
     * @return
     */
    @Mappings({
            @Mapping(source = "seatCount", target = "numberOfSeats"),
            @Mapping(source = "price", target = "price", numberFormat = "$#.00")
    })
    Car carDtoToCar(CarDto carDto);

    /**
     * Car对象转换成CarVo对象
     * @param car
     * @return
     */
    @Mappings({
            @Mapping(source = "numberOfSeats", target = "seatCount"),
            @Mapping(source = "price", target = "price", numberFormat = "$#.00")
    })
    CarVo carToCarVo(Car car);

    /**
     * 将carDto的属性复制到car中
     * @param carDto
     * @param car
     */
    @Mapping(source = "seatCount", target = "numberOfSeats")
    void updateCarFromCarDto(CarDto carDto, @MappingTarget Car car);

    // ------------- 支持List、Set、Map
    @IterableMapping(numberFormat = "$#.00")
    List<String> prices(List<Double> prices);

    List<CarDto> carDtoList(List<Car> carList);

    Set<String> integerSetToStringSet(Set<Integer> integers);

    @MapMapping(valueDateFormat = "yyyy年MM月dd日 HH:mm:ss")
    Map<String, String> longDateMapToStringStringMap(Map<Long, Date> source);

    @MapMapping(valueDateFormat = "dd.MM.yyyy")
    Map<String, String> longLocalDateTimeMapToStringStringMap(Map<Long, LocalDateTime> source);

    Set<String> integerStreamToStringSet(Stream<Integer> integers);

}
