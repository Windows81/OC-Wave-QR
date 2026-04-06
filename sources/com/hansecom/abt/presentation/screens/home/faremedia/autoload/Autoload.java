package com.hansecom.abt.presentation.screens.home.faremedia.autoload;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface Autoload {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Activate implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Activate f36221a = new Activate();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Activate);
            }

            public int hashCode() {
                return -1332547235;
            }

            public String toString() {
                return "Activate";
            }
        }

        @Metadata
        public static final class Delete implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Delete f36222a = new Delete();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Delete);
            }

            public int hashCode() {
                return 2092807317;
            }

            public String toString() {
                return "Delete";
            }
        }

        @Metadata
        public static final class Pause implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Pause f36223a = new Pause();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Pause);
            }

            public int hashCode() {
                return 2018144716;
            }

            public String toString() {
                return "Pause";
            }
        }

        @Metadata
        public static final class ShowDeleteDialog implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f36224a;

            public ShowDeleteDialog(boolean z2) {
                this.f36224a = z2;
            }

            public final boolean a() {
                return this.f36224a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ShowDeleteDialog) && this.f36224a == ((ShowDeleteDialog) obj).f36224a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f36224a);
            }

            public String toString() {
                boolean z2 = this.f36224a;
                return "ShowDeleteDialog(show=" + z2 + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class DeleteSuccess implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final DeleteSuccess f36225a = new DeleteSuccess();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof DeleteSuccess);
            }

            public int hashCode() {
                return 1868530121;
            }

            public String toString() {
                return "DeleteSuccess";
            }
        }

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36226a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36226a = stringValue;
            }

            public final StringValue a() {
                return this.f36226a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f36226a, ((Error) obj).f36226a);
            }

            public int hashCode() {
                return this.f36226a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36226a;
                return "Error(message=" + stringValue + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final AutoloadState f36227A;

        /* renamed from: B  reason: collision with root package name */
        public final BigDecimal f36228B;
        public final LoadState C;
        public final boolean D;

        /* renamed from: z  reason: collision with root package name */
        public final String f36229z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readString(), parcel.readInt() == 0 ? null : AutoloadState.CREATOR.createFromParcel(parcel), (BigDecimal) parcel.readSerializable(), LoadState.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        @Metadata
        public enum LoadState {
            IDLE,
            INITIAL,
            PAUSING,
            ACTIVATING,
            DELETING;

            static {
                LoadState[] d2;
                F = EnumEntriesKt.a(d2);
            }
        }

        public State(String str, AutoloadState autoloadState, BigDecimal bigDecimal, LoadState loadState, boolean z2) {
            Intrinsics.i(str, "title");
            Intrinsics.i(bigDecimal, "defaultBalanceThreshold");
            Intrinsics.i(loadState, "loadState");
            this.f36229z = str;
            this.f36227A = autoloadState;
            this.f36228B = bigDecimal;
            this.C = loadState;
            this.D = z2;
        }

        public static /* synthetic */ State b(State state, String str, AutoloadState autoloadState, BigDecimal bigDecimal, LoadState loadState, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = state.f36229z;
            }
            if ((i2 & 2) != 0) {
                autoloadState = state.f36227A;
            }
            AutoloadState autoloadState2 = autoloadState;
            if ((i2 & 4) != 0) {
                bigDecimal = state.f36228B;
            }
            BigDecimal bigDecimal2 = bigDecimal;
            if ((i2 & 8) != 0) {
                loadState = state.C;
            }
            LoadState loadState2 = loadState;
            if ((i2 & 16) != 0) {
                z2 = state.D;
            }
            return state.a(str, autoloadState2, bigDecimal2, loadState2, z2);
        }

        public final State a(String str, AutoloadState autoloadState, BigDecimal bigDecimal, LoadState loadState, boolean z2) {
            Intrinsics.i(str, "title");
            Intrinsics.i(bigDecimal, "defaultBalanceThreshold");
            Intrinsics.i(loadState, "loadState");
            return new State(str, autoloadState, bigDecimal, loadState, z2);
        }

        public final AutoloadState c() {
            return this.f36227A;
        }

        public final BigDecimal d() {
            return this.f36228B;
        }

        public final int describeContents() {
            return 0;
        }

        public final LoadState e() {
            return this.C;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f36229z, state.f36229z) && Intrinsics.d(this.f36227A, state.f36227A) && Intrinsics.d(this.f36228B, state.f36228B) && this.C == state.C && this.D == state.D;
        }

        public final boolean f() {
            return this.D;
        }

        public final String g() {
            return this.f36229z;
        }

        public int hashCode() {
            int hashCode = this.f36229z.hashCode() * 31;
            AutoloadState autoloadState = this.f36227A;
            return ((((((hashCode + (autoloadState == null ? 0 : autoloadState.hashCode())) * 31) + this.f36228B.hashCode()) * 31) + this.C.hashCode()) * 31) + Boolean.hashCode(this.D);
        }

        public String toString() {
            String str = this.f36229z;
            AutoloadState autoloadState = this.f36227A;
            BigDecimal bigDecimal = this.f36228B;
            LoadState loadState = this.C;
            boolean z2 = this.D;
            return "State(title=" + str + ", autoload=" + autoloadState + ", defaultBalanceThreshold=" + bigDecimal + ", loadState=" + loadState + ", showDeleteDialog=" + z2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f36229z);
            AutoloadState autoloadState = this.f36227A;
            if (autoloadState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                autoloadState.writeToParcel(parcel, i2);
            }
            parcel.writeSerializable(this.f36228B);
            parcel.writeString(this.C.name());
            parcel.writeInt(this.D ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r4, com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadState r5, java.math.BigDecimal r6, com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload.State.LoadState r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L_0x0006
                java.lang.String r4 = ""
            L_0x0006:
                r10 = r9 & 2
                if (r10 == 0) goto L_0x000b
                r5 = 0
            L_0x000b:
                r10 = r5
                r5 = r9 & 4
                if (r5 == 0) goto L_0x0012
                java.math.BigDecimal r6 = java.math.BigDecimal.ZERO
            L_0x0012:
                r0 = r6
                r5 = r9 & 8
                if (r5 == 0) goto L_0x0019
                com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State$LoadState r7 = com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload.State.LoadState.IDLE
            L_0x0019:
                r1 = r7
                r5 = r9 & 16
                if (r5 == 0) goto L_0x001f
                r8 = 0
            L_0x001f:
                r2 = r8
                r5 = r3
                r6 = r4
                r7 = r10
                r8 = r0
                r9 = r1
                r10 = r2
                r5.<init>(r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload.State.<init>(java.lang.String, com.hansecom.abt.presentation.screens.home.faremedia.autoload.AutoloadState, java.math.BigDecimal, com.hansecom.abt.presentation.screens.home.faremedia.autoload.Autoload$State$LoadState, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
