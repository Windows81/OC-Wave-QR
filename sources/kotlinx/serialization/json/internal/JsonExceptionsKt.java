package kotlinx.serialization.json.internal;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class JsonExceptionsKt {
    public static final JsonDecodingException a(Number number, String str, String str2) {
        Intrinsics.i(number, "value");
        Intrinsics.i(str, "key");
        Intrinsics.i(str2, "output");
        return e(-1, m(number, str, str2));
    }

    public static final JsonEncodingException b(Number number, String str) {
        Intrinsics.i(number, "value");
        Intrinsics.i(str, "output");
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + k(str, 0, 1, (Object) null));
    }

    public static final JsonEncodingException c(Number number, String str, String str2) {
        Intrinsics.i(number, "value");
        Intrinsics.i(str, "key");
        Intrinsics.i(str2, "output");
        return new JsonEncodingException(m(number, str, str2));
    }

    public static final JsonEncodingException d(SerialDescriptor serialDescriptor) {
        Intrinsics.i(serialDescriptor, "keyDescriptor");
        return new JsonEncodingException("Value of type '" + serialDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException e(int i2, String str) {
        Intrinsics.i(str, "message");
        if (i2 >= 0) {
            str = "Unexpected JSON token at offset " + i2 + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final JsonDecodingException f(int i2, String str, CharSequence charSequence) {
        Intrinsics.i(str, "message");
        Intrinsics.i(charSequence, "input");
        return e(i2, str + "\nJSON input: " + j(charSequence, i2));
    }

    public static final JsonDecodingException g(String str, String str2) {
        Intrinsics.i(str, "key");
        Intrinsics.i(str2, "input");
        return e(-1, "Encountered an unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + k(str2, 0, 1, (Object) null));
    }

    public static final Void h(AbstractJsonLexer abstractJsonLexer, String str) {
        Intrinsics.i(abstractJsonLexer, "<this>");
        Intrinsics.i(str, "entity");
        abstractJsonLexer.w("Trailing comma before the end of JSON " + str, abstractJsonLexer.f42334a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new KotlinNothingValueException();
    }

    public static /* synthetic */ Void i(AbstractJsonLexer abstractJsonLexer, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = "object";
        }
        return h(abstractJsonLexer, str);
    }

    public static final CharSequence j(CharSequence charSequence, int i2) {
        Intrinsics.i(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        String str = ".....";
        if (i2 == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return str + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i3 = i2 - 30;
        int i4 = i2 + 30;
        String str2 = i3 <= 0 ? "" : str;
        if (i4 >= charSequence.length()) {
            str = "";
        }
        return str2 + charSequence.subSequence(RangesKt.e(i3, 0), RangesKt.j(i4, charSequence.length())).toString() + str;
    }

    public static /* synthetic */ CharSequence k(CharSequence charSequence, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = -1;
        }
        return j(charSequence, i2);
    }

    public static final Void l(AbstractJsonLexer abstractJsonLexer, Number number) {
        Intrinsics.i(abstractJsonLexer, "<this>");
        Intrinsics.i(number, "result");
        AbstractJsonLexer.x(abstractJsonLexer, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, (Object) null);
        throw new KotlinNothingValueException();
    }

    public static final String m(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + k(str2, 0, 1, (Object) null);
    }
}
