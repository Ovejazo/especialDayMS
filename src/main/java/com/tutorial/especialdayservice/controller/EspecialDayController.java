package com.tutorial.especialdayservice.controller;

import com.tutorial.especialdayservice.entity.EspecialDayEntity;
import com.tutorial.especialdayservice.service.EspecialDayService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/especial")
public class EspecialDayController {

    EspecialDayService especialDayService;

    @GetMapping("/{birthday}")
    public double getBirthday(@PathVariable Integer birthday) {
        return especialDayService.getBirthday(birthday);
    }

    @GetMapping("/")
    public double getEspecialDay() {
        return especialDayService.getEspecialday();
    }
}
