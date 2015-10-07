package com.jgabriellima.viridis.repository;

import com.datastax.driver.core.ResultSet;
import com.jgabriellima.viridis.entity.Medidor;
import java.util.Date;
import java.util.List;
import org.springframework.data.cassandra.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface MedidorRepository extends CrudRepository<Medidor, String> {

    @Query(value = "SELECT * FROM jgl.medidor WHERE medidor = ?0")
    List<Medidor> getMedidorByID(String medidorId);

    @Query(value = "SELECT count(*) as result FROM jgl.medidor WHERE medidor = ?0")
    ResultSet countAll(String medidorId);

    @Query(value = "SELECT sum(valor) as result FROM jgl.medidor WHERE medidor = ?0")
    ResultSet sumByMedidor(String medidorId);

    @Query(value = "SELECT sum(valor) as result FROM jgl.medidor WHERE medidor = ?0 and id > ?1 and id<?2")
    ResultSet sumByMedidor(String medidorId, Date start, Date end);

    @Query(value = "SELECT max(valor) as result FROM jgl.medidor WHERE medidor = ?0")
    ResultSet maxByMedidor(String medidorId);

    @Query(value = "SELECT max(valor) as result FROM jgl.medidor WHERE medidor = ?0 and id > ?1 and id<?2")
    ResultSet maxByMedidor(String medidorId, Date start, Date end);

    @Query(value = "SELECT MIN(valor) as result FROM jgl.medidor WHERE medidor = ?0")
    ResultSet minByMedidor(String medidorId);

    @Query(value = "SELECT MIN(valor) as result FROM jgl.medidor WHERE medidor = ?0 and id > ?1 and id<?2")
    ResultSet minByMedidor(String medidorId, Date start, Date end);

    @Query(value = "SELECT AVG(valor) as result FROM jgl.medidor WHERE medidor = ?0")
    ResultSet avgByMedidor(String medidorId);

    @Query(value = "SELECT AVG(valor) as result FROM jgl.medidor WHERE medidor = ?0 and id > ?1 and id<?2")
    ResultSet avgByMedidor(String medidorId, Date start, Date end);
}
