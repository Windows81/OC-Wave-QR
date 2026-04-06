package androidx.lifecycle;

import kotlin.jvm.functions.Function1;

public final /* synthetic */ class a implements Function1 {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ MediatorLiveData f22018z;

    public /* synthetic */ a(MediatorLiveData mediatorLiveData) {
        this.f22018z = mediatorLiveData;
    }

    public final Object invoke(Object obj) {
        return CoroutineLiveDataKt$addDisposableSource$2.C(this.f22018z, obj);
    }
}
