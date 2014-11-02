
package com.driss.tp1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getLivreResponse", namespace = "http://tp1.driss.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLivreResponse", namespace = "http://tp1.driss.com/")
public class GetLivreResponse {

    @XmlElement(name = "return", namespace = "")
    private com.driss.tp1.TLivre _return;

    /**
     * 
     * @return
     *     returns TLivre
     */
    public com.driss.tp1.TLivre getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.driss.tp1.TLivre _return) {
        this._return = _return;
    }

}
