package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LazyLayoutItemContentFactory {

    /* renamed from: a  reason: collision with root package name */
    public final SaveableStateHolder f4854a;

    /* renamed from: b  reason: collision with root package name */
    public final Function0 f4855b;

    /* renamed from: c  reason: collision with root package name */
    public final MutableScatterMap f4856c = ScatterMapKt.c();

    @Metadata
    public final class CachedItemContent {

        /* renamed from: a  reason: collision with root package name */
        public final Object f4858a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f4859b;

        /* renamed from: c  reason: collision with root package name */
        public int f4860c;

        /* renamed from: d  reason: collision with root package name */
        public Function2 f4861d;

        public CachedItemContent(int i2, Object obj, Object obj2) {
            this.f4858a = obj;
            this.f4859b = obj2;
            this.f4860c = i2;
        }

        public final Function2 c() {
            return ComposableLambdaKt.c(1403994769, true, new LazyLayoutItemContentFactory$CachedItemContent$createContentLambda$1(LazyLayoutItemContentFactory.this, this));
        }

        public final Function2 d() {
            Function2 function2 = this.f4861d;
            if (function2 != null) {
                return function2;
            }
            Function2 c2 = c();
            this.f4861d = c2;
            return c2;
        }

        public final Object e() {
            return this.f4859b;
        }

        public final int f() {
            return this.f4860c;
        }

        public final Object g() {
            return this.f4858a;
        }
    }

    public LazyLayoutItemContentFactory(SaveableStateHolder saveableStateHolder, Function0 function0) {
        this.f4854a = saveableStateHolder;
        this.f4855b = function0;
    }

    public final Function2 b(int i2, Object obj, Object obj2) {
        CachedItemContent cachedItemContent = (CachedItemContent) this.f4856c.e(obj);
        if (cachedItemContent != null && cachedItemContent.f() == i2 && Intrinsics.d(cachedItemContent.e(), obj2)) {
            return cachedItemContent.d();
        }
        CachedItemContent cachedItemContent2 = new CachedItemContent(i2, obj, obj2);
        this.f4856c.x(obj, cachedItemContent2);
        return cachedItemContent2.d();
    }

    public final Object c(Object obj) {
        if (obj == null) {
            return null;
        }
        CachedItemContent cachedItemContent = (CachedItemContent) this.f4856c.e(obj);
        if (cachedItemContent != null) {
            return cachedItemContent.e();
        }
        LazyLayoutItemProvider lazyLayoutItemProvider = (LazyLayoutItemProvider) this.f4855b.invoke();
        int e2 = lazyLayoutItemProvider.e(obj);
        if (e2 != -1) {
            return lazyLayoutItemProvider.f(e2);
        }
        return null;
    }

    public final Function0 d() {
        return this.f4855b;
    }
}
