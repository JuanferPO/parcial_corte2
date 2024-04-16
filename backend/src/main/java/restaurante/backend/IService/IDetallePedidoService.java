package restaurante.backend.IService;

import restaurante.backend.Document.DetallePedido;

import java.util.List;
import java.util.Optional;

public interface IDetallePedidoService {
    public List<DetallePedido> findAll();
    public Optional<DetallePedido> findById(Long id);
    public DetallePedido save(DetallePedido detallePedido);
    public void update(DetallePedido detallePedido, Long id);
    public void delete(Long id);
}
