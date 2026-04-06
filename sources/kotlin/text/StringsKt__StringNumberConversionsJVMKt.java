package kotlin.text;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
class StringsKt__StringNumberConversionsJVMKt extends StringsKt__StringBuilderKt {
    public static BigDecimal m(String str) {
        Intrinsics.i(str, "<this>");
        try {
            if (ScreenFloatValueRegEx.f41183b.d(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Double n(String str) {
        Intrinsics.i(str, "<this>");
        try {
            if (ScreenFloatValueRegEx.f41183b.d(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float o(String str) {
        Intrinsics.i(str, "<this>");
        try {
            if (ScreenFloatValueRegEx.f41183b.d(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
