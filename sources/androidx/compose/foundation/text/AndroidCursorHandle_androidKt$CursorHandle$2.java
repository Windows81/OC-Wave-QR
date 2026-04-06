package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.OffsetProvider;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

@Metadata
public final class AndroidCursorHandle_androidKt$CursorHandle$2 extends Lambda implements Function2<Composer, Integer, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ Modifier f5464A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ long f5465B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ OffsetProvider f5466z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidCursorHandle_androidKt$CursorHandle$2(OffsetProvider offsetProvider, Modifier modifier, long j2, int i2, int i3) {
        super(2);
        this.f5466z = offsetProvider;
        this.f5464A = modifier;
        this.f5465B = j2;
        this.C = i2;
        this.D = i3;
    }

    public final void b(Composer composer, int i2) {
        AndroidCursorHandle_androidKt.a(this.f5466z, this.f5464A, this.f5465B, composer, RecomposeScopeImplKt.a(this.C | 1), this.D);
    }

    public /* bridge */ /* synthetic */ Object m(Object obj, Object obj2) {
        b((Composer) obj, ((Number) obj2).intValue());
        return Unit.f40552a;
    }
}
