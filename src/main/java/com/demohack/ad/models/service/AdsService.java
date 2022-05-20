package com.demohack.ad.models.service;

import com.demohack.ad.models.entity.Ad;
import com.demohack.ad.models.repository.AdsRepository;

import java.util.List;

public class AdsService {

    private final AdsRepository adsRepository;

    public List<Ad> getAllAds() {
    return adsRepository.findAll();
   }

}
