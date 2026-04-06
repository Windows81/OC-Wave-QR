package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind;

@Metadata
public final class PluginGeneratedSerialDescriptorKt {
    public static final int a(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        Intrinsics.i(serialDescriptor, "<this>");
        Intrinsics.i(serialDescriptorArr, "typeParams");
        int hashCode = (serialDescriptor.a().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        Iterable<SerialDescriptor> a2 = SerialDescriptorKt.a(serialDescriptor);
        Iterator it = a2.iterator();
        int i2 = 1;
        int i3 = 1;
        while (true) {
            int i4 = 0;
            if (!it.hasNext()) {
                break;
            }
            int i5 = i3 * 31;
            String a3 = ((SerialDescriptor) it.next()).a();
            if (a3 != null) {
                i4 = a3.hashCode();
            }
            i3 = i5 + i4;
        }
        for (SerialDescriptor e2 : a2) {
            int i6 = i2 * 31;
            SerialKind e3 = e2.e();
            i2 = i6 + (e3 != null ? e3.hashCode() : 0);
        }
        return (((hashCode * 31) + i3) * 31) + i2;
    }
}
