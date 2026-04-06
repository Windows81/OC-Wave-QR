package org.slf4j.helpers;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.slf4j.Marker;

public class BasicMarker implements Marker {

    /* renamed from: B  reason: collision with root package name */
    public static String f44104B = "[ ";
    public static String C = " ]";
    public static String D = ", ";

    /* renamed from: A  reason: collision with root package name */
    public List f44105A;

    /* renamed from: z  reason: collision with root package name */
    public final String f44106z;

    public synchronized boolean a() {
        List list;
        list = this.f44105A;
        return list != null && list.size() > 0;
    }

    public synchronized Iterator b() {
        List list = this.f44105A;
        if (list != null) {
            return list.iterator();
        }
        return Collections.EMPTY_LIST.iterator();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof Marker)) {
            return this.f44106z.equals(((Marker) obj).getName());
        }
        return false;
    }

    public String getName() {
        return this.f44106z;
    }

    public int hashCode() {
        return this.f44106z.hashCode();
    }

    public String toString() {
        if (!a()) {
            return getName();
        }
        Iterator b2 = b();
        StringBuffer stringBuffer = new StringBuffer(getName());
        stringBuffer.append(' ');
        stringBuffer.append(f44104B);
        while (b2.hasNext()) {
            stringBuffer.append(((Marker) b2.next()).getName());
            if (b2.hasNext()) {
                stringBuffer.append(D);
            }
        }
        stringBuffer.append(C);
        return stringBuffer.toString();
    }
}
