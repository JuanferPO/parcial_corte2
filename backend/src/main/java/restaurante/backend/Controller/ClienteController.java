package restaurante.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurante.backend.Document.Cliente;
import restaurante.backend.IService.IClienteService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("cliente")
public class ClienteController {
    @Autowired
    private IClienteService service;

    @GetMapping()
    public List<Cliente> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> findById(@PathVariable String id){
        return service.findById(id);
    }

    @PostMapping()
    public Cliente save(@RequestBody Cliente cliente){
        return service.save(cliente);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Cliente cliente, @PathVariable String id){
        service.update(cliente, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }
}
