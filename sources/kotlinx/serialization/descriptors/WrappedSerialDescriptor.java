package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class WrappedSerialDescriptor implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ SerialDescriptor f42062a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42063b;

    public String a() {
        return this.f42063b;
    }

    public boolean c() {
        return this.f42062a.c();
    }

    public int d(String str) {
        Intrinsics.i(str, "name");
        return this.f42062a.d(str);
    }

    public SerialKind e() {
        return this.f42062a.e();
    }

    public int f() {
        return this.f42062a.f();
    }

    public String g(int i2) {
        return this.f42062a.g(i2);
    }

    public List getAnnotations() {
        return this.f42062a.getAnnotations();
    }

    public boolean h() {
        return this.f42062a.h();
    }

    public List i(int i2) {
        return this.f42062a.i(i2);
    }

    public SerialDescriptor j(int i2) {
        return this.f42062a.j(i2);
    }

    public boolean k(int i2) {
        return this.f42062a.k(i2);
    }
}
