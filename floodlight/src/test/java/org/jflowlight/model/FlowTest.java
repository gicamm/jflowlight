package org.jflowlight.model;

import org.jflowlight.model.flow.Flow;
import org.jflowlight.utils.serialization.SerializationUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class FlowTest {


    @Test
    public void testJson() throws Exception {

        final String source = "{\"switch\":\"00:00:00:00:00:00:00:01\", \"name\":\"drop1\", \"active\":\"true\",\"ether-type\":\"0x800\",\"dst-ip\":\"10.0.0.1\",\"src-ip\":\"10.0.0.2\"}";

        final Flow flow = SerializationUtils.fromJson(source, Flow.class);

        System.out.println(flow);

        System.out.println(source);
        final String toJson = SerializationUtils.toJson(flow);
        System.out.println(toJson);
        assertTrue(source.equals(toJson));

    }
}