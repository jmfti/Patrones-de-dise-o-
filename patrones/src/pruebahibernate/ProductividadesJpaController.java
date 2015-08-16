/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebahibernate;

import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import pruebahibernate.exceptions.NonexistentEntityException;
import pruebahibernate.exceptions.PreexistingEntityException;

/**
 *
 * @author Xavier Mira Fernandez
 */
public class ProductividadesJpaController implements Serializable {
    
    public void ProductividadesJpaController(EntityManagerFactory emf){
        this.emf = emf;
        /*
        * TODO : constructor
        */
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Productividades productividades) throws PreexistingEntityException, Exception {
        if (productividades.getProductividadesPK() == null) {
            productividades.setProductividadesPK(new ProductividadesPK());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(productividades);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findProductividades(productividades.getProductividadesPK()) != null) {
                throw new PreexistingEntityException("Productividades " + productividades + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Productividades productividades) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            productividades = em.merge(productividades);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                ProductividadesPK id = productividades.getProductividadesPK();
                if (findProductividades(id) == null) {
                    throw new NonexistentEntityException("The productividades with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(ProductividadesPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Productividades productividades;
            try {
                productividades = em.getReference(Productividades.class, id);
                productividades.getProductividadesPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The productividades with id " + id + " no longer exists.", enfe);
            }
            em.remove(productividades);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Productividades> findProductividadesEntities() {
        return findProductividadesEntities(true, -1, -1);
    }

    public List<Productividades> findProductividadesEntities(int maxResults, int firstResult) {
        return findProductividadesEntities(false, maxResults, firstResult);
    }

    private List<Productividades> findProductividadesEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Productividades.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Productividades findProductividades(ProductividadesPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Productividades.class, id);
        } finally {
            em.close();
        }
    }

    public int getProductividadesCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Productividades> rt = cq.from(Productividades.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
