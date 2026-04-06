package com.hansecom.abt.presentation.screens.home.more.guidedTour;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.data.config.guidedTour.GuidedTourPage;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface GuidedTour {

    @Metadata
    public interface Action {
    }

    @Metadata
    public interface Effect {
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: z  reason: collision with root package name */
        public final PersistentList f37445z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i2 = 0; i2 != readInt; i2++) {
                    arrayList.add(GuidedTourPage.CREATOR.createFromParcel(parcel));
                }
                return new State(ExtensionsKt.e(arrayList));
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(PersistentList persistentList) {
            Intrinsics.i(persistentList, "pages");
            this.f37445z = persistentList;
        }

        public final State a(PersistentList persistentList) {
            Intrinsics.i(persistentList, "pages");
            return new State(persistentList);
        }

        public final PersistentList b() {
            return this.f37445z;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof State) && Intrinsics.d(this.f37445z, ((State) obj).f37445z);
        }

        public int hashCode() {
            return this.f37445z.hashCode();
        }

        public String toString() {
            PersistentList persistentList = this.f37445z;
            return "State(pages=" + persistentList + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            PersistentList<GuidedTourPage> persistentList = this.f37445z;
            parcel.writeInt(persistentList.size());
            for (GuidedTourPage writeToParcel : persistentList) {
                writeToParcel.writeToParcel(parcel, i2);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(PersistentList persistentList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? ExtensionsKt.a() : persistentList);
        }
    }
}
