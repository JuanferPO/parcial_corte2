package restaurante.backend.IService;

import restaurante.backend.Document.Cliente;

import java.util.List;
import java.util.Optional;

public interface IClienteService {
    public List<Cliente> findAll();
    public Optional<Cliente> findById(Long id);
    public Cliente save(Cliente cliente);
    public void update(Cliente cliente, Long id);
    public void delete(Long id);
}
