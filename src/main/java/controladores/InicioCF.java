package controladores;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


//import modelos.Libro;

public class InicioCF {
	
	public static void main(String[] args) {		
		
	EntityManagerFactory emf = null;
    EntityManager em = null;

    try {
        // Crea el EntityManagerFactory
        emf = Persistence.createEntityManagerFactory("MiPersistencia");

        // Crea el EntityManager
        em = emf.createEntityManager();

        // Verifica la conexión realizando una operación simple, como imprimir metadatos de la base de datos
        System.out.println("Conexión establecida correctamente. Metadatos de la base de datos:");

    } catch (Exception e) {
        e.printStackTrace();
        System.out.println("Error al establecer la conexión a la base de datos.");
    } finally {
        // Cierra los recursos
        if (em != null) {
            em.close();
        }
        if (emf != null) {
            emf.close();
        }    
    }
    
    
    
    }
}
