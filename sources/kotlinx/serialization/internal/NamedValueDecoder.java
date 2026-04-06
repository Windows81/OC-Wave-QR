package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
@InternalSerializationApi
public abstract class NamedValueDecoder extends TaggedDecoder<String> {
    public String g0(String str, String str2) {
        Intrinsics.i(str, "parentName");
        Intrinsics.i(str2, "childName");
        if (str.length() == 0) {
            return str2;
        }
        return str + '.' + str2;
    }

    public String h0(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return serialDescriptor.g(i2);
    }

    /* renamed from: i0 */
    public final String b0(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "<this>");
        return j0(h0(serialDescriptor, i2));
    }

    public final String j0(String str) {
        Intrinsics.i(str, "nestedName");
        String str2 = (String) a0();
        if (str2 == null) {
            str2 = "";
        }
        return g0(str2, str);
    }

    public final String k0() {
        return c0().isEmpty() ? "$" : CollectionsKt.n0(c0(), ".", "$.", (CharSequence) null, 0, (CharSequence) null, (Function1) null, 60, (Object) null);
    }
}
