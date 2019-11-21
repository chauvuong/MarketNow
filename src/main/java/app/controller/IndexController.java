package app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import app.model.Categories;
import app.model.Tours;
import app.service.CategoriesService;
import app.service.ToursService;

@Controller("client/users")
public class IndexController {
//	@Autowired
//	private ToursService toursService;
//
//	@GetMapping("/")
//	public ModelAndView home() {
//		List<Tours> tours = toursService.loadTours();
//		ModelAndView mav = new ModelAndView("index");
//		mav.addObject("tours", tours);
//
//		Tours maxSaleOffTour = toursService.maxSaleOffTours();
//		mav.addObject("mSOTour", maxSaleOffTour);
//
//		List<Tours> listSaleOffTours = toursService.loadSaleOffTours();
//		mav.addObject("listSaleOffTours", listSaleOffTours);
//		return mav;
//	}
	@Autowired
	private CategoriesService categoriesService;
	@GetMapping("/")
	public ModelAndView home() {
		List<Categories> categories= categoriesService.loadCategories();
		ModelAndView mav = new ModelAndView("home");
//		System.err.println("blaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"+categories.size());
		mav.addObject("categories", categories.size());
		return mav;
	}
}