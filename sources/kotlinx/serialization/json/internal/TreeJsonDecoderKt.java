package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonObject;

@Metadata
public final class TreeJsonDecoderKt {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: kotlinx.serialization.json.internal.JsonTreeDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: kotlinx.serialization.json.internal.JsonPrimitiveDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: kotlinx.serialization.json.internal.JsonTreeListDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: kotlinx.serialization.json.internal.JsonTreeDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: kotlinx.serialization.json.internal.JsonTreeDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: kotlinx.serialization.json.internal.JsonTreeDecoder} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object a(kotlinx.serialization.json.Json r8, kotlinx.serialization.json.JsonElement r9, kotlinx.serialization.DeserializationStrategy r10) {
        /*
            java.lang.String r0 = "json"
            kotlin.jvm.internal.Intrinsics.i(r8, r0)
            java.lang.String r0 = "element"
            kotlin.jvm.internal.Intrinsics.i(r9, r0)
            java.lang.String r0 = "deserializer"
            kotlin.jvm.internal.Intrinsics.i(r10, r0)
            boolean r0 = r9 instanceof kotlinx.serialization.json.JsonObject
            if (r0 == 0) goto L_0x0023
            kotlinx.serialization.json.internal.JsonTreeDecoder r0 = new kotlinx.serialization.json.internal.JsonTreeDecoder
            r3 = r9
            kotlinx.serialization.json.JsonObject r3 = (kotlinx.serialization.json.JsonObject) r3
            r6 = 12
            r7 = 0
            r4 = 0
            r5 = 0
            r1 = r0
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x004f
        L_0x0023:
            boolean r0 = r9 instanceof kotlinx.serialization.json.JsonArray
            if (r0 == 0) goto L_0x002f
            kotlinx.serialization.json.internal.JsonTreeListDecoder r0 = new kotlinx.serialization.json.internal.JsonTreeListDecoder
            kotlinx.serialization.json.JsonArray r9 = (kotlinx.serialization.json.JsonArray) r9
            r0.<init>(r8, r9)
            goto L_0x004f
        L_0x002f:
            boolean r0 = r9 instanceof kotlinx.serialization.json.JsonLiteral
            if (r0 != 0) goto L_0x0042
            kotlinx.serialization.json.JsonNull r0 = kotlinx.serialization.json.JsonNull.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r9, r0)
            if (r0 == 0) goto L_0x003c
            goto L_0x0042
        L_0x003c:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L_0x0042:
            kotlinx.serialization.json.internal.JsonPrimitiveDecoder r6 = new kotlinx.serialization.json.internal.JsonPrimitiveDecoder
            r2 = r9
            kotlinx.serialization.json.JsonPrimitive r2 = (kotlinx.serialization.json.JsonPrimitive) r2
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r8
            r0.<init>(r1, r2, r3, r4, r5)
        L_0x004f:
            java.lang.Object r8 = r0.C(r10)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.TreeJsonDecoderKt.a(kotlinx.serialization.json.Json, kotlinx.serialization.json.JsonElement, kotlinx.serialization.DeserializationStrategy):java.lang.Object");
    }

    public static final Object b(Json json, String str, JsonObject jsonObject, DeserializationStrategy deserializationStrategy) {
        Intrinsics.i(json, "<this>");
        Intrinsics.i(str, "discriminator");
        Intrinsics.i(jsonObject, "element");
        Intrinsics.i(deserializationStrategy, "deserializer");
        return new JsonTreeDecoder(json, jsonObject, str, deserializationStrategy.a()).C(deserializationStrategy);
    }
}
