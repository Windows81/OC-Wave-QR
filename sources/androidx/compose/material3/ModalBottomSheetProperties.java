package androidx.compose.material3;

import androidx.compose.ui.window.SecureFlagPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class ModalBottomSheetProperties {

    /* renamed from: a  reason: collision with root package name */
    public final SecureFlagPolicy f10335a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10336b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10337c;

    /* renamed from: d  reason: collision with root package name */
    public final Boolean f10338d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f10339e;

    public ModalBottomSheetProperties() {
        this.f10335a = SecureFlagPolicy.Inherit;
        this.f10336b = true;
        this.f10337c = true;
        this.f10338d = null;
        this.f10339e = null;
    }

    public final SecureFlagPolicy a() {
        return this.f10335a;
    }

    public final boolean b() {
        return this.f10336b;
    }

    public final Boolean c() {
        return this.f10339e;
    }

    public final Boolean d() {
        return this.f10338d;
    }

    public final boolean e() {
        return this.f10337c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModalBottomSheetProperties)) {
            return false;
        }
        ModalBottomSheetProperties modalBottomSheetProperties = (ModalBottomSheetProperties) obj;
        return this.f10335a == modalBottomSheetProperties.f10335a && Intrinsics.d(this.f10338d, modalBottomSheetProperties.f10338d) && Intrinsics.d(this.f10339e, modalBottomSheetProperties.f10339e) && this.f10337c == modalBottomSheetProperties.f10337c && this.f10336b == modalBottomSheetProperties.f10336b;
    }

    public int hashCode() {
        int hashCode = ((this.f10335a.hashCode() * 31) + Boolean.hashCode(this.f10336b)) * 31;
        Boolean bool = this.f10338d;
        int i2 = 0;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f10339e;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return ((hashCode2 + i2) * 31) + Boolean.hashCode(this.f10337c);
    }

    public ModalBottomSheetProperties(boolean z2, boolean z3) {
        this.f10335a = SecureFlagPolicy.Inherit;
        this.f10336b = z2;
        this.f10337c = z3;
        this.f10339e = null;
        this.f10338d = null;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ModalBottomSheetProperties(boolean z2, boolean z3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? true : z2, (i2 & 2) != 0 ? true : z3);
    }
}
