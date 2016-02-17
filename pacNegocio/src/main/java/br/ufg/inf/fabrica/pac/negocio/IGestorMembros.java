package br.ufg.inf.fabrica.pac.negocio;

import br.ufg.inf.fabrica.pac.dominio.MembroProjeto;
import br.ufg.inf.fabrica.pac.dominio.Projeto;
import br.ufg.inf.fabrica.pac.dominio.Resposta;
import br.ufg.inf.fabrica.pac.dominio.Usuario;
import java.util.List;

/**
 *
 * @author Danillo
 */
public interface IGestorMembros {
    
    /**
     * 
     * @param autor
     * @param projeto
     * @return 
     */
    public Resposta<List<Usuario>> buscarUsuarios(Usuario autor, Projeto projeto);
    
    /**
     * 
     * @param autor
     * @param membro
     * @return 
     */
    public Resposta<MembroProjeto> adicionarMembroProjeto(Usuario autor, MembroProjeto membro);
    
    /**
     * 
     * @param autor
     * @param membro
     * @return 
     */
    public Resposta<MembroProjeto> removerMembroProjeto(Usuario autor, MembroProjeto membro);
}
