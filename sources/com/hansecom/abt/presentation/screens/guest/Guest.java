package com.hansecom.abt.presentation.screens.guest;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface Guest {

    @Metadata
    public interface Action {

        @Metadata
        public static final class MenuItemClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final MenuItemState f34687a;

            public MenuItemClick(MenuItemState menuItemState) {
                Intrinsics.i(menuItemState, "menuItem");
                this.f34687a = menuItemState;
            }

            public final MenuItemState a() {
                return this.f34687a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MenuItemClick) && Intrinsics.d(this.f34687a, ((MenuItemClick) obj).f34687a);
            }

            public int hashCode() {
                return this.f34687a.hashCode();
            }

            public String toString() {
                MenuItemState menuItemState = this.f34687a;
                return "MenuItemClick(menuItem=" + menuItemState + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class OpenBrowserUrl implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f34688a;

            public OpenBrowserUrl(String str) {
                Intrinsics.i(str, "url");
                this.f34688a = str;
            }

            public final String a() {
                return this.f34688a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof OpenBrowserUrl) && Intrinsics.d(this.f34688a, ((OpenBrowserUrl) obj).f34688a);
            }

            public int hashCode() {
                return this.f34688a.hashCode();
            }

            public String toString() {
                String str = this.f34688a;
                return "OpenBrowserUrl(url=" + str + ")";
            }
        }

        @Metadata
        public static final class OpenCheckFareMediaBalance implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final OpenCheckFareMediaBalance f34689a = new OpenCheckFareMediaBalance();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenCheckFareMediaBalance);
            }

            public int hashCode() {
                return -961396468;
            }

            public String toString() {
                return "OpenCheckFareMediaBalance";
            }
        }

        @Metadata
        public static final class OpenGuidedTour implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final OpenGuidedTour f34690a = new OpenGuidedTour();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenGuidedTour);
            }

            public int hashCode() {
                return 1278158818;
            }

            public String toString() {
                return "OpenGuidedTour";
            }
        }

        @Metadata
        public static final class OpenHelpRequest implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final OpenHelpRequest f34691a = new OpenHelpRequest();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenHelpRequest);
            }

            public int hashCode() {
                return 999847884;
            }

            public String toString() {
                return "OpenHelpRequest";
            }
        }

        @Metadata
        public static final class OpenWebViewUrl implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f34692a;

            /* renamed from: b  reason: collision with root package name */
            public final StringValue f34693b;

            public OpenWebViewUrl(String str, StringValue stringValue) {
                Intrinsics.i(str, "url");
                this.f34692a = str;
                this.f34693b = stringValue;
            }

            public final StringValue a() {
                return this.f34693b;
            }

            public final String b() {
                return this.f34692a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OpenWebViewUrl)) {
                    return false;
                }
                OpenWebViewUrl openWebViewUrl = (OpenWebViewUrl) obj;
                return Intrinsics.d(this.f34692a, openWebViewUrl.f34692a) && Intrinsics.d(this.f34693b, openWebViewUrl.f34693b);
            }

            public int hashCode() {
                int hashCode = this.f34692a.hashCode() * 31;
                StringValue stringValue = this.f34693b;
                return hashCode + (stringValue == null ? 0 : stringValue.hashCode());
            }

            public String toString() {
                String str = this.f34692a;
                StringValue stringValue = this.f34693b;
                return "OpenWebViewUrl(url=" + str + ", title=" + stringValue + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final String f34694A;

        /* renamed from: z  reason: collision with root package name */
        public final MenuItemListState f34695z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readInt() == 0 ? null : MenuItemListState.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(MenuItemListState menuItemListState, String str) {
            Intrinsics.i(str, "version");
            this.f34695z = menuItemListState;
            this.f34694A = str;
        }

        public final State a(MenuItemListState menuItemListState, String str) {
            Intrinsics.i(str, "version");
            return new State(menuItemListState, str);
        }

        public final MenuItemListState b() {
            return this.f34695z;
        }

        public final String c() {
            return this.f34694A;
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
            return Intrinsics.d(this.f34695z, state.f34695z) && Intrinsics.d(this.f34694A, state.f34694A);
        }

        public int hashCode() {
            MenuItemListState menuItemListState = this.f34695z;
            return ((menuItemListState == null ? 0 : menuItemListState.hashCode()) * 31) + this.f34694A.hashCode();
        }

        public String toString() {
            MenuItemListState menuItemListState = this.f34695z;
            String str = this.f34694A;
            return "State(menu=" + menuItemListState + ", version=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            MenuItemListState menuItemListState = this.f34695z;
            if (menuItemListState == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                menuItemListState.writeToParcel(parcel, i2);
            }
            parcel.writeString(this.f34694A);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(MenuItemListState menuItemListState, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : menuItemListState, (i2 & 2) != 0 ? "" : str);
        }
    }
}
