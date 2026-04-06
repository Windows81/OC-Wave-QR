package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class c implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ String f42234A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ EnumSerializer f42235z;

    public /* synthetic */ c(EnumSerializer enumSerializer, String str) {
        this.f42235z = enumSerializer;
        this.f42234A = str;
    }

    public final Object invoke() {
        return EnumSerializer.h(this.f42235z, this.f42234A);
    }
}
