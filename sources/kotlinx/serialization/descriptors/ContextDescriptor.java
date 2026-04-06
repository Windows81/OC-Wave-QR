package kotlinx.serialization.descriptors;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

@Metadata
final class ContextDescriptor implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public final SerialDescriptor f42024a;

    /* renamed from: b  reason: collision with root package name */
    public final KClass f42025b;

    /* renamed from: c  reason: collision with root package name */
    public final String f42026c;

    public ContextDescriptor(SerialDescriptor serialDescriptor, KClass kClass) {
        Intrinsics.i(serialDescriptor, "original");
        Intrinsics.i(kClass, "kClass");
        this.f42024a = serialDescriptor;
        this.f42025b = kClass;
        this.f42026c = serialDescriptor.a() + '<' + kClass.e() + '>';
    }

    public String a() {
        return this.f42026c;
    }

    public boolean c() {
        return this.f42024a.c();
    }

    public int d(String str) {
        Intrinsics.i(str, "name");
        return this.f42024a.d(str);
    }

    public SerialKind e() {
        return this.f42024a.e();
    }

    public boolean equals(Object obj) {
        ContextDescriptor contextDescriptor = obj instanceof ContextDescriptor ? (ContextDescriptor) obj : null;
        return contextDescriptor != null && Intrinsics.d(this.f42024a, contextDescriptor.f42024a) && Intrinsics.d(contextDescriptor.f42025b, this.f42025b);
    }

    public int f() {
        return this.f42024a.f();
    }

    public String g(int i2) {
        return this.f42024a.g(i2);
    }

    public List getAnnotations() {
        return this.f42024a.getAnnotations();
    }

    public boolean h() {
        return this.f42024a.h();
    }

    public int hashCode() {
        return (this.f42025b.hashCode() * 31) + a().hashCode();
    }

    public List i(int i2) {
        return this.f42024a.i(i2);
    }

    public SerialDescriptor j(int i2) {
        return this.f42024a.j(i2);
    }

    public boolean k(int i2) {
        return this.f42024a.k(i2);
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f42025b + ", original: " + this.f42024a + ')';
    }
}
