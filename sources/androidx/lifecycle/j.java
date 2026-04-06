package androidx.lifecycle;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class j implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MediatorLiveData f22053z;

    public /* synthetic */ j(MediatorLiveData mediatorLiveData) {
        this.f22053z = mediatorLiveData;
    }

    public final Object invoke(Object obj) {
        return Transformations$switchMap$2.c(this.f22053z, obj);
    }
}
