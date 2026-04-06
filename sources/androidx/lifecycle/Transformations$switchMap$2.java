package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class Transformations$switchMap$2 implements Observer {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Function f21986A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ MediatorLiveData f21987B;

    /* renamed from: z  reason: collision with root package name */
    public LiveData f21988z;

    public static final Unit c(MediatorLiveData mediatorLiveData, Object obj) {
        mediatorLiveData.o(obj);
        return Unit.f40552a;
    }

    public void a(Object obj) {
        LiveData liveData = (LiveData) this.f21986A.apply(obj);
        LiveData liveData2 = this.f21988z;
        if (liveData2 != liveData) {
            if (liveData2 != null) {
                MediatorLiveData mediatorLiveData = this.f21987B;
                Intrinsics.f(liveData2);
                mediatorLiveData.q(liveData2);
            }
            this.f21988z = liveData;
            if (liveData != null) {
                MediatorLiveData mediatorLiveData2 = this.f21987B;
                Intrinsics.f(liveData);
                mediatorLiveData2.p(liveData, new Transformations$sam$androidx_lifecycle_Observer$0(new j(this.f21987B)));
            }
        }
    }
}
