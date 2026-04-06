package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.geometry.Rect;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CancellableContinuation;

@Metadata
public final class BringIntoViewRequestPriorityQueue {

    /* renamed from: b  reason: collision with root package name */
    public static final int f3398b = MutableVector.C;

    /* renamed from: a  reason: collision with root package name */
    public final MutableVector f3399a = new MutableVector(new ContentInViewNode.Request[16], 0);

    public final void b(Throwable th) {
        MutableVector mutableVector = this.f3399a;
        int p2 = mutableVector.p();
        CancellableContinuation[] cancellableContinuationArr = new CancellableContinuation[p2];
        boolean z2 = false;
        for (int i2 = 0; i2 < p2; i2++) {
            cancellableContinuationArr[i2] = ((ContentInViewNode.Request) mutableVector.f15005z[i2]).a();
        }
        for (int i3 = 0; i3 < p2; i3++) {
            cancellableContinuationArr[i3].W(th);
        }
        if (this.f3399a.p() == 0) {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.c("uncancelled requests present");
        }
    }

    public final boolean c(ContentInViewNode.Request request) {
        Rect rect = (Rect) request.b().invoke();
        if (rect == null) {
            CancellableContinuation a2 = request.a();
            Result.Companion companion = Result.f40519A;
            a2.q(Result.b(Unit.f40552a));
            return false;
        }
        request.a().u(new BringIntoViewRequestPriorityQueue$enqueue$1(this, request));
        IntRange v2 = RangesKt.v(0, this.f3399a.p());
        int n2 = v2.n();
        int o2 = v2.o();
        if (n2 <= o2) {
            while (true) {
                Rect rect2 = (Rect) ((ContentInViewNode.Request) this.f3399a.f15005z[o2]).b().invoke();
                if (rect2 != null) {
                    Rect x2 = rect.x(rect2);
                    if (Intrinsics.d(x2, rect)) {
                        this.f3399a.a(o2 + 1, request);
                        return true;
                    } else if (!Intrinsics.d(x2, rect2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int p2 = this.f3399a.p() - 1;
                        if (p2 <= o2) {
                            while (true) {
                                ((ContentInViewNode.Request) this.f3399a.f15005z[o2]).a().W(cancellationException);
                                if (p2 == o2) {
                                    break;
                                }
                                p2++;
                            }
                        }
                    }
                }
                if (o2 == n2) {
                    break;
                }
                o2--;
            }
        }
        this.f3399a.a(0, request);
        return true;
    }

    public final void d() {
        IntRange v2 = RangesKt.v(0, this.f3399a.p());
        int n2 = v2.n();
        int o2 = v2.o();
        if (n2 <= o2) {
            while (true) {
                ((ContentInViewNode.Request) this.f3399a.f15005z[n2]).a().q(Result.b(Unit.f40552a));
                if (n2 == o2) {
                    break;
                }
                n2++;
            }
        }
        this.f3399a.l();
    }
}
