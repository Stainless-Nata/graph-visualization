package com.bardlind.graph;


public class Link {
    private String nodeTo;
    private String nodeFrom;

    public Link() {
    }

    public Link(String nodeTo, String nodeFrom) {
        this.nodeTo = nodeTo;
        this.nodeFrom = nodeFrom;
    }

    public String getNodeTo() {
        return nodeTo;
    }

    public void setNodeTo(String nodeTo) {
        this.nodeTo = nodeTo;
    }

    public String getNodeFrom() {
        return nodeFrom;
    }

    public void setNodeFrom(String nodeFrom) {
        this.nodeFrom = nodeFrom;
    }
}
