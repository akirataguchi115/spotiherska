package com.example.spotiherska

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun spotih(model: Model): String {
        model["title"] = "SpotiHerska"
        return "spotih"
    }

}