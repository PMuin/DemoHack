package com.demohack.ad.models.service;

import com.demohack.ad.models.entity.Ad;
import com.demohack.ad.models.repository.AdRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AdService {

    private final AdRepository adRepository;

    public AdService(AdRepository adRepository) {
        this.adRepository = adRepository;
    }

    @Autowired

    public List<Ad> getAllAds() {
        return adRepository.findAll();
    }

}