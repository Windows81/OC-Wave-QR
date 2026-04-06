package com.hansecom.abt.presentation.screens.auth.welcome;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface Welcome {

    @Metadata
    public interface Action {
    }

    @Metadata
    public interface Effect {
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final boolean f34658A;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f34659z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                boolean z2 = false;
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new State(z3, z2);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2, boolean z3) {
            this.f34659z = z2;
            this.f34658A = z3;
        }

        public final boolean a() {
            return this.f34658A;
        }

        public final boolean b() {
            return this.f34659z;
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f34659z ? 1 : 0);
            parcel.writeInt(this.f34658A ? 1 : 0);
        }
    }
}
