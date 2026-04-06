package kotlinx.serialization.internal;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;

@Metadata
public final class SerialDescriptorForNullable implements SerialDescriptor, CachedNames {

    /* renamed from: a  reason: collision with root package name */
    public final SerialDescriptor f42189a;

    /* renamed from: b  reason: collision with root package name */
    public final String f42190b;

    /* renamed from: c  reason: collision with root package name */
    public final Set f42191c;

    public SerialDescriptorForNullable(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "original");
        this.f42189a = serialDescriptor;
        this.f42190b = serialDescriptor.a() + '?';
        this.f42191c = Platform_commonKt.a(serialDescriptor);
    }

    public String a() {
        return this.f42190b;
    }

    public Set b() {
        return this.f42191c;
    }

    public boolean c() {
        return true;
    }

    public int d(String str) {
        Intrinsics.i(str, "name");
        return this.f42189a.d(str);
    }

    public SerialKind e() {
        return this.f42189a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SerialDescriptorForNullable) && Intrinsics.d(this.f42189a, ((SerialDescriptorForNullable) obj).f42189a);
    }

    public int f() {
        return this.f42189a.f();
    }

    public String g(int i2) {
        return this.f42189a.g(i2);
    }

    public List getAnnotations() {
        return this.f42189a.getAnnotations();
    }

    public boolean h() {
        return this.f42189a.h();
    }

    public int hashCode() {
        return this.f42189a.hashCode() * 31;
    }

    public List i(int i2) {
        return this.f42189a.i(i2);
    }

    public SerialDescriptor j(int i2) {
        return this.f42189a.j(i2);
    }

    public boolean k(int i2) {
        return this.f42189a.k(i2);
    }

    public final SerialDescriptor l() {
        return this.f42189a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f42189a);
        sb.append('?');
        return sb.toString();
    }
}
