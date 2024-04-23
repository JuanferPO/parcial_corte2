package restaurante.backend.IService;

import restaurante.backend.Document.DetallePedido;

import java.util.List;
import java.util.Optional;

public interface IDetallePedidoService {
    public List<DetallePedido> findAll();
    public Optional<DetallePedido> findById(String id);
    public DetallePedido save(DetallePedido detallePedido);
    public void update(DetallePedido detallePedido, String id);
    public void delete(String id);
}
