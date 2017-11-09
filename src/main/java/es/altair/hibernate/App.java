package es.altair.hibernate;

import java.util.Date;

import es.altair.hibernate.bean.Asistencia;
import es.altair.hibernate.bean.Equipo;
import es.altair.hibernate.bean.Tecnico;
import es.altair.hibernate.dao.AsistenciaDAIImplemHibernate;
import es.altair.hibernate.dao.AsistenciaDAO;

public class App 
{
    public static void main( String[] args )
    {
        AsistenciaDAO asDao = new AsistenciaDAIImplemHibernate();
        
        Tecnico t1 = new Tecnico("Ford", "Ray", "122121221", "ray@t1.com");
        
        Equipo eq1 = new Equipo("FabrFord", "Rua Tal", new Date(), 100.23);
        
        Asistencia as = new Asistencia(t1, eq1, new Date(), "Fonte Rota");
       
        asDao.save(as);
        
        
    }
}
