package restaurante.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurante.backend.Document.Pedido;
import restaurante.backend.IService.IPedidoService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("pedido")
public class PedidoController {
    @Autowired
    private IPedidoService service;

    @GetMapping()
    public List<Pedido> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Pedido> findById(@PathVariable String id){
        return service.findById(id);
    }

    @PostMapping()
    public Pedido save(@RequestBody Pedido pedido){
        return service.save(pedido);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody Pedido pedido, @PathVariable String id){
        service.update(pedido, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        service.delete(id);
    }
}
