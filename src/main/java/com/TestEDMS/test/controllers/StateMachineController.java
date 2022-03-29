package com.TestEDMS.test.controllers;

import com.TestEDMS.test.repositories.DocumentsRepository;
import com.TestEDMS.test.stateMachine.Events;
import com.TestEDMS.test.stateMachine.States;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StateMachineController {

    @Autowired
    DocumentsRepository documentsRepository;

    @GetMapping("/preparation")
    public String preparation(Model model) {
        model.addAttribute("preparation", "Стадия подготовки");
        return "states/preparation";
    }

    @GetMapping("/execution")
    public String execution(Model model) {
        model.addAttribute("execution", "Стадия исполнения");
        return "states/execution";
    }

    @GetMapping("/control")
    public String control(Model model) {
        model.addAttribute("control", "Стадия контроля");
        return "states/control";
    }

    @GetMapping("/revision")
    public String revision(Model model) {
        model.addAttribute("revision", "Стадия доработки");
        return "states/revision";
    }

    @GetMapping("/acceptance")
    public String acceptance(Model model) {
        model.addAttribute("acceptance", "Приём документа");
        return "states/acceptance";
    }
}
