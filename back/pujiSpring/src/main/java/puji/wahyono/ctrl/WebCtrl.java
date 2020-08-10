package puji.wahyono.ctrl;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import puji.wahyono.beans.Meja2;
import puji.wahyono.beans.Menu2;
import puji.wahyono.entitas.Karyawan;
import puji.wahyono.repo.*;

@Controller
public class WebCtrl {

	@Autowired
	private KaryawanRepo repo1;

	@GetMapping({"/","/index.html"})
	public ModelAndView index(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("judul", "Login Karyawan | Ayam Bakar Wong Solo");
		mav.addObject("error", null != session.getAttribute("error"));
		session.removeAttribute("error");
		mav.addObject("addJs", false);
		mav.addObject("addCss", false);
		mav.addObject("autoreload", false);
		if (null != session.getAttribute("log")) {
			String s = (String) session.getAttribute("log");
			Karyawan k = repo1.findById(s).orElse(null);
			if (k != null) {
				if (k.isMlebu()) return new ModelAndView("redirect:/dash.php");
				else session.removeAttribute("log");
			}
		} mav.setViewName("login");
		return mav;
	}

	@GetMapping("/dash.php")
	public ModelAndView dashPhp(HttpSession session) {
		if (null != session.getAttribute("log")) {
			String s = (String) session.getAttribute("log");
			Karyawan k = repo1.findById(s).orElse(null);
			if (k != null) {
				if ("admin".equals(k.getJab())) return new ModelAndView("redirect:/dash-admin.html");
				else if ("teller".equals(k.getJab())) return new ModelAndView("redirect:/dash-kasir.html");
				else if ("koki".equals(k.getJab())) return new ModelAndView("redirect:/dash-koki.html");
				else {
					session.removeAttribute("log");
					return new ModelAndView("redirect:/index.html");
				}
			} else {
				session.removeAttribute("log");
				return new ModelAndView("redirect:/index.html");
			}
		} else return new ModelAndView("redirect:/index.html");
	}

	@GetMapping("/dash-koki.html")
	public ModelAndView dashKoki(HttpSession session) {
		if(sesiUntuk(session, "koki")) {
			String s = (String) session.getAttribute("log");
			Karyawan k = repo1.findById(s).orElse(null);
			ModelAndView mav = new ModelAndView("koki");
			mav.addObject("tahun", 1900 + (LocalDate.now().getYear()));
			mav.addObject("judul", "Dashboard Koki | Ayam Bakar Wong Solo");
			mav.addObject("addJs", true);
			mav.addObject("addCss", true);
			mav.addObject("autoreload", true);
			mav.addObject("csse", Arrays.asList("plugins/datatables-bs4/css/dataTables.bootstrap4.min.css",
					"plugins/datatables-responsive/css/responsive.bootstrap4.min.css"));
			mav.addObject("jsse", Arrays.asList("plugins/datatables/jquery.dataTables.min.js",
					"plugins/datatables-bs4/js/dataTables.bootstrap4.min.js",
					"plugins/datatables-responsive/js/dataTables.responsive.min.js",
					"plugins/datatables-responsive/js/responsive.bootstrap4.min.js","dist/js/demo.js","jd/tabel.js"));
			mav.addObject("ini", k);
			mav.addObject("menus", Arrays.asList(new Menu2("/index.html","Home","home"),new Menu2("/profile.html","Profile",
					"user"),new Menu2("/logout.php","Logout","lock")));
			mav.addObject("pesans", pesananHariini());
			return mav;
		} else return new ModelAndView("redirect:/dash.php");
	}

	private List<Meja2> pesananHariini() {
		// TODO Auto-generated method stub
		return null;
	}

	private boolean sesiUntuk(HttpSession session, String string) {
		boolean b = false;
		String s = (String) session.getAttribute("log");
		Karyawan k = repo1.findById(s).orElse(null);
		if (k != null) {
			if (k.isMlebu()) b = string.equals(k.getJab());
			else session.removeAttribute("log");
		} else session.removeAttribute("log");
		return b;
	}

	@PostMapping("/logout.php")
	public ModelAndView logout(HttpSession session) {
		if(null != session.getAttribute("log")) {
			String s = (String) session.getAttribute("log");
			Karyawan k = repo1.findById(s).orElse(null);
			if (k != null) {
				k.setMlebu(false);
				repo1.save(k);
			} session.removeAttribute("log");
		} return new ModelAndView("redirect:/index.html");
	}

	@PostMapping("/login.exe")
	public ModelAndView login(HttpSession session, HttpServletRequest req) {
		String uid = req.getParameter("uid"), pass = req.getParameter("sandi");
		Karyawan k = repo1.findById(uid).orElse(null);
		if (k != null) {
			if (pass.equals(k.getPass())) {
				session.setAttribute("log", uid);
				k.setMlebu(true);
				repo1.save(k);
			} else session.setAttribute("error", "login.exe/pass");
		} else session.setAttribute("error", "login.exe");
		return new ModelAndView("redirect:/index.html");
	}

}
