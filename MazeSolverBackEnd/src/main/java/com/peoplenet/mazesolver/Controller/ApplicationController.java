package com.peoplenet.mazesolver.Controller;

import com.peoplenet.mazesolver.Solver.Maze;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ApplicationController {

    @RequestMapping(path = "/solve", method = RequestMethod.POST)
    @ResponseBody String solve(@RequestBody String input) {
        Maze maze = new Maze();
        if(maze.createMaze(input).solveMaze()){
            return maze.getSolutionString();
        }
        return null;
    }
    @RequestMapping(value = "/")
    public String index() {
        return "index.html";
    }
}
