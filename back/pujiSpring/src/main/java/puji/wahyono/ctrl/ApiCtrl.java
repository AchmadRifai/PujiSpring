package puji.wahyono.ctrl;

import org.springframework.web.bind.annotation.RequestBody;

import puji.wahyono.In;
import puji.wahyono.Out;

public interface ApiCtrl<T, W> {

	java.util.List<T> index();
	Out<T> add(@RequestBody T v);
	Out<T> edit(@RequestBody In<T, W> v);
	Out<T> del(@RequestBody In<T, W> v);

}
