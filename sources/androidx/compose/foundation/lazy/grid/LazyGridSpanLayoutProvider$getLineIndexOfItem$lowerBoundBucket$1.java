package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1 extends Lambda implements Function1<LazyGridSpanLayoutProvider.Bucket, Integer> {

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ int f4720z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyGridSpanLayoutProvider$getLineIndexOfItem$lowerBoundBucket$1(int i2) {
        super(1);
        this.f4720z = i2;
    }

    /* renamed from: b */
    public final Integer invoke(LazyGridSpanLayoutProvider.Bucket bucket) {
        return Integer.valueOf(bucket.a() - this.f4720z);
    }
}
