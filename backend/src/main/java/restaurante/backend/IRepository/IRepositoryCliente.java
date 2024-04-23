package restaurante.backend.IRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import restaurante.backend.Document.Cliente;

@Repository
public interface IRepositoryCliente extends MongoRepository<Cliente,String> {
}
