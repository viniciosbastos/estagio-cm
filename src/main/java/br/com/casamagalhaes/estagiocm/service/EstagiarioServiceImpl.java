package br.com.casamagalhaes.estagiocm.service;

import br.com.casamagalhaes.estagiocm.model.Estagiario;
import br.com.casamagalhaes.estagiocm.repository.EstagiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class EstagiarioServiceImpl implements EstagiarioService {

    @Autowired
    private EstagiarioRepository estagiarioRepository;

    @Override
    public String darBoasVindas(Estagiario estagiario) {
        Estagiario resultado = estagiarioRepository.pesquisar(estagiario);
        if (Objects.isNull(resultado)) {
            estagiarioRepository.save(estagiario);
            resultado = estagiario;
        } else {
            resultado = estagiarioRepository.pesquisar(estagiario);
        }

        return resultado.getNome();
    }
}
