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


        private String controllerType;
        private String version;
        private String address;
        private Integer port;
        private String user;
        private String pwd;

        /**
         *
         * @return
         * @throws JolException
         */
        public static ControllerFactory builder() throws JolException{
                return new ControllerFactory();
        }

        /**
         *
         * @param controllerType
         * @return
         */
        public ControllerFactory setControllerType(final String controllerType) {
                this.controllerType = controllerType;
                return this;
        }

        /**
         *
         * @param version
         * @return
         */
        public ControllerFactory setVersion(final String version) {
                this.version = version;
                return this;
        }

        /**
         *
         * @param address
         * @return
         */
        public ControllerFactory setAddress(final String address) {
                this.address = address;
                return this;
        }

        /**
         *
         * @param port
         * @return
         */
        public ControllerFactory setPort(final Integer port) {
                this.port = port;
                return this;
        }

        /**
         *
         * @param user
         * @return
         */
        public ControllerFactory setUser(final String user) {
                this.user = user;
                return this;
        }

        /**
         *
         * @param pwd
         * @return
         */
        public ControllerFactory setPwd(final String pwd) {
                this.pwd = pwd;
                return this;
        }

        /**
         *
         * @return
         * @throws JolException
         */
        public Controller build() throws JolException{
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
