package com.project.CadastroNinjas.Ninja;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class NinjaService {

    private final NinjaRepository ninjaRepository;
}
