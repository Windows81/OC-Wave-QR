package com.hansecom.abt.ui.components.fareMediaCard;

import androidx.compose.ui.graphics.Color;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
final class PreviewState {

    /* renamed from: a  reason: collision with root package name */
    public final String f38212a;

    /* renamed from: b  reason: collision with root package name */
    public final String f38213b;

    /* renamed from: c  reason: collision with root package name */
    public final String f38214c;

    /* renamed from: d  reason: collision with root package name */
    public final StringValue f38215d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f38216e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f38217f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f38218g;

    /* renamed from: h  reason: collision with root package name */
    public final StringValue f38219h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f38220i;

    /* renamed from: j  reason: collision with root package name */
    public final long f38221j;

    public final StringValue a() {
        return this.f38215d;
    }

    public final long b() {
        return this.f38221j;
    }

    public final String c() {
        return this.f38212a;
    }

    public final String d() {
        return this.f38213b;
    }

    public final String e() {
        return this.f38214c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewState)) {
            return false;
        }
        PreviewState previewState = (PreviewState) obj;
        return Intrinsics.d(this.f38212a, previewState.f38212a) && Intrinsics.d(this.f38213b, previewState.f38213b) && Intrinsics.d(this.f38214c, previewState.f38214c) && Intrinsics.d(this.f38215d, previewState.f38215d) && this.f38216e == previewState.f38216e && this.f38217f == previewState.f38217f && this.f38218g == previewState.f38218g && Intrinsics.d(this.f38219h, previewState.f38219h) && this.f38220i == previewState.f38220i && Color.n(this.f38221j, previewState.f38221j);
    }

    public final StringValue f() {
        return this.f38219h;
    }

    public final boolean g() {
        return this.f38220i;
    }

    public final boolean h() {
        return this.f38217f;
    }

    public int hashCode() {
        int hashCode = ((((((((((((this.f38212a.hashCode() * 31) + this.f38213b.hashCode()) * 31) + this.f38214c.hashCode()) * 31) + this.f38215d.hashCode()) * 31) + Boolean.hashCode(this.f38216e)) * 31) + Boolean.hashCode(this.f38217f)) * 31) + Boolean.hashCode(this.f38218g)) * 31;
        StringValue stringValue = this.f38219h;
        return ((((hashCode + (stringValue == null ? 0 : stringValue.hashCode())) * 31) + Boolean.hashCode(this.f38220i)) * 31) + Color.t(this.f38221j);
    }

    public final boolean i() {
        return this.f38218g;
    }

    public final boolean j() {
        return this.f38216e;
    }

    public String toString() {
        String str = this.f38212a;
        String str2 = this.f38213b;
        String str3 = this.f38214c;
        StringValue stringValue = this.f38215d;
        boolean z2 = this.f38216e;
        boolean z3 = this.f38217f;
        boolean z4 = this.f38218g;
        StringValue stringValue2 = this.f38219h;
        boolean z5 = this.f38220i;
        String u2 = Color.u(this.f38221j);
        return "PreviewState(cardBalance=" + str + ", cardNumber=" + str2 + ", riderType=" + str3 + ", autoloadLabel=" + stringValue + ", isVirtual=" + z2 + ", isLocked=" + z3 + ", isLowBalance=" + z4 + ", transferStatusText=" + stringValue2 + ", transferWarning=" + z5 + ", bottomCardColor=" + u2 + ")";
    }
}
