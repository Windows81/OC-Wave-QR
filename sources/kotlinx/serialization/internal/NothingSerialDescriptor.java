package kotlinx.serialization.internal;

import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata
public final class NothingSerialDescriptor implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public static final NothingSerialDescriptor f42156a = new NothingSerialDescriptor();

    /* renamed from: b  reason: collision with root package name */
    public static final SerialKind f42157b = StructureKind.OBJECT.f42061a;

    /* renamed from: c  reason: collision with root package name */
    public static final String f42158c = "kotlin.Nothing";

    public String a() {
        return f42158c;
    }

    public final Void b() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    public boolean c() {
        return SerialDescriptor.DefaultImpls.c(this);
    }

    public int d(String str) {
        Intrinsics.i(str, "name");
        b();
        throw new KotlinNothingValueException();
    }

    public SerialKind e() {
        return f42157b;
    }

    public boolean equals(Object obj) {
        return this == obj;
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

    public String toString() {
        return "NothingSerialDescriptor";
    }
}
