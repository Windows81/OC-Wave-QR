package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.StringOpsKt;

@Metadata
public final class JsonLiteral extends JsonPrimitive {

    /* renamed from: A  reason: collision with root package name */
    public final SerialDescriptor f42313A;

    /* renamed from: B  reason: collision with root package name */
    public final String f42314B;

    /* renamed from: z  reason: collision with root package name */
    public final boolean f42315z;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ JsonLiteral(Object obj, boolean z2, SerialDescriptor serialDescriptor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, z2, (i2 & 4) != 0 ? null : serialDescriptor);
    }

    public String e() {
        return this.f42314B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || JsonLiteral.class != obj.getClass()) {
            return false;
        }
        JsonLiteral jsonLiteral = (JsonLiteral) obj;
        return h() == jsonLiteral.h() && Intrinsics.d(e(), jsonLiteral.e());
    }

    public final SerialDescriptor g() {
        return this.f42313A;
    }

    public boolean h() {
        return this.f42315z;
    }

    public int hashCode() {
        return (Boolean.hashCode(h()) * 31) + e().hashCode();
    }

    public String toString() {
        if (!h()) {
            return e();
        }
        StringBuilder sb = new StringBuilder();
        StringOpsKt.c(sb, e());
        String sb2 = sb.toString();
        Intrinsics.h(sb2, "toString(...)");
        return sb2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonLiteral(Object obj, boolean z2, SerialDescriptor serialDescriptor) {
        super((DefaultConstructorMarker) null);
        Intrinsics.i(obj, "body");
        this.f42315z = z2;
        this.f42313A = serialDescriptor;
        this.f42314B = obj.toString();
        if (serialDescriptor != null && !serialDescriptor.h()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
