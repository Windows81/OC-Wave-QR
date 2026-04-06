package androidx.compose.ui.text.android;

import android.text.StaticLayout;
import kotlin.Metadata;

@Metadata
interface StaticLayoutFactoryImpl {
    StaticLayout a(StaticLayoutParams staticLayoutParams);

    boolean b(StaticLayout staticLayout, boolean z2);
}
