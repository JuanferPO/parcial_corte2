package restaurante.backend.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import restaurante.backend.Document.Producto;

@Repository
public interface IRepositoryProducto extends MongoRepository<Producto,String> {
}
