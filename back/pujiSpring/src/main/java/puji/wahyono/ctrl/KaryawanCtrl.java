package puji.wahyono.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import puji.wahyono.In;
import puji.wahyono.Out;
import puji.wahyono.entitas.Karyawan;
import puji.wahyono.repo.KaryawanRepo;

@CrossOrigin
@RestController
@RequestMapping("/api/karyawan")
public class KaryawanCtrl implements ApiCtrl<Karyawan, String> {

	@Autowired
	private KaryawanRepo repo;

	@GetMapping("/")
	@Override
	public List<Karyawan> index() {
		return repo.findAll();
	}

	@Override
	@PostMapping("/add")
	public Out<Karyawan> add(@RequestBody Karyawan v) {
		Out<Karyawan> o = new Out<>();
		o.setVal(v);
		if (repo.existsById(v.getKode())) o.setMsg("Tidak tersimpan");
		else {
			repo.save(v);
			o.setMsg("Sukses");
		} return o;
	}

	@Override
	@PostMapping("/edit")
	public Out<Karyawan> edit(@RequestBody In<Karyawan, String> v) {
		Out<Karyawan> o = new Out<>();
		o.setVal(v.getVal());
		if (repo.existsById(v.getWhat())) {
			Karyawan k = repo.findById(v.getWhat()).get();
			k.setAlmt(v.getVal().getAlmt());
			k.setJab(v.getVal().getJab());
			k.setMlebu(v.getVal().isMlebu());
			k.setNama(v.getVal().getNama());
			k.setPass(v.getVal().getPass());
			repo.save(k);
			o.setVal(k);
			o.setMsg("Sukses");
		} else o.setMsg("Tidak terupdate");
		return o;
	}

	@Override
	@PostMapping("/delete")
	public Out<Karyawan> del(@RequestBody In<Karyawan, String> v) {
		Out<Karyawan> o = new Out<>();
		o.setVal(v.getVal());
		if (repo.existsById(v.getWhat())) {
			o.setVal(repo.findById(v.getWhat()).get());
			repo.delete(o.getVal());
			o.setMsg("Sukses");
		} else o.setMsg("Tidak terhapus");
		return o;
	}

}
