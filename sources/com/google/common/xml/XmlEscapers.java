package com.google.common.xml;

import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;

@ElementTypesAreNonnullByDefault
public class XmlEscapers {

    /* renamed from: a  reason: collision with root package name */
    public static final Escaper f29622a;

    /* renamed from: b  reason: collision with root package name */
    public static final Escaper f29623b;

    /* renamed from: c  reason: collision with root package name */
    public static final Escaper f29624c;

    static {
        Escapers.Builder a2 = Escapers.a();
        a2.d(0, 65533);
        a2.e("�");
        for (char c2 = 0; c2 <= 31; c2 = (char) (c2 + 1)) {
            if (!(c2 == 9 || c2 == 10 || c2 == 13)) {
                a2.b(c2, "�");
            }
        }
        a2.b('&', "&amp;");
        a2.b('<', "&lt;");
        a2.b('>', "&gt;");
        f29623b = a2.c();
        a2.b('\'', "&apos;");
        a2.b('\"', "&quot;");
        f29622a = a2.c();
        a2.b(9, "&#x9;");
        a2.b(10, "&#xA;");
        a2.b(13, "&#xD;");
        f29624c = a2.c();
    }
}
