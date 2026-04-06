package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public class Composer {

    /* renamed from: a  reason: collision with root package name */
    public final InternalJsonWriter f42371a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f42372b = true;

    public Composer(InternalJsonWriter internalJsonWriter) {
        Intrinsics.i(internalJsonWriter, "writer");
        this.f42371a = internalJsonWriter;
    }

    public final boolean a() {
        return this.f42372b;
    }

    public void b() {
        this.f42372b = true;
    }

    public void c() {
        this.f42372b = false;
    }

    public void d() {
        this.f42372b = false;
    }

    public void e(byte b2) {
        this.f42371a.writeLong((long) b2);
    }

    public final void f(char c2) {
        this.f42371a.a(c2);
    }

    public void g(double d2) {
        this.f42371a.c(String.valueOf(d2));
    }

    public void h(float f2) {
        this.f42371a.c(String.valueOf(f2));
    }

    public void i(int i2) {
        this.f42371a.writeLong((long) i2);
    }

    public void j(long j2) {
        this.f42371a.writeLong(j2);
    }

    public final void k(String str) {
        Intrinsics.i(str, "v");
        this.f42371a.c(str);
    }

    public void l(short s2) {
        this.f42371a.writeLong((long) s2);
    }

    public void m(boolean z2) {
        this.f42371a.c(String.valueOf(z2));
    }

    public void n(String str) {
        Intrinsics.i(str, "value");
        this.f42371a.b(str);
    }

    public final void o(boolean z2) {
        this.f42372b = z2;
    }

    public void p() {
    }

    public void q() {
    }
}
