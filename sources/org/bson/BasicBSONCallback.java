package org.bson;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;
import org.bson.types.BSONTimestamp;
import org.bson.types.BasicBSONList;
import org.bson.types.Binary;
import org.bson.types.Code;
import org.bson.types.CodeWScope;
import org.bson.types.Decimal128;
import org.bson.types.MaxKey;
import org.bson.types.MinKey;
import org.bson.types.ObjectId;

public class BasicBSONCallback implements BSONCallback {

    /* renamed from: a  reason: collision with root package name */
    public Object f43603a;

    /* renamed from: b  reason: collision with root package name */
    public final LinkedList f43604b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    public final LinkedList f43605c = new LinkedList();

    public BasicBSONCallback() {
        F();
    }

    public void A(String str, Object obj) {
        BSONObject E = E();
        if (BSON.c()) {
            obj = BSON.a(obj);
        }
        E.g(str, obj);
    }

    public BSONObject B() {
        return new BasicBSONObject();
    }

    public BSONObject C(boolean z2, List list) {
        return z2 ? D() : B();
    }

    public BSONObject D() {
        return new BasicBSONList();
    }

    public BSONObject E() {
        return (BSONObject) this.f43604b.getLast();
    }

    public void F() {
        this.f43603a = null;
        this.f43604b.clear();
        this.f43605c.clear();
    }

    public void a(String str) {
        E().g(str, (Object) null);
    }

    public void b(String str, String str2, ObjectId objectId) {
        A(str, new BasicBSONObject("$ns", str2).b("$id", objectId));
    }

    public void c() {
        if (this.f43604b.size() <= 0) {
            BSONObject C = C(false, (List) null);
            this.f43603a = C;
            this.f43604b.add(C);
            return;
        }
        throw new IllegalStateException("Illegal object beginning in current context.");
    }

    public BSONCallback d() {
        return new BasicBSONCallback();
    }

    public void e(String str) {
        this.f43605c.addLast(str);
        BSONObject C = C(true, this.f43605c);
        ((BSONObject) this.f43604b.getLast()).g(str, C);
        this.f43604b.addLast(C);
    }

    public void f(String str) {
        E().g(str, new MinKey());
    }

    public void g(String str, long j2) {
        A(str, new Date(j2));
    }

    public Object get() {
        return this.f43603a;
    }

    public void h(String str) {
        E().g(str, new MaxKey());
    }

    public void i(String str, String str2, Object obj) {
        A(str, new CodeWScope(str2, (BSONObject) obj));
    }

    public void j(String str, ObjectId objectId) {
        A(str, objectId);
    }

    public void k(String str) {
        this.f43605c.addLast(str);
        BSONObject C = C(false, this.f43605c);
        ((BSONObject) this.f43604b.getLast()).g(str, C);
        this.f43604b.addLast(C);
    }

    public void l(String str, String str2) {
        A(str, str2);
    }

    public void m(String str) {
    }

    public void n(String str, int i2) {
        A(str, Integer.valueOf(i2));
    }

    public void o(String str, String str2) {
        A(str, new Code(str2));
    }

    public Object p() {
        BSONObject bSONObject = (BSONObject) this.f43604b.removeLast();
        if (this.f43605c.size() > 0) {
            this.f43605c.removeLast();
        } else if (this.f43604b.size() > 0) {
            throw new IllegalStateException("Illegal object end in current context.");
        }
        return !BSON.c() ? bSONObject : (BSONObject) BSON.a(bSONObject);
    }

    public Object q() {
        return p();
    }

    public void r(String str, Decimal128 decimal128) {
        A(str, decimal128);
    }

    public void s(String str, double d2) {
        A(str, Double.valueOf(d2));
    }

    public void t(String str, byte b2, byte[] bArr) {
        if (b2 == 0 || b2 == 2) {
            A(str, bArr);
        } else {
            A(str, new Binary(b2, bArr));
        }
    }

    public void u(String str, String str2, String str3) {
        A(str, Pattern.compile(str2, BSON.f(str3)));
    }

    public void v(String str, boolean z2) {
        A(str, Boolean.valueOf(z2));
    }

    public void w(String str, long j2, long j3) {
        A(str, new UUID(j2, j3));
    }

    public void x(String str, String str2) {
        A(str, str2);
    }

    public void y(String str, long j2) {
        A(str, Long.valueOf(j2));
    }

    public void z(String str, int i2, int i3) {
        A(str, new BSONTimestamp(i2, i3));
    }
}
