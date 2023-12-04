package controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController
{

		//business logic request processing
		@RequestMapping(value="/hello",method=RequestMethod.GET)
		public String sayHello()
		{
			return "hello";
		}
		
		@RequestMapping(value="/hello",method=RequestMethod.POST)
		public String sayHello1()
		{
			return "hello";
		}
		
		
		@RequestMapping("/welcome")
		public ModelAndView  welcome(@RequestParam("nm") String name)
		{
			//welcone gets converted into --> /welcome.jsp
				return new ModelAndView("welcome","msg","Welcome ,"+name);
		}
		
		
		@RequestMapping("/process")
		public  String process(ModelMap map,HttpServletRequest req)
		{
			map.addAttribute("r_url",req.getRequestURL());
			map.addAttribute("r_method",req.getMethod());
			map.addAttribute("par_count",req.getParameterMap().size() );
			return "process";
		}
}
