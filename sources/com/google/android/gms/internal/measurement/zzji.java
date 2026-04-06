package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjh;
import com.google.android.gms.internal.measurement.zzji;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class zzji<MessageType extends zzji<MessageType, BuilderType>, BuilderType extends zzjh<MessageType, BuilderType>> implements zzml {
    protected int zza = 0;

    public static void j(Iterable iterable, List list) {
        zzle.e(iterable);
        if (iterable instanceof zzls) {
            List a2 = ((zzls) iterable).a();
            zzls zzls = (zzls) list;
            int size = list.size();
            for (Object next : a2) {
                if (next == null) {
                    String str = "Element at index " + (zzls.size() - size) + " is null.";
                    for (int size2 = zzls.size() - 1; size2 >= size; size2--) {
                        zzls.remove(size2);
                    }
                    throw new NullPointerException(str);
                } else if (next instanceof zzjs) {
                    zzls.J0((zzjs) next);
                } else if (next instanceof byte[]) {
                    zzls.J0(zzjs.o((byte[]) next));
                } else {
                    zzls.add((String) next);
                }
            }
        } else if (iterable instanceof zzmx) {
            list.addAll((Collection) iterable);
        } else {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size3 = list.size();
            for (Object next2 : iterable) {
                if (next2 == null) {
                    String str2 = "Element at index " + (list.size() - size3) + " is null.";
                    for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                        list.remove(size4);
                    }
                    throw new NullPointerException(str2);
                }
                list.add(next2);
            }
        }
    }

    public int d(zznd zznd) {
        int k2 = k();
        if (k2 != -1) {
            return k2;
        }
        int b2 = zznd.b(this);
        l(b2);
        return b2;
    }

    public final zzjs f() {
        try {
            zzjx z2 = zzjs.z(h());
            c(z2.b());
            return z2.a();
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a " + "ByteString" + " threw an IOException (should never happen).", e2);
        }
    }

    public int k() {
        throw new UnsupportedOperationException();
    }

    public void l(int i2) {
        throw new UnsupportedOperationException();
    }

    public final byte[] m() {
        try {
            byte[] bArr = new byte[h()];
            zzkl H = zzkl.H(bArr);
            c(H);
            H.I();
            return bArr;
        } catch (IOException e2) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a " + "byte array" + " threw an IOException (should never happen).", e2);
        }
    }
}
