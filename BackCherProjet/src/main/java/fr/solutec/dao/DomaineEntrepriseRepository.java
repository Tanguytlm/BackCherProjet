package fr.solutec.dao;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import fr.solutec.entities.DomaineEntreprise;

public interface DomaineEntrepriseRepository extends CrudRepository<DomaineEntreprise, Long>{
	public Optional<DomaineEntreprise> findByEntrepriseIdUtilisateur(Long id);
	public Optional<DomaineEntreprise> findByDomaineIdDomaine(Long id);
}
