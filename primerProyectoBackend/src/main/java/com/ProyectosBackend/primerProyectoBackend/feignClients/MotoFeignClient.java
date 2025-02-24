package com.ProyectosBackend.primerProyectoBackend.feignClients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ProyectosBackend.primerProyectoBackend.modelos.Moto;

@FeignClient(name = "moto-service", url = "http://localhost:8003")
// @RequestMapping("/moto")
public interface MotoFeignClient {

    @PostMapping("/moto")
    public Moto save(@RequestBody Moto moto);

    @GetMapping("/usuario/{usuarioId}")
    public List<Moto> getMotos(@PathVariable("usuarioId") int usuarioId);

}
