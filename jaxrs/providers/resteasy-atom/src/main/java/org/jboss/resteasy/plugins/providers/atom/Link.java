package org.jboss.resteasy.plugins.providers.atom;

import javax.ws.rs.core.MediaType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.net.URI;

/**
 * <p>Per RFC4287:</p>
 * <p/>
 * <pre>
 *  The "atom:link" element defines a reference from an entry or feed to
 *  a Web resource.  This specification assigns no meaning to the content
 *  (if any) of this element.
 * <p/>
 *  atomLink =
 *     element atom:link {
 *        atomCommonAttributes,
 *        attribute href { atomUri },
 *        attribute rel { atomNCName | atomUri }?,
 *        attribute type { atomMediaType }?,
 *        attribute hreflang { atomLanguageTag }?,
 *        attribute title { text }?,
 *        attribute length { text }?,
 *        undefinedContent
 *     }
 * </pre>
 *
 * @author <a href="mailto:bill@burkecentral.com">Bill Burke</a>
 * @version $Revision: 1 $
 */
@XmlRootElement(name = "link")
@XmlAccessorType(XmlAccessType.PROPERTY)
public class Link extends CommonAttributes
{
   private URI href;

   private String rel;

   private MediaType type;

   private String hreflang;

   private String title;

   private String length;

   @XmlAttribute(required = true)
   public URI getHref()
   {
      return href;
   }

   public void setHref(URI href)
   {
      this.href = href;
   }

   @XmlAttribute
   public String getRel()
   {
      return rel;
   }

   public void setRel(String rel)
   {
      this.rel = rel;
   }

   @XmlAttribute
   public MediaType getType()
   {
      return type;
   }

   public void setType(MediaType type)
   {
      this.type = type;
   }

   @XmlAttribute
   public String getHreflang()
   {
      return hreflang;
   }

   public void setHreflang(String hreflang)
   {
      this.hreflang = hreflang;
   }

   @XmlAttribute
   public String getTitle()
   {
      return title;
   }

   public void setTitle(String title)
   {
      this.title = title;
   }

   @XmlAttribute
   public String getLength()
   {
      return length;
   }

   public void setLength(String length)
   {
      this.length = length;
   }
}
