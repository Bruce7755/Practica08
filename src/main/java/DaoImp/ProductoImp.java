package DaoImp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import proye.TblProducto;

public class ProductoImp implements IProducto{

	public void RegistrarProducto(TblProducto tblProducto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proye");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.persist(tblProducto);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
	}

	public void ActualizarProducto(TblProducto tblProducto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proye");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			em.merge(tblProducto);
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			e.getMessage();
		}finally {
			em.close();
		}
		
	}

	public void EliminarProduct(TblProducto tblProducto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proye");
		EntityManager em = emf.createEntityManager();
		
		try {
			em.getTransaction().begin();
			TblProducto productoelim = em.find(TblProducto.class, tblProducto.getIdproducto());
			if(productoelim!=null){
				em.remove(productoelim);
				em.getTransaction().commit();
			}
		} catch (RuntimeException e) {
			if(em.getTransaction().isActive())em.getTransaction().rollback();
			e.getMessage();
		}finally{
			em.close();
		}
		
	}

	public List<TblProducto> ListarProducto() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proye");
		EntityManager em = emf.createEntityManager();
		List<TblProducto> listado = null;
		
		try {
			em.getTransaction().begin();
			listado = em.createQuery("select p from TblProductort1 p", TblProducto.class).getResultList();
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			if(em.getTransaction().isActive())em.getTransaction().rollback();
			e.getMessage();
		}finally{
			em.close();
		}
		return listado;
	}

	public TblProducto buscarProducto(TblProducto tblProducto) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("proye");
		EntityManager em = emf.createEntityManager();
		TblProducto buscaproducto = null;
		
		try {
			em.getTransaction().begin();
			buscaproducto = em.find(TblProducto.class, tblProducto.getIdproducto());
			em.getTransaction().commit();
		} catch (RuntimeException e) {
			if(em.getTransaction().isActive())em.getTransaction().rollback();
			e.getMessage();
		}finally {
			em.close();
		}
		return buscaproducto;
	}

}
