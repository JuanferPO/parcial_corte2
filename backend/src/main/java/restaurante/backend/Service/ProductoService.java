package restaurante.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restaurante.backend.Document.Producto;
import restaurante.backend.IRepository.IRepositoryProducto;
import restaurante.backend.IService.IProductoService;
import java.util.List;
import java.util.Optional;

@Service
public class ProductoService implements IProductoService{
    @Autowired
    private IRepositoryProducto repository;
    @Override
    public List<Producto> findAll(){
        return repository.findAll();
    }
    @Override
    public Optional<Producto> findById(String id){
        return repository.findById(id);
    }
    @Override
    public Producto save(Producto producto){
        return repository.save(producto);
    }
    @Override
    public void update(Producto producto, String id){
        Optional<Producto> ps = repository.findById(id);
        if(!ps.isEmpty()){
            Producto productoUpdate = new Producto();
            productoUpdate.setNombre(producto.getNombre());
            productoUpdate.setValorUnitario(producto.getValorUnitario());
            repository.save(productoUpdate);
        }else{
            System.out.println("Id inválido para producto");
        }
    }
    @Override
    public void delete(String id){
        repository.deleteById(id);
    }
}
