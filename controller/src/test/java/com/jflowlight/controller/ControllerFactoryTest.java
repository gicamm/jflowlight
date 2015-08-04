package com.jflowlight.controller;

import org.jflowlight.controller.Controller;
import org.junit.Test;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class ControllerFactoryTest {

    @Test
    public void testGet() throws Exception {
        final Controller controller = ControllerFactory.builder().
                setControllerType("opendaylight").
                setAddress("192.168.1.55").
                setPort(8181).
                setUser("usr").
                setPwd("strong_pwd").
                build();
    }

}