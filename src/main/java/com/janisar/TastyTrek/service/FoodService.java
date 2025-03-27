package com.janisar.TastyTrek.service;
import java.util.*;

import com.janisar.TastyTrek.io.FoodRequest;
import com.janisar.TastyTrek.io.FoodResponse;
import org.springframework.web.multipart.MultipartFile;

public interface FoodService {

    String uploadFile(MultipartFile file);

    FoodResponse addFood(FoodRequest request, MultipartFile file);

    List<FoodResponse> readFoods();

    FoodResponse readFood(String id);

    boolean deleteFile(String filename);

    void deleteFood(String id);
}
