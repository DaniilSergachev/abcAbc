package appl.springboot.abcgalaxy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


	@GetMapping("/")
	public String home() {
		return "index"; // Главная страница
	}

	@GetMapping("/letterA")
	public String letterA() {
		return "letterA"; // Страница с буквой A
	}

  @GetMapping("/cartoon")
  public String cartoon() {
    return "cartoon"; // Страница "Мультик"
  }

	@GetMapping("/game")
	public String game() {
		return "game"; // Страница "Игра"
	}


	@GetMapping("/b1")
	public String b() {
		return "b1";
	}

	@GetMapping("/b2")
	public String b2() {
		return "b2";
	}

	@GetMapping("/c1")
	public String c1() {
		return "c1";
	}

	@GetMapping("/c2")
	public String c2() {
		return "c2";
	}


	@GetMapping("/videoA")
	public String test(Model model) {

		model.addAttribute("animationDuration", "1s");
		model.addAttribute("imageChangeDuration", "0.5s");
		model.addAttribute("imageWidth", 100);

		model.addAttribute("leftImageTop", "100px");
		model.addAttribute("rightImageTop", "100px");

		model.addAttribute("handImage", "/images/hand.png");
		model.addAttribute("handReverseImage", "/images/reverseHand.png");


		model.addAttribute("leftFirstImage", "/images/nloAbig.png");
		model.addAttribute("leftSecondImage", "/images/a big.png");
		model.addAttribute("rightFirstImage", "/images/nloaSmall.png");
		model.addAttribute("rightSecondImage", "/images/a small.png");

		return "test2";
	}

	@GetMapping("/test")
	public String test2(Model model) {
		return "test";
	}

	@GetMapping("/d1")
	public String d1() {
		return "d1";
	}

	@GetMapping("/d2")
	public String d2() {
		return "d2";
	}

	@GetMapping("/angry-alien")
	public String alien() {

		return "angry-alien";
	}

	@GetMapping("/ant")
	public String ant() {
		return "ant";
	}

	@GetMapping("/river")
	public String river() {
		return "river";
	}


	@GetMapping("/actor")
	public String actor() {
		return "actor";
	}

	@GetMapping("/c3")
	public String c3() {
		return "c3";
	}

	@GetMapping("/e1")
	public String e1() {
		return "e1";
	}
	@GetMapping("/d3")
	public String d3() {
		return "d3";
	}

}