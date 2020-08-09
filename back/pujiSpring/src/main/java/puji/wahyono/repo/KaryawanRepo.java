package puji.wahyono.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import puji.wahyono.entitas.Karyawan;

public interface KaryawanRepo extends JpaRepository<Karyawan, String> {

}
