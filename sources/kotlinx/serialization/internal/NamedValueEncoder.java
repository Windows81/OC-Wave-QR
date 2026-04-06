package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
@InternalSerializationApi
public abstract class NamedValueEncoder extends TaggedEncoder<String> {
    public String d0(String str, String str2) {
        Intrinsics.i(str, "parentName");
        Intrinsics.i(str2, "childName");
        if (str.length() == 0) {
            return str2;
        }
        return str + '.' + str2;
    }

    public String e0(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "descriptor");
        return serialDescriptor.g(i2);
    }

    /* renamed from: f0 */
    public final String a0(SerialDescriptor serialDescriptor, int i2) {
        Intrinsics.i(serialDescriptor, "<this>");
        return g0(e0(serialDescriptor, i2));
    }

    public final String g0(String str) {
        Intrinsics.i(str, "nestedName");
        String str2 = (String) Z();
        if (str2 == null) {
            str2 = "";
        }
        return d0(str2, str);
    }
}
