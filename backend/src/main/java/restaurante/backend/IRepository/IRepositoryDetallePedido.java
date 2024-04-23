package restaurante.backend.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import restaurante.backend.Document.DetallePedido;

@Repository
public interface IRepositoryDetallePedido extends MongoRepository<DetallePedido,String> {
}
