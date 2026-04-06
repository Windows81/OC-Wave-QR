package com.hansecom.abt.presentation.screens.home.faremedia;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.hansecom.abt.presentation.model.TransferTimeState;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public interface FareMedia {

    @Metadata
    public interface Action {

        @Metadata
        public static final class AddCard implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final AddCard f35900a = new AddCard();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof AddCard);
            }

            public int hashCode() {
                return 1052228703;
            }

            public String toString() {
                return "AddCard";
            }
        }

        @Metadata
        public static final class AddToGoogleWalletClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35901a;

            public AddToGoogleWalletClick(String str) {
                Intrinsics.i(str, "id");
                this.f35901a = str;
            }

            public final String a() {
                return this.f35901a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof AddToGoogleWalletClick) && Intrinsics.d(this.f35901a, ((AddToGoogleWalletClick) obj).f35901a);
            }

            public int hashCode() {
                return this.f35901a.hashCode();
            }

            public String toString() {
                String str = this.f35901a;
                return "AddToGoogleWalletClick(id=" + str + ")";
            }
        }

        @Metadata
        public static final class ChangeCurrentCard implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final String f35902a;

            public ChangeCurrentCard(String str) {
                Intrinsics.i(str, "id");
                this.f35902a = str;
            }

            public final String a() {
                return this.f35902a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ChangeCurrentCard) && Intrinsics.d(this.f35902a, ((ChangeCurrentCard) obj).f35902a);
            }

            public int hashCode() {
                return this.f35902a.hashCode();
            }

            public String toString() {
                String str = this.f35902a;
                return "ChangeCurrentCard(id=" + str + ")";
            }
        }

        @Metadata
        public static final class CreateCardClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final CreateCardClick f35903a = new CreateCardClick();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof CreateCardClick);
            }

            public int hashCode() {
                return -476496438;
            }

            public String toString() {
                return "CreateCardClick";
            }
        }

        @Metadata
        public static final class DismissDialog implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final DismissDialog f35904a = new DismissDialog();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof DismissDialog);
            }

            public int hashCode() {
                return 727717632;
            }

            public String toString() {
                return "DismissDialog";
            }
        }

        @Metadata
        public static final class LinkCardClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final LinkCardClick f35905a = new LinkCardClick();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof LinkCardClick);
            }

            public int hashCode() {
                return 2115147788;
            }

            public String toString() {
                return "LinkCardClick";
            }
        }

        @Metadata
        public static final class OnGoogleWalletResult implements Action {

            /* renamed from: a  reason: collision with root package name */
            public final int f35906a;

            /* renamed from: b  reason: collision with root package name */
            public final String f35907b;

            public OnGoogleWalletResult(int i2, String str) {
                this.f35906a = i2;
                this.f35907b = str;
            }

            public final String a() {
                return this.f35907b;
            }

            public final int b() {
                return this.f35906a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof OnGoogleWalletResult)) {
                    return false;
                }
                OnGoogleWalletResult onGoogleWalletResult = (OnGoogleWalletResult) obj;
                return this.f35906a == onGoogleWalletResult.f35906a && Intrinsics.d(this.f35907b, onGoogleWalletResult.f35907b);
            }

            public int hashCode() {
                int hashCode = Integer.hashCode(this.f35906a) * 31;
                String str = this.f35907b;
                return hashCode + (str == null ? 0 : str.hashCode());
            }

            public String toString() {
                int i2 = this.f35906a;
                String str = this.f35907b;
                return "OnGoogleWalletResult(result=" + i2 + ", error=" + str + ")";
            }
        }

        @Metadata
        public static final class Refresh implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final Refresh f35908a = new Refresh();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof Refresh);
            }

            public int hashCode() {
                return -1008197655;
            }

            public String toString() {
                return "Refresh";
            }
        }

        @Metadata
        public static final class RetrieveCard implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final RetrieveCard f35909a = new RetrieveCard();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof RetrieveCard);
            }

            public int hashCode() {
                return 359734558;
            }

            public String toString() {
                return "RetrieveCard";
            }
        }

        @Metadata
        public static final class TransferCardClick implements Action {

            /* renamed from: a  reason: collision with root package name */
            public static final TransferCardClick f35910a = new TransferCardClick();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof TransferCardClick);
            }

            public int hashCode() {
                return 488896571;
            }

            public String toString() {
                return "TransferCardClick";
            }
        }
    }

    @Metadata
    public interface Effect {

        @Metadata
        public static final class Error implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final StringValue f35911a;

            public Error(StringValue stringValue) {
                Intrinsics.i(stringValue, "message");
                this.f35911a = stringValue;
            }

            public final StringValue a() {
                return this.f35911a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.d(this.f35911a, ((Error) obj).f35911a);
            }

            public int hashCode() {
                return this.f35911a.hashCode();
            }

            public String toString() {
                StringValue stringValue = this.f35911a;
                return "Error(message=" + stringValue + ")";
            }
        }

        @Metadata
        public static final class GoToCreateCard implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final GoToCreateCard f35912a = new GoToCreateCard();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GoToCreateCard);
            }

            public int hashCode() {
                return 1564331654;
            }

            public String toString() {
                return "GoToCreateCard";
            }
        }

        @Metadata
        public static final class GoToLinkCard implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final GoToLinkCard f35913a = new GoToLinkCard();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof GoToLinkCard);
            }

            public int hashCode() {
                return -146899708;
            }

            public String toString() {
                return "GoToLinkCard";
            }
        }

        @Metadata
        public static final class LaunchGoogleWalletWithJwt implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f35914a;

            public LaunchGoogleWalletWithJwt(String str) {
                Intrinsics.i(str, "jwt");
                this.f35914a = str;
            }

            public final String a() {
                return this.f35914a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchGoogleWalletWithJwt) && Intrinsics.d(this.f35914a, ((LaunchGoogleWalletWithJwt) obj).f35914a);
            }

            public int hashCode() {
                return this.f35914a.hashCode();
            }

            public String toString() {
                String str = this.f35914a;
                return "LaunchGoogleWalletWithJwt(jwt=" + str + ")";
            }
        }

        @Metadata
        public static final class LaunchGoogleWalletWithLink implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public final String f35915a;

            public LaunchGoogleWalletWithLink(String str) {
                Intrinsics.i(str, "link");
                this.f35915a = str;
            }

            public final String a() {
                return this.f35915a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LaunchGoogleWalletWithLink) && Intrinsics.d(this.f35915a, ((LaunchGoogleWalletWithLink) obj).f35915a);
            }

            public int hashCode() {
                return this.f35915a.hashCode();
            }

            public String toString() {
                String str = this.f35915a;
                return "LaunchGoogleWalletWithLink(link=" + str + ")";
            }
        }

        @Metadata
        public static final class ScrollToCarouselStart implements Effect {

            /* renamed from: a  reason: collision with root package name */
            public static final ScrollToCarouselStart f35916a = new ScrollToCarouselStart();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof ScrollToCarouselStart);
            }

            public int hashCode() {
                return 2064572227;
            }

            public String toString() {
                return "ScrollToCarouselStart";
            }
        }
    }

    @Metadata
    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: A  reason: collision with root package name */
        public final StringValue f35917A;

        /* renamed from: B  reason: collision with root package name */
        public final FareCappingCardState f35918B;
        public final int C;
        public final String D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final DialogType H;
        public final boolean I;
        public final long J;
        public final boolean K;
        public final String L;
        public final boolean M;

        /* renamed from: z  reason: collision with root package name */
        public final PersistentList f35919z;

        @Metadata
        public interface CardItem extends Parcelable {

            @Metadata
            public static final class Card implements CardItem {
                public static final Parcelable.Creator<Card> CREATOR = new Creator();

                /* renamed from: A  reason: collision with root package name */
                public final String f35920A;

                /* renamed from: B  reason: collision with root package name */
                public final String f35921B;
                public final boolean C;
                public final String D;
                public final String E;
                public final StringValue F;
                public final boolean G;
                public final boolean H;
                public final boolean I;
                public final CardProvisioningStatus J;
                public final Long K;
                public final TransferTimeState L;

                /* renamed from: z  reason: collision with root package name */
                public final String f35922z;

                @Metadata
                public static final class Creator implements Parcelable.Creator<Card> {
                    /* renamed from: a */
                    public final Card createFromParcel(Parcel parcel) {
                        Parcel parcel2 = parcel;
                        Intrinsics.i(parcel2, "parcel");
                        String readString = parcel.readString();
                        String readString2 = parcel.readString();
                        String readString3 = parcel.readString();
                        boolean z2 = parcel.readInt() != 0;
                        String readString4 = parcel.readString();
                        String readString5 = parcel.readString();
                        StringValue stringValue = (StringValue) parcel2.readParcelable(Card.class.getClassLoader());
                        boolean z3 = parcel.readInt() != 0;
                        boolean z4 = parcel.readInt() != 0;
                        boolean z5 = parcel.readInt() != 0;
                        CardProvisioningStatus valueOf = CardProvisioningStatus.valueOf(parcel.readString());
                        TransferTimeState transferTimeState = null;
                        Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                        if (parcel.readInt() != 0) {
                            transferTimeState = TransferTimeState.CREATOR.createFromParcel(parcel2);
                        }
                        return new Card(readString, readString2, readString3, z2, readString4, readString5, stringValue, z3, z4, z5, valueOf, valueOf2, transferTimeState);
                    }

                    /* renamed from: b */
                    public final Card[] newArray(int i2) {
                        return new Card[i2];
                    }
                }

                public Card(String str, String str2, String str3, boolean z2, String str4, String str5, StringValue stringValue, boolean z3, boolean z4, boolean z5, CardProvisioningStatus cardProvisioningStatus, Long l2, TransferTimeState transferTimeState) {
                    Intrinsics.i(str, "id");
                    Intrinsics.i(str2, "nickName");
                    Intrinsics.i(str3, "balance");
                    Intrinsics.i(str4, "cardNumber");
                    Intrinsics.i(str5, "riderType");
                    Intrinsics.i(stringValue, "autoloadLabel");
                    Intrinsics.i(cardProvisioningStatus, "provisioningStatus");
                    this.f35922z = str;
                    this.f35920A = str2;
                    this.f35921B = str3;
                    this.C = z2;
                    this.D = str4;
                    this.E = str5;
                    this.F = stringValue;
                    this.G = z3;
                    this.H = z4;
                    this.I = z5;
                    this.J = cardProvisioningStatus;
                    this.K = l2;
                    this.L = transferTimeState;
                }

                public static /* synthetic */ Card b(Card card, String str, String str2, String str3, boolean z2, String str4, String str5, StringValue stringValue, boolean z3, boolean z4, boolean z5, CardProvisioningStatus cardProvisioningStatus, Long l2, TransferTimeState transferTimeState, int i2, Object obj) {
                    Card card2 = card;
                    int i3 = i2;
                    return card.a((i3 & 1) != 0 ? card2.f35922z : str, (i3 & 2) != 0 ? card2.f35920A : str2, (i3 & 4) != 0 ? card2.f35921B : str3, (i3 & 8) != 0 ? card2.C : z2, (i3 & 16) != 0 ? card2.D : str4, (i3 & 32) != 0 ? card2.E : str5, (i3 & 64) != 0 ? card2.F : stringValue, (i3 & 128) != 0 ? card2.G : z3, (i3 & 256) != 0 ? card2.H : z4, (i3 & 512) != 0 ? card2.I : z5, (i3 & 1024) != 0 ? card2.J : cardProvisioningStatus, (i3 & 2048) != 0 ? card2.K : l2, (i3 & 4096) != 0 ? card2.L : transferTimeState);
                }

                public final Card a(String str, String str2, String str3, boolean z2, String str4, String str5, StringValue stringValue, boolean z3, boolean z4, boolean z5, CardProvisioningStatus cardProvisioningStatus, Long l2, TransferTimeState transferTimeState) {
                    String str6 = str;
                    Intrinsics.i(str6, "id");
                    String str7 = str2;
                    Intrinsics.i(str7, "nickName");
                    String str8 = str3;
                    Intrinsics.i(str8, "balance");
                    String str9 = str4;
                    Intrinsics.i(str9, "cardNumber");
                    String str10 = str5;
                    Intrinsics.i(str10, "riderType");
                    StringValue stringValue2 = stringValue;
                    Intrinsics.i(stringValue2, "autoloadLabel");
                    CardProvisioningStatus cardProvisioningStatus2 = cardProvisioningStatus;
                    Intrinsics.i(cardProvisioningStatus2, "provisioningStatus");
                    return new Card(str6, str7, str8, z2, str9, str10, stringValue2, z3, z4, z5, cardProvisioningStatus2, l2, transferTimeState);
                }

                public final StringValue c() {
                    return this.F;
                }

                public final String d() {
                    return this.f35921B;
                }

                public final int describeContents() {
                    return 0;
                }

                public final boolean e() {
                    return this.I;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof Card)) {
                        return false;
                    }
                    Card card = (Card) obj;
                    return Intrinsics.d(this.f35922z, card.f35922z) && Intrinsics.d(this.f35920A, card.f35920A) && Intrinsics.d(this.f35921B, card.f35921B) && this.C == card.C && Intrinsics.d(this.D, card.D) && Intrinsics.d(this.E, card.E) && Intrinsics.d(this.F, card.F) && this.G == card.G && this.H == card.H && this.I == card.I && this.J == card.J && Intrinsics.d(this.K, card.K) && Intrinsics.d(this.L, card.L);
                }

                public final String f() {
                    return this.D;
                }

                public final long g() {
                    Long l2 = this.K;
                    return l2 != null ? ColorKt.d(l2.longValue()) : Color.f15975b.e();
                }

                public final boolean h() {
                    return this.C;
                }

                public int hashCode() {
                    int hashCode = ((((((((((((((((((((this.f35922z.hashCode() * 31) + this.f35920A.hashCode()) * 31) + this.f35921B.hashCode()) * 31) + Boolean.hashCode(this.C)) * 31) + this.D.hashCode()) * 31) + this.E.hashCode()) * 31) + this.F.hashCode()) * 31) + Boolean.hashCode(this.G)) * 31) + Boolean.hashCode(this.H)) * 31) + Boolean.hashCode(this.I)) * 31) + this.J.hashCode()) * 31;
                    Long l2 = this.K;
                    int i2 = 0;
                    int hashCode2 = (hashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
                    TransferTimeState transferTimeState = this.L;
                    if (transferTimeState != null) {
                        i2 = transferTimeState.hashCode();
                    }
                    return hashCode2 + i2;
                }

                public final String i() {
                    return this.f35920A;
                }

                public final CardProvisioningStatus j() {
                    return this.J;
                }

                public final String k() {
                    return this.E;
                }

                public final TransferTimeState l() {
                    return this.L;
                }

                public String m() {
                    return this.f35922z;
                }

                public final boolean n() {
                    return this.H;
                }

                public final boolean o() {
                    return this.G;
                }

                public String toString() {
                    String str = this.f35922z;
                    String str2 = this.f35920A;
                    String str3 = this.f35921B;
                    boolean z2 = this.C;
                    String str4 = this.D;
                    String str5 = this.E;
                    StringValue stringValue = this.F;
                    boolean z3 = this.G;
                    boolean z4 = this.H;
                    boolean z5 = this.I;
                    CardProvisioningStatus cardProvisioningStatus = this.J;
                    Long l2 = this.K;
                    TransferTimeState transferTimeState = this.L;
                    return "Card(id=" + str + ", nickName=" + str2 + ", balance=" + str3 + ", lowBalanceWarning=" + z2 + ", cardNumber=" + str4 + ", riderType=" + str5 + ", autoloadLabel=" + stringValue + ", isVirtual=" + z3 + ", isLocked=" + z4 + ", canBeUnlocked=" + z5 + ", provisioningStatus=" + cardProvisioningStatus + ", bottomCardColor=" + l2 + ", transferTimeState=" + transferTimeState + ")";
                }

                public final void writeToParcel(Parcel parcel, int i2) {
                    Intrinsics.i(parcel, "dest");
                    parcel.writeString(this.f35922z);
                    parcel.writeString(this.f35920A);
                    parcel.writeString(this.f35921B);
                    parcel.writeInt(this.C ? 1 : 0);
                    parcel.writeString(this.D);
                    parcel.writeString(this.E);
                    parcel.writeParcelable(this.F, i2);
                    parcel.writeInt(this.G ? 1 : 0);
                    parcel.writeInt(this.H ? 1 : 0);
                    parcel.writeInt(this.I ? 1 : 0);
                    parcel.writeString(this.J.name());
                    Long l2 = this.K;
                    if (l2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeLong(l2.longValue());
                    }
                    TransferTimeState transferTimeState = this.L;
                    if (transferTimeState == null) {
                        parcel.writeInt(0);
                        return;
                    }
                    parcel.writeInt(1);
                    transferTimeState.writeToParcel(parcel, i2);
                }
            }

            @Metadata
            public static final class CardPlaceholder implements CardItem {
                public static final Parcelable.Creator<CardPlaceholder> CREATOR = new Creator();

                /* renamed from: z  reason: collision with root package name */
                public static final CardPlaceholder f35923z = new CardPlaceholder();

                @Metadata
                public static final class Creator implements Parcelable.Creator<CardPlaceholder> {
                    /* renamed from: a */
                    public final CardPlaceholder createFromParcel(Parcel parcel) {
                        Intrinsics.i(parcel, "parcel");
                        parcel.readInt();
                        return CardPlaceholder.f35923z;
                    }

                    /* renamed from: b */
                    public final CardPlaceholder[] newArray(int i2) {
                        return new CardPlaceholder[i2];
                    }
                }

                public final int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    return this == obj || (obj instanceof CardPlaceholder);
                }

                public int hashCode() {
                    return 465794619;
                }

                public String m() {
                    return "";
                }

                public String toString() {
                    return "CardPlaceholder";
                }

                public final void writeToParcel(Parcel parcel, int i2) {
                    Intrinsics.i(parcel, "dest");
                    parcel.writeInt(1);
                }
            }

            String m();
        }

        @Metadata
        public enum CardProvisioningStatus {
            UNSUPPORTED,
            WALLET_UNAVAILABLE,
            PROVISIONED,
            CAN_BE_PROVISIONED;

            static {
                CardProvisioningStatus[] d2;
                E = EnumEntriesKt.a(d2);
            }
        }

        @Metadata
        public static final class Creator implements Parcelable.Creator<State> {
            /* renamed from: a */
            public final State createFromParcel(Parcel parcel) {
                Class<State> cls;
                Parcel parcel2 = parcel;
                Intrinsics.i(parcel2, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i2 = 0;
                while (true) {
                    cls = State.class;
                    if (i2 == readInt) {
                        break;
                    }
                    arrayList.add(parcel2.readParcelable(cls.getClassLoader()));
                    i2++;
                }
                return new State(ExtensionsKt.e(arrayList), (StringValue) parcel2.readParcelable(cls.getClassLoader()), (FareCappingCardState) parcel2.readParcelable(cls.getClassLoader()), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, DialogType.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final State[] newArray(int i2) {
                return new State[i2];
            }
        }

        @Metadata
        public enum DialogType {
            NONE,
            CREATE_OR_LINK,
            TRANSFER_OR_LINK,
            TRANSFER,
            TRANSFER_LOADING,
            ADD_TO_WALLET_LOADING;

            static {
                DialogType[] d2;
                G = EnumEntriesKt.a(d2);
            }
        }

        public State(PersistentList persistentList, StringValue stringValue, FareCappingCardState fareCappingCardState, int i2, String str, boolean z2, boolean z3, boolean z4, DialogType dialogType, boolean z5, long j2, boolean z6, String str2, boolean z7) {
            Intrinsics.i(persistentList, "cards");
            Intrinsics.i(stringValue, "cardFareCappingTitle");
            Intrinsics.i(dialogType, "dialogType");
            this.f35919z = persistentList;
            this.f35917A = stringValue;
            this.f35918B = fareCappingCardState;
            this.C = i2;
            this.D = str;
            this.E = z2;
            this.F = z3;
            this.G = z4;
            this.H = dialogType;
            this.I = z5;
            this.J = j2;
            this.K = z6;
            this.L = str2;
            this.M = z7;
        }

        public static /* synthetic */ State b(State state, PersistentList persistentList, StringValue stringValue, FareCappingCardState fareCappingCardState, int i2, String str, boolean z2, boolean z3, boolean z4, DialogType dialogType, boolean z5, long j2, boolean z6, String str2, boolean z7, int i3, Object obj) {
            State state2 = state;
            int i4 = i3;
            return state.a((i4 & 1) != 0 ? state2.f35919z : persistentList, (i4 & 2) != 0 ? state2.f35917A : stringValue, (i4 & 4) != 0 ? state2.f35918B : fareCappingCardState, (i4 & 8) != 0 ? state2.C : i2, (i4 & 16) != 0 ? state2.D : str, (i4 & 32) != 0 ? state2.E : z2, (i4 & 64) != 0 ? state2.F : z3, (i4 & 128) != 0 ? state2.G : z4, (i4 & 256) != 0 ? state2.H : dialogType, (i4 & 512) != 0 ? state2.I : z5, (i4 & 1024) != 0 ? state2.J : j2, (i4 & 2048) != 0 ? state2.K : z6, (i4 & 4096) != 0 ? state2.L : str2, (i4 & 8192) != 0 ? state2.M : z7);
        }

        public final State a(PersistentList persistentList, StringValue stringValue, FareCappingCardState fareCappingCardState, int i2, String str, boolean z2, boolean z3, boolean z4, DialogType dialogType, boolean z5, long j2, boolean z6, String str2, boolean z7) {
            PersistentList persistentList2 = persistentList;
            Intrinsics.i(persistentList2, "cards");
            StringValue stringValue2 = stringValue;
            Intrinsics.i(stringValue2, "cardFareCappingTitle");
            DialogType dialogType2 = dialogType;
            Intrinsics.i(dialogType2, "dialogType");
            return new State(persistentList2, stringValue2, fareCappingCardState, i2, str, z2, z3, z4, dialogType2, z5, j2, z6, str2, z7);
        }

        public final boolean c() {
            return this.G;
        }

        public final FareCappingCardState d() {
            return this.f35918B;
        }

        public final int describeContents() {
            return 0;
        }

        public final StringValue e() {
            return this.f35917A;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.d(this.f35919z, state.f35919z) && Intrinsics.d(this.f35917A, state.f35917A) && Intrinsics.d(this.f35918B, state.f35918B) && this.C == state.C && Intrinsics.d(this.D, state.D) && this.E == state.E && this.F == state.F && this.G == state.G && this.H == state.H && this.I == state.I && this.J == state.J && this.K == state.K && Intrinsics.d(this.L, state.L) && this.M == state.M;
        }

        public final PersistentList f() {
            return this.f35919z;
        }

        public final String g() {
            return this.D;
        }

        public final DialogType h() {
            return this.H;
        }

        public int hashCode() {
            int hashCode = ((this.f35919z.hashCode() * 31) + this.f35917A.hashCode()) * 31;
            FareCappingCardState fareCappingCardState = this.f35918B;
            int i2 = 0;
            int hashCode2 = (((hashCode + (fareCappingCardState == null ? 0 : fareCappingCardState.hashCode())) * 31) + Integer.hashCode(this.C)) * 31;
            String str = this.D;
            int hashCode3 = (((((((((((((((hashCode2 + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.E)) * 31) + Boolean.hashCode(this.F)) * 31) + Boolean.hashCode(this.G)) * 31) + this.H.hashCode()) * 31) + Boolean.hashCode(this.I)) * 31) + Long.hashCode(this.J)) * 31) + Boolean.hashCode(this.K)) * 31;
            String str2 = this.L;
            if (str2 != null) {
                i2 = str2.hashCode();
            }
            return ((hashCode3 + i2) * 31) + Boolean.hashCode(this.M);
        }

        public final boolean i() {
            return !this.G && this.f35919z.isEmpty();
        }

        public final int j() {
            return this.C;
        }

        public final String k() {
            return this.L;
        }

        public final boolean l() {
            return this.M;
        }

        public final long n() {
            return this.J;
        }

        public final boolean o() {
            return this.F;
        }

        public final boolean p() {
            return this.K;
        }

        public final boolean q() {
            return this.I;
        }

        public final boolean r() {
            return this.E;
        }

        public String toString() {
            PersistentList persistentList = this.f35919z;
            StringValue stringValue = this.f35917A;
            FareCappingCardState fareCappingCardState = this.f35918B;
            int i2 = this.C;
            String str = this.D;
            boolean z2 = this.E;
            boolean z3 = this.F;
            boolean z4 = this.G;
            DialogType dialogType = this.H;
            boolean z5 = this.I;
            long j2 = this.J;
            boolean z6 = this.K;
            String str2 = this.L;
            boolean z7 = this.M;
            return "State(cards=" + persistentList + ", cardFareCappingTitle=" + stringValue + ", cardFareCappingInfo=" + fareCappingCardState + ", initialPage=" + i2 + ", currentCardId=" + str + ", isVirtualCardInOtherDevice=" + z2 + ", isAddCardDialogButtonEnabled=" + z3 + ", blockingLoading=" + z4 + ", dialogType=" + dialogType + ", isRefreshing=" + z5 + ", updateElapsedSec=" + j2 + ", isEmptyScreenBackgroundEnabled=" + z6 + ", moreInfoLink=" + str2 + ", showWalletUnavailableWarning=" + z7 + ")";
        }

        public final void writeToParcel(Parcel parcel, int i2) {
            Intrinsics.i(parcel, "dest");
            PersistentList<Parcelable> persistentList = this.f35919z;
            parcel.writeInt(persistentList.size());
            for (Parcelable writeParcelable : persistentList) {
                parcel.writeParcelable(writeParcelable, i2);
            }
            parcel.writeParcelable(this.f35917A, i2);
            parcel.writeParcelable(this.f35918B, i2);
            parcel.writeInt(this.C);
            parcel.writeString(this.D);
            parcel.writeInt(this.E ? 1 : 0);
            parcel.writeInt(this.F ? 1 : 0);
            parcel.writeInt(this.G ? 1 : 0);
            parcel.writeString(this.H.name());
            parcel.writeInt(this.I ? 1 : 0);
            parcel.writeLong(this.J);
            parcel.writeInt(this.K ? 1 : 0);
            parcel.writeString(this.L);
            parcel.writeInt(this.M ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ State(kotlinx.collections.immutable.PersistentList r17, com.hansecom.abt.util.resourcesResolvers.StringValue r18, com.hansecom.abt.ui.components.fareCapping.FareCappingCardState r19, int r20, java.lang.String r21, boolean r22, boolean r23, boolean r24, com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.DialogType r25, boolean r26, long r27, boolean r29, java.lang.String r30, boolean r31, int r32, kotlin.jvm.internal.DefaultConstructorMarker r33) {
            /*
                r16 = this;
                r0 = r32
                r1 = r0 & 1
                if (r1 == 0) goto L_0x000b
                kotlinx.collections.immutable.PersistentList r1 = kotlinx.collections.immutable.ExtensionsKt.a()
                goto L_0x000d
            L_0x000b:
                r1 = r17
            L_0x000d:
                r2 = r0 & 2
                if (r2 == 0) goto L_0x0019
                com.hansecom.abt.util.resourcesResolvers.StringValue$Value r2 = new com.hansecom.abt.util.resourcesResolvers.StringValue$Value
                java.lang.String r3 = ""
                r2.<init>(r3)
                goto L_0x001b
            L_0x0019:
                r2 = r18
            L_0x001b:
                r3 = r0 & 4
                if (r3 == 0) goto L_0x0021
                r3 = 0
                goto L_0x0023
            L_0x0021:
                r3 = r19
            L_0x0023:
                r5 = r0 & 8
                r6 = 0
                if (r5 == 0) goto L_0x002a
                r5 = r6
                goto L_0x002c
            L_0x002a:
                r5 = r20
            L_0x002c:
                r7 = r0 & 16
                if (r7 == 0) goto L_0x0032
                r7 = 0
                goto L_0x0034
            L_0x0032:
                r7 = r21
            L_0x0034:
                r8 = r0 & 32
                if (r8 == 0) goto L_0x003a
                r8 = r6
                goto L_0x003c
            L_0x003a:
                r8 = r22
            L_0x003c:
                r9 = r0 & 64
                if (r9 == 0) goto L_0x0042
                r9 = r6
                goto L_0x0044
            L_0x0042:
                r9 = r23
            L_0x0044:
                r10 = r0 & 128(0x80, float:1.794E-43)
                if (r10 == 0) goto L_0x004a
                r10 = r6
                goto L_0x004c
            L_0x004a:
                r10 = r24
            L_0x004c:
                r11 = r0 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L_0x0053
                com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$DialogType r11 = com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.DialogType.NONE
                goto L_0x0055
            L_0x0053:
                r11 = r25
            L_0x0055:
                r12 = r0 & 512(0x200, float:7.175E-43)
                if (r12 == 0) goto L_0x005b
                r12 = r6
                goto L_0x005d
            L_0x005b:
                r12 = r26
            L_0x005d:
                r13 = r0 & 1024(0x400, float:1.435E-42)
                if (r13 == 0) goto L_0x0064
                r13 = 0
                goto L_0x0066
            L_0x0064:
                r13 = r27
            L_0x0066:
                r15 = r0 & 2048(0x800, float:2.87E-42)
                if (r15 == 0) goto L_0x006c
                r15 = r6
                goto L_0x006e
            L_0x006c:
                r15 = r29
            L_0x006e:
                r4 = r0 & 4096(0x1000, float:5.74E-42)
                if (r4 == 0) goto L_0x0074
                r4 = 0
                goto L_0x0076
            L_0x0074:
                r4 = r30
            L_0x0076:
                r0 = r0 & 8192(0x2000, float:1.14794E-41)
                if (r0 == 0) goto L_0x007b
                goto L_0x007d
            L_0x007b:
                r6 = r31
            L_0x007d:
                r17 = r16
                r18 = r1
                r19 = r2
                r20 = r3
                r21 = r5
                r22 = r7
                r23 = r8
                r24 = r9
                r25 = r10
                r26 = r11
                r27 = r12
                r28 = r13
                r30 = r15
                r31 = r4
                r32 = r6
                r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r30, r31, r32)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.hansecom.abt.presentation.screens.home.faremedia.FareMedia.State.<init>(kotlinx.collections.immutable.PersistentList, com.hansecom.abt.util.resourcesResolvers.StringValue, com.hansecom.abt.ui.components.fareCapping.FareCappingCardState, int, java.lang.String, boolean, boolean, boolean, com.hansecom.abt.presentation.screens.home.faremedia.FareMedia$State$DialogType, boolean, long, boolean, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
