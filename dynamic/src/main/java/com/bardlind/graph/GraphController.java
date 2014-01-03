package com.bardlind.graph;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class GraphController {
    GraphBuilder graphBuilder = new GraphBuilderStub();

    @RequestMapping("/graph")
    public @ResponseBody ArrayList<NodeWithLinks> buildGraph(
            @RequestParam(value = "name", required = false, defaultValue = "1") String name) {

        return graphBuilder.findGraph(name);
    }
}
