
package com.driss.tp1.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAuteurResponse", namespace = "http://tp1.driss.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAuteurResponse", namespace = "http://tp1.driss.com/")
public class GetAuteurResponse {

    @XmlElement(name = "return", namespace = "")
    private com.driss.tp1.TAuteur _return;

    /**
     * 
     * @return
     *     returns TAuteur
     */
    public com.driss.tp1.TAuteur getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(com.driss.tp1.TAuteur _return) {
        this._return = _return;
    }

}
