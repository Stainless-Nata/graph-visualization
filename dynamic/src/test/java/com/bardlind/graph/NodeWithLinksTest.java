package com.bardlind.graph;

import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: baardl
 * Date: 1/2/14
 * Time: 10:00 PM
 * To change this template use File | Settings | File Templates.
 */
public class NodeWithLinksTest {
    @Test
    public void testGetAdjacencies() throws Exception {
        ArrayList<NodeWithLinks> graph = new ArrayList<>();
        NodeWithLinks node1 = new NodeWithLinks("node1", "node1");
        node1.addAdjacency(new Link("node1", "node2"));
        node1.addAdjacency(new Link("node1", "node3"));
        graph.add(node1);

        assertNotNull(graph);
        assertNotNull(node1);
        assertNotNull(node1.getAdjacencies());
        Link[] adjecencies = node1.getAdjacencies();
        assertNotNull(adjecencies);
        assertEquals("node1", adjecencies[0].getNodeFrom());
        assertEquals("node2", adjecencies[0].getNodeTo());

    }
}
