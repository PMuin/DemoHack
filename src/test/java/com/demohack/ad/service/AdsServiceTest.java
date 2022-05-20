package com.demohack.ad.service;

import com.demohack.ad.models.repository.AdsRepository;
import com.demohack.ad.models.service.AdsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


@ExtendWith(MockitoExtension.class)

public class AdsServiceTest {
    @Mock private AdsRepository adsRepositoryMock;

    private AdsService adsServiceUnderTest;


    @BeforeEach
    void setUp() {
        adsServiceUnderTest = new AdsService(adsRepositoryMock);

    }

    @Test
    void getAllAds() {

    //When
    adsServiceUnderTest.getAllAds();

    //Then
    verify(adsRepositoryMock).findAll();

    }

}
