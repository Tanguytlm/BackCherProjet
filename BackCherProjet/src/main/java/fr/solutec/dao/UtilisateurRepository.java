package fr.solutec.dao;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import fr.solutec.entities.Utilisateur;

public interface UtilisateurRepository extends CrudRepository<Utilisateur, Long>{
	public Optional<Utilisateur> findByMailAndMdp(String mail,String mdp);
}
