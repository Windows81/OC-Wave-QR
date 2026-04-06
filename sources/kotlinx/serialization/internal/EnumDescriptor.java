package kotlinx.serialization.internal;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata
public final class EnumDescriptor extends PluginGeneratedSerialDescriptor {

    /* renamed from: m  reason: collision with root package name */
    public final SerialKind f42112m = SerialKind.ENUM.f42057a;

    /* renamed from: n  reason: collision with root package name */
    public final Lazy f42113n;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnumDescriptor(String str, int i2) {
        super(str, (GeneratedSerializer) null, i2, 2, (DefaultConstructorMarker) null);
        Intrinsics.i(str, "name");
        this.f42113n = LazyKt.b(new b(i2, str, this));
    }

    public static final SerialDescriptor[] C(int i2, String str, EnumDescriptor enumDescriptor) {
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            serialDescriptorArr[i3] = SerialDescriptorsKt.h(str + '.' + enumDescriptor.g(i3), StructureKind.OBJECT.f42061a, new SerialDescriptor[0], (Function1) null, 8, (Object) null);
        }
        return serialDescriptorArr;
    }

    public final SerialDescriptor[] D() {
        return (SerialDescriptor[]) this.f42113n.getValue();
    }

    public SerialKind e() {
        return this.f42112m;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.e() == SerialKind.ENUM.f42057a && Intrinsics.d(a(), serialDescriptor.a()) && Intrinsics.d(Platform_commonKt.a(this), Platform_commonKt.a(serialDescriptor));
    }

    public int hashCode() {
        int hashCode = a().hashCode();
        int i2 = 1;
        for (String str : SerialDescriptorKt.b(this)) {
            int i3 = i2 * 31;
            i2 = i3 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i2;
    }

    public SerialDescriptor j(int i2) {
        return D()[i2];
    }

    public String toString() {
        Iterable b2 = SerialDescriptorKt.b(this);
        return CollectionsKt.n0(b2, ", ", a() + '(', ")", 0, (CharSequence) null, (Function1) null, 56, (Object) null);
    }
}
