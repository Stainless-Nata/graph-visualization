package com.bardlind.graph;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GraphController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public @ResponseBody ArrayList<NodeWithLinks> buildGraph(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        ArrayList<NodeWithLinks> graph = new ArrayList<>();
        NodeWithLinks node1 = new NodeWithLinks("node1", "node1");
        node1.addAdjacency(new Link("node1", "node2"));
        node1.addAdjacency(new Link("node1", "node3"));
        graph.add(node1);
        NodeWithLinks node2 = new NodeWithLinks("node2", "node2");
        node2.addAdjacency(new Link("node2", "node3"));
        graph.add(node2);
        graph.add(new NodeWithLinks("node3", "node3"));
        return graph;

        //return new Greeting(counter.incrementAndGet(),
        //        String.format(template, name));
    }
}
