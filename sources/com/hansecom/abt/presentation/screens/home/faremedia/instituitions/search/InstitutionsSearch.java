package com.hansecom.abt.presentation.screens.home.faremedia.instituitions.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.presentation.model.InstitutionState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface InstitutionsSearch {

    @Metadata
    public interface Action {

        @Metadata
        public static final class FilterChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f36863a;

            public FilterChange(String str) {
                Intrinsics.i(str, "value");
                this.f36863a = str;
            }

            public final String a() {
                return this.f36863a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof FilterChange) && Intrinsics.d(this.f36863a, ((FilterChange) obj).f36863a);
            }

            public int hashCode() {
                return this.f36863a.hashCode();
            }

            public String toString() {
                String str = this.f36863a;
                return "FilterChange(value=" + str + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f36864a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f36864a = stringValue;
            }

            public final StringValue a() {
                return this.f36864a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f36864a, ((Error) obj).f36864a);
            }

            public int hashCode() {
                return this.f36864a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f36864a;
                return "Error(message=" + stringValue + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final PersistentList f36865A;

        /* renamed from: z  reason: collision with root package name */
        public final String f36866z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                PersistentList persistentList;
                Intrinsics.i(parcel, "parcel");
                String readString = parcel.readString();
                if (parcel.readInt() == 0) {
                    persistentList = null;
                } else {
                    int readInt = parcel.readInt();
                    ArrayList arrayList = new ArrayList(readInt);
                    for (int i2 = 0; i2 != readInt; i2++) {
                        arrayList.add(InstitutionState.CREATOR.createFromParcel(parcel));
                    }
                    persistentList = ExtensionsKt.e(arrayList);
                }
                return new State(readString, persistentList);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(String str, PersistentList persistentList) {
            Intrinsics.i(str, "filter");
            this.f36866z = str;
            this.f36865A = persistentList;
        }

        public static /* synthetic */ State b(State state, String str, PersistentList persistentList, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = state.f36866z;
            }
            if ((i2 & 2) != 0) {
                persistentList = state.f36865A;
            }
            return state.a(str, persistentList);
        }

        public final State a(String str, PersistentList persistentList) {
            Intrinsics.i(str, "filter");
            return new State(str, persistentList);
        }

        public final String c() {
            return this.f36866z;
        }

        public final PersistentList d() {
            return this.f36865A;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f36866z, state.f36866z) && Intrinsics.d(this.f36865A, state.f36865A);
        }

        public int hashCode() {
            int hashCode = this.f36866z.hashCode() * 31;
            PersistentList persistentList = this.f36865A;
            return hashCode + (persistentList == null ? 0 : persistentList.hashCode());
        }

        public String toString() {
            String str = this.f36866z;
            PersistentList persistentList = this.f36865A;
            return "State(filter=" + str + ", institutions=" + persistentList + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeString(this.f36866z);
            PersistentList<InstitutionState> persistentList = this.f36865A;
            if (persistentList == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(persistentList.size());
            for (InstitutionState writeToParcel : persistentList) {
                writeToParcel.writeToParcel(parcel, i2);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(String str, PersistentList persistentList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? null : persistentList);
        }
    }
}
