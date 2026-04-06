package io.github.inflationx.viewpump.internal;

import android.view.LayoutInflater;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata
/* renamed from: io.github.inflationx.viewpump.internal.-ViewPumpLayoutInflater$Companion$CONSTRUCTOR_ARGS_FIELD$2  reason: invalid class name */
public final class ViewPumpLayoutInflater$Companion$CONSTRUCTOR_ARGS_FIELD$2 extends Lambda implements Function0<Field> {

    /* renamed from: z  reason: collision with root package name */
    public static final ViewPumpLayoutInflater$Companion$CONSTRUCTOR_ARGS_FIELD$2 f39835z = new ViewPumpLayoutInflater$Companion$CONSTRUCTOR_ARGS_FIELD$2();

    public ViewPumpLayoutInflater$Companion$CONSTRUCTOR_ARGS_FIELD$2() {
        super(0);
    }

    /* renamed from: b */
    public final Field invoke() {
        Field declaredField = LayoutInflater.class.getDeclaredField("mConstructorArgs");
        if (declaredField != null) {
            declaredField.setAccessible(true);
            return declaredField;
        }
        throw new IllegalArgumentException("No constructor arguments field found in LayoutInflater!");
    }
}
