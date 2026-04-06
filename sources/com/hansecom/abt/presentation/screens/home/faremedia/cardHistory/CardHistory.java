package com.hansecom.abt.presentation.screens.home.faremedia.cardHistory;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.ui.components.historyItem.HistorySectionState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface CardHistory {

    @Metadata
    public interface Action {

        @Metadata
        public static final class GetMore implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final GetMore f36372a = new GetMore();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GetMore);
            }

            public int hashCode() {
                return 268203093;
            }

            public String toString() {
                return "GetMore";
            }
        }

        @Metadata
        public static final class Refresh implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Refresh f36373a = new Refresh();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Refresh);
            }

            public int hashCode() {
                return 1428972389;
            }

            public String toString() {
                return "Refresh";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36374a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36374a = stringValue;
            }

            public final StringValue a() {
                return this.f36374a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f36374a, ((Error) obj).f36374a);
            }

            public int hashCode() {
                return this.f36374a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36374a;
                return "Error(message=" + stringValue + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final boolean f36375A;

        /* renamed from: B  reason: collision with root package name */
        public final int f36376B;
        public final boolean C;
        public final PersistentList D;

        /* renamed from: z  reason: collision with root package name */
        public final String f36377z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                PersistentList e2;
                Intrinsics.i(parcel, "parcel");
                String readString = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                boolean z3 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    e2 = null;
                } else {
                    int readInt2 = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt2);
                    for (int i2 = 0; i2 != readInt2; i2++) {
                        arrayList.add(HistorySectionState.CREATOR.createFromParcel(parcel));
                    }
                    e2 = ExtensionsKt.e(arrayList);
                }
                return new State(readString, z2, readInt, z3, e2);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, boolean z2, int i2, boolean z3, PersistentList persistentList) {
            Intrinsics.i(str, "cardNickname");
            this.f36377z = str;
            this.f36375A = z2;
            this.f36376B = i2;
            this.C = z3;
            this.D = persistentList;
        }

        public static /* synthetic */ State b(State state, String str, boolean z2, int i2, boolean z3, PersistentList persistentList, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = state.f36377z;
            }
            if ((i3 & 2) != 0) {
                z2 = state.f36375A;
            }
            boolean z4 = z2;
            if ((i3 & 4) != 0) {
                i2 = state.f36376B;
            }
            int i4 = i2;
            if ((i3 & 8) != 0) {
                z3 = state.C;
            }
            boolean z5 = z3;
            if ((i3 & 16) != 0) {
                persistentList = state.D;
            }
            return state.a(str, z4, i4, z5, persistentList);
        }

        public final State a(String str, boolean z2, int i2, boolean z3, PersistentList persistentList) {
            Intrinsics.i(str, "cardNickname");
            return new State(str, z2, i2, z3, persistentList);
        }

        public final boolean c() {
            return this.C;
        }

        public final String d() {
            return this.f36377z;
        }

        public final int describeContents() {
            return 0;
        }

        public final PersistentList e() {
            return this.D;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f36377z, state.f36377z) && this.f36375A == state.f36375A && this.f36376B == state.f36376B && this.C == state.C && Intrinsics.d(this.D, state.D);
        }

        public final int f() {
            return this.f36376B;
        }

        public final boolean g() {
            return this.f36375A;
        }

        public int hashCode() {
            int hashCode = ((((((this.f36377z.hashCode() * 31) + Boolean.hashCode(this.f36375A)) * 31) + Integer.hashCode(this.f36376B)) * 31) + Boolean.hashCode(this.C)) * 31;
            PersistentList persistentList = this.D;
            return hashCode + (persistentList == null ? 0 : persistentList.hashCode());
        }

        public String toString() {
            String str = this.f36377z;
            boolean z2 = this.f36375A;
            int i2 = this.f36376B;
            boolean z3 = this.C;
            PersistentList persistentList = this.D;
            return "State(cardNickname=" + str + ", refreshing=" + z2 + ", loadedCount=" + i2 + ", canGetMore=" + z3 + ", historySections=" + persistentList + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f36377z);
            parcel.writeInt(this.f36375A ? 1 : 0);
            parcel.writeInt(this.f36376B);
            parcel.writeInt(this.C ? 1 : 0);
            PersistentList<HistorySectionState> persistentList = this.D;
            if (persistentList == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(persistentList.size());
            for (HistorySectionState writeToParcel : persistentList) {
                writeToParcel.writeToParcel(parcel, i2);
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(java.lang.String r4, boolean r5, int r6, boolean r7, kotlinx.collections.immutable.PersistentList r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r3 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L_0x0006
                java.lang.String r4 = ""
            L_0x0006:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto L_0x000d
                r10 = r0
                goto L_0x000e
            L_0x000d:
                r10 = r5
            L_0x000e:
                r5 = r9 & 4
                if (r5 == 0) goto L_0x0013
                goto L_0x0014
            L_0x0013:
                r0 = r6
            L_0x0014:
                r5 = r9 & 8
                if (r5 == 0) goto L_0x0019
                r7 = 1
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
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.cardHistory.CardHistory.State.<init>(java.lang.String, boolean, int, boolean, kotlinx.collections.immutable.PersistentList, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
