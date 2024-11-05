package com.tariff.manager.back.driven.repositories;

import com.tariff.manager.back.driven.repositories.models.PriceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface PriceJpaRepository extends JpaRepository<PriceEntity, Long> {

    @Query("SELECT p FROM PriceEntity p WHERE p.brandId = ?1 AND p.productId = ?2 AND p.startDate <= ?3 AND p.endDate >= ?3 ORDER BY p.priority DESC, p.priceList DESC")
    Optional<List<PriceEntity>> findAllByBrandIdAndProductIdBetweenDates(Long brandId, Long productId, LocalDateTime dateBetween);
}
