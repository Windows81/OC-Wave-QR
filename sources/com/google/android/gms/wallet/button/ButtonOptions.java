package com.google.android.gms.wallet.button;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class ButtonOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<ButtonOptions> CREATOR = new zzb();

    /* renamed from: A  reason: collision with root package name */
    public int f27332A;

    /* renamed from: B  reason: collision with root package name */
    public int f27333B;
    public String C;
    public boolean D = false;

    /* renamed from: z  reason: collision with root package name */
    public int f27334z;

    public final class Builder {
        public /* synthetic */ Builder(zza zza) {
        }

        public ButtonOptions a() {
            return ButtonOptions.this;
        }

        public Builder b(String str) {
            ButtonOptions.this.C = str;
            return this;
        }

        public Builder c(int i2) {
            ButtonOptions.this.f27332A = i2;
            return this;
        }

        public Builder d(int i2) {
            ButtonOptions.this.f27334z = i2;
            return this;
        }

        public Builder e(int i2) {
            ButtonOptions buttonOptions = ButtonOptions.this;
            buttonOptions.f27333B = i2;
            buttonOptions.D = true;
            return this;
        }
    }

    private ButtonOptions() {
    }

    public static Builder f0() {
        return new Builder((zza) null);
    }

    public String H() {
        return this.C;
    }

    public int Q() {
        return this.f27332A;
    }

    public int S() {
        return this.f27334z;
    }

    public int X() {
        return this.f27333B;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ButtonOptions) {
            ButtonOptions buttonOptions = (ButtonOptions) obj;
            return Objects.a(Integer.valueOf(this.f27334z), Integer.valueOf(buttonOptions.f27334z)) && Objects.a(Integer.valueOf(this.f27332A), Integer.valueOf(buttonOptions.f27332A)) && Objects.a(Integer.valueOf(this.f27333B), Integer.valueOf(buttonOptions.f27333B)) && Objects.a(this.C, buttonOptions.C);
        }
    }

    public int hashCode() {
        return Objects.b(Integer.valueOf(this.f27334z));
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int a2 = SafeParcelWriter.a(parcel);
        SafeParcelWriter.n(parcel, 1, S());
        SafeParcelWriter.n(parcel, 2, Q());
        SafeParcelWriter.n(parcel, 3, X());
        SafeParcelWriter.w(parcel, 4, H(), false);
        SafeParcelWriter.b(parcel, a2);
    }

    public ButtonOptions(int i2, int i3, int i4, String str) {
        this.f27334z = ((Integer) Preconditions.m(Integer.valueOf(i2))).intValue();
        this.f27332A = ((Integer) Preconditions.m(Integer.valueOf(i3))).intValue();
        this.f27333B = ((Integer) Preconditions.m(Integer.valueOf(i4))).intValue();
        this.C = (String) Preconditions.m(str);
    }
}
