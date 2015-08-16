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
public class ImpositorJpaController implements Serializable {
    
    public void ImpositorJpaController(EntityManagerFactory emf){
        this.emf = emf;
        /*
        * TODO : constructor
        */
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Impositor impositor) throws PreexistingEntityException, Exception {
        if (impositor.getImpositorPK() == null) {
            impositor.setImpositorPK(new ImpositorPK());
        }
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(impositor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findImpositor(impositor.getImpositorPK()) != null) {
                throw new PreexistingEntityException("Impositor " + impositor + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Impositor impositor) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            impositor = em.merge(impositor);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                ImpositorPK id = impositor.getImpositorPK();
                if (findImpositor(id) == null) {
                    throw new NonexistentEntityException("The impositor with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(ImpositorPK id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Impositor impositor;
            try {
                impositor = em.getReference(Impositor.class, id);
                impositor.getImpositorPK();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The impositor with id " + id + " no longer exists.", enfe);
            }
            em.remove(impositor);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Impositor> findImpositorEntities() {
        return findImpositorEntities(true, -1, -1);
    }

    public List<Impositor> findImpositorEntities(int maxResults, int firstResult) {
        return findImpositorEntities(false, maxResults, firstResult);
    }

    private List<Impositor> findImpositorEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Impositor.class));
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

    public Impositor findImpositor(ImpositorPK id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Impositor.class, id);
        } finally {
            em.close();
        }
    }

    public int getImpositorCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Impositor> rt = cq.from(Impositor.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }

}
