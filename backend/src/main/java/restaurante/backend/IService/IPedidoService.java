package restaurante.backend.IService;

import restaurante.backend.Document.Pedido;

import java.util.List;
import java.util.Optional;

public interface IPedidoService {
    public List<Pedido> findAll();
    public Optional<Pedido> findById(Long id);
    public Pedido save(Pedido pedido);
    public void update(Pedido pedido, Long id);
    public void delete(Long id);
}
