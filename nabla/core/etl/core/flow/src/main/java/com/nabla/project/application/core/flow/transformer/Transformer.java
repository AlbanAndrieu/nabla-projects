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
package com.nabla.project.application.core.flow.transformer;

import com.nabla.project.application.api.config.RequestId;
import com.nabla.project.application.api.helpers.Pipe;
import com.nabla.project.application.api.helpers.PipePublisher;
import com.nabla.project.application.api.transformer.TransformerDataInterface;
import com.nabla.project.application.api.transformer.TransformerThreadInterface;
import com.nabla.project.application.api.writer.WriterDataInterface;

/**
 * DOCUMENT ME!
 *
 * @author $Author: albandri $
 * @version $Revision: 358 $
 * @since $Date: 2010-09-16 01:11:04 +0200 (jeu., 16 sept. 2010) $
 * @param <SRC> DOCUMENT ME!
 * @param <TRG> DOCUMENT ME!
 */
public abstract class Transformer<SRC, TRG> implements TransformerThreadInterface<SRC, TRG>
{

    protected Object                   id;
    protected RequestId                requestId;
    protected String                   name = "Transformer";
    protected Pipe<SRC>                pipeIn;
    protected Pipe<TRG>                pipeOut;
    protected PipePublisher<Throwable> pipeException;
    protected TransformerDataInterface transformerData;
    protected boolean                  isUsePipeOut;
    protected WriterDataInterface      writerData;

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public Object getId()
    {

        return id;

    }

    /**
     * DOCUMENT ME!
     *
     * @param id DOCUMENT ME!
     */
    public void setId(Object id)
    {

        this.id = id;

    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public RequestId getRequestId()
    {

        return requestId;

    }

    /**
     * DOCUMENT ME!
     *
     * @param requestId DOCUMENT ME!
     */
    public void setRequestId(RequestId requestId)
    {

        this.requestId = requestId;

    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getName()
    {

        return name;

    }

    /**
     * DOCUMENT ME!
     *
     * @param name DOCUMENT ME!
     */
    public void setName(String name)
    {

        this.name = name;

    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public PipePublisher<Throwable> getPipeException()
    {

        return pipeException;

    }

    /**
     * DOCUMENT ME!
     *
     * @param pipeException DOCUMENT ME!
     */
    public void setPipeException(PipePublisher<Throwable> pipeException)
    {

        this.pipeException = pipeException;

    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public TransformerDataInterface getTransformerData()
    {

        return transformerData;

    }

    /**
     * DOCUMENT ME!
     *
     * @param transformerData DOCUMENT ME!
     */
    public void setTransformerData(TransformerDataInterface transformerData)
    {

        this.transformerData = transformerData;

    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public WriterDataInterface getWriterData()
    {

        return writerData;

    }

    /**
     * DOCUMENT ME!
     *
     * @param writerData DOCUMENT ME!
     */
    public void setWriterData(WriterDataInterface writerData)
    {

        this.writerData = writerData;

    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public boolean isUsePipeOut()
    {

        return isUsePipeOut;

    }

    /**
     * DOCUMENT ME!
     *
     * @param isUsePipeOut DOCUMENT ME!
     */
    public void setUsePipeOut(boolean isUsePipeOut)
    {

        this.isUsePipeOut = isUsePipeOut;

    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public Pipe<SRC> getPipeIn()
    {

        return pipeIn;

    }

    /**
     * DOCUMENT ME!
     *
     * @param pipeIn DOCUMENT ME!
     */
    public void setPipeIn(Pipe<SRC> pipeIn)
    {

        this.pipeIn = pipeIn;

    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public Pipe<TRG> getPipeOut()
    {

        return pipeOut;

    }

    /**
     * DOCUMENT ME!
     *
     * @param pipeOut DOCUMENT ME!
     */
    public void setPipeOut(Pipe<TRG> pipeOut)
    {

        this.pipeOut = pipeOut;

    }

    /**
     * DOCUMENT ME!
     */
    public void afterPropertiesSet()
    {

    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getPipeInName()
    {

        return (pipeIn != null) ? pipeIn.getName() : null;

    }

    /**
     * DOCUMENT ME!
     *
     * @return DOCUMENT ME!
     */
    public String getPipeOutName()
    {

        return (pipeOut != null) ? pipeOut.getName() : null;

    }

    protected String getTransformerThreadName()
    {

        StringBuffer threadName = new StringBuffer();
        boolean isFirst = true;

        if (this.name != null)
        {

            threadName.append(name);
            isFirst = false;

        }

        if (requestId != null)
        {

            if (!isFirst)
            {

                threadName.append('-');

            }

            threadName.append(requestId);
            isFirst = false;

        }

        if (this.id != null)
        {

            if (!isFirst)
            {

                threadName.append('-');

            }

            threadName.append(this.id);
            isFirst = false;

        }

        return threadName.toString();

    }

}
