package org.codehaus.modello.plugin.store.metadata;

/*
 * Copyright (c) 2005, Codehaus.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

import org.codehaus.modello.metadata.AssociationMetadata;

/**
 * @author <a href="mailto:jason@maven.org">Jason van Zyl</a>
 * @version $Id: StoreAssociationMetadata.java 378 2005-06-19 21:04:43Z trygvis $
 */
public class StoreAssociationMetadata
    implements AssociationMetadata
{
    public static final String ID = StoreAssociationMetadata.class.getName();

    private boolean storable;

    private Boolean part;

    private String keyType;

    public void setStorable( boolean storable )
    {
        this.storable = storable;
    }

    public boolean isStorable()
    {
        return storable;
    }

    public Boolean isPart()
    {
        return part;
    }

    public void setPart( Boolean part )
    {
        this.part = part;
    }

    public String getKeyType()
    {
        return keyType;
    }

    public void setKeyType( String keyType )
    {
        this.keyType = keyType;
    }
}
