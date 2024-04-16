package restaurante.backend.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import restaurante.backend.Document.Cliente;
import restaurante.backend.IRepository.IRepositoryCliente;
import restaurante.backend.IService.IClienteService;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService{
    @Autowired
    private IRepositoryCliente repository;
    @Override
    public List<Cliente> findAll(){
        return repository.findAll();
    }
    @Override
    public Optional<Cliente> findById(Long id){
        return repository.findById(id);
    }
    @Override
    public Cliente save(Cliente cliente){
        return repository.save(cliente);
    }
    @Override
    public void update(Cliente cliente, Long id){
        Optional<Cliente> ps = repository.findById(id);
        if(!ps.isEmpty()){
            Cliente clienteUpdate = new Cliente();
            clienteUpdate.setNombre(cliente.getNombre());
            clienteUpdate.setTelefono(cliente.getTelefono());
            repository.save(clienteUpdate);
        }else{
            System.out.println("Id inválido para cliente");
        }
    }
    @Override
    public void delete(Long id){
        repository.deleteById(id);
    }
}
