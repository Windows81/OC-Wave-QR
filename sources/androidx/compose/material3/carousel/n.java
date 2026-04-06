package androidx.compose.material3.carousel;

import androidx.compose.foundation.lazy.layout.LazyLayoutScrollScope;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

public final /* synthetic */ class n implements Function2 {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ LazyLayoutScrollScope f11980A;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ Ref.FloatRef f11981z;

    public /* synthetic */ n(Ref.FloatRef floatRef, LazyLayoutScrollScope lazyLayoutScrollScope) {
        this.f11981z = floatRef;
        this.f11980A = lazyLayoutScrollScope;
    }

    public final Object m(Object obj, Object obj2) {
        return CarouselStateKt.d(this.f11981z, this.f11980A, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
    }
}
