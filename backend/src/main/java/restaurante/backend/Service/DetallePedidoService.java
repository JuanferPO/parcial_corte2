package restaurante.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restaurante.backend.Document.DetallePedido;
import restaurante.backend.IRepository.IRepositoryDetallePedido;
import restaurante.backend.IService.IDetallePedidoService;
import java.util.List;
import java.util.Optional;

@Service
public class DetallePedidoService implements IDetallePedidoService{
    @Autowired
    private IRepositoryDetallePedido repository;
    @Override
    public List<DetallePedido> findAll(){
        return repository.findAll();
    }
    @Override
    public Optional<DetallePedido> findById(Long id){
        return repository.findById(id);
    }
    @Override
    public DetallePedido save(DetallePedido detallePedido){
        return repository.save(detallePedido);
    }
    @Override
    public void update(DetallePedido detallePedido, Long id){
        Optional<DetallePedido> ps = repository.findById(id);
        if(!ps.isEmpty()){
            DetallePedido detallePedidoUpdate = new DetallePedido();
            detallePedidoUpdate.setPedido(detallePedido.getPedido());
            detallePedidoUpdate.setCantidad(detallePedido.getCantidad());
            detallePedidoUpdate.setProducto(detallePedido.getProducto());
            repository.save(detallePedidoUpdate);
        }else{
            System.out.println("Id inválido para detallePedido");
        }
    }
    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}
