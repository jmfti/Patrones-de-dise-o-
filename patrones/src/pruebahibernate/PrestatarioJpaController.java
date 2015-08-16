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
public class PrestatarioJpaController implements Serializable {
    
    public void PrestatarioJpaController(EntityManagerFactory emf){
        this.emf = emf;
        /*
        * TODO : constructor
        */
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Prestatario prestatario) throws PreexistingEntityException, Exception {
        if (prestatario.getPrestatarioPK() == null) {
            prestatario.setPrestatarioPK(new PrestatarioPK());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(prestatario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPrestatario(prestatario.getPrestatarioPK()) != null) {
                throw new PreexistingEntityException("Prestatario " + prestatario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Prestatario prestatario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            prestatario = em.merge(prestatario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                PrestatarioPK id = prestatario.getPrestatarioPK();
                if (findPrestatario(id) == null) {
                    throw new NonexistentEntityException("The prestatario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(PrestatarioPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Prestatario prestatario;
            try {
                prestatario = em.getReference(Prestatario.class, id);
                prestatario.getPrestatarioPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The prestatario with id " + id + " no longer exists.", enfe);
            }
            em.remove(prestatario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Prestatario> findPrestatarioEntities() {
        return findPrestatarioEntities(true, -1, -1);
    }

    public List<Prestatario> findPrestatarioEntities(int maxResults, int firstResult) {
        return findPrestatarioEntities(false, maxResults, firstResult);
    }

    private List<Prestatario> findPrestatarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Prestatario.class));
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

    public Prestatario findPrestatario(PrestatarioPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Prestatario.class, id);
        } finally {
            em.close();
        }
    }

    public int getPrestatarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Prestatario> rt = cq.from(Prestatario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
