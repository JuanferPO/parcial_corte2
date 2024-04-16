package restaurante.backend.IService;

import restaurante.backend.Document.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public List<Producto> findAll();
    public Optional<Producto> findById(Long id);
    public Producto save(Producto producto);
    public void update(Producto producto, Long id);
    public void delete(Long id);
}
