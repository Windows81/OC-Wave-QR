package kotlinx.serialization.json;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.InlineClassDescriptorKt;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.StringJsonLexer;
import kotlinx.serialization.json.internal.StringOpsKt;

@Metadata
public final class JsonElementKt {

    /* renamed from: a  reason: collision with root package name */
    public static final SerialDescriptor f42309a = InlineClassDescriptorKt.a("kotlinx.serialization.json.JsonUnquotedLiteral", BuiltinSerializersKt.I(StringCompanionObject.f40914a));

    public static final JsonPrimitive a(Boolean bool) {
        return bool == null ? JsonNull.INSTANCE : new JsonLiteral(bool, false, (SerialDescriptor) null, 4, (DefaultConstructorMarker) null);
    }

    public static final JsonPrimitive b(Number number) {
        return number == null ? JsonNull.INSTANCE : new JsonLiteral(number, false, (SerialDescriptor) null, 4, (DefaultConstructorMarker) null);
    }

    public static final JsonPrimitive c(String str) {
        return str == null ? JsonNull.INSTANCE : new JsonLiteral(str, true, (SerialDescriptor) null, 4, (DefaultConstructorMarker) null);
    }

    public static final Void d(JsonElement jsonElement, String str) {
        throw new IllegalArgumentException("Element " + Reflection.b(jsonElement.getClass()) + " is not a " + str);
    }

    public static final Boolean e(JsonPrimitive jsonPrimitive) {
        Intrinsics.i(jsonPrimitive, "<this>");
        return StringOpsKt.d(jsonPrimitive.e());
    }

    public static final String f(JsonPrimitive jsonPrimitive) {
        Intrinsics.i(jsonPrimitive, "<this>");
        if (jsonPrimitive instanceof JsonNull) {
            return null;
        }
        return jsonPrimitive.e();
    }

    public static final double g(JsonPrimitive jsonPrimitive) {
        Intrinsics.i(jsonPrimitive, "<this>");
        return Double.parseDouble(jsonPrimitive.e());
    }

    public static final float h(JsonPrimitive jsonPrimitive) {
        Intrinsics.i(jsonPrimitive, "<this>");
        return Float.parseFloat(jsonPrimitive.e());
    }

    public static final int i(JsonPrimitive jsonPrimitive) {
        Intrinsics.i(jsonPrimitive, "<this>");
        try {
            long m2 = new StringJsonLexer(jsonPrimitive.e()).m();
            if (-2147483648L <= m2 && m2 <= 2147483647L) {
                return (int) m2;
            }
            throw new NumberFormatException(jsonPrimitive.e() + " is not an Int");
        } catch (JsonDecodingException e2) {
            throw new NumberFormatException(e2.getMessage());
        }
    }

    public static final JsonPrimitive j(JsonElement jsonElement) {
        Intrinsics.i(jsonElement, "<this>");
        JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
        if (jsonPrimitive != null) {
            return jsonPrimitive;
        }
        d(jsonElement, "JsonPrimitive");
        throw new KotlinNothingValueException();
    }

    public static final SerialDescriptor k() {
        return f42309a;
    }

    public static final long l(JsonPrimitive jsonPrimitive) {
        Intrinsics.i(jsonPrimitive, "<this>");
        try {
            return new StringJsonLexer(jsonPrimitive.e()).m();
        } catch (JsonDecodingException e2) {
            throw new NumberFormatException(e2.getMessage());
        }
    }
}
