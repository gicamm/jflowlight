package com.jflowlight.controller;

import org.jflowlight.JolException;
import org.jflowlight.controller.Controller;
import org.jflowlight.floodligh.FloodlightController;
import org.jflowlight.opendaylight.OpenDayLightController;
import java.text.MessageFormat;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class ControllerFactory {

        public enum ControllerType {
                OPENDAYLIGHT,
                FLOODLIGHT
        }

        public static Controller get(final ControllerType controllerType, final String address, final Integer port, final String user, final String pwd) throws JolException{
                switch (controllerType){
                        case OPENDAYLIGHT:
                                return new OpenDayLightController(address,port,user,pwd);
                        case FLOODLIGHT:
                                return new FloodlightController(address,port,user,pwd);
                        default:
                                throw new JolException(MessageFormat.format("The controller type [{0}] is not supported yet",controllerType));
                }
        }

}
