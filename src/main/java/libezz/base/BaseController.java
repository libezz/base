package libezz.base;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/*.do")
public class BaseController {

	@RequestMapping("/getMessage")
	public Object getMassage() {
		return new Object() {
			private String name = "张三";
			private int age = 33;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
		};
	}
}
