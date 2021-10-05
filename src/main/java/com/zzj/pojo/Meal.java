package com.zzj.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Meal {
    private String dishName;
    private String dishSort;
    private String Ingredients;
    private String behavior;
    private String dishImg;
}
