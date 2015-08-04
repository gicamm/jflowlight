package com.jflowlight.controller;

import org.apache.commons.lang3.StringUtils;
import org.jflowlight.JolException;
import org.jflowlight.controller.Controller;
import org.jflowlight.floodligh.FloodlightController;
import org.jflowlight.opendaylight.OpenDayLightController;
import java.text.MessageFormat;

/**
 * @author Giovanni Cammarata <cammarata.giovanni@gmail.com>
 */
public class ControllerFactory {

        /**
         *
         * @param controllerType the controller type (e.g. opendaylight)
         * @param version the version. Currently not supported
         * @param address
         * @param port
         * @param user
         * @param pwd
         * @return
         * @throws JolException
         */
        public static Controller get(final String controllerType, final String version, final String address, final Integer port, final String user, final String pwd) throws JolException{
                if(StringUtils.isBlank(controllerType))
                        throw new JolException("Type must not be blank");

                switch (StringUtils.trim(StringUtils.lowerCase(controllerType))){
                        case "opendaylight":
                                return new OpenDayLightController(address,port,user,pwd);
                        case "floodlight":
                                return new FloodlightController(address,port,user,pwd);
                        default:
                                throw new JolException(MessageFormat.format("The controller type [{0}] is not supported yet",controllerType));
                }
        }

}
