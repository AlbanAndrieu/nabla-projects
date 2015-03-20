/*
 * Copyright (c) 2002-2004, Nabla
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Nabla' nor 'Alban' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package com.nabla.project.application.api;

/**
 * DOCUMENT ME!
 * 
 * @author $Author: albandri $
 * @version $Revision: 358 $
 * @since $Date: 2010-09-16 01:11:04 +0200 (jeu., 16 sept. 2010) $
 */
// TODO DELETE
public class TibcoDestination
{

    private String topic;
    private String network;
    private String service;
    private String daemon;

    /**
     * DOCUMENT ME!
     * 
     * @return DOCUMENT ME!
     */
    public String getDaemon()
    {

        return this.daemon;

    }

    /**
     * DOCUMENT ME!
     * 
     * @param daemon DOCUMENT ME!
     */
    public void setDaemon(final String daemon)
    {

        this.daemon = daemon;

    }

    /**
     * DOCUMENT ME!
     * 
     * @return DOCUMENT ME!
     */
    public String getNetwork()
    {

        return this.network;

    }

    /**
     * DOCUMENT ME!
     * 
     * @param network DOCUMENT ME!
     */
    public void setNetwork(final String network)
    {

        this.network = network;

    }

    /**
     * DOCUMENT ME!
     * 
     * @return DOCUMENT ME!
     */
    public String getService()
    {

        return this.service;

    }

    /**
     * DOCUMENT ME!
     * 
     * @param service DOCUMENT ME!
     */
    public void setService(final String service)
    {

        this.service = service;

    }

    /**
     * DOCUMENT ME!
     * 
     * @return DOCUMENT ME!
     */
    public String getTopic()
    {

        return this.topic;

    }

    /**
     * DOCUMENT ME!
     * 
     * @param topic DOCUMENT ME!
     */
    public void setTopic(final String topic)
    {

        this.topic = topic;

    }

}
