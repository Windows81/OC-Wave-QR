package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class AndroidEdgeEffectOverscrollFactory implements OverscrollFactory {

    /* renamed from: a  reason: collision with root package name */
    public final Context f2888a;

    /* renamed from: b  reason: collision with root package name */
    public final Density f2889b;

    /* renamed from: c  reason: collision with root package name */
    public final long f2890c;

    /* renamed from: d  reason: collision with root package name */
    public final PaddingValues f2891d;

    public /* synthetic */ AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j2, PaddingValues paddingValues, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, density, j2, paddingValues);
    }

    public OverscrollEffect a() {
        return new AndroidEdgeEffectOverscrollEffect(this.f2888a, this.f2889b, this.f2890c, this.f2891d, (DefaultConstructorMarker) null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.d(AndroidEdgeEffectOverscrollFactory.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type androidx.compose.foundation.AndroidEdgeEffectOverscrollFactory");
        AndroidEdgeEffectOverscrollFactory androidEdgeEffectOverscrollFactory = (AndroidEdgeEffectOverscrollFactory) obj;
        return Intrinsics.d(this.f2888a, androidEdgeEffectOverscrollFactory.f2888a) && Intrinsics.d(this.f2889b, androidEdgeEffectOverscrollFactory.f2889b) && Color.n(this.f2890c, androidEdgeEffectOverscrollFactory.f2890c) && Intrinsics.d(this.f2891d, androidEdgeEffectOverscrollFactory.f2891d);
    }

    public int hashCode() {
        return (((((this.f2888a.hashCode() * 31) + this.f2889b.hashCode()) * 31) + Color.t(this.f2890c)) * 31) + this.f2891d.hashCode();
    }

    public AndroidEdgeEffectOverscrollFactory(Context context, Density density, long j2, PaddingValues paddingValues) {
        this.f2888a = context;
        this.f2889b = density;
        this.f2890c = j2;
        this.f2891d = paddingValues;
    }
}
