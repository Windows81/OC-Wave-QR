package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.TransferableContent;
import kotlin.Metadata;
import kotlin.ranges.RangesKt;

@Metadata
public final class DynamicReceiveContentConfiguration$receiveContentListener$1 implements ReceiveContentListener {

    /* renamed from: a  reason: collision with root package name */
    public int f3214a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ DynamicReceiveContentConfiguration f3215b;

    public DynamicReceiveContentConfiguration$receiveContentListener$1(DynamicReceiveContentConfiguration dynamicReceiveContentConfiguration) {
        this.f3215b = dynamicReceiveContentConfiguration;
    }

    public void a() {
        this.f3214a = 0;
        this.f3215b.e().f3().a();
    }

    public void b() {
        int i2 = this.f3214a;
        int e2 = RangesKt.e(i2 - 1, 0);
        this.f3214a = e2;
        if (e2 == 0 && i2 > 0) {
            this.f3215b.e().f3().b();
        }
        ReceiveContentListener c2 = this.f3215b.d();
        if (c2 != null) {
            c2.b();
        }
    }

    public void c() {
        int i2 = this.f3214a + 1;
        this.f3214a = i2;
        if (i2 == 1) {
            this.f3215b.e().f3().c();
        }
        ReceiveContentListener c2 = this.f3215b.d();
        if (c2 != null) {
            c2.c();
        }
    }

    public void d() {
        this.f3215b.e().f3().d();
        this.f3214a = 0;
    }

    public TransferableContent e(TransferableContent transferableContent) {
        TransferableContent e2 = this.f3215b.e().f3().e(transferableContent);
        if (e2 == null) {
            return null;
        }
        ReceiveContentListener c2 = this.f3215b.d();
        return c2 == null ? e2 : c2.e(e2);
    }
}
