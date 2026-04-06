package com.hansecom.abt.ui;

import android.graphics.Bitmap;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.hansecom.abt.R;
import com.hansecom.abt.presentation.model.PaymentMethodState;
import com.hansecom.abt.ui.components.fareCapping.FareCappingCardState;
import com.hansecom.abt.ui.components.historyItem.HistoryItemState;
import com.hansecom.abt.ui.components.listItem.MenuItemListState;
import com.hansecom.abt.ui.components.listItem.MenuItemState;
import com.hansecom.abt.ui.components.passCard.PassCardState;
import com.hansecom.abt.ui.components.passCard.PassOfferCardState;
import com.hansecom.abt.util.BigDecimalExtKt;
import com.hansecom.abt.util.BitmapExtKt;
import com.hansecom.abt.util.resourcesResolvers.StringValue;
import com.hansecom.abt.util.resourcesResolvers.StringValueKt;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ExtensionsKt;
import kotlinx.collections.immutable.PersistentList;

@Metadata
public final class SampleStates {

    /* renamed from: a  reason: collision with root package name */
    public static final SampleStates f37859a = new SampleStates();

    public final PassCardState a() {
        return new PassCardState(0, "The Employer Bus Pass", true, false, false, 1, (LocalDateTime) null, LocalDateTime.of(2026, 1, 1, 0, 0, 0, 0));
    }

    public final Bitmap b(String str) {
        Intrinsics.i(str, "text");
        BitMatrix b2 = new MultiFormatWriter().b(str, BarcodeFormat.CODE_128, 200, 100);
        Intrinsics.h(b2, "encode(...)");
        Color.Companion companion = Color.f15975b;
        return BitmapExtKt.a(b2, ColorKt.j(companion.a()), ColorKt.j(companion.e()), Bitmap.Config.ALPHA_8);
    }

    public final FareCappingCardState.Concluded c() {
        return new FareCappingCardState.Concluded(R.drawable.f33010l, new StringValue.ResourceId(R.string.U3), LocalDateTime.of(2026, 1, 30, 9, 0));
    }

    public final FareCappingCardState.InProgress d() {
        return new FareCappingCardState.InProgress(R.drawable.f33015q, StringValueKt.d("Name"), StringValueKt.d("Prize"), 23.0f, 50.0f);
    }

    public final PassOfferCardState e() {
        PassOfferCardState g2 = g();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.h(bigDecimal, "ZERO");
        return PassOfferCardState.b(g2, 0, (String) null, (String) null, (String) null, bigDecimal, (String) null, false, 0, 0, 0, 1007, (Object) null);
    }

    public final PassOfferCardState f() {
        PassOfferCardState k2 = k();
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Intrinsics.h(bigDecimal, "ZERO");
        return PassOfferCardState.b(k2, 0, (String) null, (String) null, (String) null, bigDecimal, (String) null, false, 0, 0, 0, 1007, (Object) null);
    }

    public final PassOfferCardState g() {
        return new PassOfferCardState(1, "Group pass name", "Pass description", "validityDescription", BigDecimalExtKt.a(999), (String) null, true, 3, 2, 10, 32, (DefaultConstructorMarker) null);
    }

    public final HistoryItemState h() {
        LocalTime of = LocalTime.of(12, 0);
        BigDecimal valueOf = BigDecimal.valueOf((long) 2);
        Intrinsics.h(valueOf, "valueOf(...)");
        return new HistoryItemState("title", "description", of, valueOf, (String) null, (String) null, 48, (DefaultConstructorMarker) null);
    }

    public final PassCardState i() {
        return new PassCardState(0, "The Employer Bus Pass", false, false, false, 1, LocalDateTime.of(2026, 1, 1, 0, 0, 0, 0), (LocalDateTime) null);
    }

    public final MenuItemListState j() {
        return new MenuItemListState(ExtensionsKt.b(new MenuItemState.Text(StringValueKt.d("Title"), (StringValue) null, (String) null, (String) null, (String) null, (String) null, false, 126, (DefaultConstructorMarker) null), new MenuItemState.Text(StringValueKt.d("Title"), (StringValue) null, "close", "chevron_right", (String) null, (String) null, false, 114, (DefaultConstructorMarker) null), new MenuItemState.Text(StringValueKt.d("Title disabled"), StringValueKt.d("Description text"), "close", "chevron_right", (String) null, (String) null, false, 48, (DefaultConstructorMarker) null), new MenuItemState.Group(StringValueKt.d("Group"), "close", (String) null, (String) null, ExtensionsKt.a(), false, 44, (DefaultConstructorMarker) null)));
    }

    public final PassOfferCardState k() {
        return new PassOfferCardState(0, "Pass name", "Pass description", "validityDescription", BigDecimalExtKt.a(199), (String) null, false, 0, 0, 0, 928, (DefaultConstructorMarker) null);
    }

    public final PersistentList l() {
        return ExtensionsKt.b(new PaymentMethodState.CreditCard(0, "Card name", "411111******1111", true, "12/30", false, (String) null), new PaymentMethodState.CreditCard(1, "Second card name", "411111******1111", false, "01/25", true, (String) null));
    }
}
