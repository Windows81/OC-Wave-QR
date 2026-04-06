package androidx.compose.foundation.pager;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;

@Metadata
public final class PagerKt$pagerSemantics$1 extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

    /* renamed from: A  reason: collision with root package name */
    public final /* synthetic */ PagerState f5283A;

    /* renamed from: B  reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f5284B;

    /* renamed from: z  reason: collision with root package name */
    public final /* synthetic */ boolean f5285z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerKt$pagerSemantics$1(boolean z2, PagerState pagerState, CoroutineScope coroutineScope) {
        super(1);
        this.f5285z = z2;
        this.f5283A = pagerState;
        this.f5284B = coroutineScope;
    }

    public final void b(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        if (this.f5285z) {
            final PagerState pagerState = this.f5283A;
            final CoroutineScope coroutineScope = this.f5284B;
            SemanticsPropertiesKt.O(semanticsPropertyReceiver, (String) null, new Function0<Boolean>() {
                /* renamed from: b */
                public final Boolean invoke() {
                    return Boolean.valueOf(PagerKt.i(pagerState, coroutineScope));
                }
            }, 1, (Object) null);
            final PagerState pagerState2 = this.f5283A;
            final CoroutineScope coroutineScope2 = this.f5284B;
            SemanticsPropertiesKt.I(semanticsPropertyReceiver, (String) null, new Function0<Boolean>() {
                /* renamed from: b */
                public final Boolean invoke() {
                    return Boolean.valueOf(PagerKt.j(pagerState2, coroutineScope2));
                }
            }, 1, (Object) null);
            return;
        }
        final PagerState pagerState3 = this.f5283A;
        final CoroutineScope coroutineScope3 = this.f5284B;
        SemanticsPropertiesKt.K(semanticsPropertyReceiver, (String) null, new Function0<Boolean>() {
            /* renamed from: b */
            public final Boolean invoke() {
                return Boolean.valueOf(PagerKt.i(pagerState3, coroutineScope3));
            }
        }, 1, (Object) null);
        final PagerState pagerState4 = this.f5283A;
        final CoroutineScope coroutineScope4 = this.f5284B;
        SemanticsPropertiesKt.M(semanticsPropertyReceiver, (String) null, new Function0<Boolean>() {
            /* renamed from: b */
            public final Boolean invoke() {
                return Boolean.valueOf(PagerKt.j(pagerState4, coroutineScope4));
            }
        }, 1, (Object) null);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        b((SemanticsPropertyReceiver) obj);
        return Unit.f40552a;
    }
}
