package androidx.compose.foundation.content.internal;

import androidx.compose.foundation.content.ReceiveContentListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class ReceiveContentConfigurationImpl extends ReceiveContentConfiguration {

    /* renamed from: b  reason: collision with root package name */
    public final ReceiveContentListener f3217b;

    public ReceiveContentListener a() {
        return this.f3217b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReceiveContentConfigurationImpl) && Intrinsics.d(this.f3217b, ((ReceiveContentConfigurationImpl) obj).f3217b);
    }

    public int hashCode() {
        return this.f3217b.hashCode();
    }

    public String toString() {
        return "ReceiveContentConfigurationImpl(receiveContentListener=" + this.f3217b + ')';
    }
}
