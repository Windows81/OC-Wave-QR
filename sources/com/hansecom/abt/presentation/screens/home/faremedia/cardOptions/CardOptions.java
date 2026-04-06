package com.hansecom.abt.presentation.screens.home.faremedia.cardOptions;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface CardOptions {

    @Metadata
    public interface Action {

        @Metadata
        public static final class MenuItemClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final MenuItemState f36470a;

            public MenuItemClick(MenuItemState menuItemState) {
                Intrinsics.i(menuItemState, "menuItem");
                this.f36470a = menuItemState;
            }

            public final MenuItemState a() {
                return this.f36470a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MenuItemClick) && Intrinsics.d(this.f36470a, ((MenuItemClick) obj).f36470a);
            }

            public int hashCode() {
                return this.f36470a.hashCode();
            }

            public String toString() {
                MenuItemState menuItemState = this.f36470a;
                return "MenuItemClick(menuItem=" + menuItemState + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class AddValue implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final AddValue f36471a = new AddValue();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AddValue);
            }

            public int hashCode() {
                return -821436897;
            }

            public String toString() {
                return "AddValue";
            }
        }

        @Metadata
        public static final class Autoload implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Autoload f36472a = new Autoload();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Autoload);
            }

            public int hashCode() {
                return 1862708196;
            }

            public String toString() {
                return "Autoload";
            }
        }

        @Metadata
        public static final class CardHistory implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final CardHistory f36473a = new CardHistory();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CardHistory);
            }

            public int hashCode() {
                return 882708533;
            }

            public String toString() {
                return "CardHistory";
            }
        }

        @Metadata
        public static final class CardInformation implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final CardInformation f36474a = new CardInformation();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CardInformation);
            }

            public int hashCode() {
                return -486348723;
            }

            public String toString() {
                return "CardInformation";
            }
        }

        @Metadata
        public static final class ConvertToVirtual implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final ConvertToVirtual f36475a = new ConvertToVirtual();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ConvertToVirtual);
            }

            public int hashCode() {
                return -1641845396;
            }

            public String toString() {
                return "ConvertToVirtual";
            }
        }

        @Metadata
        public static final class FareCapping implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final FareCapping f36476a = new FareCapping();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof FareCapping);
            }

            public int hashCode() {
                return 1155152135;
            }

            public String toString() {
                return "FareCapping";
            }
        }

        @Metadata
        public static final class Institutions implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Institutions f36477a = new Institutions();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Institutions);
            }

            public int hashCode() {
                return 44993290;
            }

            public String toString() {
                return "Institutions";
            }
        }

        @Metadata
        public static final class LockCard implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final LockCard f36478a = new LockCard();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof LockCard);
            }

            public int hashCode() {
                return -1962893398;
            }

            public String toString() {
                return "LockCard";
            }
        }

        @Metadata
        public static final class Passes implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final Passes f36479a = new Passes();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Passes);
            }

            public int hashCode() {
                return -1870917362;
            }

            public String toString() {
                return "Passes";
            }
        }

        @Metadata
        public static final class RemoveCard implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final RemoveCard f36480a = new RemoveCard();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof RemoveCard);
            }

            public int hashCode() {
                return -168655165;
            }

            public String toString() {
                return "RemoveCard";
            }
        }

        @Metadata
        public static final class TransferBalance implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final TransferBalance f36481a = new TransferBalance();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof TransferBalance);
            }

            public int hashCode() {
                return -1072533310;
            }

            public String toString() {
                return "TransferBalance";
            }
        }

        @Metadata
        public static final class UnlockCard implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final UnlockCard f36482a = new UnlockCard();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof UnlockCard);
            }

            public int hashCode() {
                return -2126639741;
            }

            public String toString() {
                return "UnlockCard";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: z  reason: collision with root package name */
        public final MenuItemListState f36483z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readInt() == 0 ? null : MenuItemListState.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(MenuItemListState menuItemListState) {
            this.f36483z = menuItemListState;
        }

        public final State a(MenuItemListState menuItemListState) {
            return new State(menuItemListState);
        }

        public final MenuItemListState b() {
            return this.f36483z;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof State) && Intrinsics.d(this.f36483z, ((State) obj).f36483z);
        }

        public int hashCode() {
            MenuItemListState menuItemListState = this.f36483z;
            if (menuItemListState == null) {
                return 0;
            }
            return menuItemListState.hashCode();
        }

        public String toString() {
            MenuItemListState menuItemListState = this.f36483z;
            return "State(menuItemsList=" + menuItemListState + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            MenuItemListState menuItemListState = this.f36483z;
            if (menuItemListState == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            menuItemListState.writeToParcel(parcel, i2);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ State(MenuItemListState menuItemListState, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : menuItemListState);
        }
    }
}
