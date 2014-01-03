package com.bardlind.graph;


import java.util.ArrayList;

public class GraphBuilderStub implements GraphBuilder {
    @Override
    public ArrayList<NodeWithLinks> findGraph(String startNodeId) {
        ArrayList<NodeWithLinks> graph = new ArrayList<>();
        NodeWithLinks node1 = new NodeWithLinks("node1", "node1");
        node1.addAdjacency(new Link("node1", "node2"));
        node1.addAdjacency(new Link("node1", "node3"));
        graph.add(node1);
        NodeWithLinks node2 = new NodeWithLinks("node2", "node2");
        node2.addAdjacency(new Link("node2", "node3"));
        graph.add(node2);
        graph.add(new NodeWithLinks("node3", "node3"));
        NodeWithLinks node4 = new NodeWithLinks("node4", "node4");
        node4.addAdjacency(new Link("node4", "node3"));
        graph.add(node4);
        return graph;
    }
}
