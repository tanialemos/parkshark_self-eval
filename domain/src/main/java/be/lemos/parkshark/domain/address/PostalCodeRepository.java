package be.lemos.parkshark.domain.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class PostalCodeRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public PostalCode savePostalCode(PostalCode postalCode){
        entityManager.persist(postalCode);
        return postalCode;
    }

}
