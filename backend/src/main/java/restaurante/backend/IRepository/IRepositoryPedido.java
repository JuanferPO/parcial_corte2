package restaurante.backend.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import restaurante.backend.Document.Pedido;

@Repository
public interface IRepositoryPedido extends MongoRepository<Pedido,String> {
}
