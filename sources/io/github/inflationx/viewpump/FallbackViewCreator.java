package io.github.inflationx.viewpump;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Metadata;

@Metadata
public interface FallbackViewCreator {
    View onCreateView(View view, String str, Context context, AttributeSet attributeSet);
}
