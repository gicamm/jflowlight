package com.jflowlight.controller;

import org.jflowlight.controller.Controller;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class ControllerFactoryTest {

    @Test
    public void testGet() throws Exception {
        final Controller controller = ControllerFactory.get(ControllerFactory.ControllerType.OPENDAYLIGHT, "address", 8181, "user", "strong_pwd");
    }

}