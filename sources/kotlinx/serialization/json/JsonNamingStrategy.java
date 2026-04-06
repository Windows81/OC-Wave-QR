package kotlinx.serialization.json;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
@ExperimentalSerializationApi
public interface JsonNamingStrategy {

    @Metadata
    @ExperimentalSerializationApi
    public static final class Builtins {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ Builtins f42319a = new Builtins();

        /* renamed from: b  reason: collision with root package name */
        public static final JsonNamingStrategy f42320b = new JsonNamingStrategy$Builtins$SnakeCase$1();

        /* renamed from: c  reason: collision with root package name */
        public static final JsonNamingStrategy f42321c = new JsonNamingStrategy$Builtins$KebabCase$1();

        public final String b(String str, char c2) {
            StringBuilder sb = new StringBuilder(str.length() * 2);
            Character ch = null;
            int i2 = 0;
            for (int i3 = 0; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (Character.isUpperCase(charAt)) {
                    if (i2 == 0 && sb.length() > 0 && StringsKt.l1(sb) != c2) {
                        sb.append(c2);
                    }
                    if (ch != null) {
                        sb.append(ch.charValue());
                    }
                    i2++;
                    ch = Character.valueOf(Character.toLowerCase(charAt));
                } else {
                    if (ch != null) {
                        if (i2 > 1 && Character.isLetter(charAt)) {
                            sb.append(c2);
                        }
                        sb.append(ch.charValue());
                        ch = null;
                        i2 = 0;
                    }
                    sb.append(charAt);
                }
            }
            if (ch != null) {
                sb.append(ch.charValue());
            }
            String sb2 = sb.toString();
            Intrinsics.h(sb2, "toString(...)");
            return sb2;
        }
    }

    String a(SerialDescriptor serialDescriptor, int i2, String str);
}
