package com.demohack.ad.models.repository;

import com.demohack.ad.models.entity.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdRepository extends JpaRepository<Ad, Long> {

}
