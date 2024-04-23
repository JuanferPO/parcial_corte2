package restaurante.backend.IService;

import restaurante.backend.Document.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    public List<Cliente> findAll();
    public Optional<Cliente> findById(String id);
    public Cliente save(Cliente cliente);
    public void update(Cliente cliente, String id);
    public void delete(String id);
}
