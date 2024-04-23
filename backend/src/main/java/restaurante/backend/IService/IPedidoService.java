package restaurante.backend.IService;

import restaurante.backend.Document.Pedido;

import java.util.List;
import java.util.Optional;

public interface IPedidoService {
    public List<Pedido> findAll();
    public Optional<Pedido> findById(String id);
    public Pedido save(Pedido pedido);
    public void update(Pedido pedido, String id);
    public void delete(String id);
}
