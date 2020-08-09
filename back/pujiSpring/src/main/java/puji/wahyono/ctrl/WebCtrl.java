package puji.wahyono.ctrl;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

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
		mav.addObject("addJs", false);
		mav.addObject("addCss", false);
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

}
