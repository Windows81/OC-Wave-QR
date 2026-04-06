package androidx.compose.ui.window;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata
public final class DialogProperties {

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19319a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f19320b;

    /* renamed from: c  reason: collision with root package name */
    public final SecureFlagPolicy f19321c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f19322d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f19323e;

    public DialogProperties(boolean z2, boolean z3, SecureFlagPolicy secureFlagPolicy, boolean z4, boolean z5) {
        this.f19319a = z2;
        this.f19320b = z3;
        this.f19321c = secureFlagPolicy;
        this.f19322d = z4;
        this.f19323e = z5;
    }

    public final boolean a() {
        return this.f19323e;
    }

    public final boolean b() {
        return this.f19319a;
    }

    public final boolean c() {
        return this.f19320b;
    }

    public final SecureFlagPolicy d() {
        return this.f19321c;
    }

    public final boolean e() {
        return this.f19322d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        return this.f19319a == dialogProperties.f19319a && this.f19320b == dialogProperties.f19320b && this.f19321c == dialogProperties.f19321c && this.f19322d == dialogProperties.f19322d && this.f19323e == dialogProperties.f19323e;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f19319a) * 31) + Boolean.hashCode(this.f19320b)) * 31) + this.f19321c.hashCode()) * 31) + Boolean.hashCode(this.f19322d)) * 31) + Boolean.hashCode(this.f19323e);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DialogProperties(boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? true : z3, (i2 & 4) != 0 ? true : z4);
    }

    public DialogProperties(boolean z2, boolean z3, boolean z4) {
        this(z2, z3, SecureFlagPolicy.Inherit, z4, true);
    }
}
