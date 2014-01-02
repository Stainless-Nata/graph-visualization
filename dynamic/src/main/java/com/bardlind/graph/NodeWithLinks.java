package com.bardlind.graph;


import java.util.ArrayList;

public class NodeWithLinks {
    private String id;
    private String name;
    private ArrayList<Link> adjacencies = new ArrayList<>();

    public NodeWithLinks() {
    }

    public NodeWithLinks(String id, String name) {
        this.id = id;
        this.name = name;
        this.adjacencies = adjacencies;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Link[] getAdjacencies() {
        return (Link[])adjacencies.toArray();
    }

    public void addAdjacency(Link adjacency) {
        adjacencies.add(adjacency);
    }
}
