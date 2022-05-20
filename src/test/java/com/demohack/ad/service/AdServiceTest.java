package com.demohack.ad.service;

import com.demohack.ad.models.repository.AdRepository;
import com.demohack.ad.models.service.AdService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)

public class AdServiceTest {
    @Mock private AdRepository adRepositoryMock;

    private AdService adServiceUnderTest;


    @BeforeEach
    void setUp() {
        adServiceUnderTest = new AdService(adRepositoryMock);

    }

    @Test
    void getAllAds() {

    //When
    adServiceUnderTest.getAllAds();

    //Then
    verify(adRepositoryMock).findAll();

    }

}
