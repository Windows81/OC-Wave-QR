package kotlin.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KTypeProjection;

public final /* synthetic */ class a implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ TypeReference f40923z;

    public /* synthetic */ a(TypeReference typeReference) {
        this.f40923z = typeReference;
    }

    public final Object invoke(Object obj) {
        return TypeReference.l(this.f40923z, (KTypeProjection) obj);
    }
}
