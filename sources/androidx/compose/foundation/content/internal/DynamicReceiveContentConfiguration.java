package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import androidx.compose.foundation.content.ReceiveContentNode;
import kotlin.Metadata;

@Metadata
public final class DynamicReceiveContentConfiguration extends ReceiveContentConfiguration {

    /* renamed from: b  reason: collision with root package name */
    public final ReceiveContentNode f3212b;

    /* renamed from: c  reason: collision with root package name */
    public final ReceiveContentListener f3213c = new DynamicReceiveContentConfiguration$receiveContentListener$1(this);

    public DynamicReceiveContentConfiguration(ReceiveContentNode receiveContentNode) {
        this.f3212b = receiveContentNode;
    }

    public ReceiveContentListener a() {
        return this.f3213c;
    }

    public final ReceiveContentListener d() {
        ReceiveContentConfiguration b2 = ReceiveContentConfigurationKt.b(this.f3212b);
        if (b2 != null) {
            return b2.a();
        }
        return null;
    }

    public final ReceiveContentNode e() {
        return this.f3212b;
    }
}
