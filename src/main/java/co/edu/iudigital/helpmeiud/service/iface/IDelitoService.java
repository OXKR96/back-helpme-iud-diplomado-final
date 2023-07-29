package co.edu.iudigital.helpmeiud.service.iface;

import co.edu.iudigital.helpmeiud.dto.request.DelitoDTORequest;
import co.edu.iudigital.helpmeiud.dto.response.DelitoDTO;
import co.edu.iudigital.helpmeiud.exceptions.RestException;

import java.util.List;

public interface IDelitoService {


    List<DelitoDTO> consultarTodos(); //TODO: throw exception


    DelitoDTO consultarPorId(Long id);


    DelitoDTO guardarDelito(DelitoDTORequest delitoDTORequest) throws RestException;


    void borrarDelitoPorId(Long id);
}
