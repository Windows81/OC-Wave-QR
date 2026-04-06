package com.hansecom.abt.presentation.screens.home.more;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface More {

    @Metadata
    public interface Action {

        @Metadata
        public static final class MenuItemClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final MenuItemState f37417a;

            public MenuItemClick(MenuItemState menuItemState) {
                Intrinsics.i(menuItemState, "menuItem");
                this.f37417a = menuItemState;
            }

            public final MenuItemState a() {
                return this.f37417a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MenuItemClick) && Intrinsics.d(this.f37417a, ((MenuItemClick) obj).f37417a);
            }

            public int hashCode() {
                return this.f37417a.hashCode();
            }

            public String toString() {
                MenuItemState menuItemState = this.f37417a;
                return "MenuItemClick(menuItem=" + menuItemState + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class OpenBrowserUrl implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f37418a;

            public OpenBrowserUrl(String str) {
                Intrinsics.i(str, "url");
                this.f37418a = str;
            }

            public final String a() {
                return this.f37418a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenBrowserUrl) && Intrinsics.d(this.f37418a, ((OpenBrowserUrl) obj).f37418a);
            }

            public int hashCode() {
                return this.f37418a.hashCode();
            }

            public String toString() {
                String str = this.f37418a;
                return "OpenBrowserUrl(url=" + str + ")";
            }
        }

        @Metadata
        public static final class OpenGuidedTour implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final OpenGuidedTour f37419a = new OpenGuidedTour();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenGuidedTour);
            }

            public int hashCode() {
                return 1855609329;
            }

            public String toString() {
                return "OpenGuidedTour";
            }
        }

        @Metadata
        public static final class OpenHelpRequest implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final OpenHelpRequest f37420a = new OpenHelpRequest();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenHelpRequest);
            }

            public int hashCode() {
                return 1720944541;
            }

            public String toString() {
                return "OpenHelpRequest";
            }
        }

        @Metadata
        public static final class OpenWebViewUrl implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f37421a;

            /* renamed from: b  reason: collision with root package name */
            public final StringValue f37422b;

            public OpenWebViewUrl(String str, StringValue stringValue) {
                Intrinsics.i(str, "url");
                this.f37421a = str;
                this.f37422b = stringValue;
            }

            public final StringValue a() {
                return this.f37422b;
            }

            public final String b() {
                return this.f37421a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenWebViewUrl)) {
                    return false;
                }
                OpenWebViewUrl openWebViewUrl = (OpenWebViewUrl) obj;
                return Intrinsics.d(this.f37421a, openWebViewUrl.f37421a) && Intrinsics.d(this.f37422b, openWebViewUrl.f37422b);
            }

            public int hashCode() {
                int hashCode = this.f37421a.hashCode() * 31;
                StringValue stringValue = this.f37422b;
                return hashCode + (stringValue == null ? 0 : stringValue.hashCode());
            }

            public String toString() {
                String str = this.f37421a;
                StringValue stringValue = this.f37422b;
                return "OpenWebViewUrl(url=" + str + ", title=" + stringValue + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final String f37423A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f37424B;

        /* renamed from: z  reason: collision with root package name */
        public final MenuItemListState f37425z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readInt() == 0 ? null : MenuItemListState.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(MenuItemListState menuItemListState, String str, boolean z2) {
            Intrinsics.i(str, "version");
            this.f37425z = menuItemListState;
            this.f37423A = str;
            this.f37424B = z2;
        }

        public static /* synthetic */ State b(State state, MenuItemListState menuItemListState, String str, boolean z2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                menuItemListState = state.f37425z;
            }
            if ((i2 & 2) != 0) {
                str = state.f37423A;
            }
            if ((i2 & 4) != 0) {
                z2 = state.f37424B;
            }
            return state.a(menuItemListState, str, z2);
        }

        public final State a(MenuItemListState menuItemListState, String str, boolean z2) {
            Intrinsics.i(str, "version");
            return new State(menuItemListState, str, z2);
        }

        public final MenuItemListState c() {
            return this.f37425z;
        }

        public final String d() {
            return this.f37423A;
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
            return Intrinsics.d(this.f37425z, state.f37425z) && Intrinsics.d(this.f37423A, state.f37423A) && this.f37424B == state.f37424B;
        }

        public int hashCode() {
            MenuItemListState menuItemListState = this.f37425z;
            return ((((menuItemListState == null ? 0 : menuItemListState.hashCode()) * 31) + this.f37423A.hashCode()) * 31) + Boolean.hashCode(this.f37424B);
        }

        public String toString() {
            MenuItemListState menuItemListState = this.f37425z;
            String str = this.f37423A;
            boolean z2 = this.f37424B;
            return "State(menu=" + menuItemListState + ", version=" + str + ", debugMenuEnabled=" + z2 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            MenuItemListState menuItemListState = this.f37425z;
            if (menuItemListState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                menuItemListState.writeToParcel(parcel, i2);
            }
            parcel.writeString(this.f37423A);
            parcel.writeInt(this.f37424B ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(MenuItemListState menuItemListState, String str, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : menuItemListState, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? false : z2);
        }
    }
}
