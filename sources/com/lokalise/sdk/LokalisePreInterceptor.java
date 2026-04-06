package com.lokalise.sdk;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.lokalise.sdk.utils.LogType;
import com.lokalise.sdk.utils.Logger;
import com.lokalise.sdk.utils.ParsedAttrs;
import io.github.inflationx.viewpump.InflateRequest;
import io.github.inflationx.viewpump.InflateResult;
import io.github.inflationx.viewpump.Interceptor;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class LokalisePreInterceptor implements Interceptor {
    private final Lazy parsedAttrs$delegate = LazyKt.b(LokalisePreInterceptor$parsedAttrs$2.INSTANCE);
    private int[] set = new int[0];

    private final InflateResult getInflateResult(Context context, View view, String str, AttributeSet attributeSet) {
        return InflateResult.f39788e.a().c(context).e(view).a(attributeSet).d(str).b();
    }

    public static /* synthetic */ InflateResult getInflateResult$default(LokalisePreInterceptor lokalisePreInterceptor, Context context, View view, String str, AttributeSet attributeSet, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            str = view.getClass().getName();
            Intrinsics.h(str, "view::class.java.name");
        }
        return lokalisePreInterceptor.getInflateResult(context, view, str, attributeSet);
    }

    private final ParsedAttrs getParsedAttrs() {
        return (ParsedAttrs) this.parsedAttrs$delegate.getValue();
    }

    private final View inflateView(InflateRequest inflateRequest) {
        return inflateRequest.c().onCreateView(inflateRequest.e(), inflateRequest.d(), inflateRequest.b(), inflateRequest.a());
    }

    public InflateResult intercept(Interceptor.Chain chain) {
        Intrinsics.i(chain, "chain");
        InflateRequest m2 = chain.m();
        View inflateView = inflateView(m2);
        if (inflateView != null) {
            boolean z2 = inflateView instanceof TextView;
            if (z2) {
                this.set = getParsedAttrs().getTextViewAttrs();
            } else if (inflateView instanceof Toolbar) {
                this.set = getParsedAttrs().getAppCompatToolbarAttrs();
            } else {
                if (inflateView instanceof android.widget.Toolbar) {
                    this.set = getParsedAttrs().getToolbarAttrs();
                }
                boolean z3 = Lokalise.isMaterial;
            }
            Logger logger = Logger.INSTANCE;
            LogType logType = LogType.PRE_INFLATION;
            String arrays = Arrays.toString(this.set);
            Intrinsics.h(arrays, "toString(this)");
            logger.printDebug(logType, "Attrs set is " + arrays);
            TypedArray obtainStyledAttributes = m2.b().obtainStyledAttributes(m2.a(), this.set);
            Intrinsics.h(obtainStyledAttributes, "request.context.obtainSt…butes(request.attrs, set)");
            boolean z4 = Lokalise.isMaterial;
            int i2 = 2;
            if (z2) {
                TextView textView = (TextView) inflateView;
                Resources resources = m2.b().getResources();
                Intrinsics.h(resources, "request.context.resources");
                __Extensions_Kt.translateTextAttrIfPossible(textView, resources, obtainStyledAttributes.getResourceId(0, -1));
                Resources resources2 = m2.b().getResources();
                Intrinsics.h(resources2, "request.context.resources");
                __Extensions_Kt.translateHintAttrIfPossible(textView, resources2, obtainStyledAttributes.getResourceId(1, -1));
            } else if (inflateView instanceof Toolbar) {
                Resources resources3 = m2.b().getResources();
                Intrinsics.h(resources3, "request.context.resources");
                __Extensions_Kt.translateToolbarXIfPossible((Toolbar) inflateView, resources3, obtainStyledAttributes.getResourceId(0, -1));
                i2 = 1;
            } else if (inflateView instanceof android.widget.Toolbar) {
                Resources resources4 = m2.b().getResources();
                Intrinsics.h(resources4, "request.context.resources");
                __Extensions_Kt.translateToolbarIfPossible((android.widget.Toolbar) inflateView, resources4, obtainStyledAttributes.getResourceId(0, -1), obtainStyledAttributes.getResourceId(1, -1));
            }
            Resources resources5 = m2.b().getResources();
            Intrinsics.h(resources5, "request.context.resources");
            __Extensions_Kt.translateTooltipTextAttrIfPossible(inflateView, resources5, obtainStyledAttributes.getResourceId(i2, -1));
            obtainStyledAttributes.recycle();
            InflateResult inflateResult$default = getInflateResult$default(this, m2.b(), inflateView, (String) null, m2.a(), 4, (Object) null);
            if (inflateResult$default != null) {
                return inflateResult$default;
            }
        }
        return chain.n(m2);
    }
}
