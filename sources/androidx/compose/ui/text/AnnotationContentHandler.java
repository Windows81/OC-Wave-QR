package androidx.compose.ui.text;

import android.text.Editable;
import java.util.ArrayList;
import kotlin.Metadata;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;

@Metadata
final class AnnotationContentHandler implements ContentHandler {

    /* renamed from: a  reason: collision with root package name */
    public final ContentHandler f18243a;

    /* renamed from: b  reason: collision with root package name */
    public final Editable f18244b;

    /* renamed from: c  reason: collision with root package name */
    public int f18245c;

    /* renamed from: d  reason: collision with root package name */
    public BulletSpanWithLevel f18246d;

    public AnnotationContentHandler(ContentHandler contentHandler, Editable editable) {
        this.f18243a = contentHandler;
        this.f18244b = editable;
    }

    public final void a() {
        BulletSpanWithLevel bulletSpanWithLevel = this.f18246d;
        if (bulletSpanWithLevel != null) {
            this.f18244b.setSpan(bulletSpanWithLevel, bulletSpanWithLevel.c(), this.f18244b.length(), 33);
        }
        this.f18246d = null;
    }

    public final void b() {
        Editable editable = this.f18244b;
        Object[] spans = editable.getSpans(0, editable.length(), AnnotationSpan.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (this.f18244b.getSpanFlags((AnnotationSpan) obj) == 17) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            AnnotationSpan annotationSpan = (AnnotationSpan) arrayList.get(i2);
            int spanStart = this.f18244b.getSpanStart(annotationSpan);
            int length = this.f18244b.length();
            this.f18244b.removeSpan(annotationSpan);
            if (spanStart != length) {
                this.f18244b.setSpan(annotationSpan, spanStart, length, 33);
            }
        }
    }

    public final void c(Attributes attributes) {
        int length = attributes.getLength();
        for (int i2 = 0; i2 < length; i2++) {
            String localName = attributes.getLocalName(i2);
            String str = "";
            if (localName == null) {
                localName = str;
            }
            String value = attributes.getValue(i2);
            if (value != null) {
                str = value;
            }
            if (localName.length() > 0 && str.length() > 0) {
                int length2 = this.f18244b.length();
                this.f18244b.setSpan(new AnnotationSpan(localName, str), length2, length2, 17);
            }
        }
    }

    public void characters(char[] cArr, int i2, int i3) {
        this.f18243a.characters(cArr, i2, i3);
    }

    public final void d() {
        a();
    }

    public final void e() {
        a();
        this.f18246d = new BulletSpanWithLevel(BulletKt.a(), this.f18245c, this.f18244b.length());
    }

    public void endDocument() {
        this.f18243a.endDocument();
    }

    public void endElement(String str, String str2, String str3) {
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1555043537) {
                if (hashCode != 3453) {
                    if (hashCode == 3735 && str2.equals("ul")) {
                        f();
                        return;
                    }
                } else if (str2.equals("li")) {
                    d();
                    return;
                }
            } else if (str2.equals("annotation")) {
                b();
                return;
            }
        }
        this.f18243a.endElement(str, str2, str3);
    }

    public void endPrefixMapping(String str) {
        this.f18243a.endPrefixMapping(str);
    }

    public final void f() {
        a();
        this.f18245c--;
    }

    public final void g() {
        a();
        this.f18245c++;
    }

    public void ignorableWhitespace(char[] cArr, int i2, int i3) {
        this.f18243a.ignorableWhitespace(cArr, i2, i3);
    }

    public void processingInstruction(String str, String str2) {
        this.f18243a.processingInstruction(str, str2);
    }

    public void setDocumentLocator(Locator locator) {
        this.f18243a.setDocumentLocator(locator);
    }

    public void skippedEntity(String str) {
        this.f18243a.skippedEntity(str);
    }

    public void startDocument() {
        this.f18243a.startDocument();
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1555043537) {
                if (hashCode != 3453) {
                    if (hashCode == 3735 && str2.equals("ul")) {
                        g();
                        return;
                    }
                } else if (str2.equals("li")) {
                    e();
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    c(attributes);
                    return;
                }
                return;
            }
        }
        this.f18243a.startElement(str, str2, str3, attributes);
    }

    public void startPrefixMapping(String str, String str2) {
        this.f18243a.startPrefixMapping(str, str2);
    }
}
