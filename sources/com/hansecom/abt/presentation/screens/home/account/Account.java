package com.hansecom.abt.presentation.screens.home.account;

import android.os.Parcel;
import android.os.Parcelable;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public interface Account {

    @Metadata
    public interface Action {

        @Metadata
        public static final class Close implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Close f35015a = new Close();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Close);
            }

            public int hashCode() {
                return -1839752776;
            }

            public String toString() {
                return "Close";
            }
        }

        @Metadata
        public static final class CloseDialog implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f35016a;

            public CloseDialog(boolean z2) {
                this.f35016a = z2;
            }

            public final boolean a() {
                return this.f35016a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof CloseDialog) && this.f35016a == ((CloseDialog) obj).f35016a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f35016a);
            }

            public String toString() {
                boolean z2 = this.f35016a;
                return "CloseDialog(visible=" + z2 + ")";
            }
        }

        @Metadata
        public static final class ClosePasswordChange implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35017a;

            public ClosePasswordChange(String str) {
                Intrinsics.i(str, "password");
                this.f35017a = str;
            }

            public final String a() {
                return this.f35017a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ClosePasswordChange) && Intrinsics.d(this.f35017a, ((ClosePasswordChange) obj).f35017a);
            }

            public int hashCode() {
                return this.f35017a.hashCode();
            }

            public String toString() {
                String str = this.f35017a;
                return "ClosePasswordChange(password=" + str + ")";
            }
        }

        @Metadata
        public static final class ClosePasswordVisibilityToggle implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final ClosePasswordVisibilityToggle f35018a = new ClosePasswordVisibilityToggle();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ClosePasswordVisibilityToggle);
            }

            public int hashCode() {
                return -297176167;
            }

            public String toString() {
                return "ClosePasswordVisibilityToggle";
            }
        }

        @Metadata
        public static final class LogOut implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final LogOut f35019a = new LogOut();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof LogOut);
            }

            public int hashCode() {
                return -937600598;
            }

            public String toString() {
                return "LogOut";
            }
        }

        @Metadata
        public static final class LogoutDialog implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f35020a;

            public LogoutDialog(boolean z2) {
                this.f35020a = z2;
            }

            public final boolean a() {
                return this.f35020a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LogoutDialog) && this.f35020a == ((LogoutDialog) obj).f35020a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f35020a);
            }

            public String toString() {
                boolean z2 = this.f35020a;
                return "LogoutDialog(visible=" + z2 + ")";
            }
        }

        @Metadata
        public static final class MenuItemClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final MenuItemState f35021a;

            public MenuItemClick(MenuItemState menuItemState) {
                Intrinsics.i(menuItemState, "menuItem");
                this.f35021a = menuItemState;
            }

            public final MenuItemState a() {
                return this.f35021a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MenuItemClick) && Intrinsics.d(this.f35021a, ((MenuItemClick) obj).f35021a);
            }

            public int hashCode() {
                return this.f35021a.hashCode();
            }

            public String toString() {
                MenuItemState menuItemState = this.f35021a;
                return "MenuItemClick(menuItem=" + menuItemState + ")";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class ErrorLoadingConfig implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final ErrorLoadingConfig f35022a = new ErrorLoadingConfig();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ErrorLoadingConfig);
            }

            public int hashCode() {
                return 496096123;
            }

            public String toString() {
                return "ErrorLoadingConfig";
            }
        }

        @Metadata
        public static final class OpenAccountInformation implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final OpenAccountInformation f35023a = new OpenAccountInformation();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenAccountInformation);
            }

            public int hashCode() {
                return 1037071150;
            }

            public String toString() {
                return "OpenAccountInformation";
            }
        }

        @Metadata
        public static final class OpenChangeAddress implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final OpenChangeAddress f35024a = new OpenChangeAddress();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenChangeAddress);
            }

            public int hashCode() {
                return -1246297515;
            }

            public String toString() {
                return "OpenChangeAddress";
            }
        }

        @Metadata
        public static final class OpenChangePassword implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final OpenChangePassword f35025a = new OpenChangePassword();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenChangePassword);
            }

            public int hashCode() {
                return -1839783846;
            }

            public String toString() {
                return "OpenChangePassword";
            }
        }

        @Metadata
        public static final class OpenChangePin implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final OpenChangePin f35026a = new OpenChangePin();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenChangePin);
            }

            public int hashCode() {
                return 1439527030;
            }

            public String toString() {
                return "OpenChangePin";
            }
        }

        @Metadata
        public static final class OpenChangeSecurityQuestion implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final OpenChangeSecurityQuestion f35027a = new OpenChangeSecurityQuestion();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenChangeSecurityQuestion);
            }

            public int hashCode() {
                return -246739451;
            }

            public String toString() {
                return "OpenChangeSecurityQuestion";
            }
        }

        @Metadata
        public static final class OpenPaymentMethods implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final OpenPaymentMethods f35028a = new OpenPaymentMethods();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof OpenPaymentMethods);
            }

            public int hashCode() {
                return 1483611323;
            }

            public String toString() {
                return "OpenPaymentMethods";
            }
        }

        @Metadata
        public static final class SuccessClosingAccount implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final boolean f35029a;

            public SuccessClosingAccount(boolean z2) {
                this.f35029a = z2;
            }

            public final boolean a() {
                return this.f35029a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof SuccessClosingAccount) && this.f35029a == ((SuccessClosingAccount) obj).f35029a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f35029a);
            }

            public String toString() {
                boolean z2 = this.f35029a;
                return "SuccessClosingAccount(wasRemoved=" + z2 + ")";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final boolean f35030A;

        /* renamed from: B  reason: collision with root package name */
        public final boolean f35031B;
        public final String C;
        public final StringValue D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final MenuItemListState H;

        /* renamed from: z  reason: collision with root package name */
        public final boolean f35032z;

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.i(parcel, "parcel");
                return new State(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (StringValue) parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : MenuItemListState.CREATOR.createFromParcel(parcel));
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        public State(boolean z2, boolean z3, boolean z4, String str, StringValue stringValue, boolean z5, boolean z6, boolean z7, MenuItemListState menuItemListState) {
            Intrinsics.i(str, "closeDialogPassword");
            Intrinsics.i(stringValue, "closeDialogPasswordError");
            this.f35032z = z2;
            this.f35030A = z3;
            this.f35031B = z4;
            this.C = str;
            this.D = stringValue;
            this.E = z5;
            this.F = z6;
            this.G = z7;
            this.H = menuItemListState;
        }

        public static /* synthetic */ State b(State state, boolean z2, boolean z3, boolean z4, String str, StringValue stringValue, boolean z5, boolean z6, boolean z7, MenuItemListState menuItemListState, int i2, Object obj) {
            State state2 = state;
            int i3 = i2;
            return state.a((i3 & 1) != 0 ? state2.f35032z : z2, (i3 & 2) != 0 ? state2.f35030A : z3, (i3 & 4) != 0 ? state2.f35031B : z4, (i3 & 8) != 0 ? state2.C : str, (i3 & 16) != 0 ? state2.D : stringValue, (i3 & 32) != 0 ? state2.E : z5, (i3 & 64) != 0 ? state2.F : z6, (i3 & 128) != 0 ? state2.G : z7, (i3 & 256) != 0 ? state2.H : menuItemListState);
        }

        public final State a(boolean z2, boolean z3, boolean z4, String str, StringValue stringValue, boolean z5, boolean z6, boolean z7, MenuItemListState menuItemListState) {
            Intrinsics.i(str, "closeDialogPassword");
            StringValue stringValue2 = stringValue;
            Intrinsics.i(stringValue2, "closeDialogPasswordError");
            return new State(z2, z3, z4, str, stringValue2, z5, z6, z7, menuItemListState);
        }

        public final boolean c() {
            return this.F;
        }

        public final String d() {
            return this.C;
        }

        public final int describeContents() {
            return 0;
        }

        public final StringValue e() {
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
            return this.f35032z == state.f35032z && this.f35030A == state.f35030A && this.f35031B == state.f35031B && Intrinsics.d(this.C, state.C) && Intrinsics.d(this.D, state.D) && this.E == state.E && this.F == state.F && this.G == state.G && Intrinsics.d(this.H, state.H);
        }

        public final boolean f() {
            return this.E;
        }

        public final boolean g() {
            return this.f35031B;
        }

        public final boolean h() {
            return this.G;
        }

        public int hashCode() {
            int hashCode = ((((((((((((((Boolean.hashCode(this.f35032z) * 31) + Boolean.hashCode(this.f35030A)) * 31) + Boolean.hashCode(this.f35031B)) * 31) + this.C.hashCode()) * 31) + this.D.hashCode()) * 31) + Boolean.hashCode(this.E)) * 31) + Boolean.hashCode(this.F)) * 31) + Boolean.hashCode(this.G)) * 31;
            MenuItemListState menuItemListState = this.H;
            return hashCode + (menuItemListState == null ? 0 : menuItemListState.hashCode());
        }

        public final MenuItemListState i() {
            return this.H;
        }

        public String toString() {
            boolean z2 = this.f35032z;
            boolean z3 = this.f35030A;
            boolean z4 = this.f35031B;
            String str = this.C;
            StringValue stringValue = this.D;
            boolean z5 = this.E;
            boolean z6 = this.F;
            boolean z7 = this.G;
            MenuItemListState menuItemListState = this.H;
            return "State(biometricsAvailable=" + z2 + ", biometricsEnabled=" + z3 + ", closeDialogVisible=" + z4 + ", closeDialogPassword=" + str + ", closeDialogPasswordError=" + stringValue + ", closeDialogPasswordVisible=" + z5 + ", closeDialogInProgress=" + z6 + ", logoutDialogVisible=" + z7 + ", menu=" + menuItemListState + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            parcel.writeInt(this.f35032z ? 1 : 0);
            parcel.writeInt(this.f35030A ? 1 : 0);
            parcel.writeInt(this.f35031B ? 1 : 0);
            parcel.writeString(this.C);
            parcel.writeParcelable(this.D, i2);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeInt(this.G ? 1 : 0);
            MenuItemListState menuItemListState = this.H;
            if (menuItemListState == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            menuItemListState.writeToParcel(parcel, i2);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(boolean r11, boolean r12, boolean r13, java.lang.String r14, com.hansecom.abt.util.resourcesResolvers.StringValue r15, boolean r16, boolean r17, boolean r18, com.hansecom.abt.ui.components.listItem.MenuItemListState r19, int r20, kotlin.jvm.internal.DefaultConstructorMarker r21) {
            /*
                r10 = this;
                r0 = r20
                r1 = r0 & 1
                r2 = 0
                if (r1 == 0) goto L_0x0009
                r1 = r2
                goto L_0x000a
            L_0x0009:
                r1 = r11
            L_0x000a:
                r3 = r0 & 2
                if (r3 == 0) goto L_0x0010
                r3 = r2
                goto L_0x0011
            L_0x0010:
                r3 = r12
            L_0x0011:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0017
                r4 = r2
                goto L_0x0018
            L_0x0017:
                r4 = r13
            L_0x0018:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x001f
                java.lang.String r5 = ""
                goto L_0x0020
            L_0x001f:
                r5 = r14
            L_0x0020:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x002b
                com.hansecom.abt.util.resourcesResolvers.StringValue$Companion r6 = com.hansecom.abt.util.resourcesResolvers.StringValue.Companion
                com.hansecom.abt.util.resourcesResolvers.StringValue r6 = r6.a()
                goto L_0x002c
            L_0x002b:
                r6 = r15
            L_0x002c:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x0032
                r7 = r2
                goto L_0x0034
            L_0x0032:
                r7 = r16
            L_0x0034:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x003a
                r8 = r2
                goto L_0x003c
            L_0x003a:
                r8 = r17
            L_0x003c:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x0041
                goto L_0x0043
            L_0x0041:
                r2 = r18
            L_0x0043:
                r0 = r0 & 256(0x100, float:3.59E-43)
                if (r0 == 0) goto L_0x0049
                r0 = 0
                goto L_0x004b
            L_0x0049:
                r0 = r19
            L_0x004b:
                r11 = r10
                r12 = r1
                r13 = r3
                r14 = r4
                r15 = r5
                r16 = r6
                r17 = r7
                r18 = r8
                r19 = r2
                r20 = r0
                r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.account.Account.State.<init>(boolean, boolean, boolean, java.lang.String, com.hansecom.abt.util.resourcesResolvers.StringValue, boolean, boolean, boolean, com.hansecom.abt.ui.components.listItem.MenuItemListState, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
