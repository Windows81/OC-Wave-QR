package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class b implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f42231A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ EnumDescriptor f42232B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f42233z;

    public /* synthetic */ b(int i2, String str, EnumDescriptor enumDescriptor) {
        this.f42233z = i2;
        this.f42231A = str;
        this.f42232B = enumDescriptor;
    }

    public final Object invoke() {
        return EnumDescriptor.C(this.f42233z, this.f42231A, this.f42232B);
    }
}
