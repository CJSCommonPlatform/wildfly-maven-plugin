/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2013, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.wildfly.plugin.server;

/**
 * @author <a href="mailto:jperkins@redhat.com">James R. Perkins</a>
 */
interface Defaults {

    /**
     * The default JVM arguments.
     */
    String DEFAULT_JVM_ARGS = "-Xms64m -Xmx512m -XX:MaxPermSize=256m -Djava.net.preferIPv4Stack=true";

    /**
     * The default group id
     */
    String WILDFLY_GROUP_ID = "org.wildfly";

    /**
     * The default artifact id
     */
    String WILDFLY_ARTIFACT_ID = "wildfly-dist";

    /*
     * The default packaging type
     */
    String WILDFLY_PACKAGING = "zip";

    /**
     * The default WildFly version.
     */
    String WILDFLY_TARGET_VERSION = "8.0.0.Final";

    /**
     * The default startup timeout.
     */
    String TIMEOUT = "60";

    String KEEP_ALIVE = "false";
}
