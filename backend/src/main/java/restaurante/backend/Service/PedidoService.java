package restaurante.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restaurante.backend.Document.Pedido;
import restaurante.backend.IRepository.IRepositoryPedido;
import restaurante.backend.IService.IPedidoService;
import java.util.List;
import java.util.Optional;

@Service
public class PedidoService implements IPedidoService{
    @Autowired
    private IRepositoryPedido repository;
    @Override
    public List<Pedido> findAll(){
        return repository.findAll();
    }
    @Override
    public Optional<Pedido> findById(Long id){
        return repository.findById(id);
    }
    @Override
    public Pedido save(Pedido pedido){
        return repository.save(pedido);
    }
    @Override
    public void update(Pedido pedido, Long id){
        Optional<Pedido> ps = repository.findById(id);
        if(!ps.isEmpty()){
            Pedido pedidoUpdate = new Pedido();
            pedidoUpdate.setCliente(pedido.getCliente());
            pedidoUpdate.setFecha(pedido.getFecha());
            repository.save(pedidoUpdate);
        }else{
            System.out.println("Id inválido para pedido");
        }
    }
    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}
