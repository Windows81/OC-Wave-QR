package kotlinx.serialization.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class PrimitiveSerialDescriptor implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public final String f42184a;

    /* renamed from: b  reason: collision with root package name */
    public final PrimitiveKind f42185b;

    public PrimitiveSerialDescriptor(String str, PrimitiveKind primitiveKind) {
        Intrinsics.i(str, "serialName");
        Intrinsics.i(primitiveKind, "kind");
        this.f42184a = str;
        this.f42185b = primitiveKind;
    }

    private final Void b() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    public String a() {
        return this.f42184a;
    }

    public boolean c() {
        return SerialDescriptor.DefaultImpls.c(this);
    }

    public int d(String str) {
        Intrinsics.i(str, "name");
        b();
        throw new KotlinNothingValueException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrimitiveSerialDescriptor)) {
            return false;
        }
        PrimitiveSerialDescriptor primitiveSerialDescriptor = (PrimitiveSerialDescriptor) obj;
        return Intrinsics.d(a(), primitiveSerialDescriptor.a()) && Intrinsics.d(e(), primitiveSerialDescriptor.e());
    }

    public int f() {
        return 0;
    }

    public String g(int i2) {
        b();
        throw new KotlinNothingValueException();
    }

    public List getAnnotations() {
        return SerialDescriptor.DefaultImpls.a(this);
    }

    public boolean h() {
        return SerialDescriptor.DefaultImpls.b(this);
    }

    public int hashCode() {
        return a().hashCode() + (e().hashCode() * 31);
    }

    public List i(int i2) {
        b();
        throw new KotlinNothingValueException();
    }

    public SerialDescriptor j(int i2) {
        b();
        throw new KotlinNothingValueException();
    }

    public boolean k(int i2) {
        b();
        throw new KotlinNothingValueException();
    }

    /* renamed from: l */
    public PrimitiveKind e() {
        return this.f42185b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + a() + ')';
    }
}
