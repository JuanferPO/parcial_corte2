package restaurante.backend.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import restaurante.backend.Document.DetallePedido;
import restaurante.backend.IService.IDetallePedidoService;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("detallePedido")
public class DetallePedidoController {
    @Autowired
    private IDetallePedidoService service;

    @GetMapping()
    public List<DetallePedido> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<DetallePedido> findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PostMapping()
    public DetallePedido save(@RequestBody DetallePedido detallePedido){
        return service.save(detallePedido);
    }

    @PutMapping("/{id}")
    public void update(@RequestBody DetallePedido detallePedido, @PathVariable Long id){
        service.update(detallePedido, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
}
