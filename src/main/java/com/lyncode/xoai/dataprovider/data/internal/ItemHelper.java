package com.lyncode.xoai.dataprovider.data.internal;

import com.lyncode.xoai.dataprovider.data.Item;
import com.lyncode.xoai.dataprovider.exceptions.WritingXmlException;
import com.lyncode.xoai.dataprovider.xml.XmlOutputContext;
import com.lyncode.xoai.util.XSLPipeline;
import org.codehaus.stax2.XMLOutputFactory2;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class ItemHelper extends ItemIdentifyHelper {
    private static XMLOutputFactory outputFactory = XMLOutputFactory2.newFactory();
    private Item item;

    public ItemHelper(Item item) {
        super(item);
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public InputStream toStream() throws XMLStreamException, WritingXmlException, UnsupportedEncodingException {
        if (item.getMetadata().isCompiled()) {
            return new ByteArrayInputStream(item.getMetadata().getCompiled().getBytes()); //VSTODO: "UTF8"utf8 qui è giusto?? 
        } else {
            ByteArrayOutputStream mdOUT = new ByteArrayOutputStream();
            XmlOutputContext context = XmlOutputContext.emptyContext(mdOUT); //VSTODO: ,"UTF8" utf8 qui è giusto?? 
            item.getMetadata().getMetadata().write(context);
            context.getWriter().flush();
            context.getWriter().close();
            return new ByteArrayInputStream(mdOUT.toByteArray());
        }
    }

    public XSLPipeline toPipeline(boolean omitXMLDeclaration) throws WritingXmlException, XMLStreamException, UnsupportedEncodingException {
        return new XSLPipeline(toStream(), omitXMLDeclaration);
    }
}
