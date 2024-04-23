package restaurante.backend.IService;

import restaurante.backend.Document.Producto;

import java.util.List;
import java.util.Optional;

public interface IProductoService {
    public List<Producto> findAll();
    public Optional<Producto> findById(String id);
    public Producto save(Producto producto);
    public void update(Producto producto, String id);
    public void delete(String id);
}
