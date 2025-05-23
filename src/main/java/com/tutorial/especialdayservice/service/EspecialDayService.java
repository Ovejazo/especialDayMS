package com.tutorial.especialdayservice.service;

//import com.tutorial.frecuencyclentsservice.repository.FrecuencyClentsRepository;
//import edu.mtisw.payrollbackend.repositories.EmployeeRepository;
//import edu.mtisw.payrollbackend.repositories.ExtraHoursRepository;
import org.springframework.stereotype.Service;

@Service
public class EspecialDayService {

    public double getBirthday(Integer nPersonas){
        double descuentoCumplenos = 0.0;
        if (nPersonas >= 3) {
            if (nPersonas <= 5) descuentoCumplenos = 0.5;
        }
        return descuentoCumplenos;
    }

    public double getEspecialday(){
        return 0.05;
    }

}
