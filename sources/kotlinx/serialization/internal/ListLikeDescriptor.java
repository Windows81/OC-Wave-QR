package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata
@ExperimentalSerializationApi
public abstract class ListLikeDescriptor implements SerialDescriptor {

    /* renamed from: a  reason: collision with root package name */
    public final SerialDescriptor f42137a;

    /* renamed from: b  reason: collision with root package name */
    public final int f42138b;

    public /* synthetic */ ListLikeDescriptor(SerialDescriptor serialDescriptor, DefaultConstructorMarker defaultConstructorMarker) {
        this(serialDescriptor);
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
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    public SerialKind e() {
        return StructureKind.LIST.f42059a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ListLikeDescriptor)) {
            return false;
        }
        ListLikeDescriptor listLikeDescriptor = (ListLikeDescriptor) obj;
        return Intrinsics.d(this.f42137a, listLikeDescriptor.f42137a) && Intrinsics.d(a(), listLikeDescriptor.a());
    }

    public int f() {
        return this.f42138b;
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
        return (this.f42137a.hashCode() * 31) + a().hashCode();
    }

    public List i(int i2) {
        if (i2 >= 0) {
            return CollectionsKt.m();
        }
        throw new IllegalArgumentException(("Illegal index " + i2 + ", " + a() + " expects only non-negative indices").toString());
    }

    public SerialDescriptor j(int i2) {
        if (i2 >= 0) {
            return this.f42137a;
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
        return a() + '(' + this.f42137a + ')';
    }

    public ListLikeDescriptor(SerialDescriptor serialDescriptor) {
        this.f42137a = serialDescriptor;
        this.f42138b = 1;
    }
}
