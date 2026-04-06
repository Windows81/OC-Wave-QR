package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata
public abstract class MapLikeDescriptor implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public final String f42147a;

    /* renamed from: b  reason: collision with root package name */
    public final SerialDescriptor f42148b;

    /* renamed from: c  reason: collision with root package name */
    public final SerialDescriptor f42149c;

    /* renamed from: d  reason: collision with root package name */
    public final int f42150d;

    public /* synthetic */ MapLikeDescriptor(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, serialDescriptor, serialDescriptor2);
    }

    public String a() {
        return this.f42147a;
    }

    public boolean c() {
        return SerialDescriptor.DefaultImpls.c(this);
    }

    public int d(String str) {
        Intrinsics.i(str, "name");
        Integer q2 = StringsKt.q(str);
        if (q2 != null) {
            return q2.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    public SerialKind e() {
        return StructureKind.MAP.f42060a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapLikeDescriptor)) {
            return false;
        }
        MapLikeDescriptor mapLikeDescriptor = (MapLikeDescriptor) obj;
        return Intrinsics.d(a(), mapLikeDescriptor.a()) && Intrinsics.d(this.f42148b, mapLikeDescriptor.f42148b) && Intrinsics.d(this.f42149c, mapLikeDescriptor.f42149c);
    }

    public int f() {
        return this.f42150d;
    }

    public String g(int i2) {
        return String.valueOf(i2);
    }

    public List getAnnotations() {
        return SerialDescriptor.DefaultImpls.a(this);
    }

    public boolean h() {
        return SerialDescriptor.DefaultImpls.b(this);
    }

    public int hashCode() {
        return (((a().hashCode() * 31) + this.f42148b.hashCode()) * 31) + this.f42149c.hashCode();
    }

    public List i(int i2) {
        if (i2 >= 0) {
            return CollectionsKt.m();
        }
        throw new IllegalArgumentException(("Illegal index " + i2 + ", " + a() + " expects only non-negative indices").toString());
    }

    public SerialDescriptor j(int i2) {
        if (i2 >= 0) {
            int i3 = i2 % 2;
            if (i3 == 0) {
                return this.f42148b;
            }
            if (i3 == 1) {
                return this.f42149c;
            }
            throw new IllegalStateException("Unreached");
        }
        throw new IllegalArgumentException(("Illegal index " + i2 + ", " + a() + " expects only non-negative indices").toString());
    }

    public boolean k(int i2) {
        if (i2 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i2 + ", " + a() + " expects only non-negative indices").toString());
    }

    public String toString() {
        return a() + '(' + this.f42148b + ", " + this.f42149c + ')';
    }

    public MapLikeDescriptor(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.f42147a = str;
        this.f42148b = serialDescriptor;
        this.f42149c = serialDescriptor2;
        this.f42150d = 2;
    }
}
