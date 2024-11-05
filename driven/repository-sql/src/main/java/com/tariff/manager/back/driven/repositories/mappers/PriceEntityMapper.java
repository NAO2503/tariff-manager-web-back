package com.tariff.manager.back.driven.repositories.mappers;

import com.tariff.manager.back.domain.Price;
import com.tariff.manager.back.driven.repositories.models.PriceEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PriceEntityMapper {

    Price toDomain(PriceEntity entity);

}