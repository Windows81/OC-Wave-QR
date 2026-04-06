package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.json.Json;

@Metadata
public final class WriteModeKt {
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r3 = a(r0, r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlinx.serialization.descriptors.SerialDescriptor a(kotlinx.serialization.descriptors.SerialDescriptor r2, kotlinx.serialization.modules.SerializersModule r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.i(r2, r0)
            java.lang.String r0 = "module"
            kotlin.jvm.internal.Intrinsics.i(r3, r0)
            kotlinx.serialization.descriptors.SerialKind r0 = r2.e()
            kotlinx.serialization.descriptors.SerialKind$CONTEXTUAL r1 = kotlinx.serialization.descriptors.SerialKind.CONTEXTUAL.f42056a
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r1)
            if (r0 == 0) goto L_0x0025
            kotlinx.serialization.descriptors.SerialDescriptor r0 = kotlinx.serialization.descriptors.ContextAwareKt.b(r3, r2)
            if (r0 == 0) goto L_0x0034
            kotlinx.serialization.descriptors.SerialDescriptor r3 = a(r0, r3)
            if (r3 != 0) goto L_0x0023
            goto L_0x0034
        L_0x0023:
            r2 = r3
            goto L_0x0034
        L_0x0025:
            boolean r0 = r2.h()
            if (r0 == 0) goto L_0x0034
            r0 = 0
            kotlinx.serialization.descriptors.SerialDescriptor r2 = r2.j(r0)
            kotlinx.serialization.descriptors.SerialDescriptor r2 = a(r2, r3)
        L_0x0034:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.WriteModeKt.a(kotlinx.serialization.descriptors.SerialDescriptor, kotlinx.serialization.modules.SerializersModule):kotlinx.serialization.descriptors.SerialDescriptor");
    }

    public static final WriteMode b(Json json, SerialDescriptor serialDescriptor) {
        Intrinsics.i(json, "<this>");
        Intrinsics.i(serialDescriptor, "desc");
        SerialKind e2 = serialDescriptor.e();
        if (e2 instanceof PolymorphicKind) {
            return WriteMode.POLY_OBJ;
        }
        if (Intrinsics.d(e2, StructureKind.LIST.f42059a)) {
            return WriteMode.LIST;
        }
        if (!Intrinsics.d(e2, StructureKind.MAP.f42060a)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor a2 = a(serialDescriptor.j(0), json.a());
        SerialKind e3 = a2.e();
        if ((e3 instanceof PrimitiveKind) || Intrinsics.d(e3, SerialKind.ENUM.f42057a)) {
            return WriteMode.MAP;
        }
        if (json.g().c()) {
            return WriteMode.LIST;
        }
        throw JsonExceptionsKt.d(a2);
    }
}
