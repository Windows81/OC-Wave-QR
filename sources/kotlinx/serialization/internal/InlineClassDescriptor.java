package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata
public final class InlineClassDescriptor extends PluginGeneratedSerialDescriptor {

    /* renamed from: m  reason: collision with root package name */
    public final boolean f42124m = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InlineClassDescriptor(String str, GeneratedSerializer generatedSerializer) {
        super(str, generatedSerializer, 1);
        Intrinsics.i(str, "name");
        Intrinsics.i(generatedSerializer, "generatedSerializer");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InlineClassDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (Intrinsics.d(a(), serialDescriptor.a())) {
                InlineClassDescriptor inlineClassDescriptor = (InlineClassDescriptor) obj;
                if (inlineClassDescriptor.h() && Arrays.equals(v(), inlineClassDescriptor.v()) && f() == serialDescriptor.f()) {
                    int f2 = f();
                    int i2 = 0;
                    while (i2 < f2) {
                        if (Intrinsics.d(j(i2).a(), serialDescriptor.j(i2).a()) && Intrinsics.d(j(i2).e(), serialDescriptor.j(i2).e())) {
                            i2++;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public boolean h() {
        return this.f42124m;
    }

    public int hashCode() {
        return super.hashCode() * 31;
    }
}
