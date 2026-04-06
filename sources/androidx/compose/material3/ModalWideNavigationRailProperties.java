package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class ModalWideNavigationRailProperties {

    /* renamed from: a  reason: collision with root package name */
    public final SecureFlagPolicy f10360a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10361b;

    public ModalWideNavigationRailProperties(SecureFlagPolicy secureFlagPolicy, boolean z2) {
        this.f10360a = secureFlagPolicy;
        this.f10361b = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ModalWideNavigationRailProperties) && this.f10360a == ((ModalWideNavigationRailProperties) obj).f10360a;
    }

    public int hashCode() {
        return (this.f10360a.hashCode() * 31) + Boolean.hashCode(this.f10361b);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModalWideNavigationRailProperties(boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z2);
    }

    public ModalWideNavigationRailProperties(boolean z2) {
        this(SecureFlagPolicy.Inherit, z2);
    }
}
