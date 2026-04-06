package org.bson;

import java.util.List;
import org.bson.types.ObjectId;

public class LazyBSONCallback extends EmptyBSONCallback {

    /* renamed from: a  reason: collision with root package name */
    public Object f43677a;

    public List A(byte[] bArr, int i2) {
        return new LazyBSONList(bArr, i2, this);
    }

    public Object B(String str, ObjectId objectId) {
        return new BasicBSONObject("$ns", str).b("$id", objectId);
    }

    public Object C(byte[] bArr, int i2) {
        return new LazyBSONObject(bArr, i2, this);
    }

    public final Object D() {
        return this.f43677a;
    }

    public final void E(Object obj) {
        this.f43677a = obj;
    }

    public Object get() {
        return D();
    }

    public void t(String str, byte b2, byte[] bArr) {
        E(C(bArr, 0));
    }
}
