package puji.wahyono.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import puji.wahyono.entitas.Pesanan;

public interface PesananRepo extends JpaRepository<Pesanan, String> {

	List<Pesanan> findByTgl(final Date tgl);

}
