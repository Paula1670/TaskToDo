package com.cmepps.listatareas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cmepps.listatareas.model.SemanalModel;
import com.cmepps.listatareas.model.Todo;
import com.cmepps.listatareas.service.ITodoService;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Controller
public class SemanalController {

    // Simulación de datos de tareas
   /* private List<SemanalModel> getSampleTasks() {
        List<SemanalModel> tasks = new ArrayList<>();
        tasks.add(new SemanalModel("Tarea 1", "Descripción de la Tarea 1", LocalDate.now().plusDays(1), 1));
        tasks.add(new SemanalModel("Tarea 2", "Descripción de la Tarea 2", LocalDate.now().plusDays(2), 2));
        tasks.add(new SemanalModel("Tarea 3", "Descripción de la Tarea 3", LocalDate.now().plusDays(3), 3));
        return tasks;
    }*/


}