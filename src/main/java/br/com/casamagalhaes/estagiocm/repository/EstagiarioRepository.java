package br.com.casamagalhaes.estagiocm.repository;

import br.com.casamagalhaes.estagiocm.model.Estagiario;

public interface EstagiarioRepository {

    public void save(Estagiario estagiario);

    public Estagiario pesquisar(Estagiario estagiario);

}
