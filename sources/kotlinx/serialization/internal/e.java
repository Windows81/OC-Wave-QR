package kotlinx.serialization.internal;

import kotlin.jvm.functions.Function0;

public final /* synthetic */ class e implements Function0 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ ObjectSerializer f42238A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ String f42239z;

    public /* synthetic */ e(String str, ObjectSerializer objectSerializer) {
        this.f42239z = str;
        this.f42238A = objectSerializer;
    }

    public final Object invoke() {
        return ObjectSerializer.h(this.f42239z, this.f42238A);
    }
}
